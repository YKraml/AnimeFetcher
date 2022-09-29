package caller.top;

import caller.ACaller;
import enums.AnimeSearchQueryType;
import enums.Filter;
import model.jikan.top.TopAnime.TopAnime;

public class TopAnimeCaller extends ACaller<TopAnime> {

    protected TopAnimeCaller() {
        pathParameters.add("top");
        pathParameters.add("anime");
    }

    public TopAnimeCaller type(AnimeSearchQueryType type) {
        queryParameters.put("type", type.name());
        return this;
    }

    public TopAnimeCaller filter(Filter filter) {
        queryParameters.put("filter", filter.name());
        return this;
    }

    public TopAnimeCaller page(int page) {
        queryParameters.put("page", String.valueOf(page));
        return this;
    }

    public TopAnimeCaller limit(int limit) {
        queryParameters.put("limit", String.valueOf(limit));
        return this;
    }
}
