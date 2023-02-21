package caller.top;

public class TopCaller {

    public TopAnimeCaller anime() {
        return new TopAnimeCaller();
    }

    public TopMangaCaller manga(){
        return new TopMangaCaller();
    }

    public TopPeopleCaller people(){
        return new TopPeopleCaller();
    }

    public TopCharactersCaller characters(){
        return new TopCharactersCaller();
    }

    public TopReviewsCaller reviews(){
        return new TopReviewsCaller();
    }
}
