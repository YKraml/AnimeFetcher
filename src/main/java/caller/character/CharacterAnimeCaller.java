package caller.character;

import caller.ACaller;
import model.jikan.characters.characterAnime.CharacterAnime;
import util.ApiCaller;

public class CharacterAnimeCaller extends ACaller<CharacterAnime> {

  public CharacterAnimeCaller(int id, ApiCaller apiCaller) {
    super(apiCaller);
    addPathParameter("characters");
    addPathParameter(String.valueOf(id));
    addPathParameter("anime");
  }
}
