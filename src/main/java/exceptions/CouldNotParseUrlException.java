package exceptions;

public class CouldNotParseUrlException extends MyException {

    private final String connectionType;
    private final String host;
    private final String pathParameters;
    private final String queryParameters;

    public CouldNotParseUrlException(Exception innerException, String connectionType, String host, String pathParameters, String queryParameters) {
        super(innerException);
        this.connectionType = connectionType;
        this.host = host;
        this.pathParameters = pathParameters;
        this.queryParameters = queryParameters;
    }

    @Override
    protected String getPrivateMessage() {
        return "Could not parse Url with " +
                "connection type = '" + connectionType + "', " +
                "host = '" + host + "', " +
                "path parameters = '" + pathParameters + "', " +
                "queryParameters = '" + queryParameters + "'";
    }
}
