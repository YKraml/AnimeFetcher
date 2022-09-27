package caller.top;

import exceptions.CouldNotGetObjectException;
import model.jikan.top.TopAnime.TopAnime;
import model.jikan.top.TopCharacters.TopCharacters;
import model.jikan.top.TopManga.TopManga;
import model.jikan.top.TopPeople.TopPeople;
import model.jikan.top.TopReviews.TopReviews;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TopCallerTest {

    private final TopCaller topCaller = new TopCaller();

    @Test
    void getTopAnime() throws CouldNotGetObjectException {
        TopAnime topAnime = topCaller.getTopAnime("1");
        Assertions.assertFalse(topAnime.getData().isEmpty());
    }

    @Test
    void getTopManga() throws CouldNotGetObjectException {
        TopManga topManga = topCaller.getTopManga("1");
        Assertions.assertFalse(topManga.getData().isEmpty());
    }

    @Test
    void getTopPeople() throws CouldNotGetObjectException {
        TopPeople topPeople = topCaller.getTopPeople("1");
        Assertions.assertFalse(topPeople.getData().isEmpty());
    }

    @Test
    void getTopCharacters() throws CouldNotGetObjectException {
        TopCharacters topCharacters = topCaller.getTopCharacters("1");
        Assertions.assertFalse(topCharacters.getData().isEmpty());
    }

    @Test
    void getTopReviews() throws CouldNotGetObjectException {
        TopReviews topReviews = topCaller.getTopReviews("1");
        // TODO: 27.09.2022 Reviews sind bei Jikan broken
        //Assertions.assertFalse(topReviews.getData().isEmpty());
    }
}