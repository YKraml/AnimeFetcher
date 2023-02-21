package caller.anime;

import caller.ACaller;
import model.jikan.anime.animeExternal.AnimeExternal;

public class AnimeExternalCaller extends ACaller<AnimeExternal> {
    public AnimeExternalCaller(int id) {
        addPathParameter("anime");
        addPathParameter(String.valueOf(id));
        addPathParameter("external");
    }
}
