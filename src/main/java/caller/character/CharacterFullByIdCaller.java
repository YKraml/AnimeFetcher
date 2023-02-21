package caller.character;

import caller.ACaller;
import model.jikan.characters.characterFullById.CharacterFullById;

public class CharacterFullByIdCaller extends ACaller<CharacterFullById> {
    public CharacterFullByIdCaller(int id) {
        addPathParameter("characters");
        addPathParameter(String.valueOf(id));
        addPathParameter("full");
    }
}
