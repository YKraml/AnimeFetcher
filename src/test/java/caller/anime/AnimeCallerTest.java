package caller.anime;

import caller.Jikan;
import enums.AnimeForumFilter;
import model.jikan.anime.animeById.AnimeById;
import model.jikan.anime.animeByIdFull.AnimeFullById;
import model.jikan.anime.animeCharacters.AnimeCharacters;
import model.jikan.anime.animeEpisodeById.AnimeEpisodeById;
import model.jikan.anime.animeEpisodes.AnimeEpisodes;
import model.jikan.anime.animeExternal.AnimeExternal;
import model.jikan.anime.animeForum.AnimeForum;
import model.jikan.anime.animeMoreInfo.AnimeMoreInfo;
import model.jikan.anime.animeNews.AnimeNews;
import model.jikan.anime.animeNews.Datum;
import model.jikan.anime.animePictures.AnimePictures;
import model.jikan.anime.animeRecommendations.AnimeRecommendations;
import model.jikan.anime.animeRelations.AnimeRelations;
import model.jikan.anime.animeReviews.AnimeReviews;
import model.jikan.anime.animeStaff.AnimeStaff;
import model.jikan.anime.animeStatistics.AnimeStatistics;
import model.jikan.anime.animeStreaming.AnimeStreaming;
import model.jikan.anime.animeThemes.AnimeThemes;
import model.jikan.anime.animeUserUpdates.AnimeUserUpdates;
import model.jikan.anime.animeVideos.AnimeVideos;
import model.jikan.anime.animeVideosEpisodes.AnimeVideosEpisodes;
import model.jikan.characters.characterAnime.Anime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.function.Function;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

class AnimeCallerTest {

    AnimeCaller animeCaller = new AnimeCaller();

    @Test
    void fullById() throws ExecutionException, InterruptedException {
        AnimeFullById animeFullById = animeCaller.fullById(1).consume().get();
        Assertions.assertEquals("Cowboy Bebop", animeFullById.getData().getTitle());
    }

    @Test
    void byId() throws ExecutionException, InterruptedException {
        AnimeById animeById = animeCaller.byId(1).consume().get();
        Assertions.assertEquals("Cowboy Bebop", animeById.getData().getTitle());
    }

    @Test
    void characters() throws ExecutionException, InterruptedException {
        AnimeCharacters animeCharacters = animeCaller.characters(1).consume().get();

        Set<String> characterNames = animeCharacters
                .getData()
                .stream()
                .map(datum -> datum.getCharacter().getName())
                .collect(Collectors.toSet());

        Assertions.assertTrue(characterNames.contains("Black, Jet"));
        Assertions.assertTrue(characterNames.contains("Spiegel, Spike"));
    }

    @Test
    void staff() throws ExecutionException, InterruptedException {
        AnimeStaff animeStaff = animeCaller.staff(1).consume().get();

        Set<String> characterNames = animeStaff
                .getData()
                .stream()
                .map(datum -> datum.getPerson().getName())
                .collect(Collectors.toSet());

        Assertions.assertTrue(characterNames.contains("Maseba, Yutaka"));
        Assertions.assertTrue(characterNames.contains("Minami, Masahiko"));
    }

    @Test
    void episodes() throws ExecutionException, InterruptedException {
        AnimeEpisodes animeEpisodes = animeCaller.episodes(1).page(1).consume().get();
        Assertions.assertEquals(26, animeEpisodes.getData().size());
    }

    @Test
    void episodesById() throws ExecutionException, InterruptedException {
        AnimeEpisodeById animeEpisodeById = animeCaller.episodesById(1, 1).consume().get();
        Assertions.assertEquals("Asteroid Blues", animeEpisodeById.getData().getTitle());
    }

    @Test
    void news() throws ExecutionException, InterruptedException {
        AnimeNews animeNews = animeCaller.news(1).page(1).consume().get();
        Set<String> newsTitels = animeNews.getData().stream().map(Datum::getTitle).collect(Collectors.toSet());
        Assertions.assertTrue(newsTitels.contains("North American Anime & Manga Releases for September"));
        Assertions.assertTrue(newsTitels.contains("North American Anime & Manga Releases for November"));

    }

