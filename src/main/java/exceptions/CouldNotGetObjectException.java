package exceptions;

public class CouldNotGetObjectException extends MyException {

    private final String id;
    private final String request;
    private final String parameter;

    public CouldNotGetObjectException(Exception innerException, String id, String request, String parameter) {
        super(innerException);
        this.id = id;
        this.request = request;
        this.parameter = parameter;
    }


    @Override
    protected String getPrivateMessage() {
        return "Could not get Data from id: \"" + id + "\", request: \"" + request + "\", parameter: \"" + parameter + "\"";
    }
}
