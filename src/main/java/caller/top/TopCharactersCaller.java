package caller.top;

import caller.ACaller;
import model.jikan.top.TopAnime.TopAnime;
import model.jikan.top.TopCharacters.TopCharacters;

public class TopCharactersCaller extends ACaller<TopCharacters> {

    public TopCharactersCaller() {
        pathParameters.add("top");
        pathParameters.add("characters");
    }

    public TopCharactersCaller page(int page) {
        queryParameters.put("page", String.valueOf(page));
        return this;
    }

    public TopCharactersCaller limit(int limit) {
        queryParameters.put("limit", String.valueOf(limit));
        return this;
    }
}
