package caller.anime;

import caller.ACaller;
import model.jikan.anime.animeVideos.AnimeVideos;
import util.ApiCaller;

public class AnimeVideosCaller extends ACaller<AnimeVideos> {

  public AnimeVideosCaller(int id, ApiCaller apiCaller) {
    super(apiCaller);
    addPathParameter("anime");
    addPathParameter(String.valueOf(id));
    addPathParameter("videos");
  }
}
