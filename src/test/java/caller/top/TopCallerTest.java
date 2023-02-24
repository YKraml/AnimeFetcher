package caller.top;

import model.jikan.top.TopAnime.TopAnime;
import model.jikan.top.TopCharacters.TopCharacters;
import model.jikan.top.TopManga.TopManga;
import model.jikan.top.TopPeople.TopPeople;
import model.jikan.top.TopReviews.TopReviews;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.concurrent.ExecutionException;
import util.ApiCallerJikan;

class TopCallerTest {

    TopCaller topCaller = new TopCaller(new ApiCallerJikan());

    @Test
    void anime() throws ExecutionException, InterruptedException {
        TopAnime topAnime = topCaller.anime().page(1).limit(10).consume().get();
        Assertions.assertEquals("Fullmetal Alchemist: Brotherhood", topAnime.getData().get(0).getTitle());
        Assertions.assertEquals(10, topAnime.getData().size());
    }

    @Test
    void manga() throws ExecutionException, InterruptedException {
        TopManga topManga = topCaller.manga().page(1).limit(10).consume().get();
        Assertions.assertEquals("Berserk", topManga.getData().get(0).getTitle());
        Assertions.assertEquals(10, topManga.getData().size());

    }

    @Test
    void people() throws ExecutionException, InterruptedException {
        TopPeople topPeople = topCaller.people().page(1).limit(10).consume().get();
        Assertions.assertEquals("Hiroshi Kamiya", topPeople.getData().get(0).getName());
        Assertions.assertEquals(10, topPeople.getData().size());
    }

    @Test
    void characters() throws ExecutionException, InterruptedException {
        TopCharacters topCharacters = topCaller.characters().page(1).limit(10).consume().get();
        Assertions.assertEquals("Lelouch Lamperouge",topCharacters.getData().get(0).getName());
        Assertions.assertEquals(10, topCharacters.getData().size());
    }

    @Test
    void reviews() throws ExecutionException, InterruptedException {
        TopReviews topReviews = topCaller.reviews().page(1).consume().get();
        // TODO: 29.09.2022 Reviews are broken from Jikan.
    }
}