package caller;

import anime.anime.Anime;
import anime.characters_staff.CharacterStaff;
import anime.episodes.Episodes;
import anime.forum.Forum;
import anime.moreinfo.MoreInfo;
import anime.news.News;
import anime.pictures.Pictures;
import anime.recommendations.Recommendations;
import anime.reviews.Reviews;
import anime.stats.Stats;
import anime.userupdates.UserUpdates;
import anime.videos.Videos;
import org.junit.jupiter.api.BeforeAll;

class AnimeCallerTest {

    private static AnimeCaller animeCaller;
    private final String id = "21";

    @BeforeAll
    static void init(){
        animeCaller = AnimeCaller.getInstance();
    }

    @org.junit.jupiter.api.Test
    void getAnime() {
        Anime anime = animeCaller.getAnime(id);
    }

    @org.junit.jupiter.api.Test
    void getCharacterStaff() {
        CharacterStaff characterStaff = animeCaller.getCharacterStaff(id);
    }

    @org.junit.jupiter.api.Test
    void getEpisodes() {
        Episodes episodes = animeCaller.getEpisodes(id, 1);
    }

    @org.junit.jupiter.api.Test
    void getNews() {
        News news = animeCaller.getNews(id);
    }

    @org.junit.jupiter.api.Test
    void getPictures() {
        Pictures pictures = animeCaller.getPictures(id);
    }

    @org.junit.jupiter.api.Test
    void getVideos() {
        Videos videos = animeCaller.getVideos(id);
    }

    @org.junit.jupiter.api.Test
    void getStats() {
        Stats stats = animeCaller.getStats(id);
    }

    @org.junit.jupiter.api.Test
    void getForum() {
        Forum forum = animeCaller.getForum(id);
    }

    @org.junit.jupiter.api.Test
    void getMoreInfo() {
        MoreInfo moreInfo = animeCaller.getMoreInfo(id);
    }

    @org.junit.jupiter.api.Test
    void getReviews() {
        Reviews reviews = animeCaller.getReviews(id, 1);
    }

    @org.junit.jupiter.api.Test
    void getRecommendations() {
        Recommendations recommendations = animeCaller.getRecommendations(id);
    }

    @org.junit.jupiter.api.Test
    void getUserUpdates() {
        UserUpdates userUpdates = animeCaller.getUserUpdates(id, 1);
    }
}