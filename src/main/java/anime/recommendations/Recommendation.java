package anime.recommendations; 
public class Recommendation{
    private int mal_id;
    private String url;
    private String image_url;
    private String recommendation_url;
    private String title;
    private int recommendation_count;

    public int getMal_id() {
        return mal_id;
    }

    public String getUrl() {
        return url;
    }

    public String getImage_url() {
        return image_url;
    }

    public String getRecommendation_url() {
        return recommendation_url;
    }

    public String getTitle() {
        return title;
    }

    public int getRecommendation_count() {
        return recommendation_count;
    }
}
