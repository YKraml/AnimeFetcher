
package anime.APIObjects.search;

public class Result {

    private Integer mal_id;
    private String url;
    private String image_url;
    private String title;
    private Boolean airing;
    private String synopsis;
    private String type;
    private Integer episodes;
    private Double score;
    private String start_date;
    private String end_date;
    private Integer members;
    private String rated;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Result() {
    }

    /**
     * 
     * @param end_date
     * @param image_url
     * @param mal_id
     * @param synopsis
     * @param title
     * @param type
     * @param url
     * @param rated
     * @param score
     * @param members
     * @param airing
     * @param episodes
     * @param start_date
     */
    public Result(Integer mal_id, String url, String image_url, String title, Boolean airing, String synopsis, String type, Integer episodes, Double score, String start_date, String end_date, Integer members, String rated) {
        super();
        this.mal_id = mal_id;
        this.url = url;
        this.image_url = image_url;
        this.title = title;
        this.airing = airing;
        this.synopsis = synopsis;
        this.type = type;
        this.episodes = episodes;
        this.score = score;
        this.start_date = start_date;
        this.end_date = end_date;
        this.members = members;
        this.rated = rated;
    }

    public Integer getMal_id() {
        return mal_id;
    }

    public void setMal_id(Integer mal_id) {
        this.mal_id = mal_id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getImage_url() {
        return image_url;
    }

    public void setImage_url(String image_url) {
        this.image_url = image_url;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Boolean getAiring() {
        return airing;
    }

    public void setAiring(Boolean airing) {
        this.airing = airing;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getEpisodes() {
        return episodes;
    }

    public void setEpisodes(Integer episodes) {
        this.episodes = episodes;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public String getStart_date() {
        return start_date;
    }

    public void setStart_date(String start_date) {
        this.start_date = start_date;
    }

    public String getEnd_date() {
        return end_date;
    }

    public void setEnd_date(String end_date) {
        this.end_date = end_date;
    }

    public Integer getMembers() {
        return members;
    }

    public void setMembers(Integer members) {
        this.members = members;
    }

    public String getRated() {
        return rated;
    }

    public void setRated(String rated) {
        this.rated = rated;
    }

}
