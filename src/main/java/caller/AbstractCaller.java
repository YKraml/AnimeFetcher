package caller;

import request.AbstractRequest;
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

    protected String name;

    protected AbstractCaller(String name) {
        this.objectMapper = new MyObjectMapper();
        this.name = name;
        endPointUrl = JIKAN_URL + this.name + "/" + ID_REGEX + "/" + REQUEST_REGEX + "/" + PARAMETER_REGEX;
    }


    protected <K> K getObject(int id, AbstractRequest request) throws CouldNotGetObjectException {
        return getObject(id, request, "");
    }

    protected <K> K getObject(int root, AbstractRequest request, String parameter) throws CouldNotGetObjectException {
        String url = endPointUrl
                .replace(ID_REGEX, String.valueOf(root))
                .replace(REQUEST_REGEX, request.getRequestString())
                .replace(PARAMETER_REGEX, String.valueOf(parameter));

        try {
            String json = ApiCaller.getInstance().getDataFromJikan(url);
            return objectMapper.map(json, request.getRequestClass());
        } catch (MyException e) {
            throw new CouldNotGetObjectException(e, url);
        }
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
