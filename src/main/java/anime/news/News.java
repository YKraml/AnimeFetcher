package anime.news; 
import java.util.List; 
public class News {
    public String request_hash;
    public boolean request_cached;
    public int request_cache_expiry;
    public List<Article> articles;
}
