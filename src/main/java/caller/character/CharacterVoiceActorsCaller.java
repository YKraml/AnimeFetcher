package caller.character;

import caller.ACaller;
import model.jikan.characters.characterVoiceActors.CharacterVoiceActors;

public class CharacterVoiceActorsCaller extends ACaller<CharacterVoiceActors> {
    public CharacterVoiceActorsCaller(int id) {
        addPathParameter("characters");
        addPathParameter(String.valueOf(id));
        addPathParameter("voices");
    }
}
