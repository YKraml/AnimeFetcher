package caller.character;

import caller.AbstractCaller;

public class CharacterCaller extends AbstractCaller {

    private static CharacterCaller instance;

    public CharacterCaller() {
        super("characters");
    }


    public static CharacterCaller getInstance() {
        if (instance == null) {
            instance = new CharacterCaller();
        }
        return instance;
    }



}
