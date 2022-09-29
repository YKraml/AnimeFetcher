package caller.anime;

import caller.ACaller;
import model.jikan.anime.animeCharacters.AnimeCharacters;

public class AnimeCharactersCaller extends ACaller<AnimeCharacters> {
    public AnimeCharactersCaller(int id) {
        pathParameters.add("anime");
        pathParameters.add(String.valueOf(id));
        pathParameters.add("characters");
    }
}
