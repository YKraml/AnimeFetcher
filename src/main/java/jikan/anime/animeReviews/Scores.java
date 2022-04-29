
package jikan.anime.animeReviews;

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
    "overall",
    "story",
    "animation",
    "sound",
    "character",
    "enjoyment"
})
@Generated("jsonschema2pojo")
public class Scores {

    @JsonProperty("overall")
    private Integer overall;
    @JsonProperty("story")
    private Integer story;
    @JsonProperty("animation")
    private Integer animation;
    @JsonProperty("sound")
    private Integer sound;
    @JsonProperty("character")
    private Integer character;
    @JsonProperty("enjoyment")
    private Integer enjoyment;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("overall")
    public Integer getOverall() {
        return overall;
    }

    @JsonProperty("overall")
    public void setOverall(Integer overall) {
        this.overall = overall;
    }

    @JsonProperty("story")
    public Integer getStory() {
        return story;
    }

    @JsonProperty("story")
    public void setStory(Integer story) {
        this.story = story;
    }

    @JsonProperty("animation")
    public Integer getAnimation() {
        return animation;
    }

    @JsonProperty("animation")
    public void setAnimation(Integer animation) {
        this.animation = animation;
    }

    @JsonProperty("sound")
    public Integer getSound() {
        return sound;
    }

    @JsonProperty("sound")
    public void setSound(Integer sound) {
        this.sound = sound;
    }

    @JsonProperty("character")
    public Integer getCharacter() {
        return character;
    }

    @JsonProperty("character")
    public void setCharacter(Integer character) {
        this.character = character;
    }

    @JsonProperty("enjoyment")
    public Integer getEnjoyment() {
        return enjoyment;
    }

    @JsonProperty("enjoyment")
    public void setEnjoyment(Integer enjoyment) {
        this.enjoyment = enjoyment;
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
