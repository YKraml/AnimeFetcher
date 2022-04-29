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

    public TopAnime getTopAnime() throws CouldNotGetObjectException {
        return getObject(TopRequests.TopAnime);
    }

    public TopManga getTopManga() throws CouldNotGetObjectException {
        return getObject(TopRequests.TopManga);
    }


    public TopPeople getTopPeople() throws CouldNotGetObjectException {
        return getObject(TopRequests.TopPeople);
    }


    public TopCharacters getTopCharacters() throws CouldNotGetObjectException {
        return getObject(TopRequests.TopCharacters);
    }

    public TopReviews getTopReviews() throws CouldNotGetObjectException {
        return getObject(TopRequests.TopReviews);
    }

    private <K> K getObject(TopRequests request) throws CouldNotGetObjectException {
        String url = JIKAN_URL + name + "/" + request.getRequestString();
        String data;
        try {
            data = ApiCaller.getInstance().getDataFromJikan(url);
            return objectMapper.map(data, request.getRequestClass());
        } catch (CouldNotReachJikanException | CouldNotMapException e) {
            throw new CouldNotGetObjectException(e, url);
        }

    }


}
