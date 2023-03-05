package caller;

import exceptions.CouldNotGetObjectException;
import exceptions.CouldNotMapException;
import exceptions.CouldNotParseUrlException;
import exceptions.CouldNotReachJikanException;
import exceptions.MyException;
import java.lang.reflect.ParameterizedType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;
import util.ApiCaller;
import util.Mapper;
import util.url.SubfolderAdder;
import util.url.UrlBuilder;

public abstract class ACaller<T> {

  private final List<String> pathParameters;
  private final Map<String, String> queryParameters;
  private final Mapper objectMapper;
  private final ApiCaller apiCaller;

  protected ACaller(ApiCaller apiCaller) {
    pathParameters = new ArrayList<>();
    queryParameters = new HashMap<>();
    objectMapper = new Mapper();
    this.apiCaller = apiCaller;
  }

  @SuppressWarnings({"unchecked"})
  public CompletableFuture<T> consume() {
    Supplier<T> supplier = () -> {
      try {
        String className = ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0].getTypeName();
        Class<T> clazz = (Class<T>) Class.forName(className);

        return getObject(pathParameters, queryParameters, clazz);
      } catch (MyException | ClassNotFoundException e) {
        throw new RuntimeException(e);
      }
    };
    return CompletableFuture.supplyAsync(supplier);
  }

  protected boolean addPathParameter(String value) {
    return pathParameters.add(value);
  }

  protected String addQueryParameter(String type, String value) {
    return queryParameters.put(type, value);
  }

  private <K> K getObject(List<String> pathParameters, Map<String, String> queryParameters,
      Class<K> clazz) throws MyException {

    String url;
    try {
      SubfolderAdder subfolderAdder = new UrlBuilder()
          .setConnType("https")
          .setHost("api.jikan.moe")
          .addSubfolder("v4");

      pathParameters.forEach(subfolderAdder::addSubfolder);
      queryParameters.forEach(subfolderAdder::addParameter);
      url = subfolderAdder.getURL();

    } catch (CouldNotParseUrlException e) {
      throw new CouldNotGetObjectException(e, pathParameters, queryParameters, clazz);
    }

    try {
      String json = apiCaller.getDataFromJikan(url);
      return objectMapper.map(json, clazz);
    } catch (CouldNotMapException | CouldNotReachJikanException e) {
      throw new CouldNotGetObjectException(e, pathParameters, queryParameters, clazz);
    }
  }
}