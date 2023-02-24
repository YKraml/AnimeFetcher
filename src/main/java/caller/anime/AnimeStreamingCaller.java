package caller.anime;

import caller.ACaller;
import model.jikan.anime.animeStreaming.AnimeStreaming;
import util.ApiCaller;

public class AnimeStreamingCaller extends ACaller<AnimeStreaming> {

  public AnimeStreamingCaller(int id, ApiCaller apiCaller) {
    super(apiCaller);
    addPathParameter("anime");
    addPathParameter(String.valueOf(id));
    addPathParameter("streaming");
  }
}
