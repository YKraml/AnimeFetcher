package caller.top;

import caller.ACaller;
import model.jikan.top.TopCharacters.TopCharacters;
import util.ApiCaller;

public class TopCharactersCaller extends ACaller<TopCharacters> {

    public TopCharactersCaller(ApiCaller apiCaller) {
      super(apiCaller);
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
