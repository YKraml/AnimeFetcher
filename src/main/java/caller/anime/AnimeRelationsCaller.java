package caller.anime;

import caller.ACaller;
import model.jikan.anime.animeRelations.AnimeRelations;

public class AnimeRelationsCaller extends ACaller<AnimeRelations> {
    public AnimeRelationsCaller(int id) {
        addPathParameter("anime");
        addPathParameter(String.valueOf(id));
        addPathParameter("relations");
    }
}
