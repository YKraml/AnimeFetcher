package caller.top;

import caller.ACaller;
import enums.MangaFilter;
import enums.MangaSearchQueryType;
import model.jikan.top.TopManga.TopManga;

public class TopMangaCaller extends ACaller<TopManga> {

    public TopMangaCaller() {
        pathParameters.add("top");
        pathParameters.add("manga");
    }

    public TopMangaCaller type(MangaSearchQueryType type) {
        queryParameters.put("type", type.name());
        return this;
    }

    public TopMangaCaller filter(MangaFilter filter) {
        queryParameters.put("filter", filter.name());
        return this;
    }

    public TopMangaCaller page(int page) {
        queryParameters.put("page", String.valueOf(page));
        return this;
    }

    public TopMangaCaller limit(int limit) {
        queryParameters.put("limit", String.valueOf(limit));
        return this;
    }

}
