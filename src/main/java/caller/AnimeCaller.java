package caller;


import enums.AnimeRequests;
import exceptions.CouldNotGetObjectException;
import jikan.anime.animeById.AnimeById;
import jikan.anime.animeCharacters.AnimeCharacters;
import jikan.anime.animeEpisodeById.AnimeEpisodeById;
import jikan.anime.animeEpisodes.AnimeEpisodes;
import jikan.anime.animeExternal.AnimeExternal;
import jikan.anime.animeForum.AnimeForum;
import jikan.anime.animeMoreInfo.AnimeMoreInfo;
import jikan.anime.animeNews.AnimeNews;
import jikan.anime.animePictures.AnimePictures;
import jikan.anime.animeRecommendations.AnimeRecommendations;
import jikan.anime.animeRelations.AnimeRelations;
import jikan.anime.animeReviews.AnimeReviews;
import jikan.anime.animeStaff.AnimeStaff;
import jikan.anime.animeStatistics.AnimeStatistics;
import jikan.anime.animeThemes.AnimeThemes;
import jikan.anime.animeUserUpdates.AnimeUserUpdates;
import jikan.anime.animeVideos.AnimeVideos;

public class AnimeCaller extends AbstractCaller {




    private static AnimeCaller instance;

    public AnimeCaller(){
        super("anime");
    }


    public static AnimeCaller getInstance() {
        if (instance == null) {
            instance = new AnimeCaller();
        }
        return instance;
    }




    public AnimeById getAnimeById(int id) throws CouldNotGetObjectException {
        return this.getObject(id, AnimeRequests.AnimeById);
    }

    public AnimeCharacters getAnimeCharacters(int id) throws CouldNotGetObjectException {
        return this.getObject(id, AnimeRequests.AnimeCharacters);
    }

    public AnimeStaff getAnimeStaff(int id) throws CouldNotGetObjectException {
        return this.getObject(id, AnimeRequests.AnimeStaff);
    }

    public AnimeEpisodes getAnimeEpisodes(int id) throws CouldNotGetObjectException {
        return this.getObject(id, AnimeRequests.AnimeEpisodes);
    }


    public AnimeEpisodeById getAnimeEpisodeById(int id, int episode) throws CouldNotGetObjectException {
        return this.getObject(id, AnimeRequests.AnimeEpisodeById, String.valueOf(episode));
    }


    public AnimeNews getAnimeNews(int id) throws CouldNotGetObjectException {
        return this.getObject(id, AnimeRequests.AnimeNews);
    }

    public AnimeForum getAnimeForum(int id) throws CouldNotGetObjectException {
        return this.getObject(id, AnimeRequests.AnimeForum);
    }

    public AnimeVideos getAnimeVideos(int id) throws CouldNotGetObjectException {
        return this.getObject(id, AnimeRequests.AnimeVideos);
    }

    public AnimePictures getAnimePictures(int id) throws CouldNotGetObjectException {
        return this.getObject(id, AnimeRequests.AnimePictures);
    }

    public AnimeStatistics getAnimeStatistics(int id) throws CouldNotGetObjectException {
        return this.getObject(id, AnimeRequests.AnimeStatistics);
    }

    public AnimeMoreInfo getAnimeMoreInfo(int id) throws CouldNotGetObjectException {
        return this.getObject(id, AnimeRequests.AnimeMoreInfo);
    }

    public AnimeRecommendations getAnimeRecommendations(int id) throws CouldNotGetObjectException {
        return this.getObject(id, AnimeRequests.AnimeRecommendations);
    }

    public AnimeUserUpdates getAnimeUserUpdates(int id) throws CouldNotGetObjectException {
        return this.getObject(id, AnimeRequests.AnimeUserUpdates);
    }

    public AnimeReviews getAnimeReviews(int id) throws CouldNotGetObjectException {
        return this.getObject(id, AnimeRequests.AnimeReviews);
    }

    public AnimeRelations getAnimeRelations(int id) throws CouldNotGetObjectException {
        return this.getObject(id, AnimeRequests.AnimeRelations);
    }

    public AnimeThemes getAnimeThemes(int id) throws CouldNotGetObjectException {
        return this.getObject(id, AnimeRequests.AnimeThemes);
    }

    public AnimeExternal getAnimeExternal(int id) throws CouldNotGetObjectException {
        return this.getObject(id, AnimeRequests.AnimeExternal);
    }

    /*
    public AnimeSearch getAnimeSearch(int id) throws CouldNotGetObjectException {
        // TODO: 29.04.2022 Search implementieren
        return this.getObject(id, AnimeRequests.AnimeSearch, "");
    }
    */


}
