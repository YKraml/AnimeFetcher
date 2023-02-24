package caller.character;

import caller.ACaller;
import model.jikan.characters.characterById.CharacterById;
import util.ApiCaller;

public class CharacterByIdCaller extends ACaller<CharacterById> {

  public CharacterByIdCaller(int id, ApiCaller apiCaller) {
    super(apiCaller);
    addPathParameter("characters");
    addPathParameter(String.valueOf(id));
  }
}
