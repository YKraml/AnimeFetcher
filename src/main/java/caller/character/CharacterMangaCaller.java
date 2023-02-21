package caller.character;

import caller.ACaller;
import model.jikan.characters.characterManga.CharacterManga;

public class CharacterMangaCaller extends ACaller<CharacterManga> {
    public CharacterMangaCaller(int id) {
        addPathParameter("characters");
        addPathParameter(String.valueOf(id));
        addPathParameter("manga");
    }
}
