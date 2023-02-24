package caller.character;

import caller.ACaller;
import model.jikan.characters.characterPictures.CharacterPictures;
import util.ApiCaller;

public class CharacterPicturesCaller extends ACaller<CharacterPictures> {
    public CharacterPicturesCaller(int id, ApiCaller apiCaller) {
      super(apiCaller);
      addPathParameter("characters");
        addPathParameter(String.valueOf(id));
        addPathParameter("pictures");
    }

}
