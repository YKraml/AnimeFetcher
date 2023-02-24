package caller.top;

import caller.ACaller;
import model.jikan.top.TopPeople.TopPeople;
import util.ApiCaller;

public class TopPeopleCaller extends ACaller<TopPeople> {

  public TopPeopleCaller(ApiCaller apiCaller) {
    super(apiCaller);
    addPathParameter("top");
    addPathParameter("people");
  }

  public TopPeopleCaller page(int page) {
    addQueryParameter("page", String.valueOf(page));
    return this;
  }

  public TopPeopleCaller limit(int limit) {
    addQueryParameter("limit", String.valueOf(limit));
    return this;
  }
}
