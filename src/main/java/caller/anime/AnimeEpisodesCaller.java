package caller.anime;

import caller.ACaller;
import model.jikan.anime.animeEpisodes.AnimeEpisodes;
import util.ApiCaller;

public class AnimeEpisodesCaller extends ACaller<AnimeEpisodes> {

  public AnimeEpisodesCaller(int id, ApiCaller apiCaller) {
    super(apiCaller);
    addPathParameter("anime");
    addPathParameter(String.valueOf(id));
    addPathParameter("episodes");
  }


  public AnimeEpisodesCaller page(int page) {
    addQueryParameter("page", String.valueOf(page));
    return this;
  }
}
