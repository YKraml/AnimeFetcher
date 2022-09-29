package caller.anime;

public class AnimeCaller {
    public AnimeFullByIdCaller fullById(int id) {
        return new AnimeFullByIdCaller(id);
    }

    public AnimeByIdCaller byId(int id) {
        return new AnimeByIdCaller(id);
    }

    public AnimeCharactersCaller characters(int id) {
        return new AnimeCharactersCaller(id);
    }

    public AnimeStaffCaller staff(int id) {
        return new AnimeStaffCaller(id);
    }

    public AnimeEpisodesCaller episodes(int id) {
        return new AnimeEpisodesCaller(id);
    }

    public AnimeEpisodeByIdCaller episodesById(int id, int episode) {
        return new AnimeEpisodeByIdCaller(id, episode);
    }

    public AnimeNewsCaller news(int id) {
        return new AnimeNewsCaller(id);
    }

    public AnimeForumCaller forum(int id) {
        return new AnimeForumCaller(id);
    }

    public AnimeVideosCaller videos(int id) {
        return new AnimeVideosCaller(id);
    }

    public AnimeVideosEpisodesCaller videosEpisodes(int id) {
        return new AnimeVideosEpisodesCaller(id);
    }

    public AnimePicturesCaller pictures(int id) {
        return new AnimePicturesCaller(id);
    }

    public AnimeStatisticsCaller statistics(int id) {
        return new AnimeStatisticsCaller(id);
    }

    public AnimeMoreInfoCaller moreInfo(int id) {
        return new AnimeMoreInfoCaller(id);
    }

    public AnimeRecommendationsCaller recommendations(int id) {
        return new AnimeRecommendationsCaller(id);
    }

    public AnimeUserUpdatesCaller userUpdates(int id) {
        return new AnimeUserUpdatesCaller(id);
    }

    public AnimeReviewsCaller reviews(int id) {
        return new AnimeReviewsCaller(id);
    }

    public AnimeRelationsCaller relations(int id) {
        return new AnimeRelationsCaller(id);
    }

    public AnimeThemesCaller themes(int id) {
        return new AnimeThemesCaller(id);
    }

    public AnimeExternalCaller external(int id) {
        return new AnimeExternalCaller(id);
    }

    public AnimeStreamingCaller streaming(int id) {
        return new AnimeStreamingCaller(id);
    }

    public AnimeSearchCaller search() {
        return new AnimeSearchCaller();
    }
}
