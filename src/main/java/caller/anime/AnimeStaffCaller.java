package caller.anime;

import caller.ACaller;
import model.jikan.anime.animeStaff.AnimeStaff;

public class AnimeStaffCaller extends ACaller<AnimeStaff> {
    public AnimeStaffCaller(int id) {
        addPathParameter("anime");
        addPathParameter(String.valueOf(id));
        addPathParameter("staff");
    }
}
