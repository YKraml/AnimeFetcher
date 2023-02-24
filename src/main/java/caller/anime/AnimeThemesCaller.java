package caller.anime;

import caller.ACaller;
import model.jikan.anime.animeThemes.AnimeThemes;
import util.ApiCaller;

public class AnimeThemesCaller extends ACaller<AnimeThemes> {

  public AnimeThemesCaller(int id, ApiCaller apiCaller) {
    super(apiCaller);
    addPathParameter("anime");
    addPathParameter(String.valueOf(id));
    addPathParameter("themes");
  }
}
