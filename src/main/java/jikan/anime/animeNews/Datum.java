
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
    "mal_id",
    "url",
    "title",
    "date",
    "author_username",
    "author_url",
    "forum_url",
    "images",
    "comments",
    "excerpt"
})
@Generated("jsonschema2pojo")
public class Datum {

    @JsonProperty("mal_id")
    private Integer malId;
    @JsonProperty("url")
    private String url;
    @JsonProperty("title")
    private String title;
    @JsonProperty("date")
    private String date;
    @JsonProperty("author_username")
    private String authorUsername;
    @JsonProperty("author_url")
    private String authorUrl;
    @JsonProperty("forum_url")
    private String forumUrl;
    @JsonProperty("images")
    private Images images;
    @JsonProperty("comments")
    private Integer comments;
    @JsonProperty("excerpt")
    private String excerpt;
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

    @JsonProperty("date")
    public String getDate() {
        return date;
    }

    @JsonProperty("date")
    public void setDate(String date) {
        this.date = date;
    }

    @JsonProperty("author_username")
    public String getAuthorUsername() {
        return authorUsername;
    }

    @JsonProperty("author_username")
    public void setAuthorUsername(String authorUsername) {
        this.authorUsername = authorUsername;
    }

    @JsonProperty("author_url")
    public String getAuthorUrl() {
        return authorUrl;
    }

    @JsonProperty("author_url")
    public void setAuthorUrl(String authorUrl) {
        this.authorUrl = authorUrl;
    }

    @JsonProperty("forum_url")
    public String getForumUrl() {
        return forumUrl;
    }

    @JsonProperty("forum_url")
    public void setForumUrl(String forumUrl) {
        this.forumUrl = forumUrl;
    }

    @JsonProperty("images")
    public Images getImages() {
        return images;
    }

    @JsonProperty("images")
    public void setImages(Images images) {
        this.images = images;
    }

    @JsonProperty("comments")
    public Integer getComments() {
        return comments;
    }

    @JsonProperty("comments")
    public void setComments(Integer comments) {
        this.comments = comments;
    }

    @JsonProperty("excerpt")
    public String getExcerpt() {
        return excerpt;
    }

    @JsonProperty("excerpt")
    public void setExcerpt(String excerpt) {
        this.excerpt = excerpt;
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
