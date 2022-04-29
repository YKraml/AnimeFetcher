package enums;

import jikan.top.TopAnime.TopAnime;

public class TopRequests extends AbstractRequest {

    public final static TopRequests TopAnime = new TopRequests("anime", TopAnime.class);
    public final static TopRequests TopManga = new TopRequests("manga", jikan.top.TopManga.TopManga.class);
    public final static TopRequests TopPeople = new TopRequests("people", jikan.top.TopPeople.TopPeople.class);
    public final static TopRequests TopCharacters = new TopRequests("characters", jikan.top.TopCharacters.TopCharacters.class);
    public final static TopRequests TopReviews = new TopRequests("reviews", jikan.top.TopReviews.TopReviews.class);

    TopRequests(String requestString, Class<?> requestClass) {
        super(requestString, requestClass);
    }
}
