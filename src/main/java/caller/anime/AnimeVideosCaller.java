package caller.anime;

import caller.ACaller;
import model.jikan.anime.animeVideos.AnimeVideos;

public class AnimeVideosCaller extends ACaller<AnimeVideos> {
    public AnimeVideosCaller(int id) {
        addPathParameter("anime");
        addPathParameter(String.valueOf(id));
        addPathParameter("videos");
    }
}
