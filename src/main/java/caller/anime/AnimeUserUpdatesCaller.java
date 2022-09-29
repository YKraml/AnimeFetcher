package caller.anime;

import caller.ACaller;
import model.jikan.anime.animeUserUpdates.AnimeUserUpdates;

public class AnimeUserUpdatesCaller extends ACaller<AnimeUserUpdates> {
    public AnimeUserUpdatesCaller(int id) {
        pathParameters.add("anime");
        pathParameters.add(String.valueOf(id));
        pathParameters.add("userupdates");
    }

    public AnimeUserUpdatesCaller page(int page) {
        queryParameters.put("page", String.valueOf(page));
        return this;
    }
}
