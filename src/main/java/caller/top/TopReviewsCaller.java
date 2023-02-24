package caller.top;

import caller.ACaller;
import model.jikan.top.TopReviews.TopReviews;
import util.ApiCaller;

public class TopReviewsCaller extends ACaller<TopReviews> {

  public TopReviewsCaller(ApiCaller apiCaller) {
    super(apiCaller);
    addPathParameter("top");
    addPathParameter("reviews");
  }

  public TopReviewsCaller page(int page) {
    addQueryParameter("page", String.valueOf(page));
    return this;
  }

}
