package anime.episodes; 
import java.util.List;

public class Episodes {
    public String request_hash;
    public boolean request_cached;
    public int request_cache_expiry;
    public int episodes_last_page;
    public List<Episode> episodes;
}
