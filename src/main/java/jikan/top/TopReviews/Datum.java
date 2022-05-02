
package jikan.top.TopReviews;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "mal_id",
    "url",
    "type",
    "votes",
    "date",
    "review",
    "episodes_watched",
    "scores",
    "entry",
    "user"
})
@Generated("jsonschema2pojo")
public class Datum {

    @JsonProperty("mal_id")
    private Integer malId;
    @JsonProperty("url")
    private String url;
    @JsonProperty("type")
    private String type;
    @JsonProperty("votes")
    private Integer votes;
    @JsonProperty("date")
    private String date;
    @JsonProperty("review")
    private String review;
    @JsonProperty("episodes_watched")
    private Integer episodesWatched;
    @JsonProperty("scores")
    private Scores scores;
    @JsonProperty("entry")
    private Entry entry;
    @JsonProperty("user")
    private User user;
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

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("votes")
    public Integer getVotes() {
        return votes;
    }

    @JsonProperty("votes")
    public void setVotes(Integer votes) {
        this.votes = votes;
    }

    @JsonProperty("date")
    public String getDate() {
        return date;
    }

    @JsonProperty("date")
    public void setDate(String date) {
        this.date = date;
    }

    @JsonProperty("review")
    public String getReview() {
        return review;
    }

    @JsonProperty("review")
    public void setReview(String review) {
        this.review = review;
    }

    @JsonProperty("episodes_watched")
    public Integer getEpisodesWatched() {
        return episodesWatched;
    }

    @JsonProperty("episodes_watched")
    public void setEpisodesWatched(Integer episodesWatched) {
        this.episodesWatched = episodesWatched;
    }

    @JsonProperty("scores")
    public Scores getScores() {
        return scores;
    }

    @JsonProperty("scores")
    public void setScores(Scores scores) {
        this.scores = scores;
    }

    @JsonProperty("entry")
    public Entry getEntry() {
        return entry;
    }

    @JsonProperty("entry")
    public void setEntry(Entry entry) {
        this.entry = entry;
    }

    @JsonProperty("user")
    public User getUser() {
        return user;
    }

    @JsonProperty("user")
    public void setUser(User user) {
        this.user = user;
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
