package caller.anime;

import caller.ACaller;
import model.jikan.anime.animeRecommendations.AnimeRecommendations;

public class AnimeRecommendationsCaller extends ACaller<AnimeRecommendations> {
    public AnimeRecommendationsCaller(int id) {
        pathParameters.add("anime");
        pathParameters.add(String.valueOf(id));
        pathParameters.add("recommendations");
    }
}
