package caller;

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
import org.junit.jupiter.api.Test;

class AnimeCallerTest {

    @Test
    public void testAll() {

        try {

            int id = 20;

            AnimeById animeById = AnimeCaller.getInstance().getAnimeById(id);
            AnimeCharacters animeCharacters = AnimeCaller.getInstance().getAnimeCharacters(id);
            AnimeStaff animeStaff = AnimeCaller.getInstance().getAnimeStaff(id);
            AnimeEpisodes animeEpisodes = AnimeCaller.getInstance().getAnimeEpisodes(id);
            AnimeEpisodeById animeEpisodeById = AnimeCaller.getInstance().getAnimeEpisodeById(id, 1);
            AnimeNews animeNews = AnimeCaller.getInstance().getAnimeNews(id);
            AnimeForum animeForum = AnimeCaller.getInstance().getAnimeForum(id);
            AnimeVideos animeVideos = AnimeCaller.getInstance().getAnimeVideos(id);
            AnimePictures animePictures = AnimeCaller.getInstance().getAnimePictures(id);
            AnimeStatistics animeStatistics = AnimeCaller.getInstance().getAnimeStatistics(id);
            AnimeMoreInfo animeMoreInfo = AnimeCaller.getInstance().getAnimeMoreInfo(id);
            AnimeRecommendations animeRecommendations = AnimeCaller.getInstance().getAnimeRecommendations(id);
            AnimeUserUpdates animeUserUpdates = AnimeCaller.getInstance().getAnimeUserUpdates(id);
            AnimeReviews animeReviews = AnimeCaller.getInstance().getAnimeReviews(id);
            AnimeRelations animeRelations = AnimeCaller.getInstance().getAnimeRelations(id);
            AnimeThemes animeThemes = AnimeCaller.getInstance().getAnimeThemes(id);
            AnimeExternal animeExternal = AnimeCaller.getInstance().getAnimeExternal(id);


            System.out.println("hi");
        } catch (CouldNotGetObjectException e) {
            e.printStackTrace();
        }

    }

}