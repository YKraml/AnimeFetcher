package caller.anime;

import caller.ACaller;
import model.jikan.anime.animeEpisodeById.AnimeEpisodeById;
import util.ApiCaller;

public class AnimeEpisodeByIdCaller extends ACaller<AnimeEpisodeById> {

  public AnimeEpisodeByIdCaller(int id, int episode, ApiCaller apiCaller) {
    super(apiCaller);
    addPathParameter("anime");
    addPathParameter(String.valueOf(id));
    addPathParameter("episodes");
    addPathParameter(String.valueOf(episode));
  }
}
