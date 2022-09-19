package exceptions;

import com.fasterxml.jackson.core.JsonProcessingException;

public class CouldNotMapException extends MyException {

    private final String data;
    private final Class<?> t;

    public <T> CouldNotMapException(Exception innerException, String data, Class<T> t) {
        super(innerException);
        this.data = data;
        this.t = t;
    }

    @Override
    protected String getPrivateMessage() {
        return "Could not map data to class with " +
                "class = '" + t.getSimpleName() + "', " +
                "data = '" + data + "'";
    }
}
