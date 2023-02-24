package caller.top;

import util.ApiCaller;

public class TopCaller {

    private final ApiCaller apiCaller;

    public TopCaller(ApiCaller apiCaller) {
        this.apiCaller = apiCaller;
    }

    public TopAnimeCaller anime() {
        return new TopAnimeCaller(apiCaller);
    }

    public TopMangaCaller manga(){
        return new TopMangaCaller(apiCaller);
    }

    public TopPeopleCaller people(){
        return new TopPeopleCaller(apiCaller);
    }

    public TopCharactersCaller characters(){
        return new TopCharactersCaller(apiCaller);
    }

    public TopReviewsCaller reviews(){
        return new TopReviewsCaller(apiCaller);
    }
}
