package caller;

import caller.anime.AnimeCaller;
import caller.character.CharacterCaller;
import caller.top.TopCaller;

public class Jikan {


    public static TopCaller top() {
        return new TopCaller();
    }

    public static AnimeCaller anime() {
        return new AnimeCaller();
    }

    public static CharacterCaller characters(){
        return new CharacterCaller();
    }
}
