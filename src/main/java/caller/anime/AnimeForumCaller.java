package caller.anime;

import caller.ACaller;
import enums.AnimeForumFilter;
import model.jikan.anime.animeForum.AnimeForum;

public class AnimeForumCaller extends ACaller<AnimeForum> {
    public AnimeForumCaller(int id) {
        pathParameters.add("anime");
        pathParameters.add(String.valueOf(id));
        pathParameters.add("forum");
    }

    public AnimeForumCaller filter(AnimeForumFilter filter) {
        queryParameters.put("filter", filter.name());
        return this;
    }
}
