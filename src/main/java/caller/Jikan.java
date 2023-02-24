package caller;

import caller.anime.AnimeCaller;
import caller.character.CharacterCaller;
import caller.top.TopCaller;
import org.apiguardian.api.API;
import util.ApiCaller;
import util.ApiCallerCached;
import util.Mapper;

public class Jikan {

  private static final ApiCaller API_CALLER = new ApiCallerCached();

  public static TopCaller top() {
    return new TopCaller(API_CALLER);
  }

  public static AnimeCaller anime() {
    return new AnimeCaller(API_CALLER);
  }

  public static CharacterCaller characters() {
    return new CharacterCaller(API_CALLER);
  }
}
