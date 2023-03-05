package caller;

import caller.anime.AnimeCaller;
import caller.character.CharacterCaller;
import caller.top.TopCaller;
import util.ApiCaller;
import util.ApiCallerCachedLocal;
import util.ApiCallerCashedPersistent;

public class Jikan {

  private static final ApiCaller API_CALLER = new ApiCallerCachedLocal();

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
