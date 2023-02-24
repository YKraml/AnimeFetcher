package caller.anime;

import caller.ACaller;
import model.jikan.anime.animeRecommendations.AnimeRecommendations;
import util.ApiCaller;

public class AnimeRecommendationsCaller extends ACaller<AnimeRecommendations> {

  public AnimeRecommendationsCaller(int id, ApiCaller apiCaller) {
    super(apiCaller);
    addPathParameter("anime");
    addPathParameter(String.valueOf(id));
    addPathParameter("recommendations");
  }
}
