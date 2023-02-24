package caller.character;

import caller.ACaller;
import model.jikan.characters.characterFullById.CharacterFullById;
import util.ApiCaller;

public class CharacterFullByIdCaller extends ACaller<CharacterFullById> {

  public CharacterFullByIdCaller(int id, ApiCaller apiCaller) {
    super(apiCaller);
    addPathParameter("characters");
    addPathParameter(String.valueOf(id));
    addPathParameter("full");
  }
}
