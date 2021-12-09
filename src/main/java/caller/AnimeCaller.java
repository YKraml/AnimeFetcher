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
import enums.AnimeRequests;
import exceptions.CouldNotGetObjectException;
import exceptions.MyException;
import util.ApiCaller;
import util.MyObjectMapper;

public class AnimeCaller extends AbstractCaller {


    private static final String ID_REGEX = "%ID%";
    private static final String REQUEST_REGEX = "%REQUEST%";
    private static final String PARAMETER_REGEX = "%PARAMETER%";
    private static final String END_POINT_URL = jikanUrl + "anime/" + ID_REGEX + "/" + REQUEST_REGEX + "/" + PARAMETER_REGEX;

    private final MyObjectMapper objectMapper;

    private static AnimeCaller instance;
    private AnimeCaller() {
        this.objectMapper = new MyObjectMapper();
    }

    public static AnimeCaller getInstance() {
        if(instance == null){
            instance = new AnimeCaller();
        }
        return instance;
    }

    private String makeUrl(String id, String request, String parameter) {
        return END_POINT_URL.replace(ID_REGEX, id).replace(REQUEST_REGEX, request).replace(PARAMETER_REGEX, parameter);
    }

    private String getJson(String id, String request, String parameter) throws MyException {
        String url = this.makeUrl(id, request, parameter);
        return ApiCaller.getInstance().getDataFromJikan(url);
    }

    private  <K> K getObject(String id, AnimeRequests request, String parameter) throws CouldNotGetObjectException {
        try {
            String json = this.getJson(id, request.getRequestString(), parameter);
            return objectMapper.map(json, request.getRequestClass());
        }catch (MyException e){
            throw new CouldNotGetObjectException(e, id, request.getRequestString(), parameter);
        }
    }

    public Anime getAnime(String id) throws CouldNotGetObjectException {
        return this.getObject(id, AnimeRequests.ANIME, "");
    }

    public CharacterStaff getCharacterStaff(String id) throws CouldNotGetObjectException {
        return this.getObject(id, AnimeRequests.CHARACTER_STAFF, "");
    }

    public Episodes getEpisodes(String id, int page) throws CouldNotGetObjectException {
        return this.getObject(id, AnimeRequests.EPISODES, String.valueOf(page));
    }

    public News getNews(String id) throws CouldNotGetObjectException {
        return this.getObject(id, AnimeRequests.NEWS, "");
    }

    public Pictures getPictures(String id) throws CouldNotGetObjectException {
        return this.getObject(id, AnimeRequests.PICTURES, "");
    }

    public Videos getVideos(String id) throws CouldNotGetObjectException {
        return this.getObject(id, AnimeRequests.VIDEOS, "");
    }

    public Stats getStats(String id) throws CouldNotGetObjectException {
        return this.getObject(id, AnimeRequests.STATS,"");
    }

    public Forum getForum(String id) throws CouldNotGetObjectException {
        return this.getObject(id, AnimeRequests.FORUM, "");
    }

    public MoreInfo getMoreInfo(String id) throws CouldNotGetObjectException {
        return this.getObject(id, AnimeRequests.MORE_INFO, "");
    }

    public Reviews getReviews(String id, int page) throws CouldNotGetObjectException {
        return this.getObject(id, AnimeRequests.REVIEWS, String.valueOf(page));
    }

    public Recommendations getRecommendations(String id) throws CouldNotGetObjectException {
        return this.getObject(id, AnimeRequests.RECOMMENDATIONS, "");
    }

    public UserUpdates getUserUpdates(String id, int page) throws CouldNotGetObjectException {
        return this.getObject(id, AnimeRequests.USER_UPDATES, String.valueOf(page));
    }


}
