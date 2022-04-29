package enums;


public class AnimeRequests extends AbstractRequest {

    public final static AnimeRequests AnimeById = new AnimeRequests("", jikan.anime.animeById.AnimeById.class);

    public final static AnimeRequests AnimeCharacters = new AnimeRequests("characters", jikan.anime.animeCharacters.AnimeCharacters.class);

    public final static AnimeRequests AnimeStaff = new AnimeRequests("staff", jikan.anime.animeStaff.AnimeStaff.class);

    public final static AnimeRequests AnimeEpisodes = new AnimeRequests("episodes", jikan.anime.animeEpisodes.AnimeEpisodes.class);

    public final static AnimeRequests AnimeEpisodeById = new AnimeRequests("episodes", jikan.anime.animeEpisodeById.AnimeEpisodeById.class);

    public final static AnimeRequests AnimeNews = new AnimeRequests("news", jikan.anime.animeNews.AnimeNews.class);

    public final static AnimeRequests AnimeForum = new AnimeRequests("forum", jikan.anime.animeForum.AnimeForum.class);

    public final static AnimeRequests AnimeVideos = new AnimeRequests("videos", jikan.anime.animeVideos.AnimeVideos.class);

    public final static AnimeRequests AnimePictures = new AnimeRequests("pictures", jikan.anime.animePictures.AnimePictures.class);

    public final static AnimeRequests AnimeStatistics = new AnimeRequests("statistics", jikan.anime.animeStatistics.AnimeStatistics.class);

    public final static AnimeRequests AnimeMoreInfo = new AnimeRequests("moreinfo", jikan.anime.animeMoreInfo.AnimeMoreInfo.class);

    public final static AnimeRequests AnimeRecommendations = new AnimeRequests("recommendations", jikan.anime.animeRecommendations.AnimeRecommendations.class);

    public final static AnimeRequests AnimeUserUpdates = new AnimeRequests("userupdates", jikan.anime.animeUserUpdates.AnimeUserUpdates.class);

    public final static AnimeRequests AnimeReviews = new AnimeRequests("reviews", jikan.anime.animeReviews.AnimeReviews.class);

    public final static AnimeRequests AnimeRelations = new AnimeRequests("relations", jikan.anime.animeRelations.AnimeRelations.class);

    public final static AnimeRequests AnimeThemes = new AnimeRequests("themes", jikan.anime.animeThemes.AnimeThemes.class);

    public final static AnimeRequests AnimeExternal = new AnimeRequests("external", jikan.anime.animeExternal.AnimeExternal.class);

    public final static AnimeRequests AnimeSearch = new AnimeRequests("", jikan.anime.animeSearch.AnimeSearch.class);


    AnimeRequests(String requestString, Class<?> requestClass) {
        super(requestString, requestClass);
    }
}
