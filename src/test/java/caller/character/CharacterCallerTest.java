package caller.character;

import model.jikan.characters.characterAnime.CharacterAnime;
import model.jikan.characters.characterById.CharacterById;
import model.jikan.characters.characterFullById.CharacterFullById;
import model.jikan.characters.characterManga.CharacterManga;
import model.jikan.characters.characterPictures.CharacterPictures;
import model.jikan.characters.characterVoiceActors.CharacterVoiceActors;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.concurrent.ExecutionException;

import static org.junit.jupiter.api.Assertions.*;

class CharacterCallerTest {

    CharacterCaller characterCaller = new CharacterCaller();


    @Test
    void fullById() throws ExecutionException, InterruptedException {
        CharacterFullById characterFullById = characterCaller.fullById(1).consume().get();
        Assertions.assertEquals("Spike Spiegel", characterFullById.getData().getName());
    }

    @Test
    void byId() throws ExecutionException, InterruptedException {
        CharacterById characterById = characterCaller.byId(1).consume().get();
        Assertions.assertEquals("Spike Spiegel", characterById.getData().getName());
    }

    @Test
    void anime() throws ExecutionException, InterruptedException {
        CharacterAnime characterAnime = characterCaller.anime(1).consume().get();
        Assertions.assertTrue(3 <= characterAnime.getData().size());
    }

    @Test
    void manga() throws ExecutionException, InterruptedException {
        CharacterManga characterManga = characterCaller.manga(1).consume().get();
        Assertions.assertTrue(characterManga.getData().size() >= 2);
    }

    @Test
    void voiceActors() throws ExecutionException, InterruptedException {
        CharacterVoiceActors characterVoiceActors = characterCaller.voiceActors(1).consume().get();
        Assertions.assertTrue(characterVoiceActors.getData().size() >= 14);
    }

    @Test
    void pictures() throws ExecutionException, InterruptedException {
        CharacterPictures characterPictures = characterCaller.pictures(1).consume().get();
        Assertions.assertTrue(characterPictures.getData().size() >= 15);
    }

    @Test
    void search() {
        // TODO: 29.09.2022 Search testen.
    }
}