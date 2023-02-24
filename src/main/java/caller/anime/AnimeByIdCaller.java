package caller.anime;

import caller.ACaller;
import model.jikan.anime.animeById.AnimeById;
import util.ApiCaller;

public class AnimeByIdCaller extends ACaller<AnimeById> {
    public AnimeByIdCaller(int id, ApiCaller apiCaller) {
      super(apiCaller);
      addPathParameter("anime");
        addPathParameter(String.valueOf(id));
    }
}
