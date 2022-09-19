package caller.top;

import caller.AbstractCaller;

public class TopCaller extends AbstractCaller {

    private static TopCaller instance;

    public TopCaller() {
        super("top");
    }


    public static TopCaller getInstance() {
        if (instance == null) {
            instance = new TopCaller();
        }
        return instance;
    }





}
