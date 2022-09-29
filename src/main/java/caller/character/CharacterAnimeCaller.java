package caller.character;

import caller.ACaller;
import model.jikan.characters.characterAnime.CharacterAnime;

public class CharacterAnimeCaller extends ACaller<CharacterAnime> {
    public CharacterAnimeCaller(int id) {
        pathParameters.add("characters");
        pathParameters.add(String.valueOf(id));
        pathParameters.add("anime");
    }
}
