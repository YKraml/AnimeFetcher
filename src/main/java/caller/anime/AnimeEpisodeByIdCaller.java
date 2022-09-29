package caller.anime;

import caller.ACaller;
import model.jikan.anime.animeEpisodeById.AnimeEpisodeById;

public class AnimeEpisodeByIdCaller extends ACaller<AnimeEpisodeById> {
    public AnimeEpisodeByIdCaller(int id, int episode) {
        pathParameters.add("anime");
        pathParameters.add(String.valueOf(id));
        pathParameters.add("episodes");
        pathParameters.add(String.valueOf(episode));
    }
}
