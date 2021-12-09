package exceptions;

import com.fasterxml.jackson.core.JsonProcessingException;

public class CouldNotMapException extends MyException {

    private final String data;
    private final Class<?> t;

    public <T> CouldNotMapException(JsonProcessingException originalException, String data, Class<T> t) {
        super(originalException);
        this.data = data;
        this.t = t;
    }

    @Override
    protected String getPrivateMessage() {
        return super.innerException.getMessage();
    }
}
