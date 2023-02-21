package caller.top;

import caller.ACaller;
import enums.MangaFilter;
import enums.MangaSearchQueryType;
import model.jikan.top.TopManga.TopManga;

public class TopMangaCaller extends ACaller<TopManga> {

    public TopMangaCaller() {
        addPathParameter("top");
        addPathParameter("manga");
    }

    public TopMangaCaller type(MangaSearchQueryType type) {
        addQueryParameter("type", type.name());
        return this;
    }

    public TopMangaCaller filter(MangaFilter filter) {
        addQueryParameter("filter", filter.name());
        return this;
    }

    public TopMangaCaller page(int page) {
        addQueryParameter("page", String.valueOf(page));
        return this;
    }

    public TopMangaCaller limit(int limit) {
        addQueryParameter("limit", String.valueOf(limit));
        return this;
    }

}
