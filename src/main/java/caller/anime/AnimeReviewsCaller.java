package caller.anime;

import caller.ACaller;
import model.jikan.anime.animeReviews.AnimeReviews;

public class AnimeReviewsCaller extends ACaller<AnimeReviews> {
    public AnimeReviewsCaller(int id) {
        addPathParameter("anime");
        addPathParameter(String.valueOf(id));
        addPathParameter("reviews");
    }

    public AnimeReviewsCaller page(int page) {
        addQueryParameter("page", String.valueOf(page));
        return this;
    }
}
