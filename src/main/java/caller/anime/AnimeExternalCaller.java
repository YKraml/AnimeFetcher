package caller.anime;

import caller.ACaller;
import model.jikan.anime.animeExternal.AnimeExternal;

public class AnimeExternalCaller extends ACaller<AnimeExternal> {
    public AnimeExternalCaller(int id) {
        pathParameters.add("anime");
        pathParameters.add(String.valueOf(id));
        pathParameters.add("external");
    }
}
