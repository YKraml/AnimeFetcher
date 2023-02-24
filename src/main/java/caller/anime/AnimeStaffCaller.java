package caller.anime;

import caller.ACaller;
import model.jikan.anime.animeStaff.AnimeStaff;
import util.ApiCaller;

public class AnimeStaffCaller extends ACaller<AnimeStaff> {

  public AnimeStaffCaller(int id, ApiCaller apiCaller) {
    super(apiCaller);
    addPathParameter("anime");
    addPathParameter(String.valueOf(id));
    addPathParameter("staff");
  }
}
