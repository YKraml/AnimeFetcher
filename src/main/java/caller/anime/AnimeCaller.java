package caller.anime;


import caller.AbstractCaller;
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
import jikan.anime.animeSearch.AnimeSearch;
import jikan.anime.animeStaff.AnimeStaff;
import jikan.anime.animeStatistics.AnimeStatistics;
import jikan.anime.animeThemes.AnimeThemes;
import jikan.anime.animeUserUpdates.AnimeUserUpdates;
import jikan.anime.animeVideos.AnimeVideos;

import java.util.List;
import java.util.Map;


public class AnimeCaller extends AbstractCaller {


    private static AnimeCaller instance;

    public AnimeCaller() {
        super("anime");
    }


    public static AnimeCaller getInstance() {
        if (instance == null) {
            instance = new AnimeCaller();
        }
        return instance;
    }


    public AnimeById getAnimeById(String id) throws CouldNotGetObjectException {
        return getObject(List.of("anime", id), Map.of(), AnimeById.class);
    }

    public AnimeCharacters getAnimeCharacters(String id) throws CouldNotGetObjectException {
        return getObject(List.of("anime", id, "characters"), Map.of(), AnimeCharacters.class);
    }

    public AnimeStaff getAnimeStaff(String id) throws CouldNotGetObjectException {
        return getObject(List.of("anime", id, "staff"), Map.of(), AnimeStaff.class);
    }

    public AnimeEpisodes getAnimeEpisodes(String id, String page) throws CouldNotGetObjectException {
        return getObject(List.of("anime", id, "episodes"), Map.of("page", page), AnimeEpisodes.class);
    }


    public AnimeEpisodeById getAnimeEpisodeById(String id, String episode) throws CouldNotGetObjectException {
        return getObject(List.of("anime", id, "episodes", episode), Map.of(), AnimeEpisodeById.class);
    }

    // TODO: 19.09.2022 Ab hier muss noch alles gemacht und getestet werden. Also immer die Liste und Map ändern und Test schreiben.
    public AnimeNews getAnimeNews(String id) throws CouldNotGetObjectException {
        return getObject(List.of("anime", id), Map.of(), AnimeNews.class);
    }

    public AnimeForum getAnimeForum(String id) throws CouldNotGetObjectException {
        return getObject(List.of("anime", id), Map.of(), AnimeForum.class);
    }

    public AnimeVideos getAnimeVideos(String id) throws CouldNotGetObjectException {
        return getObject(List.of("anime", id), Map.of(), AnimeVideos.class);
    }

    public AnimePictures getAnimePictures(String id) throws CouldNotGetObjectException {
        return getObject(List.of("anime", id), Map.of(), AnimePictures.class);
    }

    public AnimeStatistics getAnimeStatistics(String id) throws CouldNotGetObjectException {
        return getObject(List.of("anime", id), Map.of(), AnimeStatistics.class);
    }

    public AnimeMoreInfo getAnimeMoreInfo(String id) throws CouldNotGetObjectException {
        return getObject(List.of("anime", id), Map.of(), AnimeMoreInfo.class);
    }

    public AnimeRecommendations getAnimeRecommendations(String id) throws CouldNotGetObjectException {
        return getObject(List.of("anime", id), Map.of(), AnimeRecommendations.class);
    }

    public AnimeUserUpdates getAnimeUserUpdates(String id) throws CouldNotGetObjectException {
        return getObject(List.of("anime", id), Map.of(), AnimeUserUpdates.class);
    }

    public AnimeReviews getAnimeReviews(String id) throws CouldNotGetObjectException {
        return getObject(List.of("anime", id), Map.of(), AnimeReviews.class);
    }

    public AnimeRelations getAnimeRelations(String id) throws CouldNotGetObjectException {
        return getObject(List.of("anime", id), Map.of(), AnimeRelations.class);
    }

    public AnimeThemes getAnimeThemes(String id) throws CouldNotGetObjectException {
        return getObject(List.of("anime", id), Map.of(), AnimeThemes.class);
    }

    public AnimeExternal getAnimeExternal(String id) throws CouldNotGetObjectException {
        return getObject(List.of("anime", id), Map.of(), AnimeExternal.class);
    }


    public AnimeSearch getAnimeSearch(AnimeSearchTermBuilder animeSearchTermBuilder) throws CouldNotGetObjectException {
        return this.getObject(List.of("anime"), animeSearchTermBuilder.getMap(), AnimeSearch.class);
    }


}
