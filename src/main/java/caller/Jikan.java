package caller;

import caller.anime.AnimeCaller;
import caller.top.TopCaller;

public class Jikan {


    public static TopCaller top() {
        return new TopCaller();
    }

    public static AnimeCaller anime() {
        return new AnimeCaller();
    }
}
