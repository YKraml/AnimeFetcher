
package jikan.anime.animeVideos;

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
    "mal_id",
    "url",
    "title",
    "episode",
    "images"
})
@Generated("jsonschema2pojo")
public class Episode {

    @JsonProperty("mal_id")
    private Integer malId;
    @JsonProperty("url")
    private String url;
    @JsonProperty("title")
    private String title;
    @JsonProperty("episode")
    private String episode;
    @JsonProperty("images")
    private Images__1 images;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("mal_id")
    public Integer getMalId() {
        return malId;
    }

    @JsonProperty("mal_id")
    public void setMalId(Integer malId) {
        this.malId = malId;
    }

    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }

    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    @JsonProperty("episode")
    public String getEpisode() {
        return episode;
    }

    @JsonProperty("episode")
    public void setEpisode(String episode) {
        this.episode = episode;
    }

    @JsonProperty("images")
    public Images__1 getImages() {
        return images;
    }

    @JsonProperty("images")
    public void setImages(Images__1 images) {
        this.images = images;
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
