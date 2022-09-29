package caller;

import exceptions.*;
import util.ApiCaller;
import util.MyObjectMapper;
import util.url.SubfolderAdder;
import util.url.UrlBuilder;

import java.util.List;
import java.util.Map;

public interface ICaller {

    static final MyObjectMapper objectMapper = new MyObjectMapper();

    default <K> K getObject(List<String> pathParameters, Map<String, String> queryParameters, Class<K> clazz) throws CouldNotGetObjectException {

        String url;
        try {
            SubfolderAdder subfolderAdder = new UrlBuilder()
                    .setConnType("https")
                    .setHost("api.jikan.moe")
                    .addSubfolder("v4");

            pathParameters.forEach(subfolderAdder::addSubfolder);
            queryParameters.forEach(subfolderAdder::addParameter);
            url = subfolderAdder.getURL();

            System.out.println("Built Url. Url = '" + url + "', Path parameters = '" + pathParameters + "', Query parameters = '" + queryParameters + "', Class = '" + clazz.getName() + "'");

        } catch (CouldNotParseUrlException e) {
            throw new CouldNotGetObjectException(e, pathParameters, queryParameters, clazz);
        }


        try {
            String json = ApiCaller.getInstance().getDataFromJikan(url);
            return objectMapper.map(json, clazz);
        } catch (CouldNotMapException | CouldNotReachJikanException e) {
            throw new CouldNotGetObjectException(e, pathParameters, queryParameters, clazz);
        }
    }


}
