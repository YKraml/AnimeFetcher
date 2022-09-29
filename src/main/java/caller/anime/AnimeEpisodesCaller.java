package caller.anime;

import caller.ACaller;
import model.jikan.anime.animeEpisodes.AnimeEpisodes;

public class AnimeEpisodesCaller extends ACaller<AnimeEpisodes> {

    public AnimeEpisodesCaller(int id) {
        pathParameters.add("anime");
        pathParameters.add(String.valueOf(id));
        pathParameters.add("episodes");
    }


    public AnimeEpisodesCaller page(int page) {
        queryParameters.put("page", String.valueOf(page));
        return this;
    }
}
