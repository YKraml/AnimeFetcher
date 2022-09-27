package caller.anime;

import enums.AnimeForumFilter;
import exceptions.CouldNotGetObjectException;
import model.jikan.anime.animeById.AnimeById;
import model.jikan.anime.animeByIdFull.AnimeByIdFull;
import model.jikan.anime.animeCharacters.AnimeCharacters;
import model.jikan.anime.animeCharacters.Datum;
import model.jikan.anime.animeEpisodeById.AnimeEpisodeById;
import model.jikan.anime.animeEpisodes.AnimeEpisodes;
import model.jikan.anime.animeExternal.AnimeExternal;
import model.jikan.anime.animeForum.AnimeForum;
import model.jikan.anime.animeMoreInfo.AnimeMoreInfo;
import model.jikan.anime.animeNews.AnimeNews;
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
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AnimeCallerTest {

    private final AnimeCaller animeCaller = new AnimeCaller();

    @Test
    void getAnimeByIdFull() throws CouldNotGetObjectException {
        AnimeByIdFull animeByIdFull = animeCaller.getAnimeByIdFull("1");
        Assertions.assertEquals(1, animeByIdFull.getData().getMalId());
        Assertions.assertEquals("https://myanimelist.net/anime/1/Cowboy_Bebop", animeByIdFull.getData().getUrl());
        Assertions.assertEquals("Cowboy Bebop", animeByIdFull.getData().getTitle());
    }
    @Test
    void getAnimeById() throws CouldNotGetObjectException {
        AnimeById animeById = animeCaller.getAnimeById("1");
        Assertions.assertEquals(1, animeById.getData().getMalId());
        Assertions.assertEquals("https://myanimelist.net/anime/1/Cowboy_Bebop", animeById.getData().getUrl());
        Assertions.assertEquals("Cowboy Bebop", animeById.getData().getTitle());
    }

    @Test
    void getAnimeCharacters() throws CouldNotGetObjectException {
        AnimeCharacters animeCharacters = animeCaller.getAnimeCharacters("1");
        Datum character = animeCharacters.getData().iterator().next();
        Assertions.assertEquals(3, character.getCharacter().getMalId());
        Assertions.assertEquals("Main", character.getRole());
        Assertions.assertEquals("Black, Jet", character.getCharacter().getName());
    }

    @Test
    void getAnimeStaff() throws CouldNotGetObjectException {
        AnimeStaff animeStaff = animeCaller.getAnimeStaff("1");
        model.jikan.anime.animeStaff.Datum person = animeStaff.getData().iterator().next();
        Assertions.assertEquals(40009, person.getPerson().getMalId());
        Assertions.assertEquals("Maseba, Yutaka", person.getPerson().getName());
        Assertions.assertEquals("Producer", person.getPositions().iterator().next());
    }

    @Test
    void getAnimeEpisodes() throws CouldNotGetObjectException {
        AnimeEpisodes episodes = animeCaller.getAnimeEpisodes("1", "1");
        model.jikan.anime.animeEpisodes.Datum episode = episodes.getData().iterator().next();
        Assertions.assertEquals(1, episode.getMalId());
        Assertions.assertEquals("Asteroid Blues", episode.getTitle());
        Assertions.assertEquals(false, episode.getFiller());
    }

    @Test
    void getAnimeEpisodeById() throws CouldNotGetObjectException {
        AnimeEpisodeById episode = animeCaller.getAnimeEpisodeById("1", "1");
        Assertions.assertEquals(1, episode.getData().getMalId());
        Assertions.assertEquals("Asteroid Blues", episode.getData().getTitle());
        Assertions.assertEquals(false, episode.getData().getFiller());
    }

    @Test
    void getAnimeNews() throws CouldNotGetObjectException {
        AnimeNews animeNews = animeCaller.getAnimeNews("1", "1");
        Assertions.assertFalse(animeNews.getData().isEmpty());
    }

    @Test
    void getAnimeForum() throws CouldNotGetObjectException {
        AnimeForum animeForum = animeCaller.getAnimeForum("1", AnimeForumFilter.ALL);
        Assertions.assertFalse(animeForum.getData().isEmpty());
    }

    @Test
    void getAnimeVideos() throws CouldNotGetObjectException {
        AnimeVideos animeVideos = animeCaller.getAnimeVideos("1");
        Assertions.assertFalse(animeVideos.getData().getPromo().isEmpty());
        Assertions.assertFalse(animeVideos.getData().getEpisodes().isEmpty());
    }

    @Test
    void getAnimePictures() throws CouldNotGetObjectException {
        AnimePictures animePictures = animeCaller.getAnimePictures("1");
        Assertions.assertFalse(animePictures.getData().isEmpty());
    }

    @Test
    void getAnimeStatistics() throws CouldNotGetObjectException {
        AnimeStatistics animeStatistics = animeCaller.getAnimeStatistics("1");
        Assertions.assertTrue(animeStatistics.getData().getCompleted() > 900000);
        Assertions.assertTrue(animeStatistics.getData().getDropped() > 30000);
    }

    @Test
    void getAnimeMoreInfo() throws CouldNotGetObjectException {
        AnimeMoreInfo animeMoreInfo = animeCaller.getAnimeMoreInfo("1");

        String text = "Suggested Order of Viewing 1. TV Series (26 episodes) 2. Movie (takes place between episodes 22 and 23)";
        Assertions.assertEquals(text, animeMoreInfo.getData().getMoreinfo());
    }

    @Test
    void getAnimeRecommendations() throws CouldNotGetObjectException {
        AnimeRecommendations animeRecommendations = animeCaller.getAnimeRecommendations("1");
        Assertions.assertFalse(animeRecommendations.getData().isEmpty());
    }

    @Test
    void getAnimeUserUpdates() throws CouldNotGetObjectException {
        AnimeUserUpdates animeUserUpdates = animeCaller.getAnimeUserUpdates("1", "1");
        Assertions.assertFalse(animeUserUpdates.getData().isEmpty());
    }

    @Test
    void getAnimeReviews() throws CouldNotGetObjectException {
        // TODO: 27.09.2022 Reviews sind bei Jikan broken 
        AnimeReviews animeReviews = animeCaller.getAnimeReviews("1", "1");
        //Assertions.assertFalse(animeReviews.getData().isEmpty());
    }

    @Test
    void getAnimeRelations() throws CouldNotGetObjectException {
        AnimeRelations animeRelations = animeCaller.getAnimeRelations("1");
        Assertions.assertFalse(animeRelations.getData().isEmpty());
    }

    @Test
    void getAnimeThemes() throws CouldNotGetObjectException {
        AnimeThemes animeThemes = animeCaller.getAnimeThemes("1");
        Assertions.assertEquals(1, animeThemes.getData().getOpenings().size());
        Assertions.assertEquals(3, animeThemes.getData().getEndings().size());
    }

    @Test
    void getAnimeExternal() throws CouldNotGetObjectException {
        AnimeExternal animeExternal = animeCaller.getAnimeExternal("1");
        Assertions.assertEquals(4, animeExternal.getData().size());
    }

    @Test
    void getAnimeStreaming() throws CouldNotGetObjectException {
        AnimeStreaming animeStreaming = animeCaller.getAnimeStreaming("1");
        Assertions.assertFalse(animeStreaming.getData().isEmpty());
    }

    @Test
    void getAnimeSearch() {
        // TODO: 27.09.2022 Search neu machen
    }
}