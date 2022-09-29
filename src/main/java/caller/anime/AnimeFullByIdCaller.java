package caller.anime;

import caller.ACaller;
import model.jikan.anime.animeByIdFull.AnimeFullById;

public class AnimeFullByIdCaller extends ACaller<AnimeFullById> {
    public AnimeFullByIdCaller(int id) {
        pathParameters.add("anime");
        pathParameters.add(String.valueOf(id));
        pathParameters.add("full");
    }
}
