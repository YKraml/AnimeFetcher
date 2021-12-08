package anime.anime; 
import java.util.List;

public class Anime {
    private String request_hash;
    private boolean request_cached;
    private int request_cache_expiry;
    private int mal_id;
    private String url;
    private String image_url;
    private String trailer_url;
    private String title;
    private String title_english;
    private String title_japanese;
    private List<String> title_synonyms;
    private String type;
    private String source;
    private int episodes;
    private String status;
    private boolean airing;
    private Aired aired;
    private String duration;
    private String rating;
    private double score;
    private int scored_by;
    private int rank;
    private int popularity;
    private int members;
    private int favorites;
    private String synopsis;
    private Object background;
    private String premiered;
    private String broadcast;
    private Related related;
    private List<Producer> producers;
    private List<Licensor> licensors;
    private List<Studio> studios;
    private List<Genre> genres;
    private List<Object> explicit_genres;
    private List<Object> demographics;
    private List<Theme> themes;
    private List<String> opening_themes;
    private List<String> ending_themes;
    private List<ExternalLink> external_links;


    public String getRequest_hash() {
        return request_hash;
    }

    public boolean isRequest_cached() {
        return request_cached;
    }

    public int getRequest_cache_expiry() {
        return request_cache_expiry;
    }

    public int getMal_id() {
        return mal_id;
    }

    public String getUrl() {
        return url;
    }

    public String getImage_url() {
        return image_url;
    }

    public String getTrailer_url() {
        return trailer_url;
    }

    public String getTitle() {
        return title;
    }

    public String getTitle_english() {
        return title_english;
    }

    public String getTitle_japanese() {
        return title_japanese;
    }

    public List<String> getTitle_synonyms() {
        return title_synonyms;
    }

    public String getType() {
        return type;
    }

    public String getSource() {
        return source;
    }

    public int getEpisodes() {
        return episodes;
    }

    public String getStatus() {
        return status;
    }

    public boolean isAiring() {
        return airing;
    }

    public Aired getAired() {
        return aired;
    }

    public String getDuration() {
        return duration;
    }

    public String getRating() {
        return rating;
    }

    public double getScore() {
        return score;
    }

    public int getScored_by() {
        return scored_by;
    }

    public int getRank() {
        return rank;
    }

    public int getPopularity() {
        return popularity;
    }

    public int getMembers() {
        return members;
    }

    public int getFavorites() {
        return favorites;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public Object getBackground() {
        return background;
    }

    public String getPremiered() {
        return premiered;
    }

    public String getBroadcast() {
        return broadcast;
    }

    public Related getRelated() {
        return related;
    }

    public List<Producer> getProducers() {
        return producers;
    }

    public List<Licensor> getLicensors() {
        return licensors;
    }

    public List<Studio> getStudios() {
        return studios;
    }

    public List<Genre> getGenres() {
        return genres;
    }

    public List<Object> getExplicit_genres() {
        return explicit_genres;
    }

    public List<Object> getDemographics() {
        return demographics;
    }

    public List<Theme> getThemes() {
        return themes;
    }

    public List<String> getOpening_themes() {
        return opening_themes;
    }

    public List<String> getEnding_themes() {
        return ending_themes;
    }

    public List<ExternalLink> getExternal_links() {
        return external_links;
    }
}
