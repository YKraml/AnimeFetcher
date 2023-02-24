package caller.anime;

import caller.ACaller;
import model.jikan.anime.animeRelations.AnimeRelations;
import util.ApiCaller;

public class AnimeRelationsCaller extends ACaller<AnimeRelations> {

  public AnimeRelationsCaller(int id, ApiCaller apiCaller) {
    super(apiCaller);
    addPathParameter("anime");
    addPathParameter(String.valueOf(id));
    addPathParameter("relations");
  }
}
