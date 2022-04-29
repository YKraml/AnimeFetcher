
package jikan.top.TopPeople;

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
    "website_url",
    "images",
    "name",
    "given_name",
    "family_name",
    "alternate_names",
    "birthday",
    "favorites",
    "about"
})
@Generated("jsonschema2pojo")
public class Datum {

    @JsonProperty("mal_id")
    private Integer malId;
    @JsonProperty("url")
    private String url;
    @JsonProperty("website_url")
    private String websiteUrl;
    @JsonProperty("images")
    private Images images;
    @JsonProperty("name")
    private String name;
    @JsonProperty("given_name")
    private String givenName;
    @JsonProperty("family_name")
    private String familyName;
    @JsonProperty("alternate_names")
    private List<String> alternateNames = null;
    @JsonProperty("birthday")
    private String birthday;
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

    @JsonProperty("website_url")
    public String getWebsiteUrl() {
        return websiteUrl;
    }

    @JsonProperty("website_url")
    public void setWebsiteUrl(String websiteUrl) {
        this.websiteUrl = websiteUrl;
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

    @JsonProperty("given_name")
    public String getGivenName() {
        return givenName;
    }

    @JsonProperty("given_name")
    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }

    @JsonProperty("family_name")
    public String getFamilyName() {
        return familyName;
    }

    @JsonProperty("family_name")
    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    @JsonProperty("alternate_names")
    public List<String> getAlternateNames() {
        return alternateNames;
    }

    @JsonProperty("alternate_names")
    public void setAlternateNames(List<String> alternateNames) {
        this.alternateNames = alternateNames;
    }

    @JsonProperty("birthday")
    public String getBirthday() {
        return birthday;
    }

    @JsonProperty("birthday")
    public void setBirthday(String birthday) {
        this.birthday = birthday;
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
