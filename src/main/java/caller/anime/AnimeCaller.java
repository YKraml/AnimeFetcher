package caller.anime;

import util.ApiCaller;

public class AnimeCaller {

    private final ApiCaller apiCaller;

    public AnimeCaller(ApiCaller apiCaller) {
        this.apiCaller = apiCaller;
    }

    public AnimeFullByIdCaller fullById(int id) {
        return new AnimeFullByIdCaller(id, apiCaller);
    }

    public AnimeByIdCaller byId(int id) {
        return new AnimeByIdCaller(id, apiCaller);
    }

    public AnimeCharactersCaller characters(int id) {
        return new AnimeCharactersCaller(id, apiCaller);
    }

    public AnimeStaffCaller staff(int id) {
        return new AnimeStaffCaller(id, apiCaller);
    }

    public AnimeEpisodesCaller episodes(int id) {
        return new AnimeEpisodesCaller(id, apiCaller);
    }

    public AnimeEpisodeByIdCaller episodesById(int id, int episode) {
        return new AnimeEpisodeByIdCaller(id, episode, apiCaller);
    }

    public AnimeNewsCaller news(int id) {
        return new AnimeNewsCaller(id, apiCaller);
    }

    public AnimeForumCaller forum(int id) {
        return new AnimeForumCaller(id, apiCaller);
    }

    public AnimeVideosCaller videos(int id) {
        return new AnimeVideosCaller(id, apiCaller);
    }

    public AnimeVideosEpisodesCaller videosEpisodes(int id) {
        return new AnimeVideosEpisodesCaller(id, apiCaller);
    }

    public AnimePicturesCaller pictures(int id) {
        return new AnimePicturesCaller(id, apiCaller);
    }

    public AnimeStatisticsCaller statistics(int id) {
        return new AnimeStatisticsCaller(id, apiCaller);
    }

    public AnimeMoreInfoCaller moreInfo(int id) {
        return new AnimeMoreInfoCaller(id, apiCaller);
    }

    public AnimeRecommendationsCaller recommendations(int id) {
        return new AnimeRecommendationsCaller(id, apiCaller);
    }

    public AnimeUserUpdatesCaller userUpdates(int id) {
        return new AnimeUserUpdatesCaller(id, apiCaller);
    }

    public AnimeReviewsCaller reviews(int id) {
        return new AnimeReviewsCaller(id, apiCaller);
    }

    public AnimeRelationsCaller relations(int id) {
        return new AnimeRelationsCaller(id, apiCaller);
    }

    public AnimeThemesCaller themes(int id) {
        return new AnimeThemesCaller(id, apiCaller);
    }

    public AnimeExternalCaller external(int id) {
        return new AnimeExternalCaller(id, apiCaller);
    }

    public AnimeStreamingCaller streaming(int id) {
        return new AnimeStreamingCaller(id, apiCaller);
    }

    public AnimeSearchCaller search() {
        return new AnimeSearchCaller(apiCaller);
    }
}
