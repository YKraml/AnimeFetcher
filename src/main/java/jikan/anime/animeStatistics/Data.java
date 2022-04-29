
package jikan.anime.animeStatistics;

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
    "watching",
    "completed",
    "on_hold",
    "dropped",
    "plan_to_watch",
    "total",
    "scores"
})
@Generated("jsonschema2pojo")
public class Data {

    @JsonProperty("watching")
    private Integer watching;
    @JsonProperty("completed")
    private Integer completed;
    @JsonProperty("on_hold")
    private Integer onHold;
    @JsonProperty("dropped")
    private Integer dropped;
    @JsonProperty("plan_to_watch")
    private Integer planToWatch;
    @JsonProperty("total")
    private Integer total;
    @JsonProperty("scores")
    private List<Score> scores = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("watching")
    public Integer getWatching() {
        return watching;
    }

    @JsonProperty("watching")
    public void setWatching(Integer watching) {
        this.watching = watching;
    }

    @JsonProperty("completed")
    public Integer getCompleted() {
        return completed;
    }

    @JsonProperty("completed")
    public void setCompleted(Integer completed) {
        this.completed = completed;
    }

    @JsonProperty("on_hold")
    public Integer getOnHold() {
        return onHold;
    }

    @JsonProperty("on_hold")
    public void setOnHold(Integer onHold) {
        this.onHold = onHold;
    }

    @JsonProperty("dropped")
    public Integer getDropped() {
        return dropped;
    }

    @JsonProperty("dropped")
    public void setDropped(Integer dropped) {
        this.dropped = dropped;
    }

    @JsonProperty("plan_to_watch")
    public Integer getPlanToWatch() {
        return planToWatch;
    }

    @JsonProperty("plan_to_watch")
    public void setPlanToWatch(Integer planToWatch) {
        this.planToWatch = planToWatch;
    }

    @JsonProperty("total")
    public Integer getTotal() {
        return total;
    }

    @JsonProperty("total")
    public void setTotal(Integer total) {
        this.total = total;
    }

    @JsonProperty("scores")
    public List<Score> getScores() {
        return scores;
    }

    @JsonProperty("scores")
    public void setScores(List<Score> scores) {
        this.scores = scores;
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
