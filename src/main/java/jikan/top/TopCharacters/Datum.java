
package jikan.top.TopCharacters;

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
    "mal_id",
    "url",
    "images",
    "name",
    "name_kanji",
    "nicknames",
    "favorites",
    "about"
})
@Generated("jsonschema2pojo")
public class Datum {

    @JsonProperty("mal_id")
    private Integer malId;
    @JsonProperty("url")
    private String url;
    @JsonProperty("images")
    private Images images;
    @JsonProperty("name")
    private String name;
    @JsonProperty("name_kanji")
    private String nameKanji;
    @JsonProperty("nicknames")
    private List<String> nicknames = null;
    @JsonProperty("favorites")
    private Integer favorites;
    @JsonProperty("about")
    private String about;
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

    @JsonProperty("images")
    public Images getImages() {
        return images;
    }

    @JsonProperty("images")
    public void setImages(Images images) {
        this.images = images;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("name_kanji")
    public String getNameKanji() {
        return nameKanji;
    }

    @JsonProperty("name_kanji")
    public void setNameKanji(String nameKanji) {
        this.nameKanji = nameKanji;
    }

    @JsonProperty("nicknames")
    public List<String> getNicknames() {
        return nicknames;
    }

    @JsonProperty("nicknames")
    public void setNicknames(List<String> nicknames) {
        this.nicknames = nicknames;
    }

    @JsonProperty("favorites")
    public Integer getFavorites() {
        return favorites;
    }

    @JsonProperty("favorites")
    public void setFavorites(Integer favorites) {
        this.favorites = favorites;
    }

    @JsonProperty("about")
    public String getAbout() {
        return about;
    }

    @JsonProperty("about")
    public void setAbout(String about) {
        this.about = about;
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
