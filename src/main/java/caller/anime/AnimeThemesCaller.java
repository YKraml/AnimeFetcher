package caller.anime;

import caller.ACaller;
import model.jikan.anime.animeThemes.AnimeThemes;

public class AnimeThemesCaller extends ACaller<AnimeThemes> {
    public AnimeThemesCaller(int id) {
        addPathParameter("anime");
        addPathParameter(String.valueOf(id));
        addPathParameter("themes");
    }
}
