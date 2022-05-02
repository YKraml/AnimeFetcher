package caller;

import enums.SearchQuerySort;

import java.util.HashMap;
import java.util.Map;

public class AnimeSearchTermBuilder {

    private final Map<String, String> map = new HashMap<>();

    public AnimeSearchTermBuilder(){
        setSearchQuerySort(SearchQuerySort.desc);
    }

    public AnimeSearchTermBuilder setPage(int page) {
        map.put("page", String.valueOf(page));
        return this;
    }

    public AnimeSearchTermBuilder setLimit(int limit) {
        map.put("limit", String.valueOf(limit));
        return this;
    }

    public AnimeSearchTermBuilder setQ(String q) {
        map.put("q", q);
        return this;
    }

    public AnimeSearchTermBuilder setAnimeSearchQueryType(AnimeSearchQueryType animeSearchQueryType) {
        map.put("type", String.valueOf(animeSearchQueryType));
        return this;
    }

    public AnimeSearchTermBuilder setScore(int score) {
        map.put("score", String.valueOf(score));
        return this;
    }

    public AnimeSearchTermBuilder setMinScore(int minScore) {
        map.put("min_score", String.valueOf(minScore));
        return this;
    }

    public AnimeSearchTermBuilder setMaxScore(int maxScore) {
        map.put("max_score", String.valueOf(maxScore));
        return this;
    }

    public AnimeSearchTermBuilder setAnimeSearchQueryStatus(AnimeSearchQueryStatus animeSearchQueryStatus) {
        map.put("status", String.valueOf(animeSearchQueryStatus));
        return this;
    }

    public AnimeSearchTermBuilder setAnimeSearchQueryRating(AnimeSearchQueryRating animeSearchQueryRating) {
        map.put("rating", String.valueOf(animeSearchQueryRating));
        return this;
    }

    public AnimeSearchTermBuilder setSfw(boolean sfw) {
        map.put("sfw", String.valueOf(sfw));
        return this;
    }

    public AnimeSearchTermBuilder setGenres(String genres) {
        map.put("genres", genres);
        return this;
    }

    public AnimeSearchTermBuilder setGenresExclude(String genresExclude) {
        map.put("genres_exclude", genresExclude);
        return this;
    }

    public AnimeSearchTermBuilder setAnimeSearchQueryOrderBy(AnimeSearchQueryOrderBy animeSearchQueryOrderBy) {
        map.put("order_by", String.valueOf(animeSearchQueryOrderBy));
        return this;
    }

    public AnimeSearchTermBuilder setSearchQuerySort(SearchQuerySort searchQuerySort) {
        map.put("sort", String.valueOf(searchQuerySort));
        return this;
    }

    public AnimeSearchTermBuilder setLetter(char letter) {
        map.put("letter", String.valueOf(letter));
        return this;
    }

    public AnimeSearchTermBuilder setProducers(String producers) {
        map.put("producers", producers);
        return this;
    }

    public String buildTerm() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("anime/");


        if (!map.isEmpty()) {
            stringBuilder.append("?");
            map.forEach((key, value) -> stringBuilder.append(key).append("=").append(value).append("&"));
            stringBuilder.deleteCharAt(stringBuilder.length() - 1);
        }


        return stringBuilder.toString();
    }

}
