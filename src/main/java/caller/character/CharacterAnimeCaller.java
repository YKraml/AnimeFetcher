package caller.character;

import caller.ACaller;
import model.jikan.characters.characterAnime.CharacterAnime;

public class CharacterAnimeCaller extends ACaller<CharacterAnime> {
    public CharacterAnimeCaller(int id) {
        addPathParameter("characters");
        addPathParameter(String.valueOf(id));
        addPathParameter("anime");
    }
}
