package caller;

import exceptions.CouldNotGetObjectException;
import jikan.top.TopAnime.TopAnime;
import jikan.top.TopCharacters.TopCharacters;
import jikan.top.TopManga.TopManga;
import jikan.top.TopPeople.TopPeople;
import jikan.top.TopReviews.TopReviews;
import org.junit.jupiter.api.Test;

class TopCallerTest {


    @Test
    public void testAll() {

        TopCaller topCaller = TopCaller.getInstance();


        try {
            TopAnime topAnime = topCaller.getTopAnime(1);
            TopManga topManga = topCaller.getTopManga(2);
            TopPeople topPeople = topCaller.getTopPeople(3);
            TopCharacters topCharacters = topCaller.getTopCharacters(4);
            TopReviews topReviews = topCaller.getTopReviews(5);
            System.out.println("Test Ende");
        } catch (CouldNotGetObjectException e) {
            e.printStackTrace();
        }

    }

}