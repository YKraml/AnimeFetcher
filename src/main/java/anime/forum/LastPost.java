package anime.forum;

import java.util.Date;

public class LastPost{
    private String url;
    private String author_name;
    private String author_url;
    private Date date_posted;

    public String getUrl() {
        return url;
    }

    public String getAuthor_name() {
        return author_name;
    }

    public String getAuthor_url() {
        return author_url;
    }

    public Date getDate_posted() {
        return date_posted;
    }
}
