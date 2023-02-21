package caller.top;

import caller.ACaller;
import model.jikan.top.TopPeople.TopPeople;

public class TopPeopleCaller extends ACaller<TopPeople> {

    public TopPeopleCaller(){
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
