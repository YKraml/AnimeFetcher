package caller.anime;

import caller.ACaller;
import model.jikan.anime.animeMoreInfo.AnimeMoreInfo;

public class AnimeMoreInfoCaller extends ACaller<AnimeMoreInfo> {
    public AnimeMoreInfoCaller(int id) {
        pathParameters.add("anime");
        pathParameters.add(String.valueOf(id));
        pathParameters.add("moreinfo");
    }
}
