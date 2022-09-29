package caller.anime;

import caller.ACaller;
import model.jikan.anime.animeStatistics.AnimeStatistics;

public class AnimeStatisticsCaller extends ACaller<AnimeStatistics> {
    public AnimeStatisticsCaller(int id) {
        pathParameters.add("anime");
        pathParameters.add(String.valueOf(id));
        pathParameters.add("statistics");
    }
}
