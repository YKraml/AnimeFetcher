package caller.anime;

import caller.ACaller;
import model.jikan.anime.animeByIdFull.AnimeFullById;
import util.ApiCaller;

public class AnimeFullByIdCaller extends ACaller<AnimeFullById> {

  public AnimeFullByIdCaller(int id, ApiCaller apiCaller) {
    super(apiCaller);
    addPathParameter("anime");
    addPathParameter(String.valueOf(id));
    addPathParameter("full");
  }
}
