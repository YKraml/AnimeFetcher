package util;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import exceptions.CouldNotReachJikanException;
import java.util.concurrent.ExecutionException;
import org.jetbrains.annotations.NotNull;

public class ApiCallerCached implements ApiCaller {

  private final ApiCaller innerApiCaller;

  private final LoadingCache<String, String> cache;

  public ApiCallerCached() {
    innerApiCaller = new ApiCallerJikan();

    CacheLoader<String, String> cacheLoader = new CacheLoader<>() {
      @NotNull
      public String load(@NotNull String url) throws Exception {
        return innerApiCaller.getDataFromJikan(url);
      }
    };

    cache = CacheBuilder.newBuilder()
        .maximumSize(1000)
        .build(cacheLoader);
  }

  @Override
  public String getDataFromJikan(String url) throws CouldNotReachJikanException {
    try {
      return cache.get(url);
    } catch (ExecutionException e) {
      throw new CouldNotReachJikanException(e, url);
    }
  }
}
