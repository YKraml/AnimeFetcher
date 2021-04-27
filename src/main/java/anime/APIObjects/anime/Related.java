
package anime.APIObjects.anime;

import java.util.List;
public class Related {

    private List<Adaptation> adaptation = null;
    private List<Side_story> side_story = null;
    private List<Sequel> sequel = null;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Related() {
    }

    /**
     * 
     * @param adaptation
     * @param side_story
     * @param sequel
     */
    public Related(List<Adaptation> adaptation, List<Side_story> side_story, List<Sequel> sequel) {
        super();
        this.adaptation = adaptation;
        this.side_story = side_story;
        this.sequel = sequel;
    }

    public List<Adaptation> getAdaptation() {
        return adaptation;
    }

    public void setAdaptation(List<Adaptation> adaptation) {
        this.adaptation = adaptation;
    }

    public List<Side_story> getSide_story() {
        return side_story;
    }

    public void setSide_story(List<Side_story> side_story) {
        this.side_story = side_story;
    }

    public List<Sequel> getSequel() {
        return sequel;
    }

    public void setSequel(List<Sequel> sequel) {
        this.sequel = sequel;
    }

}
