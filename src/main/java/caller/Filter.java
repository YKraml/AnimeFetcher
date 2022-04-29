package caller;

public enum Filter {

    AIRING("airing"),
    UPCOMING("upcoming"),
    BY_POPULARITY("bypopularity"),
    FAVORITE("favorite");

    private final String name;

    Filter(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
