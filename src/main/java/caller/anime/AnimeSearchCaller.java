package caller.anime;

import caller.ACaller;
import enums.*;
import model.jikan.anime.animeSearch.AnimeSearch;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class AnimeSearchCaller extends ACaller<AnimeSearch> {

    public AnimeSearchCaller(){
        pathParameters.add("anime");
    }
    public AnimeSearchCaller page(int page) {
        queryParameters.put("page", String.valueOf(page));
        return this;
    }

    public AnimeSearchCaller limit(int limit) {
        queryParameters.put("limit", String.valueOf(limit));
        return this;
    }

    public AnimeSearchCaller q(String query) {
        queryParameters.put("q",query);
        return this;
    }

    public AnimeSearchCaller type(AnimeSearchQueryType type) {
        queryParameters.put("type",type.name());
        return this;
    }

    public AnimeSearchCaller score(double score) {
        queryParameters.put("score", String.valueOf(score));
        return this;
    }

    public AnimeSearchCaller min_score(double minScore) {
        queryParameters.put("min_score", String.valueOf(minScore));
        return this;
    }

    public AnimeSearchCaller max_score(double maxScore) {
        queryParameters.put("max_score", String.valueOf(maxScore));
        return this;
    }

    public AnimeSearchCaller status(AnimeSearchQueryStatus status) {
        queryParameters.put("status",status.name());
        return this;
    }

    public AnimeSearchCaller rating(AnimeSearchQueryRating rating) {
        queryParameters.put("rating",rating.name());
        return this;
    }

    public AnimeSearchCaller swf(boolean swf) {
        queryParameters.put("swf", String.valueOf(swf));
        return this;
    }

    public AnimeSearchCaller genres(int[] genres) {
        String[] array = Arrays.stream(genres).mapToObj(String::valueOf).toArray(String[]::new);
        queryParameters.put("producers", String.join(",", array));
        return this;
    }

    public AnimeSearchCaller genresExclude(int[] genres) {
        String[] array = Arrays.stream(genres).mapToObj(String::valueOf).toArray(String[]::new);
        queryParameters.put("producers", String.join(",", array));
        return this;
    }

    public AnimeSearchCaller orderBy(AnimeSearchQueryOrderBy orderBy) {
        queryParameters.put("order_by",orderBy.name());
        return this;
    }

    public AnimeSearchCaller sort(SearchQuerySort sort) {
        queryParameters.put("sort",sort.name());
        return this;
    }

    public AnimeSearchCaller letter(String letter) {
        queryParameters.put("letter",letter);
        return this;
    }

    public AnimeSearchCaller producers(int[] producers) {
        String[] array = Arrays.stream(producers).mapToObj(String::valueOf).toArray(String[]::new);
        queryParameters.put("producers", String.join(",", array));
        return this;
    }

    public AnimeSearchCaller startDate(Date startDate) {
        String date = new SimpleDateFormat("yyyy-MM-dd").format(startDate);
        queryParameters.put("start_date", date);
        return this;
    }

    public AnimeSearchCaller endDate(Date endDate) {
        String date = new SimpleDateFormat("yyyy-MM-dd").format(endDate);
        queryParameters.put("end_date", date);
        return this;
    }
}
