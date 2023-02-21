package caller.character;

import caller.ACaller;
import model.jikan.characters.characterById.CharacterById;

public class CharacterByIdCaller  extends ACaller<CharacterById> {
    public CharacterByIdCaller(int id) {
        addPathParameter("characters");
        addPathParameter(String.valueOf(id));
    }
}
