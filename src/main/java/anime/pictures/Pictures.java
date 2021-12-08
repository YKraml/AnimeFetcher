package anime.pictures; 
import java.util.List; 
public class Pictures {
    private String request_hash;
    private boolean request_cached;
    private int request_cache_expiry;
    private List<Picture> pictures;

    public String getRequest_hash() {
        return request_hash;
    }

    public boolean isRequest_cached() {
        return request_cached;
    }

    public int getRequest_cache_expiry() {
        return request_cache_expiry;
    }

    public List<Picture> getPictures() {
        return pictures;
    }
}
