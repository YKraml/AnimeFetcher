package caller.anime;

import caller.ACaller;
import model.jikan.anime.animeCharacters.AnimeCharacters;

public class AnimeCharactersCaller extends ACaller<AnimeCharacters> {
    public AnimeCharactersCaller(int id) {
        addPathParameter("anime");
        addPathParameter(String.valueOf(id));
        addPathParameter("characters");
    }
}
