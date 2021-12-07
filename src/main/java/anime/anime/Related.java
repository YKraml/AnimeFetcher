package anime.anime; 
import com.fasterxml.jackson.annotation.JsonProperty; 
import java.util.List; 
public class Related{
    @JsonProperty("Adaptation") 
    public List<Adaptation> adaptation;
    @JsonProperty("Other") 
    public List<Other> other;
    @JsonProperty("Sequel") 
    public List<Sequel> sequel;
    @JsonProperty("Alternative version") 
    public List<AlternativeVersion> alternativeVersion;
}
