package anime.videos; 
import java.util.List; 
public class Videos {
    public String request_hash;
    public boolean request_cached;
    public int request_cache_expiry;
    public List<Promo> promo;
    public List<Episode> episodes;
}
