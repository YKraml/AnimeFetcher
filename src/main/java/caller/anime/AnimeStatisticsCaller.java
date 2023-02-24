package caller.anime;

import caller.ACaller;
import model.jikan.anime.animeStatistics.AnimeStatistics;
import util.ApiCaller;

public class AnimeStatisticsCaller extends ACaller<AnimeStatistics> {

  public AnimeStatisticsCaller(int id, ApiCaller apiCaller) {
    super(apiCaller);
    addPathParameter("anime");
    addPathParameter(String.valueOf(id));
    addPathParameter("statistics");
  }
}
