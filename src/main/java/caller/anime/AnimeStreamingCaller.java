package caller.anime;

import caller.ACaller;
import model.jikan.anime.animeStreaming.AnimeStreaming;

public class AnimeStreamingCaller extends ACaller<AnimeStreaming> {
    public AnimeStreamingCaller(int id) {
        addPathParameter("anime");
        addPathParameter(String.valueOf(id));
        addPathParameter("streaming");
    }
}
