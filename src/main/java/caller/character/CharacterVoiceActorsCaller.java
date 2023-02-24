package caller.character;

import caller.ACaller;
import model.jikan.characters.characterVoiceActors.CharacterVoiceActors;
import util.ApiCaller;

public class CharacterVoiceActorsCaller extends ACaller<CharacterVoiceActors> {

  public CharacterVoiceActorsCaller(int id, ApiCaller apiCaller) {
    super(apiCaller);
    addPathParameter("characters");
    addPathParameter(String.valueOf(id));
    addPathParameter("voices");
  }
}
