package anime;

import anime.APIObjects.APICaller;
import anime.APIObjects.anime.Anime;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.Optional;

/**
 * {@link AnimeFetcher} lädt aus der Jipan MAL Api einen Datensatz runter, falls er nicht schon runtergeladen wurde
 * und erstellt anhand eines ObjectMapper einen Anime.
 */
public class AnimeFetcher {

    /**
     * @param id Id des zu holenden Animes.
     * @return Anime, falls er existiert. Optional.empty, wenn nicht.
     */
    public Optional<Anime> getAnimeById(int id){

        ObjectMapper om = new ObjectMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

        String data = APICaller.getData("https://api.jikan.moe/v3/anime/" + id);
        try {
            Anime anime = om.readValue(data, Anime.class);
            return Optional.ofNullable(anime);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return Optional.empty();
    }

}
