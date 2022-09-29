package caller.anime;

import caller.ACaller;
import model.jikan.anime.animeVideos.AnimeVideos;

public class AnimeVideosCaller extends ACaller<AnimeVideos> {
    public AnimeVideosCaller(int id) {
        pathParameters.add("anime");
        pathParameters.add(String.valueOf(id));
        pathParameters.add("videos");
    }
}
