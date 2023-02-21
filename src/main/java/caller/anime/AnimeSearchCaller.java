package caller.anime;

import caller.ACaller;
import enums.*;
import model.jikan.anime.animeSearch.AnimeSearch;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class AnimeSearchCaller extends ACaller<AnimeSearch> {

    public AnimeSearchCaller(){
        addPathParameter("anime");
    }
    public AnimeSearchCaller page(int page) {
        addQueryParameter("page", String.valueOf(page));
        return this;
    }

    public AnimeSearchCaller limit(int limit) {
        addQueryParameter("limit", String.valueOf(limit));
        return this;
    }

    public AnimeSearchCaller q(String query) {
        addQueryParameter("q", query);
        return this;
    }

    public AnimeSearchCaller type(AnimeSearchQueryType type) {
        addQueryParameter("type", type.name());
        return this;
    }

    public AnimeSearchCaller score(double score) {
        addQueryParameter("score", String.valueOf(score));
        return this;
    }

    public AnimeSearchCaller min_score(double minScore) {
        addQueryParameter("min_score", String.valueOf(minScore));
        return this;
    }

    public AnimeSearchCaller max_score(double maxScore) {
        addQueryParameter("max_score", String.valueOf(maxScore));
        return this;
    }

    public AnimeSearchCaller status(AnimeSearchQueryStatus status) {
        addQueryParameter("status", status.name());
        return this;
    }

    public AnimeSearchCaller rating(AnimeSearchQueryRating rating) {
        addQueryParameter("rating", rating.name());
        return this;
    }

    public AnimeSearchCaller swf(boolean swf) {
        addQueryParameter("swf", String.valueOf(swf));
        return this;
    }

    public AnimeSearchCaller genres(int[] genres) {
        String[] array = Arrays.stream(genres).mapToObj(String::valueOf).toArray(String[]::new);
        addQueryParameter("producers", String.join(",", array));
        return this;
    }

    public AnimeSearchCaller genresExclude(int[] genres) {
        String[] array = Arrays.stream(genres).mapToObj(String::valueOf).toArray(String[]::new);
        addQueryParameter("producers", String.join(",", array));
        return this;
    }

    public AnimeSearchCaller orderBy(AnimeSearchQueryOrderBy orderBy) {
        addQueryParameter("order_by", orderBy.name());
        return this;
    }

    public AnimeSearchCaller sort(SearchQuerySort sort) {
        addQueryParameter("sort", sort.name());
        return this;
    }

    public AnimeSearchCaller letter(String letter) {
        addQueryParameter("letter", letter);
        return this;
    }

    public AnimeSearchCaller producers(int[] producers) {
        String[] array = Arrays.stream(producers).mapToObj(String::valueOf).toArray(String[]::new);
        addQueryParameter("producers", String.join(",", array));
        return this;
    }

    public AnimeSearchCaller startDate(Date startDate) {
        String date = new SimpleDateFormat("yyyy-MM-dd").format(startDate);
        addQueryParameter("start_date", date);
        return this;
    }

    public AnimeSearchCaller endDate(Date endDate) {
        String date = new SimpleDateFormat("yyyy-MM-dd").format(endDate);
        addQueryParameter("end_date", date);
        return this;
    }
}