    @Test
    void forum() throws ExecutionException, InterruptedException {
        AnimeForum animeForum = animeCaller.forum(1).filter(AnimeForumFilter.episode).consume().get();
        Set<String> forumTitles = animeForum.getData().stream().map(model.jikan.anime.animeForum.Datum::getTitle).collect(Collectors.toSet());
        Assertions.assertTrue(forumTitles.contains("Cowboy Bebop Episode 26 Discussion"));
        Assertions.assertTrue(forumTitles.contains("Cowboy Bebop Episode 25 Discussion"));
    }

    @Test
    void videos() throws ExecutionException, InterruptedException {
        AnimeVideos animeVideos = animeCaller.videos(1).consume().get();
        Assertions.assertEquals(26, animeVideos.getData().getEpisodes().size());
        Assertions.assertFalse(animeVideos.getData().getPromo().isEmpty());
    }

    @Test
    void videosEpisodes() throws ExecutionException, InterruptedException {
        AnimeVideosEpisodes animeVideosEpisodes = animeCaller.videosEpisodes(1).page(1).consume().get();
        Assertions.assertEquals(26, animeVideosEpisodes.getData().size());
    }

    @Test
    void pictures() throws ExecutionException, InterruptedException {
        AnimePictures animePictures = animeCaller.pictures(1).consume().get();
        Assertions.assertTrue(animePictures.getData().size() > 10);
    }

    @Test
    void statistics() throws ExecutionException, InterruptedException {
        AnimeStatistics animeStatistics = animeCaller.statistics(1).consume().get();
        Assertions.assertTrue(animeStatistics.getData().getCompleted() >= 950000);
        Assertions.assertTrue(animeStatistics.getData().getDropped() >= 36000);
    }

    @Test
    void moreInfo() throws ExecutionException, InterruptedException {
        AnimeMoreInfo animeMoreInfo = animeCaller.moreInfo(1).consume().get();
        Assertions.assertEquals(
                "Suggested Order of Viewing 1. TV Series (26 episodes) 2. Movie (takes place between episodes 22 and 23)",
                animeMoreInfo.getData().getMoreinfo());
    }

    @Test
    void recommendations() throws ExecutionException, InterruptedException {
        AnimeRecommendations animeRecommendations = animeCaller.recommendations(1).consume().get();

        Set<String> recommendationsTitles = animeRecommendations
                .getData()
                .stream()
                .map(datum -> datum.getEntry().getTitle())
                .collect(Collectors.toSet());

        Assertions.assertTrue(recommendationsTitles.contains("Samurai Champloo"));
        Assertions.assertTrue(recommendationsTitles.contains("Trigun"));
    }

    @Test
    void userUpdates() throws ExecutionException, InterruptedException {
        AnimeUserUpdates animeUserUpdates = animeCaller.userUpdates(1).consume().get();
        Assertions.assertFalse(animeUserUpdates.getData().isEmpty());
    }

    @Test
    void reviews() throws ExecutionException, InterruptedException {
        AnimeReviews animeReviews = animeCaller.reviews(1).page(1).consume().get();
        // TODO: 29.09.2022 Reviews are broken from Jikan
        //Assertions.assertFalse(animeReviews.getData().isEmpty());
    }

    @Test
    void relations() throws ExecutionException, InterruptedException {
        AnimeRelations animeRelations = animeCaller.relations(1).consume().get();
        Set<String> relationTypes = animeRelations
                .getData()
                .stream()
                .map(model.jikan.anime.animeRelations.Datum::getRelation)
                .collect(Collectors.toSet());
        Assertions.assertTrue(relationTypes.contains("Adaptation"));
        Assertions.assertTrue(relationTypes.contains("Side story"));
        Assertions.assertTrue(relationTypes.contains("Summary"));
    }

    @Test
    void themes() throws ExecutionException, InterruptedException {
        AnimeThemes animeThemes = animeCaller.themes(1).consume().get();
        List<String> openings = animeThemes.getData().getOpenings();
        Assertions.assertTrue(openings.contains("\"Tank!\" by The Seatbelts (eps 1-25)"));
    }

    @Test
    void external() throws ExecutionException, InterruptedException {
        AnimeExternal animeExternal = animeCaller.external(1).consume().get();
        Assertions.assertFalse(animeExternal.getData().isEmpty());
    }

    @Test
    void streaming() throws ExecutionException, InterruptedException {
        AnimeStreaming animeStreaming = animeCaller.streaming(1).consume().get();
        Assertions.assertFalse(animeStreaming.getData().isEmpty());
    }

    @Test
    void search() {
        // TODO: 29.09.2022 Search testen
    }
}