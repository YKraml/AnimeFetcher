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
import main.MyObjectMapper;

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

    private  <K> K getObject(String id, RequestEnums request, String parameter) {
        try {
            String json = this.getJson(id, request.getRequestString(), parameter);
            return objectMapper.map(json, request.getRequestClass());
        }catch (MyException e){

        }
        return null;
    }

    public Anime getAnime(String id) {
        return this.getObject(id, RequestEnums.ANIME, "");
    }

    public CharacterStaff getCharacterStaff(String id) {
        return this.getObject(id, RequestEnums.CHARACTER_STAFF, "");
    }

    public Episodes getEpisodes(String id, int page){
        return this.getObject(id, RequestEnums.EPISODES, String.valueOf(page));
    }

    public News getNews(String id){
        return this.getObject(id, RequestEnums.NEWS, "");
    }

    public Pictures getPictures(String id){
        return this.getObject(id, RequestEnums.PICTURES, "");
    }

    public Videos getVideos(String id){
        return this.getObject(id, RequestEnums.VIDEOS, "");
    }

    public Stats getStats(String id){
        return this.getObject(id, RequestEnums.STATS,"");
    }

    public Forum getForum(String id){
        return this.getObject(id, RequestEnums.FORUM, "");
    }

    public MoreInfo getMoreInfo(String id){
        return this.getObject(id, RequestEnums.MORE_INFO, "");
    }

    public Reviews getReviews(String id, int page){
        return this.getObject(id, RequestEnums.REVIEWS, String.valueOf(page));
    }

    public Recommendations getRecommendations(String id){
        return this.getObject(id, RequestEnums.RECOMMENDATIONS, "");
    }

    public UserUpdates getUserUpdates(String id, int page){
        return this.getObject(id, RequestEnums.USER_UPDATES, String.valueOf(page));
    }


}
