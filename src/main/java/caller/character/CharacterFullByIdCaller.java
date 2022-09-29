package caller.character;

import caller.ACaller;
import model.jikan.characters.characterFullById.CharacterFullById;

public class CharacterFullByIdCaller extends ACaller<CharacterFullById> {
    public CharacterFullByIdCaller(int id) {
        pathParameters.add("characters");
        pathParameters.add(String.valueOf(id));
        pathParameters.add("full");
    }
}
