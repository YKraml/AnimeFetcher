package caller.anime;

import caller.ACaller;
import model.jikan.anime.animeThemes.AnimeThemes;

public class AnimeThemesCaller extends ACaller<AnimeThemes> {
    public AnimeThemesCaller(int id) {
        pathParameters.add("anime");
        pathParameters.add(String.valueOf(id));
        pathParameters.add("themes");
    }
}
