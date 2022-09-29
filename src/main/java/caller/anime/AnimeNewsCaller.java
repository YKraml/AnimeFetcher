package caller.anime;

import caller.ACaller;
import model.jikan.anime.animeNews.AnimeNews;

public class AnimeNewsCaller extends ACaller<AnimeNews> {
    public AnimeNewsCaller(int id) {
        pathParameters.add("anime");
        pathParameters.add(String.valueOf(id));
        pathParameters.add("news");
    }

    public AnimeNewsCaller page(int page) {
        queryParameters.put("page", String.valueOf(page));
        return this;
    }
}
