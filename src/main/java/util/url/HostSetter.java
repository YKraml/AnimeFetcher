package util.url;

public class HostSetter {
    private final UrlBuilder urlBuilder;

    public HostSetter(UrlBuilder urlBuilder) {
        this.urlBuilder = urlBuilder;
    }

    public SubfolderAdder setHost(String host) {
        urlBuilder.host = host;
        return new SubfolderAdder(urlBuilder);
    }
}
