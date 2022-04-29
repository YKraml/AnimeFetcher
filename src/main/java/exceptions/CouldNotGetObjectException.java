package exceptions;

public class CouldNotGetObjectException extends MyException {

    String url;

    public CouldNotGetObjectException(Exception innerException, String url) {
        super(innerException);
        this.url = url;
    }


    @Override
    protected String getPrivateMessage() {
        return "Could not get Data from: \"" + url + "\"";
    }

}
