package anime.recommendations; 
import java.util.List; 
public class Recommendations {
    private String request_hash;
    private boolean request_cached;
    private int request_cache_expiry;
    private List<Recommendation> recommendations;

    public String getRequest_hash() {
        return request_hash;
    }

    public boolean isRequest_cached() {
        return request_cached;
    }

    public int getRequest_cache_expiry() {
        return request_cache_expiry;
    }

    public List<Recommendation> getRecommendations() {
        return recommendations;
    }
}
