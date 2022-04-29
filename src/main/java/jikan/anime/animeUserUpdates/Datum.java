
package jikan.anime.animeUserUpdates;

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
    "user",
    "score",
    "status",
    "episodes_seen",
    "episodes_total",
    "date"
})
@Generated("jsonschema2pojo")
public class Datum {

    @JsonProperty("user")
    private User user;
    @JsonProperty("score")
    private Integer score;
    @JsonProperty("status")
    private String status;
    @JsonProperty("episodes_seen")
    private Integer episodesSeen;
    @JsonProperty("episodes_total")
    private Integer episodesTotal;
    @JsonProperty("date")
    private String date;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("user")
    public User getUser() {
        return user;
    }

    @JsonProperty("user")
    public void setUser(User user) {
        this.user = user;
    }

    @JsonProperty("score")
    public Integer getScore() {
        return score;
    }

    @JsonProperty("score")
    public void setScore(Integer score) {
        this.score = score;
    }

    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

    @JsonProperty("episodes_seen")
    public Integer getEpisodesSeen() {
        return episodesSeen;
    }

    @JsonProperty("episodes_seen")
    public void setEpisodesSeen(Integer episodesSeen) {
        this.episodesSeen = episodesSeen;
    }

    @JsonProperty("episodes_total")
    public Integer getEpisodesTotal() {
        return episodesTotal;
    }

    @JsonProperty("episodes_total")
    public void setEpisodesTotal(Integer episodesTotal) {
        this.episodesTotal = episodesTotal;
    }

    @JsonProperty("date")
    public String getDate() {
        return date;
    }

    @JsonProperty("date")
    public void setDate(String date) {
        this.date = date;
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
