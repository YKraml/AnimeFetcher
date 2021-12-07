package anime.reviews; 
import java.util.List; 
public class Reviews {
    public String request_hash;
    public boolean request_cached;
    public int request_cache_expiry;
    public List<Review> reviews;
}
