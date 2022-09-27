package caller.character;

import caller.AbstractCaller;
import exceptions.CouldNotGetObjectException;
import model.jikan.characters.characterAnime.CharacterAnime;
import model.jikan.characters.characterById.CharacterById;
import model.jikan.characters.characterFullById.CharacterFullById;
import model.jikan.characters.characterManga.CharacterManga;
import model.jikan.characters.characterPictures.CharacterPictures;
import model.jikan.characters.characterVoiceActors.CharacterVoiceActors;
import model.jikan.characters.charactersSearch.CharactersSearch;

import java.util.List;
import java.util.Map;

public class CharacterCaller extends AbstractCaller {

    private static CharacterCaller instance;

    public CharacterCaller() {
        super("characters");
    }


    public static CharacterCaller getInstance() {
        if (instance == null) {
            instance = new CharacterCaller();
        }
        return instance;
    }

    public CharacterFullById getCharacterFullById(String id) throws CouldNotGetObjectException {
        return getObject(List.of("characters", id, "full"), Map.of(), CharacterFullById.class);
    }

    public CharacterById getCharacterById(String id) throws CouldNotGetObjectException {
        return getObject(List.of("characters", id), Map.of(), CharacterById.class);
    }

    public CharacterAnime getCharacterAnime(String id) throws CouldNotGetObjectException {
        return getObject(List.of("characters", id, "anime"), Map.of(), CharacterAnime.class);
    }

    public CharacterManga getCharacterManga(String id) throws CouldNotGetObjectException {
        return getObject(List.of("characters", id, "manga"), Map.of(), CharacterManga.class);
    }

    public CharacterVoiceActors getCharacterVoiceActor(String id) throws CouldNotGetObjectException {
        return getObject(List.of("characters", id, "voices"), Map.of(), CharacterVoiceActors.class);
    }

    public CharacterPictures getCharacterPictures(String id) throws CouldNotGetObjectException {
        return getObject(List.of("characters", id, "pictures"), Map.of(), CharacterPictures.class);
    }

    public CharactersSearch getCharacterSearch(CharactersSearchTermBuilder charactersSearchTermBuilder) throws CouldNotGetObjectException {
        return getObject(List.of("characters"), charactersSearchTermBuilder.getMap(), CharactersSearch.class);
    }


}
