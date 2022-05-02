package caller;

import enums.CharactersRequests;
import exceptions.CouldNotGetObjectException;
import jikan.characters.characterAnime.CharacterAnime;
import jikan.characters.characterById.CharacterById;
import jikan.characters.characterManga.CharacterManga;
import jikan.characters.characterPictures.CharacterPictures;
import jikan.characters.characterVoiceActors.CharacterVoiceActors;
import jikan.characters.charactersSearch.CharactersSearch;

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

    public CharacterById getCharacterById(int id) throws CouldNotGetObjectException {
        return this.getObject(id, CharactersRequests.CharacterById);
    }

    public CharacterAnime getCharacterAnime(int id) throws CouldNotGetObjectException {
        return this.getObject(id, CharactersRequests.CharacterAnime);
    }

    public CharacterManga getCharacterManga(int id) throws CouldNotGetObjectException {
        return this.getObject(id, CharactersRequests.CharacterManga);
    }

    public CharacterVoiceActors getCharacterVoiceActors(int id) throws CouldNotGetObjectException {
        return this.getObject(id, CharactersRequests.CharacterVoiceActors);
    }

    public CharacterPictures getCharacterPictures(int id) throws CouldNotGetObjectException {
        return this.getObject(id, CharactersRequests.CharacterPictures);
    }


    public CharactersSearch getCharactersSearch(CharactersSearchTermBuilder charactersSearchTermBuilder) throws CouldNotGetObjectException {
        return this.getObject(charactersSearchTermBuilder.buildTerm(), CharactersRequests.CharactersSearch);
    }


}
