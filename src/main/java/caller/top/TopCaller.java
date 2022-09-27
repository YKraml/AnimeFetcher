package caller.top;

import caller.AbstractCaller;
import exceptions.CouldNotGetObjectException;
import model.jikan.top.TopAnime.TopAnime;
import model.jikan.top.TopCharacters.TopCharacters;
import model.jikan.top.TopManga.TopManga;
import model.jikan.top.TopPeople.TopPeople;
import model.jikan.top.TopReviews.TopReviews;

import java.util.List;
import java.util.Map;

public class TopCaller extends AbstractCaller {

    private static TopCaller instance;

    public TopCaller() {
        super("top");
    }


    public static TopCaller getInstance() {
        if (instance == null) {
            instance = new TopCaller();
        }
        return instance;
    }


    public TopAnime getTopAnime(String page) throws CouldNotGetObjectException {
        return getObject(List.of("top","anime"), Map.of("page",page), TopAnime.class);
    }

    public TopManga getTopManga(String page) throws CouldNotGetObjectException {
        return getObject(List.of("top","manga"), Map.of("page",page), TopManga.class);
    }

    public TopPeople getTopPeople(String page) throws CouldNotGetObjectException {
        return getObject(List.of("top","people"), Map.of("page",page), TopPeople.class);
    }

    public TopCharacters getTopCharacters(String page) throws CouldNotGetObjectException {
        return getObject(List.of("top","characters"), Map.of("page",page), TopCharacters.class);
    }

    public TopReviews getTopReviews(String page) throws CouldNotGetObjectException {
        return getObject(List.of("top","reviews"), Map.of("page",page), TopReviews.class);
    }


}
