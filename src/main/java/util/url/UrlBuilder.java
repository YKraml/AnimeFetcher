package util.url;

public class UrlBuilder {

    final StringBuilder folders;
    final StringBuilder params;
    String host;
    String connType;

    public UrlBuilder() {
        folders = new StringBuilder();
        params = new StringBuilder();
    }


    public HostSetter setConnType(String connType) {
        this.connType = connType;
        return new HostSetter(this);
    }


}
