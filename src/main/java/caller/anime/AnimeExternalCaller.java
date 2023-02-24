package caller.anime;

import caller.ACaller;
import model.jikan.anime.animeExternal.AnimeExternal;
import util.ApiCaller;

public class AnimeExternalCaller extends ACaller<AnimeExternal> {

  public AnimeExternalCaller(int id, ApiCaller apiCaller) {
    super(apiCaller);
    addPathParameter("anime");
    addPathParameter(String.valueOf(id));
    addPathParameter("external");
  }
}
