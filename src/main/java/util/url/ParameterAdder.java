package util.url;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;

public class ParameterAdder {

    private final UrlBuilder urlBuilder;

    public ParameterAdder(UrlBuilder urlBuilder) {
        this.urlBuilder = urlBuilder;
    }

    public ParameterAdder addParameter(String parameter, String value) {
        if (urlBuilder.params.toString().length() > 0) {
            urlBuilder.params.append("&");
        }
        urlBuilder.params.append(parameter);
        urlBuilder.params.append("=");
        urlBuilder.params.append(value);
        return new ParameterAdder(urlBuilder);
    }

    public String getURL() throws URISyntaxException, MalformedURLException {
        URI uri = new URI(
                urlBuilder.connType,
                urlBuilder.host,
                urlBuilder.folders.toString(),
                urlBuilder.params.toString(),
                null);
        return uri.toURL().toString();
    }

}
