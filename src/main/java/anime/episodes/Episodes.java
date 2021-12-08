
package anime.episodes;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "request_hash",
    "request_cached",
    "request_cache_expiry",
    "episodes_last_page",
    "episodes"
})

public class Episodes {

    @JsonProperty("request_hash")
    private String request_hash;
    @JsonProperty("request_cached")
    private Boolean request_cached;
    @JsonProperty("request_cache_expiry")
    private Integer request_cache_expiry;
    @JsonProperty("episodes_last_page")
    private Integer episodes_last_page;
    @JsonProperty("episodes")
    private List<Episode> episodes = null;

    @JsonProperty("request_hash")
    public String getRequest_hash() {
        return request_hash;
    }


    @JsonProperty("request_cached")
    public Boolean getRequest_cached() {
        return request_cached;
    }

    @JsonProperty("request_cache_expiry")
    public Integer getRequest_cache_expiry() {
        return request_cache_expiry;
    }


    @JsonProperty("episodes_last_page")
    public Integer getEpisodes_last_page() {
        return episodes_last_page;
    }


    @JsonProperty("episodes")
    public List<Episode> getEpisodes() {
        return episodes;
    }



}
