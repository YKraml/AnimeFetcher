package caller;

import caller.anime.AnimeCaller;
import caller.character.CharacterCaller;
import caller.top.TopCaller;

public class Jikan {

    public static AnimeCaller getAnimeCaller(){
        return AnimeCaller.getInstance();
    }

    public static CharacterCaller getCharacterCaller(){
        return CharacterCaller.getInstance();
    }

    public static TopCaller getTopCaller(){
        return TopCaller.getInstance();
    }

}
