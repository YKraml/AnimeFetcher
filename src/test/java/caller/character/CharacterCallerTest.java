package caller.character;

import exceptions.CouldNotGetObjectException;
import model.jikan.characters.characterAnime.CharacterAnime;
import model.jikan.characters.characterById.CharacterById;
import model.jikan.characters.characterFullById.CharacterFullById;
import model.jikan.characters.characterManga.CharacterManga;
import model.jikan.characters.characterPictures.CharacterPictures;
import model.jikan.characters.characterVoiceActors.CharacterVoiceActors;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CharacterCallerTest {

    private final CharacterCaller characterCaller = new CharacterCaller();

    @Test
    void getCharacterFullById() throws CouldNotGetObjectException {
        CharacterFullById characterFullById = characterCaller.getCharacterFullById("1");
        Assertions.assertEquals("Spike Spiegel", characterFullById.getData().getName());
    }

    @Test
    void getCharacterById() throws CouldNotGetObjectException {
        CharacterById characterById = characterCaller.getCharacterById("1");
        Assertions.assertEquals("Spike Spiegel", characterById.getData().getName());
    }

    @Test
    void getCharacterAnime() throws CouldNotGetObjectException {
        CharacterAnime characterAnime = characterCaller.getCharacterAnime("1");
        Assertions.assertFalse(characterAnime.getData().isEmpty());
    }

    @Test
    void getCharacterManga() throws CouldNotGetObjectException {
        CharacterManga characterManga = characterCaller.getCharacterManga("1");
        Assertions.assertFalse(characterManga.getData().isEmpty());
    }

    @Test
    void getCharacterVoiceActor() throws CouldNotGetObjectException {
        CharacterVoiceActors characterVoiceActor = characterCaller.getCharacterVoiceActor("1");
        Assertions.assertFalse(characterVoiceActor.getData().isEmpty());
    }

    @Test
    void getCharacterPictures() throws CouldNotGetObjectException {
        CharacterPictures characterPictures = characterCaller.getCharacterPictures("1");
        Assertions.assertFalse(characterPictures.getData().isEmpty());
    }

    @Test
    void getCharacterSearch() {
        // TODO: 27.09.2022 Search ändern
    }
}