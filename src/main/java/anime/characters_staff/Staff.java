package anime.characters_staff; 
import java.util.List; 
public class Staff{
    private int mal_id;
    private String url;
    private String name;
    private String image_url;
    private List<String> positions;

    public int getMal_id() {
        return mal_id;
    }

    public String getUrl() {
        return url;
    }

    public String getName() {
        return name;
    }

    public String getImage_url() {
        return image_url;
    }

    public List<String> getPositions() {
        return positions;
    }
}
