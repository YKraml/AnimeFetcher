package exceptions;

public class CouldNotReachJikanException extends MyException {

    private final String urlString;

    public CouldNotReachJikanException(Exception originalException, String urlString) {
        super(originalException);
        this.urlString = urlString;
    }


    @Override
    protected String getPrivateMessage() {
        return "Konnte Jikan mit \"" + urlString + "\" nicht erreichen.";
    }
}
