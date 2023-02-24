package caller.anime;

import caller.ACaller;
import model.jikan.anime.animeCharacters.AnimeCharacters;
import util.ApiCaller;
import util.Mapper;

public class AnimeCharactersCaller extends ACaller<AnimeCharacters> {

  public AnimeCharactersCaller(int id, ApiCaller apiCaller) {
    super(apiCaller);
    addPathParameter("anime");
    addPathParameter(String.valueOf(id));
    addPathParameter("characters");
  }
}
