package caller.anime;

import caller.ACaller;
import model.jikan.anime.animeRelations.AnimeRelations;

public class AnimeRelationsCaller extends ACaller<AnimeRelations> {
    public AnimeRelationsCaller(int id) {
        pathParameters.add("anime");
        pathParameters.add(String.valueOf(id));
        pathParameters.add("relations");
    }
}
