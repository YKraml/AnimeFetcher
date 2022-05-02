package caller;

import enums.AbstractRequest;
import exceptions.CouldNotGetObjectException;
import exceptions.CouldNotMapException;
import exceptions.CouldNotReachJikanException;
import exceptions.MyException;
import util.ApiCaller;
import util.MyObjectMapper;

public abstract class AbstractCaller {

    protected final static String JIKAN_URL = "https://api.jikan.moe/v4/";
    private static final String ID_REGEX = "%ID%";

    private static final String REQUEST_REGEX = "%REQUEST%";
    private static final String PARAMETER_REGEX = "%PARAMETER%";
    protected final String endPointUrl;

    protected final MyObjectMapper objectMapper;

    String name;

    protected AbstractCaller(String name) {
        this.objectMapper = new MyObjectMapper();
        this.name = name;
        endPointUrl = JIKAN_URL + this.name + "/" + ID_REGEX + "/" + REQUEST_REGEX + "/" + PARAMETER_REGEX;
    }

    protected String makeUrl(String id, String request, String parameter) {
        return endPointUrl.replace(ID_REGEX, id).replace(REQUEST_REGEX, request).replace(PARAMETER_REGEX, parameter);
    }


    protected String getJson(String id, String request, String parameter) throws MyException {
        String url = this.makeUrl(id, request, parameter);
        return ApiCaller.getInstance().getDataFromJikan(url);
    }

    protected <K> K getObject(int root, AbstractRequest request, String parameter) throws CouldNotGetObjectException {
        try {
            String json = this.getJson(String.valueOf(root), request.getRequestString(), String.valueOf(parameter));
            return objectMapper.map(json, request.getRequestClass());
        } catch (MyException e) {
            throw new CouldNotGetObjectException(e, this.makeUrl(String.valueOf(root), request.getRequestString(), parameter));
        }
    }


    protected <K> K getObject(int id, AbstractRequest request) throws CouldNotGetObjectException {
        return getObject(id, request, "");
    }

    protected <K> K getObject(String restUrl, AbstractRequest request) throws CouldNotGetObjectException {
        String url = JIKAN_URL + restUrl;
        String data;
        try {
            data = ApiCaller.getInstance().getDataFromJikan(url);
            return objectMapper.map(data, request.getRequestClass());
        } catch (CouldNotReachJikanException | CouldNotMapException e) {
            throw new CouldNotGetObjectException(e, url);
        }
    }

}
