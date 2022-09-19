package exceptions;

import java.util.List;
import java.util.Map;

public class CouldNotGetObjectException extends MyException {


    private final List<String> pathParameters;
    private final Map<String, String> queryParameters;
    private final Class<?> clazz;

    public <K> CouldNotGetObjectException(Exception e, List<String> pathParameters, Map<String, String> queryParameters, Class<K> clazz) {
        super(e);
        this.pathParameters = pathParameters;
        this.queryParameters = queryParameters;
        this.clazz = clazz;
    }


    @Override
    protected String getPrivateMessage() {
        return "Could not get object with " +
                "class = '" + clazz.getSimpleName() + "', " +
                "path parameters = '" + pathParameters.toString() + "', " +
                "query parameters = '" + queryParameters.toString() + "'";
    }

}
