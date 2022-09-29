package caller.anime;

import caller.ACaller;
import model.jikan.anime.animeReviews.AnimeReviews;

public class AnimeReviewsCaller extends ACaller<AnimeReviews> {
    public AnimeReviewsCaller(int id) {
        pathParameters.add("anime");
        pathParameters.add(String.valueOf(id));
        pathParameters.add("reviews");
    }

    public AnimeReviewsCaller page(int page) {
        queryParameters.put("page", String.valueOf(page));
        return this;
    }
}
