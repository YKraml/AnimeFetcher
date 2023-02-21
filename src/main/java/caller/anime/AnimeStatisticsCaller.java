package caller.anime;

import caller.ACaller;
import model.jikan.anime.animeStatistics.AnimeStatistics;

public class AnimeStatisticsCaller extends ACaller<AnimeStatistics> {
    public AnimeStatisticsCaller(int id) {
        addPathParameter("anime");
        addPathParameter(String.valueOf(id));
        addPathParameter("statistics");
    }
}
