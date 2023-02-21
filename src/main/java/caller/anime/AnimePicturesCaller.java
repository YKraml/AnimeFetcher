package caller.anime;

import caller.ACaller;
import model.jikan.anime.animePictures.AnimePictures;

public class AnimePicturesCaller extends ACaller<AnimePictures> {
    public AnimePicturesCaller(int id) {
        addPathParameter("anime");
        addPathParameter(String.valueOf(id));
        addPathParameter("pictures");
    }
}
