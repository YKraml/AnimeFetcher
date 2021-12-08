package anime.anime;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.ArrayList;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "Adaptation",
        "Prequel",
        "Alternative version",
        "Side story",
        "Spin-off",
        "Other",
        "Sequel",
        "Full story",
        "Parent story",
        "Summary",
        "Character",
        "Alternative setting"
})

public class Related {

    @JsonProperty("Adaptation")
    private List<Adaptation> adaptation = new ArrayList<Adaptation>();
    @JsonProperty("Prequel")
    private List<Prequel> prequel = new ArrayList<Prequel>();
    @JsonProperty("Alternative version")
    private List<Alternative_version> alternative_version = new ArrayList<Alternative_version>();
    @JsonProperty("Side story")
    private List<Side_story> side_story = new ArrayList<Side_story>();
    @JsonProperty("Spin-off")
    private List<Spin_off> spin_off = new ArrayList<Spin_off>();
    @JsonProperty("Other")
    private List<Other> other = new ArrayList<Other>();
    @JsonProperty("Sequel")
    private List<Sequel> sequel = new ArrayList<Sequel>();
    @JsonProperty("Full story")
    private List<Full_story> full_story = new ArrayList<Full_story>();
    @JsonProperty("Parent story")
    private List<Parent_story> parent_story = new ArrayList<Parent_story>();
    @JsonProperty("Summary")
    private List<Summary> summary = new ArrayList<Summary>();
    @JsonProperty("Character")
    private List<Character> character = new ArrayList<Character>();
    @JsonProperty("Alternative setting")
    private List<Alternative_setting> alternative_setting = new ArrayList<Alternative_setting>();

    @JsonProperty("Adaptation")
    public List<Adaptation> getAdaptation() {
        return adaptation;
    }

    @JsonProperty("Prequel")
    public List<Prequel> getPrequel() {
        return prequel;
    }

    @JsonProperty("Side story")
    public List<Side_story> getSide_story() {
        return side_story;
    }

    @JsonProperty("Spin-off")
    public List<Spin_off> getSpin_off() {
        return spin_off;
    }

    @JsonProperty("Other")
    public List<Other> getOther() {
        return other;
    }

    @JsonProperty("Sequel")
    public List<Sequel> getSequel() {
        return sequel;
    }

    public List<Alternative_version> getAlternative_version() {
        return alternative_version;
    }

    public List<Full_story> getFull_story() {
        return full_story;
    }

    public List<Parent_story> getParent_story() {
        return parent_story;
    }

    public List<Character> getCharacter() {
        return character;
    }

    public List<Summary> getSummary() {
        return summary;
    }

    public List<Alternative_setting> getAlternative_setting() {
        return alternative_setting;
    }
}
