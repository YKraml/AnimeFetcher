package enums;

public enum AnimeForumFilter {


    ALL("all"),
    EPISODE("episode"),
    OTHER("other");

    private final String value;
    AnimeForumFilter(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
