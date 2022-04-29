
package jikan.anime.animeVideos;

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
    "promo",
    "episodes"
})
@Generated("jsonschema2pojo")
public class Data {

    @JsonProperty("promo")
    private List<Promo> promo = null;
    @JsonProperty("episodes")
    private List<Episode> episodes = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("promo")
    public List<Promo> getPromo() {
        return promo;
    }

    @JsonProperty("promo")
    public void setPromo(List<Promo> promo) {
        this.promo = promo;
    }

    @JsonProperty("episodes")
    public List<Episode> getEpisodes() {
        return episodes;
    }

    @JsonProperty("episodes")
    public void setEpisodes(List<Episode> episodes) {
        this.episodes = episodes;
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
