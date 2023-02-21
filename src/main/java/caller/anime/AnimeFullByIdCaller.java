package caller.anime;

import caller.ACaller;
import model.jikan.anime.animeByIdFull.AnimeFullById;

public class AnimeFullByIdCaller extends ACaller<AnimeFullById> {
    public AnimeFullByIdCaller(int id) {
        addPathParameter("anime");
        addPathParameter(String.valueOf(id));
        addPathParameter("full");
    }
}
