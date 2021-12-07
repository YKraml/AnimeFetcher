package anime.forum; 
import java.util.List; 
public class Forum {
    public String request_hash;
    public boolean request_cached;
    public int request_cache_expiry;
    public List<Topic> topics;
}
