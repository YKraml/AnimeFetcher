package caller.anime;

import caller.ACaller;
import model.jikan.anime.animeUserUpdates.AnimeUserUpdates;

public class AnimeUserUpdatesCaller extends ACaller<AnimeUserUpdates> {
    public AnimeUserUpdatesCaller(int id) {
        addPathParameter("anime");
        addPathParameter(String.valueOf(id));
        addPathParameter("userupdates");
    }

    public AnimeUserUpdatesCaller page(int page) {
        addQueryParameter("page", String.valueOf(page));
        return this;
    }
}
