package caller;

import enums.TopRequests;
import exceptions.CouldNotGetObjectException;
import exceptions.CouldNotMapException;
import exceptions.CouldNotReachJikanException;
import jikan.top.TopAnime.TopAnime;
import jikan.top.TopCharacters.TopCharacters;
import jikan.top.TopManga.TopManga;
import jikan.top.TopPeople.TopPeople;
import jikan.top.TopReviews.TopReviews;
import util.ApiCaller;

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

    public TopAnime getTopAnime(int page) throws CouldNotGetObjectException {
        return getObject(TopRequests.TopAnime, page);
    }

    public TopManga getTopManga(int page) throws CouldNotGetObjectException {
        return getObject(TopRequests.TopManga, page);
    }


    public TopPeople getTopPeople(int page) throws CouldNotGetObjectException {
        return getObject(TopRequests.TopPeople, page);
    }


    public TopCharacters getTopCharacters(int page) throws CouldNotGetObjectException {
        return getObject(TopRequests.TopCharacters, page);
    }

    public TopReviews getTopReviews(int page) throws CouldNotGetObjectException {
        return getObject(TopRequests.TopReviews, page);
    }

    private <K> K getObject(TopRequests request, int page) throws CouldNotGetObjectException {
        String url = JIKAN_URL + name + "/" + request.getRequestString() + "/?page=" + page;
        String data;
        try {
            data = ApiCaller.getInstance().getDataFromJikan(url);
            return objectMapper.map(data, request.getRequestClass());
        } catch (CouldNotReachJikanException | CouldNotMapException e) {
            throw new CouldNotGetObjectException(e, url);
        }

    }


}
