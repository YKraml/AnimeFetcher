package caller.top;

import caller.ACaller;
import model.jikan.top.TopReviews.TopReviews;

public class TopReviewsCaller extends ACaller<TopReviews> {

    public TopReviewsCaller() {
        pathParameters.add("top");
        pathParameters.add("reviews");
    }

    public TopReviewsCaller page(int page) {
        queryParameters.put("page", String.valueOf(page));
        return this;
    }

}
