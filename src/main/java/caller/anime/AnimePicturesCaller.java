package caller.anime;

import caller.ACaller;
import model.jikan.anime.animePictures.AnimePictures;
import util.ApiCaller;

public class AnimePicturesCaller extends ACaller<AnimePictures> {

  public AnimePicturesCaller(int id, ApiCaller apiCaller) {
    super(apiCaller);
    addPathParameter("anime");
    addPathParameter(String.valueOf(id));
    addPathParameter("pictures");
  }
}
