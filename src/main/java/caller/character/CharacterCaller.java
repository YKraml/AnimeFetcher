package caller.character;

public class CharacterCaller {

    public CharacterFullByIdCaller fullById(int id){
        return new CharacterFullByIdCaller(id);
    }

    public CharacterByIdCaller byId(int id){
        return new CharacterByIdCaller(id);
    }

    public CharacterAnimeCaller anime(int id){
        return new CharacterAnimeCaller(id);
    }

    public CharacterMangaCaller manga(int id){
        return new CharacterMangaCaller(id);
    }

    public CharacterVoiceActorsCaller voiceActors(int id){
        return new CharacterVoiceActorsCaller(id);
    }

    public CharacterPicturesCaller pictures(int id){
        return new CharacterPicturesCaller(id);
    }

    public CharacterSearchCaller search(){
        return new CharacterSearchCaller();
    }

}
