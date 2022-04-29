package enums;

import jikan.characters.characterById.CharacterById;

public class CharactersRequests extends AbstractRequest {

    public final static CharactersRequests CharacterById = new CharactersRequests("", CharacterById.class);
    public final static CharactersRequests CharacterAnime = new CharactersRequests("anime", jikan.characters.characterAnime.CharacterAnime.class);
    public final static CharactersRequests CharacterManga = new CharactersRequests("manga", jikan.characters.characterManga.CharacterManga.class);
    public final static CharactersRequests CharacterVoiceActors = new CharactersRequests("voices", jikan.characters.characterVoiceActors.CharacterVoiceActors.class);
    public final static CharactersRequests CharacterPictures = new CharactersRequests("pictures", jikan.characters.characterPictures.CharacterPictures.class);
    public final static CharactersRequests CharactersSearch = new CharactersRequests("", jikan.characters.charactersSearch.CharactersSearch.class);


    CharactersRequests(String requestString, Class<?> requestClass) {
        super(requestString, requestClass);
    }
}
