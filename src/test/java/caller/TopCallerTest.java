package caller;

import exceptions.CouldNotGetObjectException;
import jikan.top.TopReviews.TopReviews;
import org.junit.jupiter.api.Test;

class TopCallerTest {


    @Test
    public void testAll() {

        TopCaller topCaller = TopCaller.getInstance();


        try {/*
            TopAnime topAnime = topCaller.getTopAnime();
            TopManga topManga = topCaller.getTopManga();
            TopPeople topPeople = topCaller.getTopPeople();
            TopCharacters topCharacters = topCaller.getTopCharacters();*/
            TopReviews topReviews = topCaller.getTopReviews();
            System.out.println("Test Ende");
        } catch (CouldNotGetObjectException e) {
            e.printStackTrace();
        }

    }

}