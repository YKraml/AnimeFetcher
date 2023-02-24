package caller.anime;

import caller.ACaller;
import model.jikan.anime.animeReviews.AnimeReviews;
import util.ApiCaller;

public class AnimeReviewsCaller extends ACaller<AnimeReviews> {

  public AnimeReviewsCaller(int id, ApiCaller apiCaller) {
    super(apiCaller);
    addPathParameter("anime");
    addPathParameter(String.valueOf(id));
    addPathParameter("reviews");
  }

  public AnimeReviewsCaller page(int page) {
    addQueryParameter("page", String.valueOf(page));
    return this;
  }
}
