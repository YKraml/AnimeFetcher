package exceptions;

public class CouldNotReachJikanException extends MyException {

    private final String urlString;

    public CouldNotReachJikanException(Exception innerException, String urlString) {
        super(innerException);
        this.urlString = urlString;
    }


    @Override
    protected String getPrivateMessage() {
        return "Could not reach jikan with url = '" + urlString + "'";
    }
}
