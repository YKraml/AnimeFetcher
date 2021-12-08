package main;

import caller.MyException;

public class CouldNotMapException extends MyException {

    private final String data;
    private final Class<?> t;

    public <T> CouldNotMapException(String data, Class<T> t) {
        this.data = data;
        this.t = t;
    }

    @Override
    public String getMessage() {
        return "Could not map data to the class";
    }
}
