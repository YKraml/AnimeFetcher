package caller.character;

import util.ApiCaller;

public class CharacterCaller {

    private final ApiCaller apiCaller;

    public CharacterCaller(ApiCaller apiCaller) {
        this.apiCaller = apiCaller;
    }

    public CharacterFullByIdCaller fullById(int id){
        return new CharacterFullByIdCaller(id, apiCaller);
    }

    public CharacterByIdCaller byId(int id){
        return new CharacterByIdCaller(id, apiCaller);
    }

    public CharacterAnimeCaller anime(int id){
        return new CharacterAnimeCaller(id, apiCaller);
    }

    public CharacterMangaCaller manga(int id){
        return new CharacterMangaCaller(id, apiCaller);
    }

    public CharacterVoiceActorsCaller voiceActors(int id){
        return new CharacterVoiceActorsCaller(id, apiCaller);
    }

    public CharacterPicturesCaller pictures(int id){
        return new CharacterPicturesCaller(id, apiCaller);
    }

    public CharacterSearchCaller search(){
        return new CharacterSearchCaller(apiCaller);
    }

}
