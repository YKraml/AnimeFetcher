package caller.character;

import caller.ACaller;
import model.jikan.characters.characterPictures.CharacterPictures;

public class CharacterPicturesCaller extends ACaller<CharacterPictures> {
    public CharacterPicturesCaller(int id) {
        pathParameters.add("characters");
        pathParameters.add(String.valueOf(id));
        pathParameters.add("pictures");
    }
}
