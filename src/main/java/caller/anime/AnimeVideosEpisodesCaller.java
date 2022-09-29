package caller.anime;

import caller.ACaller;
import model.jikan.anime.animeVideosEpisodes.AnimeVideosEpisodes;

public class AnimeVideosEpisodesCaller extends ACaller<AnimeVideosEpisodes> {
    public AnimeVideosEpisodesCaller(int id) {
        pathParameters.add("anime");
        pathParameters.add(String.valueOf(id));
        pathParameters.add("videos");
        pathParameters.add("episodes");
    }

    public AnimeVideosEpisodesCaller page(int page) {
        queryParameters.put("page", String.valueOf(page));
        return this;
    }
}
