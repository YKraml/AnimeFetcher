package caller.anime;

import caller.ACaller;
import model.jikan.anime.animeStreaming.AnimeStreaming;

public class AnimeStreamingCaller extends ACaller<AnimeStreaming> {
    public AnimeStreamingCaller(int id) {
        pathParameters.add("anime");
        pathParameters.add(String.valueOf(id));
        pathParameters.add("streaming");
    }
}
