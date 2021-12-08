package anime.news; 
import java.util.List; 
public class News {
    private String request_hash;
    private boolean request_cached;
    private int request_cache_expiry;
    private List<Article> articles;

    public String getRequest_hash() {
        return request_hash;
    }

    public boolean isRequest_cached() {
        return request_cached;
    }

    public int getRequest_cache_expiry() {
        return request_cache_expiry;
    }

    public List<Article> getArticles() {
        return articles;
    }
}
