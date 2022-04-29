package enums;

public class AbstractRequest {

    private final String requestString;
    private final Class<?> requestClass;

    AbstractRequest(String requestString, Class<?> requestClass) {
        this.requestString = requestString;
        this.requestClass = requestClass;
    }

    public String getRequestString() {
        return requestString;
    }

    @SuppressWarnings("unchecked")
    public <T> Class<T> getRequestClass() {
        return (Class<T>) requestClass;
    }

}
