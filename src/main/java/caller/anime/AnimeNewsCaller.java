package caller.anime;

import caller.ACaller;
import model.jikan.anime.animeNews.AnimeNews;

public class AnimeNewsCaller extends ACaller<AnimeNews> {
    public AnimeNewsCaller(int id) {
        addPathParameter("anime");
        addPathParameter(String.valueOf(id));
        addPathParameter("news");
    }

    public AnimeNewsCaller page(int page) {
        addQueryParameter("page", String.valueOf(page));
        return this;
    }
}
