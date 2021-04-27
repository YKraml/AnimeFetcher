
package anime.APIObjects.anime;

import java.util.List;

public class Anime {

    private String request_hash;
    private Boolean request_cached;
    private Integer request_cache_expiry;
    private Integer mal_id;
    private String url;
    private String image_url;
    private String trailer_url;
    private String title;
    private String title_english;
    private String title_japanese;
    private List<String> title_synonyms = null;
    private String type;
    private String source;
    private Integer episodes;
    private String status;
    private Boolean airing;
    private Aired aired;
    private String duration;
    private String rating;
    private Double score;
    private Integer scored_by;
    private Integer rank;
    private Integer popularity;
    private Integer members;
    private Integer favorites;
    private String synopsis;
    private Object background;
    private String premiered;
    private String broadcast;
    private Related related;
    private List<Producer> producers = null;
    private List<Licensor> licensors = null;
    private List<Studio> studios = null;
    private List<Genre> genres = null;
    private List<String> opening_themes = null;
    private List<String> ending_themes = null;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Anime() {
    }

    /**
     * 
     * @param title_japanese
     * @param favorites
     * @param broadcast
     * @param rating
     * @param scored_by
     * @param premiered
     * @param request_cache_expiry
     * @param title_synonyms
     * @param source
     * @param title
     * @param type
     * @param duration
     * @param score
     * @param opening_themes
     * @param related
     * @param request_hash
     * @param genres
     * @param popularity
     * @param members
     * @param request_cached
     * @param title_english
     * @param rank
     * @param airing
     * @param episodes
     * @param aired
     * @param studios
     * @param ending_themes
     * @param image_url
     * @param mal_id
     * @param synopsis
     * @param licensors
     * @param url
     * @param trailer_url
     * @param producers
     * @param background
     * @param status
     */
    public Anime(String request_hash, Boolean request_cached, Integer request_cache_expiry, Integer mal_id, String url, String image_url, String trailer_url, String title, String title_english, String title_japanese, List<String> title_synonyms, String type, String source, Integer episodes, String status, Boolean airing, Aired aired, String duration, String rating, Double score, Integer scored_by, Integer rank, Integer popularity, Integer members, Integer favorites, String synopsis, Object background, String premiered, String broadcast, Related related, List<Producer> producers, List<Licensor> licensors, List<Studio> studios, List<Genre> genres, List<String> opening_themes, List<String> ending_themes) {
        super();
        this.request_hash = request_hash;
        this.request_cached = request_cached;
        this.request_cache_expiry = request_cache_expiry;
        this.mal_id = mal_id;
        this.url = url;
        this.image_url = image_url;
        this.trailer_url = trailer_url;
        this.title = title;
        this.title_english = title_english;
        this.title_japanese = title_japanese;
        this.title_synonyms = title_synonyms;
        this.type = type;
        this.source = source;
        this.episodes = episodes;
        this.status = status;
        this.airing = airing;
        this.aired = aired;
        this.duration = duration;
        this.rating = rating;
        this.score = score;
        this.scored_by = scored_by;
        this.rank = rank;
        this.popularity = popularity;
        this.members = members;
        this.favorites = favorites;
        this.synopsis = synopsis;
        this.background = background;
        this.premiered = premiered;
        this.broadcast = broadcast;
        this.related = related;
        this.producers = producers;
        this.licensors = licensors;
        this.studios = studios;
        this.genres = genres;
        this.opening_themes = opening_themes;
        this.ending_themes = ending_themes;
    }

    public String getRequest_hash() {
        return request_hash;
    }

    public void setRequest_hash(String request_hash) {
        this.request_hash = request_hash;
    }

    public Boolean getRequest_cached() {
        return request_cached;
    }

    public void setRequest_cached(Boolean request_cached) {
        this.request_cached = request_cached;
    }

    public Integer getRequest_cache_expiry() {
        return request_cache_expiry;
    }

    public void setRequest_cache_expiry(Integer request_cache_expiry) {
        this.request_cache_expiry = request_cache_expiry;
    }

    public Integer getMal_id() {
        return mal_id;
    }

    public void setMal_id(Integer mal_id) {
        this.mal_id = mal_id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getImage_url() {
        return image_url;
    }

    public void setImage_url(String image_url) {
        this.image_url = image_url;
    }

    public String getTrailer_url() {
        return trailer_url;
    }

    public void setTrailer_url(String trailer_url) {
        this.trailer_url = trailer_url;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle_english() {
        return title_english;
    }

    public void setTitle_english(String title_english) {
        this.title_english = title_english;
    }

    public String getTitle_japanese() {
        return title_japanese;
    }

    public void setTitle_japanese(String title_japanese) {
        this.title_japanese = title_japanese;
    }

    public List<String> getTitle_synonyms() {
        return title_synonyms;
    }

    public void setTitle_synonyms(List<String> title_synonyms) {
        this.title_synonyms = title_synonyms;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public Integer getEpisodes() {
        return episodes;
    }

    public void setEpisodes(Integer episodes) {
        this.episodes = episodes;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Boolean getAiring() {
        return airing;
    }

    public void setAiring(Boolean airing) {
        this.airing = airing;
    }

    public Aired getAired() {
        return aired;
    }

    public void setAired(Aired aired) {
        this.aired = aired;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public Integer getScored_by() {
        return scored_by;
    }

    public void setScored_by(Integer scored_by) {
        this.scored_by = scored_by;
    }

    public Integer getRank() {
        return rank;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }

    public Integer getPopularity() {
        return popularity;
    }

    public void setPopularity(Integer popularity) {
        this.popularity = popularity;
    }

    public Integer getMembers() {
        return members;
    }

    public void setMembers(Integer members) {
        this.members = members;
    }

    public Integer getFavorites() {
        return favorites;
    }

    public void setFavorites(Integer favorites) {
        this.favorites = favorites;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    public Object getBackground() {
        return background;
    }

    public void setBackground(Object background) {
        this.background = background;
    }

    public String getPremiered() {
        return premiered;
    }

    public void setPremiered(String premiered) {
        this.premiered = premiered;
    }

    public String getBroadcast() {
        return broadcast;
    }

    public void setBroadcast(String broadcast) {
        this.broadcast = broadcast;
    }

    public Related getRelated() {
        return related;
    }

    public void setRelated(Related related) {
        this.related = related;
    }

    public List<Producer> getProducers() {
        return producers;
    }

    public void setProducers(List<Producer> producers) {
        this.producers = producers;
    }

    public List<Licensor> getLicensors() {
        return licensors;
    }

    public void setLicensors(List<Licensor> licensors) {
        this.licensors = licensors;
    }

    public List<Studio> getStudios() {
        return studios;
    }

    public void setStudios(List<Studio> studios) {
        this.studios = studios;
    }

    public List<Genre> getGenres() {
        return genres;
    }

    public void setGenres(List<Genre> genres) {
        this.genres = genres;
    }

    public List<String> getOpening_themes() {
        return opening_themes;
    }

    public void setOpening_themes(List<String> opening_themes) {
        this.opening_themes = opening_themes;
    }

    public List<String> getEnding_themes() {
        return ending_themes;
    }

    public void setEnding_themes(List<String> ending_themes) {
        this.ending_themes = ending_themes;
    }

}
