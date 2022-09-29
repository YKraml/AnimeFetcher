package caller.anime;

import caller.ACaller;
import model.jikan.anime.animePictures.AnimePictures;

public class AnimePicturesCaller extends ACaller<AnimePictures> {
    public AnimePicturesCaller(int id) {
        pathParameters.add("anime");
        pathParameters.add(String.valueOf(id));
        pathParameters.add("pictures");
    }
}
