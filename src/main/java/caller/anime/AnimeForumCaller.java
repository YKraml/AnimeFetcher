package caller.anime;

import caller.ACaller;
import enums.AnimeForumFilter;
import model.jikan.anime.animeForum.AnimeForum;
import util.ApiCaller;

public class AnimeForumCaller extends ACaller<AnimeForum> {

  public AnimeForumCaller(int id, ApiCaller apiCaller) {
    super(apiCaller);
    addPathParameter("anime");
    addPathParameter(String.valueOf(id));
    addPathParameter("forum");
  }

  public AnimeForumCaller filter(AnimeForumFilter filter) {
    addQueryParameter("filter", filter.name());
    return this;
  }
}
