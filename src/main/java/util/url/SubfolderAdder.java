package util.url;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;

public class SubfolderAdder {

    private final UrlBuilder urlBuilder;

    public SubfolderAdder(UrlBuilder urlBuilder) {
        this.urlBuilder = urlBuilder;
    }

    public SubfolderAdder addSubfolder(String folder) {
        urlBuilder.folders.append("/");
        urlBuilder.folders.append(folder);
        return new SubfolderAdder(urlBuilder);
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
