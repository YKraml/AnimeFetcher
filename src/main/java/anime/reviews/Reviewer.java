package anime.reviews; 
public class Reviewer{
    private String url;
    private String image_url;
    private String username;
    private int episodes_seen;
    private Scores scores;

    public String getUrl() {
        return url;
    }

    public String getImage_url() {
        return image_url;
    }

    public String getUsername() {
        return username;
    }

    public int getEpisodes_seen() {
        return episodes_seen;
    }

    public Scores getScores() {
        return scores;
    }
}
