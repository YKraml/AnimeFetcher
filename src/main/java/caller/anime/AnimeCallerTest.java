package caller.anime;

import caller.Jikan;
import exceptions.CouldNotGetObjectException;
import jikan.anime.animeById.AnimeById;
import jikan.anime.animeCharacters.AnimeCharacters;
import jikan.anime.animeCharacters.Datum;
import jikan.anime.animeEpisodeById.AnimeEpisodeById;
import jikan.anime.animeEpisodes.AnimeEpisodes;
import jikan.anime.animeStaff.AnimeStaff;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimeCallerTest {

    private final AnimeCaller animeCaller = new AnimeCaller();

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
        jikan.anime.animeStaff.Datum person = animeStaff.getData().iterator().next();
        Assertions.assertEquals(40009, person.getPerson().getMalId());
        Assertions.assertEquals("Maseba, Yutaka", person.getPerson().getName());
        Assertions.assertEquals("Producer", person.getPositions().iterator().next());
    }

    @Test
    void getAnimeEpisodes() throws CouldNotGetObjectException {
        AnimeEpisodes episodes = animeCaller.getAnimeEpisodes("1", "1");
        jikan.anime.animeEpisodes.Datum episode = episodes.getData().iterator().next();
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
    void getAnimeNews() {
    }

    @Test
    void getAnimeForum() {
    }

    @Test
    void getAnimeVideos() {
    }

    @Test
    void getAnimePictures() {
    }

    @Test
    void getAnimeStatistics() {
    }

    @Test
    void getAnimeMoreInfo() {
    }

    @Test
    void getAnimeRecommendations() {
    }

    @Test
    void getAnimeUserUpdates() {
    }

    @Test
    void getAnimeReviews() {
    }

    @Test
    void getAnimeRelations() {
    }

    @Test
    void getAnimeThemes() {
    }

    @Test
    void getAnimeExternal() {
    }

    @Test
    void getAnimeSearch() {
    }
}