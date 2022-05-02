package caller;

import exceptions.CouldNotGetObjectException;
import jikan.characters.characterAnime.CharacterAnime;
import jikan.characters.characterById.CharacterById;
import jikan.characters.characterManga.CharacterManga;
import jikan.characters.characterPictures.CharacterPictures;
import jikan.characters.characterVoiceActors.CharacterVoiceActors;
import jikan.characters.charactersSearch.CharactersSearch;
import org.junit.jupiter.api.Test;

class CharacterCallerTest {


    @Test
    public void testAll() {


        CharacterCaller characterCaller = CharacterCaller.getInstance();


        try {
            int id = 1;
            CharacterById characterById = characterCaller.getCharacterById(id);
            CharacterAnime characterAnime = characterCaller.getCharacterAnime(id);
            CharacterManga characterManga = characterCaller.getCharacterManga(id);
            CharacterPictures characterPictures = characterCaller.getCharacterPictures(id);
            CharacterVoiceActors characterVoiceActors = characterCaller.getCharacterVoiceActors(id);
            System.out.println("a");
        } catch (CouldNotGetObjectException e) {
            e.printStackTrace();
        }


    }

    @Test
    public void testSearch(){

        CharactersSearchTermBuilder builder = new CharactersSearchTermBuilder();

        String s = builder.buildTerm();

        try {
            CharactersSearch charactersSearch = CharacterCaller.getInstance().getCharactersSearch(builder);
            System.out.println(charactersSearch.getData());
        } catch (CouldNotGetObjectException e) {
            throw new RuntimeException(e);
        }
    }

}