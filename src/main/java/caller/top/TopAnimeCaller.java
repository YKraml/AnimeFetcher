package caller.top;

import caller.ACaller;
import enums.AnimeSearchQueryType;
import enums.Filter;
import model.jikan.top.TopAnime.TopAnime;

public class TopAnimeCaller extends ACaller<TopAnime> {

    protected TopAnimeCaller() {
        addPathParameter("top");
        addPathParameter("anime");
    }

    public TopAnimeCaller type(AnimeSearchQueryType type) {
        addQueryParameter("type", type.name());
        return this;
    }

    public TopAnimeCaller filter(Filter filter) {
        addQueryParameter("filter", filter.name());
        return this;
    }

    public TopAnimeCaller page(int page) {
        addQueryParameter("page", String.valueOf(page));
        return this;
    }

    public TopAnimeCaller limit(int limit) {
        addQueryParameter("limit", String.valueOf(limit));
        return this;
    }
}
