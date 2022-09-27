
package model.jikan.characters.characterFullById;

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
public class Images__2 {

    @JsonProperty("jpg")
    private Jpg__2 jpg;
    @JsonProperty("webp")
    private Webp__2 webp;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("jpg")
    public Jpg__2 getJpg() {
        return jpg;
    }

    @JsonProperty("jpg")
    public void setJpg(Jpg__2 jpg) {
        this.jpg = jpg;
    }

    @JsonProperty("webp")
    public Webp__2 getWebp() {
        return webp;
    }

    @JsonProperty("webp")
    public void setWebp(Webp__2 webp) {
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
