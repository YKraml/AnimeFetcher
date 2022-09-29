package caller.top;

import caller.ACaller;
import model.jikan.top.TopPeople.TopPeople;

public class TopPeopleCaller extends ACaller<TopPeople> {

    public TopPeopleCaller(){
        pathParameters.add("top");
        pathParameters.add("people");
    }

    public TopPeopleCaller page(int page) {
        queryParameters.put("page", String.valueOf(page));
        return this;
    }

    public TopPeopleCaller limit(int limit) {
        queryParameters.put("limit", String.valueOf(limit));
        return this;
    }
}
