
package jikan.anime.animeCharacters;

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
    "character",
    "role",
    "voice_actors"
})
@Generated("jsonschema2pojo")
public class Datum {

    @JsonProperty("character")
    private Character character;
    @JsonProperty("role")
    private String role;
    @JsonProperty("voice_actors")
    private List<VoiceActor> voiceActors = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("character")
    public Character getCharacter() {
        return character;
    }

    @JsonProperty("character")
    public void setCharacter(Character character) {
        this.character = character;
    }

    @JsonProperty("role")
    public String getRole() {
        return role;
    }

    @JsonProperty("role")
    public void setRole(String role) {
        this.role = role;
    }

    @JsonProperty("voice_actors")
    public List<VoiceActor> getVoiceActors() {
        return voiceActors;
    }

    @JsonProperty("voice_actors")
    public void setVoiceActors(List<VoiceActor> voiceActors) {
        this.voiceActors = voiceActors;
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
