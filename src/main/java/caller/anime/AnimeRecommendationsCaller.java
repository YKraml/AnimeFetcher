package caller.anime;

import caller.ACaller;
import model.jikan.anime.animeRecommendations.AnimeRecommendations;

public class AnimeRecommendationsCaller extends ACaller<AnimeRecommendations> {
    public AnimeRecommendationsCaller(int id) {
        addPathParameter("anime");
        addPathParameter(String.valueOf(id));
        addPathParameter("recommendations");
    }
}
