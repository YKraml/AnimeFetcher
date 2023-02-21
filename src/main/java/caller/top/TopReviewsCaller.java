package caller.top;

import caller.ACaller;
import model.jikan.top.TopReviews.TopReviews;

public class TopReviewsCaller extends ACaller<TopReviews> {

    public TopReviewsCaller() {
        addPathParameter("top");
        addPathParameter("reviews");
    }

    public TopReviewsCaller page(int page) {
        addQueryParameter("page", String.valueOf(page));
        return this;
    }

}
