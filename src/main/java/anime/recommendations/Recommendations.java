package anime.recommendations; 
import java.util.List; 
public class Recommendations {
    public String request_hash;
    public boolean request_cached;
    public int request_cache_expiry;
    public List<Recommendation> recommendations;
}
