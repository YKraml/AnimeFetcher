
package jikan.anime.animeThemes;

import java.util.HashMap;
import java.util.List;
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
    "openings",
    "endings"
})
@Generated("jsonschema2pojo")
public class Data {

    @JsonProperty("openings")
    private List<String> openings = null;
    @JsonProperty("endings")
    private List<String> endings = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("openings")
    public List<String> getOpenings() {
        return openings;
    }

    @JsonProperty("openings")
    public void setOpenings(List<String> openings) {
        this.openings = openings;
    }

    @JsonProperty("endings")
    public List<String> getEndings() {
        return endings;
    }

    @JsonProperty("endings")
    public void setEndings(List<String> endings) {
        this.endings = endings;
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
