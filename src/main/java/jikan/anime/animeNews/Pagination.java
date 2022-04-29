
package jikan.anime.animeNews;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "last_visible_page",
    "has_next_page"
})
@Generated("jsonschema2pojo")
public class Pagination {

    @JsonProperty("last_visible_page")
    private Integer lastVisiblePage;
    @JsonProperty("has_next_page")
    private Boolean hasNextPage;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("last_visible_page")
    public Integer getLastVisiblePage() {
        return lastVisiblePage;
    }

    @JsonProperty("last_visible_page")
    public void setLastVisiblePage(Integer lastVisiblePage) {
        this.lastVisiblePage = lastVisiblePage;
    }

    @JsonProperty("has_next_page")
    public Boolean getHasNextPage() {
        return hasNextPage;
    }

    @JsonProperty("has_next_page")
    public void setHasNextPage(Boolean hasNextPage) {
        this.hasNextPage = hasNextPage;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
