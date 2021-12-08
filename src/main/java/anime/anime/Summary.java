package anime.anime;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "mal_id",
        "type",
        "name",
        "url"
})

public class Summary {

    @JsonProperty("mal_id")
    private Integer mal_id;
    @JsonProperty("type")
    private String type;
    @JsonProperty("name")
    private String name;
    @JsonProperty("url")
    private String url;

    @JsonProperty("mal_id")
    public Integer getMal_id() {
        return mal_id;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("url")
    public String getUrl() {
        return url;
    }
}