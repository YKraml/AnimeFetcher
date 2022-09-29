package caller.character;

import caller.ACaller;
import model.jikan.characters.characterById.CharacterById;

public class CharacterByIdCaller  extends ACaller<CharacterById> {
    public CharacterByIdCaller(int id) {
        pathParameters.add("characters");
        pathParameters.add(String.valueOf(id));
    }
}
