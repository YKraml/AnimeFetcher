package caller.anime;

import caller.ACaller;
import model.jikan.anime.animeStaff.AnimeStaff;

public class AnimeStaffCaller extends ACaller<AnimeStaff> {
    public AnimeStaffCaller(int id) {
        pathParameters.add("anime");
        pathParameters.add(String.valueOf(id));
        pathParameters.add("staff");
    }
}
