package caller;

public class CouldNotReachJikanException extends MyException {

    private final String urlString;

    public CouldNotReachJikanException(String urlString) {
        this.urlString = urlString;
    }
}
