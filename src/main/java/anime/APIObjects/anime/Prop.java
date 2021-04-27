
package anime.APIObjects.anime;

public class Prop {

    private From from;
    private To to;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Prop() {
    }

    /**
     * 
     * @param from
     * @param to
     */
    public Prop(From from, To to) {
        super();
        this.from = from;
        this.to = to;
    }

    public From getFrom() {
        return from;
    }

    public void setFrom(From from) {
        this.from = from;
    }

    public To getTo() {
        return to;
    }

    public void setTo(To to) {
        this.to = to;
    }

}
