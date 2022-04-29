
package jikan.anime.animeReviews;

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
    "jpg",
    "webp"
})
@Generated("jsonschema2pojo")
public class Images {

    @JsonProperty("jpg")
    private Jpg jpg;
    @JsonProperty("webp")
    private Webp webp;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("jpg")
    public Jpg getJpg() {
        return jpg;
    }

    @JsonProperty("jpg")
    public void setJpg(Jpg jpg) {
        this.jpg = jpg;
    }

    @JsonProperty("webp")
    public Webp getWebp() {
        return webp;
    }

    @JsonProperty("webp")
    public void setWebp(Webp webp) {
        this.webp = webp;
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
