package caller.anime;

import caller.ACaller;
import model.jikan.anime.animeById.AnimeById;

public class AnimeByIdCaller extends ACaller<AnimeById> {
    public AnimeByIdCaller(int id) {
        pathParameters.add("anime");
        pathParameters.add(String.valueOf(id));
    }
}
