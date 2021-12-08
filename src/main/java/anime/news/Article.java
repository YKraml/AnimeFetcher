package anime.news;

import java.util.Date;

public class Article{
    private String url;
    private String title;
    private Date date;
    private String author_name;
    private String author_url;
    private String forum_url;
    private String image_url;
    private int comments;
    private String intro;

    public String getUrl() {
        return url;
    }

    public String getTitle() {
        return title;
    }

    public Date getDate() {
        return date;
    }

    public String getAuthor_name() {
        return author_name;
    }

    public String getAuthor_url() {
        return author_url;
    }

    public String getForum_url() {
        return forum_url;
    }

    public String getImage_url() {
        return image_url;
    }

    public int getComments() {
        return comments;
    }

    public String getIntro() {
        return intro;
    }
}
