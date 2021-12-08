package anime.videos; 
import java.util.List; 
public class Videos {
    private String request_hash;
    private boolean request_cached;
    private int request_cache_expiry;
    private List<Promo> promo;
    private List<Episode> episodes;

    public String getRequest_hash() {
        return request_hash;
    }

    public boolean isRequest_cached() {
        return request_cached;
    }

    public int getRequest_cache_expiry() {
        return request_cache_expiry;
    }

    public List<Promo> getPromo() {
        return promo;
    }

    public List<Episode> getEpisodes() {
        return episodes;
    }
}
