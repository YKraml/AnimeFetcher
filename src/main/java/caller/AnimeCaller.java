package caller;

import anime.anime.Anime;
import anime.characters_staff.CharacterStaff;
import main.MyObjectMapper;
import org.jetbrains.annotations.NotNull;

import java.util.Optional;

public class AnimeCaller extends AbstractCaller {


    private static final String ID_REGEX = "%ID%";
    private static final String REQUEST_REGEX = "%REQUEST%";
    private static final String PARAMETER_REGEX = "%PARAMETER%";
    private static final String END_POINT_URL = jikanUrl + "anime/" + ID_REGEX + "/" + REQUEST_REGEX + "/" + PARAMETER_REGEX;

    private final MyObjectMapper objectMapper;

    public AnimeCaller() {
        this.objectMapper = new MyObjectMapper();
    }

    @NotNull
    private String makeUrl(String id, String request, String parameter) {
        return END_POINT_URL.replace(ID_REGEX, id).replace(REQUEST_REGEX, request).replace(PARAMETER_REGEX, parameter);
    }

    private String getJson(String id, String request, String parameter) {
        String url = makeUrl(id, request, "");
        return ApiCaller.getInstance().getDataFromJikan(url);
    }

    public Anime getAnime(String id) {

        String data = getJson(id, "", "");
        Optional<Anime> anime = objectMapper.map(data, Anime.class);

        return anime.get();
    }


    public CharacterStaff getCharacterStaff(String id) {

        String data = getJson(id, "characters_staff", "");
        Optional<CharacterStaff> characterStaff = objectMapper.map(data, CharacterStaff.class);

        return characterStaff.get();
    }

}
