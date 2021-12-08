package anime.characters_staff; 
import java.util.List; 
public class Character{
    private int mal_id;
    private String url;
    private String image_url;
    private String name;
    private String role;
    private List<VoiceActor> voice_actors;

    public int getMal_id() {
        return mal_id;
    }

    public String getUrl() {
        return url;
    }

    public String getImage_url() {
        return image_url;
    }

    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }

    public List<VoiceActor> getVoice_actors() {
        return voice_actors;
    }
}
