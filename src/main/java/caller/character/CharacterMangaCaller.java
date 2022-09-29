package caller.character;

import caller.ACaller;
import model.jikan.characters.characterManga.CharacterManga;

public class CharacterMangaCaller extends ACaller<CharacterManga> {
    public CharacterMangaCaller(int id) {
        pathParameters.add("characters");
        pathParameters.add(String.valueOf(id));
        pathParameters.add("manga");
    }
}
