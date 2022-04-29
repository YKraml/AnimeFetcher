
package jikan.anime.animeEpisodes;

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
    "title_japanese",
    "title_romanji",
    "duration",
    "aired",
    "filler",
    "recap",
    "forum_url"
})
@Generated("jsonschema2pojo")
public class Datum {

    @JsonProperty("mal_id")
    private Integer malId;
    @JsonProperty("url")
    private String url;
    @JsonProperty("title")
    private String title;
    @JsonProperty("title_japanese")
    private String titleJapanese;
    @JsonProperty("title_romanji")
    private String titleRomanji;
    @JsonProperty("duration")
    private Integer duration;
    @JsonProperty("aired")
    private String aired;
    @JsonProperty("filler")
    private Boolean filler;
    @JsonProperty("recap")
    private Boolean recap;
    @JsonProperty("forum_url")
    private String forumUrl;
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

    @JsonProperty("title_japanese")
    public String getTitleJapanese() {
        return titleJapanese;
    }

    @JsonProperty("title_japanese")
    public void setTitleJapanese(String titleJapanese) {
        this.titleJapanese = titleJapanese;
    }

    @JsonProperty("title_romanji")
    public String getTitleRomanji() {
        return titleRomanji;
    }

    @JsonProperty("title_romanji")
    public void setTitleRomanji(String titleRomanji) {
        this.titleRomanji = titleRomanji;
    }

    @JsonProperty("duration")
    public Integer getDuration() {
        return duration;
    }

    @JsonProperty("duration")
    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    @JsonProperty("aired")
    public String getAired() {
        return aired;
    }

    @JsonProperty("aired")
    public void setAired(String aired) {
        this.aired = aired;
    }

    @JsonProperty("filler")
    public Boolean getFiller() {
        return filler;
    }

    @JsonProperty("filler")
    public void setFiller(Boolean filler) {
        this.filler = filler;
    }

    @JsonProperty("recap")
    public Boolean getRecap() {
        return recap;
    }

    @JsonProperty("recap")
    public void setRecap(Boolean recap) {
        this.recap = recap;
    }

    @JsonProperty("forum_url")
    public String getForumUrl() {
        return forumUrl;
    }

    @JsonProperty("forum_url")
    public void setForumUrl(String forumUrl) {
        this.forumUrl = forumUrl;
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
