package caller.character;

import caller.ACaller;
import model.jikan.characters.characterManga.CharacterManga;
import util.ApiCaller;

public class CharacterMangaCaller extends ACaller<CharacterManga> {
    public CharacterMangaCaller(int id, ApiCaller apiCaller) {
      super(apiCaller);
      addPathParameter("characters");
        addPathParameter(String.valueOf(id));
        addPathParameter("manga");
    }
}
