import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.jetbrains.annotations.NotNull;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ParseUrl {
    private final String protocol;

    private final String host;

    private final String uri;

    public ParseUrl(String path) {
        Pattern pattern = Pattern.compile("^(https?)://(\\w+\\.\\w+)((/\\w+)*)$");
        Matcher matcher = pattern.matcher(path);
        if (matcher.find()) {
            protocol = matcher.group(1);
            host = matcher.group(2);
            uri = matcher.group(3).replaceAll("^/", "");
        } else {
            throw new IllegalArgumentException("Path not valid");
        }
    }

    public String getProtocol() {
        return protocol;
    }

    public String getHost() {
        return host;
    }

    public String getUri() {
        return uri;
    }
}










