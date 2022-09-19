package caller;

import exceptions.CouldNotGetObjectException;
import exceptions.MyException;
import util.ApiCaller;
import util.MyObjectMapper;
import util.url.SubfolderAdder;
import util.url.UrlBuilder;

import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.util.List;
import java.util.Map;

public abstract class AbstractCaller {

    protected final static String JIKAN_URL = "https://api.jikan.moe/v4/";
    private static final String ID_REGEX = "%ID%";

    private static final String REQUEST_REGEX = "%REQUEST%";
    private static final String PARAMETER_REGEX = "%PARAMETER%";
    protected final String endPointUrl;

    protected final MyObjectMapper objectMapper;

    protected String name;

    protected AbstractCaller(String name) {
        this.objectMapper = new MyObjectMapper();
        this.name = name;
        endPointUrl = JIKAN_URL + this.name + "/" + ID_REGEX + "/" + REQUEST_REGEX + "/" + PARAMETER_REGEX;
    }


    protected <K> K getObject(List<String> pathParameters, Map<String, String> queryParameters, Class<K> clazz) throws CouldNotGetObjectException {

        String url;
        try {
            SubfolderAdder subfolderAdder = new UrlBuilder()
                    .setConnType("https")
                    .setHost("api.jikan.moe")
                    .addSubfolder("v4");

            pathParameters.forEach(subfolderAdder::addSubfolder);
            queryParameters.forEach(subfolderAdder::addParameter);
            url = subfolderAdder.getURL();

            System.out.println(url);

        } catch (URISyntaxException | MalformedURLException e) {
            throw new CouldNotGetObjectException(e, "Es gab ein problem beim erstellen der Url");
        }

        try {
            String json = ApiCaller.getInstance().getDataFromJikan(url);
            return objectMapper.map(json, clazz);
        } catch (MyException e) {
            throw new CouldNotGetObjectException(e, url);
        }
    }


}
