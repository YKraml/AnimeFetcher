package util;

import exceptions.CouldNotReachJikanException;

public class ApiCallerSingleton implements ApiCaller {

  private static ApiCaller instance;
  private final ApiCaller innerApiCaller;

  public ApiCallerSingleton() {
    innerApiCaller = new ApiCallerCached();
  }

  public static ApiCaller getInstance() {
    if (instance == null) {
      instance = new ApiCallerCached();
    }
    return instance;
  }

  @Override
  public String getDataFromJikan(String url) throws CouldNotReachJikanException {
    return innerApiCaller.getDataFromJikan(url);
  }
}
