package caller;

import anime.anime.Anime;
import anime.characters_staff.CharacterStaff;
import anime.episodes.Episodes;
import anime.forum.Forum;
import anime.moreinfo.MoreInfo;
import anime.news.News;
import anime.pictures.Pictures;
import anime.recommendations.Recommendations;
import anime.reviews.Reviews;
import anime.stats.Stats;
import anime.userupdates.UserUpdates;
import anime.videos.Videos;

public enum RequestEnums {

    ANIME("", Anime.class),
    CHARACTER_STAFF("characters_staff", CharacterStaff.class),
    EPISODES("episodes", Episodes.class),
    NEWS("episodes", News.class),
    PICTURES("episodes", Pictures.class),
    VIDEOS("episodes", Videos.class),
    STATS("episodes", Stats.class),
    FORUM("episodes", Forum.class),
    MORE_INFO("episodes", MoreInfo.class),
    REVIEWS("episodes", Reviews.class),
    RECOMMENDATIONS("episodes", Recommendations.class),
    USER_UPDATES("episodes", UserUpdates.class);

    private final String requestString;
    private final Class<?> requestClass;

    RequestEnums(String requestString, Class<?> requestClass) {
        this.requestString = requestString;
        this.requestClass = requestClass;
    }

    public String getRequestString() {
        return requestString;
    }

    @SuppressWarnings("unchecked")
    public <T> Class<T> getRequestClass() {
        return (Class<T>) requestClass;
    }
}
