package caller.anime;

import caller.Jikan;
import enums.AnimeSearchQueryOrderBy;
import enums.SearchQuerySort;
import model.jikan.anime.animeSearch.AnimeSearch;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import util.ApiCallerJikan;

class AnimeSearchCallerTest {

  private AnimeSearchCaller caller;

  @BeforeEach
  void setUp() {
    caller = Jikan.anime().search();
  }

  @Test
  void testQ() {
    AnimeSearch animeSearch = caller.q("One piece").sort(SearchQuerySort.desc)
        .orderBy(AnimeSearchQueryOrderBy.favorites).consume().join();
    Assertions.assertFalse(animeSearch.getData().isEmpty());
    Assertions.assertEquals("One Piece", animeSearch.getData().get(0).getTitle());
  }

  @Test
  void testOrderByFavorites() {
    AnimeSearch animeSearch = caller.sort(SearchQuerySort.desc)
        .orderBy(AnimeSearchQueryOrderBy.favorites).consume().join();

    Integer favorites1 = animeSearch.getData().get(0).getFavorites();
    Integer favorites2 = animeSearch.getData().get(1).getFavorites();

    Assertions.assertTrue(favorites1 >= favorites2);
  }


  @Test
  void testOrderByMembers() {
    AnimeSearch animeSearch = caller.q("Kaguya-sama").sort(SearchQuerySort.desc)
        .orderBy(AnimeSearchQueryOrderBy.members).consume().join();

    Integer members1 = animeSearch.getData().get(0).getMembers();
    Integer members2 = animeSearch.getData().get(1).getMembers();

    Assertions.assertTrue(members1 >= members2);
  }

  @Test
  void testAscendingSort() {
    AnimeSearch animeSearch = caller.sort(SearchQuerySort.asc)
        .orderBy(AnimeSearchQueryOrderBy.members).consume().join();

    Integer members1 = animeSearch.getData().get(0).getMembers();
    Integer members2 = animeSearch.getData().get(1).getMembers();

    Assertions.assertTrue(members1 <= members2);
  }


}