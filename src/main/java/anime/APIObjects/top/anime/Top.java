
package anime.APIObjects.top.anime;

public class Top {

    private Integer mal_id;
    private Integer rank;
    private String title;
    private String url;
    private String image_url;
    private String type;
    private Integer episodes;
    private String start_date;
    private String end_date;
    private Integer members;
    private Double score;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Top() {
    }

    /**
     * 
     * @param end_date
     * @param score
     * @param image_url
     * @param members
     * @param rank
     * @param mal_id
     * @param title
     * @param type
     * @param url
     * @param episodes
     * @param start_date
     */
    public Top(Integer mal_id, Integer rank, String title, String url, String image_url, String type, Integer episodes, String start_date, String end_date, Integer members, Double score) {
        super();
        this.mal_id = mal_id;
        this.rank = rank;
        this.title = title;
        this.url = url;
        this.image_url = image_url;
        this.type = type;
        this.episodes = episodes;
        this.start_date = start_date;
        this.end_date = end_date;
        this.members = members;
        this.score = score;
    }

    public Integer getMal_id() {
        return mal_id;
    }

    public void setMal_id(Integer mal_id) {
        this.mal_id = mal_id;
    }

    public Integer getRank() {
        return rank;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

}
