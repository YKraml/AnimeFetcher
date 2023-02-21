package caller.anime;

import caller.ACaller;
import model.jikan.anime.animeVideosEpisodes.AnimeVideosEpisodes;

public class AnimeVideosEpisodesCaller extends ACaller<AnimeVideosEpisodes> {
    public AnimeVideosEpisodesCaller(int id) {
        addPathParameter("anime");
        addPathParameter(String.valueOf(id));
        addPathParameter("videos");
        addPathParameter("episodes");
    }

    public AnimeVideosEpisodesCaller page(int page) {
        addQueryParameter("page", String.valueOf(page));
        return this;
    }
}
