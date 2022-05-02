package caller;

import enums.CharactersSearchQueryOrderBy;
import enums.SearchQuerySort;

import java.util.HashMap;
import java.util.Map;

public class CharactersSearchTermBuilder {

    private int page = 0;
    private int limit = 25;
    private String q;
    private CharactersSearchQueryOrderBy charactersSearchQueryOrderBy = CharactersSearchQueryOrderBy.favorites;
    private SearchQuerySort searchQuerySort = SearchQuerySort.desc;
    private char letter;


    public CharactersSearchTermBuilder setPage(int page) {
        this.page = page;
        return this;
    }

    public CharactersSearchTermBuilder setLimit(int limit) {
        this.limit = limit;
        return this;
    }

    public CharactersSearchTermBuilder setQ(String q) {
        this.q = q;
        return this;
    }

    public CharactersSearchTermBuilder setCharactersSearchQueryOrderBy(CharactersSearchQueryOrderBy charactersSearchQueryOrderBy) {
        this.charactersSearchQueryOrderBy = charactersSearchQueryOrderBy;
        return this;
    }

    public CharactersSearchTermBuilder setSearchQuerySort(SearchQuerySort searchQuerySort) {
        this.searchQuerySort = searchQuerySort;
        return this;
    }

    public CharactersSearchTermBuilder setLetter(char letter) {
        this.letter = letter;
        return this;
    }

    public String buildTerm() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("characters/");

        boolean pageIsZero = page == 0;
        boolean limitIsZero = limit == 0;
        boolean qIsNull = q == null;
        boolean charactersSearchQueryOrderByIsNull = charactersSearchQueryOrderBy == null;
        boolean searchQuerySortIsNull = searchQuerySort == null;
        boolean letterIsZero = letter == '\0';


        Map<String, String> map = new HashMap<>();
        if (!pageIsZero) {
            map.put("page", String.valueOf(page));
        }
        if (!limitIsZero) {
            map.put("limit", String.valueOf(limit));
        }
        if (!qIsNull) {
            map.put("q", q);
        }
        if (!charactersSearchQueryOrderByIsNull) {
            map.put("order_by", String.valueOf(charactersSearchQueryOrderBy));
        }
        if (!searchQuerySortIsNull) {
            map.put("sort", String.valueOf(searchQuerySort));
        }
        if (!letterIsZero) {
            map.put("letter", String.valueOf(letter));
        }


        if (!map.isEmpty()) {
            stringBuilder.append("?");
            map.forEach((key, value) -> stringBuilder.append(key).append("=").append(value).append("&"));
            stringBuilder.deleteCharAt(stringBuilder.length() - 1);
        }


        return stringBuilder.toString();
    }
}
