package anime.forum;

import java.util.Date;

public class Topic{
    private int topic_id;
    private String url;
    private String title;
    private Date date_posted;
    private String author_name;
    private String author_url;
    private int replies;
    private LastPost last_post;

    public int getTopic_id() {
        return topic_id;
    }

    public String getUrl() {
        return url;
    }

    public String getTitle() {
        return title;
    }

    public Date getDate_posted() {
        return date_posted;
    }

    public String getAuthor_name() {
        return author_name;
    }

    public String getAuthor_url() {
        return author_url;
    }

    public int getReplies() {
        return replies;
    }

    public LastPost getLast_post() {
        return last_post;
    }
}
