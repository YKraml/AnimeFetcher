
package anime.APIObjects.anime;

public class Licensor {

    private Integer mal_id;
    private String type;
    private String name;
    private String url;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Licensor() {
    }

    /**
     * 
     * @param name
     * @param mal_id
     * @param type
     * @param url
     */
    public Licensor(Integer mal_id, String type, String name, String url) {
        super();
        this.mal_id = mal_id;
        this.type = type;
        this.name = name;
        this.url = url;
    }

    public Integer getMal_id() {
        return mal_id;
    }

    public void setMal_id(Integer mal_id) {
        this.mal_id = mal_id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

}
