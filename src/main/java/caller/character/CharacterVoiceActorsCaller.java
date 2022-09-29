package caller.character;

import caller.ACaller;
import model.jikan.characters.characterVoiceActors.CharacterVoiceActors;

public class CharacterVoiceActorsCaller extends ACaller<CharacterVoiceActors> {
    public CharacterVoiceActorsCaller(int id) {
        pathParameters.add("characters");
        pathParameters.add(String.valueOf(id));
        pathParameters.add("voices");
    }
}
