package caller.anime;

import caller.ACaller;
import model.jikan.anime.animeNews.AnimeNews;
import util.ApiCaller;

public class AnimeNewsCaller extends ACaller<AnimeNews> {

  public AnimeNewsCaller(int id, ApiCaller apiCaller) {
    super(apiCaller);
    addPathParameter("anime");
    addPathParameter(String.valueOf(id));
    addPathParameter("news");
  }

  public AnimeNewsCaller page(int page) {
    addQueryParameter("page", String.valueOf(page));
    return this;
  }
}
