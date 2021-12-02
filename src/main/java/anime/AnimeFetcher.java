package anime;

import anime.APIObjects.APICaller;
import anime.APIObjects.anime.Anime;
import anime.APIObjects.search.AnimeSearch;
import anime.APIObjects.top.anime.Top;
import anime.APIObjects.top.anime.TopSearch;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.List;
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
    private final ObjectMapper om = new ObjectMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

    public Optional<Anime> getAnimeById(int id) {


        String data = APICaller.getData("https://api.jikan.moe/v3/anime/" + id);
        try {
            Anime anime = om.readValue(data, Anime.class);
            return Optional.ofNullable(anime);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return Optional.empty();
    }

    public Optional<TopSearch> getTopAnimesByPage(int page) {

        String data = APICaller.getData("https://api.jikan.moe/v3/top/anime/" + page + "/tv");
        try {
            TopSearch topSearch = om.readValue(data, TopSearch.class);
            return Optional.ofNullable(topSearch);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return Optional.empty();

    }


    public Optional<AnimeSearch> getAnimeSearchByName(String name){

        String data = APICaller.getData("https://api.jikan.moe/v3/search/anime?q=" + name);
        try {
            AnimeSearch animeSearch = om.readValue(data, AnimeSearch.class);
            return Optional.ofNullable(animeSearch);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return Optional.empty();

    }


    public Optional<Anime> getRandomAnimeOnPage(int page) {

        Optional<TopSearch> topSearch = this.getTopAnimesByPage(page);

        if (topSearch.isPresent()) {

            int r = (int) (topSearch.get().getTop().size() * Math.random());

            Top top = topSearch.get().getTop().get(r);

            return this.getAnimeById(top.getMal_id());
        }

        return Optional.empty();

    }

    public String getOpeningFromAnime(Anime anime) {

        List<String> openingsList = anime.getOpening_themes();

        int r = (int) (openingsList.size() * Math.random());
        String opening = openingsList.get(r);
        String openingName = opening.split("\"")[1];
        String creator = opening.split("\"")[2].split(" ", 3)[2];
        String openingString = openingName + " " + creator;

        return openingString;
    }

}
