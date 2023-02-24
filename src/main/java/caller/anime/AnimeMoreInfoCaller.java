package caller.anime;

import caller.ACaller;
import model.jikan.anime.animeMoreInfo.AnimeMoreInfo;
import util.ApiCaller;

public class AnimeMoreInfoCaller extends ACaller<AnimeMoreInfo> {

  public AnimeMoreInfoCaller(int id, ApiCaller apiCaller) {
    super(apiCaller);
    addPathParameter("anime");
    addPathParameter(String.valueOf(id));
    addPathParameter("moreinfo");
  }
}
