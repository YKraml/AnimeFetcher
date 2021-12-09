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
import exceptions.CouldNotGetObjectException;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class AnimeCallerTest {

    private static AnimeCaller animeCaller;
    private final String id = "1735";

    @BeforeAll
    static void init() {
        animeCaller = AnimeCaller.getInstance();
    }

    @Test
    void getAnime() {
        Anime anime = null;
        try {
            anime = animeCaller.getAnime(id);
        } catch (CouldNotGetObjectException e) {
            e.printStackTrace();
        }
        assert anime != null;
    }

    @Test
    void getCharacterStaff() {
        CharacterStaff characterStaff = null;
        try {
            characterStaff = animeCaller.getCharacterStaff(id);
        } catch (CouldNotGetObjectException e) {
            e.printStackTrace();
        }
        assert characterStaff != null;
    }

    @Test
    void getEpisodes() {
        Episodes episodes = null;
        try {
            episodes = animeCaller.getEpisodes(id, 1);
        } catch (CouldNotGetObjectException e) {
            e.printStackTrace();
        }
        assert episodes != null;
    }

    @Test
    void getNews() {
        News news = null;
        try {
            news = animeCaller.getNews(id);
        } catch (CouldNotGetObjectException e) {
            e.printStackTrace();
            System.out.println(e.getInnerException().getMessage());
        }
        assert news != null;
    }

    @Test
    void getPictures() {
        Pictures pictures = null;
        try {
            pictures = animeCaller.getPictures(id);
        } catch (CouldNotGetObjectException e) {
            e.printStackTrace();
        }
        assert pictures != null;
    }

    @Test
    void getVideos() throws CouldNotGetObjectException {
        Videos videos = animeCaller.getVideos(id);
    }

    @Test
    void getStats() throws CouldNotGetObjectException {
        Stats stats = animeCaller.getStats(id);
    }

    @Test
    void getForum() throws CouldNotGetObjectException {
        Forum forum = animeCaller.getForum(id);
    }

    @Test
    void getMoreInfo() {
        MoreInfo moreInfo = null;
        try {
            moreInfo = animeCaller.getMoreInfo(id);
        } catch (CouldNotGetObjectException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
        assert moreInfo != null;
    }

    @Test
    void getReviews() throws CouldNotGetObjectException {
        Reviews reviews = animeCaller.getReviews(id, 1);
    }

    @Test
    void getRecommendations() throws CouldNotGetObjectException {
        Recommendations recommendations = animeCaller.getRecommendations(id);
    }

    @Test
    void getUserUpdates() {
        UserUpdates userUpdates = null;
        try {
            userUpdates = animeCaller.getUserUpdates(id, 1);
        } catch (CouldNotGetObjectException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
        assert userUpdates != null;
    }
}