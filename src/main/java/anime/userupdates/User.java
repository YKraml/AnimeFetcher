package anime.userupdates;

import java.util.Date;

public class User{
    private String username;
    private String url;
    private String image_url;
    private int score;
    private String status;
    private int episodes_seen;
    private int episodes_total;
    private Date date;

    public String getUsername() {
        return username;
    }

    public String getUrl() {
        return url;
    }

    public String getImage_url() {
        return image_url;
    }

    public int getScore() {
        return score;
    }

    public String getStatus() {
        return status;
    }

    public int getEpisodes_seen() {
        return episodes_seen;
    }

    public int getEpisodes_total() {
        return episodes_total;
    }

    public Date getDate() {
        return date;
    }
}
