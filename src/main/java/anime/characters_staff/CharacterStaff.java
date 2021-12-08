package anime.characters_staff; 
import java.util.List; 
public class CharacterStaff {
    private String request_hash;
    private boolean request_cached;
    private int request_cache_expiry;
    private List<Character> characters;
    private List<Staff> staff;

    public String getRequest_hash() {
        return request_hash;
    }

    public boolean isRequest_cached() {
        return request_cached;
    }

    public int getRequest_cache_expiry() {
        return request_cache_expiry;
    }

    public List<Character> getCharacters() {
        return characters;
    }

    public List<Staff> getStaff() {
        return staff;
    }
}
