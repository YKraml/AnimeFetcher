package caller.anime;

import caller.ACaller;
import model.jikan.anime.animeMoreInfo.AnimeMoreInfo;

public class AnimeMoreInfoCaller extends ACaller<AnimeMoreInfo> {
    public AnimeMoreInfoCaller(int id) {
        addPathParameter("anime");
        addPathParameter(String.valueOf(id));
        addPathParameter("moreinfo");
    }
}
