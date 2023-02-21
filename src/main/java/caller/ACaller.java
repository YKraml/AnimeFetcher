package caller;

import exceptions.CouldNotGetObjectException;
import exceptions.CouldNotMapException;
import exceptions.CouldNotParseUrlException;
import exceptions.CouldNotReachJikanException;
import java.lang.reflect.ParameterizedType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import util.ApiCaller;
import util.ApiCallerSingleton;
import util.MyObjectMapper;
import util.url.SubfolderAdder;
import util.url.UrlBuilder;

public abstract class ACaller<T> {

  private final List<String> pathParameters;
  private final Map<String, String> queryParameters;
  private final MyObjectMapper objectMapper = new MyObjectMapper();
  private final ApiCaller apiCaller;

  protected ACaller() {
    pathParameters = new ArrayList<>();
    queryParameters = new HashMap<>();
    apiCaller = ApiCallerSingleton.getInstance();
    ;
  }


  public CompletableFuture<T> consume() {
    return CompletableFuture.supplyAsync(this::makeCall);


  }

  @SuppressWarnings({"unchecked"})
  private T makeCall() {
    try {
      String className = ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0].getTypeName();
      Class<T> clazz = (Class<T>) Class.forName(className);

      return getObject(pathParameters, queryParameters, clazz);
    } catch (CouldNotGetObjectException | ClassNotFoundException e) {
      throw new RuntimeException(e);
    }
  }


  private <K> K getObject(List<String> pathParameters, Map<String, String> queryParameters,
      Class<K> clazz) throws CouldNotGetObjectException {

    String url;
    try {
      SubfolderAdder subfolderAdder = new UrlBuilder().setConnType("https").setHost("api.jikan.moe")
          .addSubfolder("v4");

      pathParameters.forEach(subfolderAdder::addSubfolder);
      queryParameters.forEach(subfolderAdder::addParameter);
      url = subfolderAdder.getURL();

      //Logging
      /*
      System.out.printf(
          "Built Url. Url = '%s', Path parameters = '%s', Query parameters = '%s', Class = '%s'%n",
          url, pathParameters, queryParameters, clazz.getName());
       */

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

  protected boolean addPathParameter(String value) {
    return pathParameters.add(value);
  }

  protected String addQueryParameter(String type, String value) {
    return queryParameters.put(type, value);
  }
}