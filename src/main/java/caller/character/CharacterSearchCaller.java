package caller.character;

import caller.ACaller;
import enums.CharactersSearchQueryOrderBy;
import enums.SearchQuerySort;
import model.jikan.characters.charactersSearch.CharactersSearch;

public class CharacterSearchCaller extends ACaller<CharactersSearch> {

    public CharacterSearchCaller() {
        pathParameters.add("characters");
    }

    public CharacterSearchCaller page(int page) {
        queryParameters.put("page", String.valueOf(page));
        return this;
    }

    public CharacterSearchCaller limit(int limit) {
        queryParameters.put("limit", String.valueOf(limit));
        return this;
    }

    public CharacterSearchCaller query(String query) {
        queryParameters.put("q", query);
        return this;
    }

    public CharacterSearchCaller orderBy(CharactersSearchQueryOrderBy orderBy) {
        queryParameters.put("order_by", orderBy.name());
        return this;
    }

    public CharacterSearchCaller sort(SearchQuerySort sort) {
        queryParameters.put("sort", sort.name());
        return this;
    }

    public CharacterSearchCaller letter(String letter) {
        queryParameters.put("letter", letter);
        return this;
    }

}
