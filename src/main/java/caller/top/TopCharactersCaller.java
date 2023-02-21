package caller.top;

import caller.ACaller;
import model.jikan.top.TopCharacters.TopCharacters;

public class TopCharactersCaller extends ACaller<TopCharacters> {

    public TopCharactersCaller() {
        addPathParameter("top");
        addPathParameter("characters");
    }

    public TopCharactersCaller page(int page) {
        addQueryParameter("page", String.valueOf(page));
        return this;
    }

    public TopCharactersCaller limit(int limit) {
        addQueryParameter("limit", String.valueOf(limit));
        return this;
    }
}
