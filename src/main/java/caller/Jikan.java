package caller;

import caller.anime.AnimeCaller;
import caller.character.CharacterCaller;
import caller.top.TopCaller;

public class Jikan {

    public static AnimeCaller AnimeCaller() {
        return AnimeCaller.getInstance();
    }

    public static CharacterCaller CharacterCaller() {
        return CharacterCaller.getInstance();
    }

    public static TopCaller TopCaller() {
        return TopCaller.getInstance();
    }

}
