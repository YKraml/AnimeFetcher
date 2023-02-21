package caller.character;

import caller.ACaller;
import enums.CharactersSearchQueryOrderBy;
import enums.SearchQuerySort;
import model.jikan.characters.charactersSearch.CharactersSearch;

public class CharacterSearchCaller extends ACaller<CharactersSearch> {

    public CharacterSearchCaller() {
        addPathParameter("characters");
    }

    public CharacterSearchCaller page(int page) {
        addQueryParameter("page", String.valueOf(page));
        return this;
    }

    public CharacterSearchCaller limit(int limit) {
        addQueryParameter("limit", String.valueOf(limit));
        return this;
    }

    public CharacterSearchCaller query(String query) {
        addQueryParameter("q", query);
        return this;
    }

    public CharacterSearchCaller orderBy(CharactersSearchQueryOrderBy orderBy) {
        addQueryParameter("order_by", orderBy.name());
        return this;
    }

    public CharacterSearchCaller sort(SearchQuerySort sort) {
        addQueryParameter("sort", sort.name());
        return this;
    }

    public CharacterSearchCaller letter(String letter) {
        addQueryParameter("letter", letter);
        return this;
    }

}
