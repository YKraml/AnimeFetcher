package anime.reviews;

import java.util.Date;

public class Review{
    private int mal_id;
    private String url;
    private Object type;
    private int helpful_count;
    private Date date;
    private Reviewer reviewer;
    private String content;

    public int getMal_id() {
        return mal_id;
    }

    public String getUrl() {
        return url;
    }

    public Object getType() {
        return type;
    }

    public int getHelpful_count() {
        return helpful_count;
    }

    public Date getDate() {
        return date;
    }

    public Reviewer getReviewer() {
        return reviewer;
    }

    public String getContent() {
        return content;
    }
}
