package caller.character;

import caller.ACaller;
import model.jikan.characters.characterPictures.CharacterPictures;

public class CharacterPicturesCaller extends ACaller<CharacterPictures> {
    public CharacterPicturesCaller(int id) {
        addPathParameter("characters");
        addPathParameter(String.valueOf(id));
        addPathParameter("pictures");
    }

}
