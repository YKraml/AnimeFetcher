
package jikan.top.TopAnime;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "mal_id",
    "url",
    "images",
    "trailer",
    "title",
    "title_english",
    "title_japanese",
    "title_synonyms",
    "type",
    "source",
    "episodes",
    "status",
    "airing",
    "aired",
    "duration",
    "rating",
    "score",
    "scored_by",
    "rank",
    "popularity",
    "members",
    "favorites",
    "synopsis",
    "background",
    "season",
    "year",
    "broadcast",
    "producers",
    "licensors",
    "studios",
    "genres",
    "explicit_genres",
    "themes",
    "demographics"
})
@Generated("jsonschema2pojo")
public class Datum {

    @JsonProperty("mal_id")
    private Integer malId;
    @JsonProperty("url")
    private String url;
    @JsonProperty("images")
    private Images images;
    @JsonProperty("trailer")
    private Trailer trailer;
    @JsonProperty("title")
    private String title;
    @JsonProperty("title_english")
    private String titleEnglish;
    @JsonProperty("title_japanese")
    private String titleJapanese;
    @JsonProperty("title_synonyms")
    private List<String> titleSynonyms = null;
    @JsonProperty("type")
    private String type;
    @JsonProperty("source")
    private String source;
    @JsonProperty("episodes")
    private Integer episodes;
    @JsonProperty("status")
    private String status;
    @JsonProperty("airing")
    private Boolean airing;
    @JsonProperty("aired")
    private Aired aired;
    @JsonProperty("duration")
    private String duration;
    @JsonProperty("rating")
    private String rating;
    @JsonProperty("score")
    private Integer score;
    @JsonProperty("scored_by")
    private Integer scoredBy;
    @JsonProperty("rank")
    private Integer rank;
    @JsonProperty("popularity")
    private Integer popularity;
    @JsonProperty("members")
    private Integer members;
    @JsonProperty("favorites")
    private Integer favorites;
    @JsonProperty("synopsis")
    private String synopsis;
    @JsonProperty("background")
    private String background;
    @JsonProperty("season")
    private String season;
    @JsonProperty("year")
    private Integer year;
    @JsonProperty("broadcast")
    private Broadcast broadcast;
    @JsonProperty("producers")
    private List<Producer> producers = null;
    @JsonProperty("licensors")
    private List<Licensor> licensors = null;
    @JsonProperty("studios")
    private List<Studio> studios = null;
    @JsonProperty("genres")
    private List<Genre> genres = null;
    @JsonProperty("explicit_genres")
    private List<ExplicitGenre> explicitGenres = null;
    @JsonProperty("themes")
    private List<Theme> themes = null;
    @JsonProperty("demographics")
    private List<Demographic> demographics = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("mal_id")
    public Integer getMalId() {
        return malId;
    }

    @JsonProperty("mal_id")
    public void setMalId(Integer malId) {
        this.malId = malId;
    }

    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }

    @JsonProperty("images")
    public Images getImages() {
        return images;
    }

    @JsonProperty("images")
    public void setImages(Images images) {
        this.images = images;
    }

    @JsonProperty("trailer")
    public Trailer getTrailer() {
        return trailer;
    }

    @JsonProperty("trailer")
    public void setTrailer(Trailer trailer) {
        this.trailer = trailer;
    }

    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    @JsonProperty("title_english")
    public String getTitleEnglish() {
        return titleEnglish;
    }

    @JsonProperty("title_english")
    public void setTitleEnglish(String titleEnglish) {
        this.titleEnglish = titleEnglish;
    }

    @JsonProperty("title_japanese")
    public String getTitleJapanese() {
        return titleJapanese;
    }

    @JsonProperty("title_japanese")
    public void setTitleJapanese(String titleJapanese) {
        this.titleJapanese = titleJapanese;
    }

    @JsonProperty("title_synonyms")
    public List<String> getTitleSynonyms() {
        return titleSynonyms;
    }

    @JsonProperty("title_synonyms")
    public void setTitleSynonyms(List<String> titleSynonyms) {
        this.titleSynonyms = titleSynonyms;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("source")
    public String getSource() {
        return source;
    }

    @JsonProperty("source")
    public void setSource(String source) {
        this.source = source;
    }

    @JsonProperty("episodes")
    public Integer getEpisodes() {
        return episodes;
    }

    @JsonProperty("episodes")
    public void setEpisodes(Integer episodes) {
        this.episodes = episodes;
    }

    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

    @JsonProperty("airing")
    public Boolean getAiring() {
        return airing;
    }

    @JsonProperty("airing")
    public void setAiring(Boolean airing) {
        this.airing = airing;
    }

    @JsonProperty("aired")
    public Aired getAired() {
        return aired;
    }

    @JsonProperty("aired")
    public void setAired(Aired aired) {
        this.aired = aired;
    }

    @JsonProperty("duration")
    public String getDuration() {
        return duration;
    }

    @JsonProperty("duration")
    public void setDuration(String duration) {
        this.duration = duration;
    }

    @JsonProperty("rating")
    public String getRating() {
        return rating;
    }

    @JsonProperty("rating")
    public void setRating(String rating) {
        this.rating = rating;
    }

    @JsonProperty("score")
    public Integer getScore() {
        return score;
    }

    @JsonProperty("score")
    public void setScore(Integer score) {
        this.score = score;
    }

    @JsonProperty("scored_by")
    public Integer getScoredBy() {
        return scoredBy;
    }

    @JsonProperty("scored_by")
    public void setScoredBy(Integer scoredBy) {
        this.scoredBy = scoredBy;
    }

    @JsonProperty("rank")
    public Integer getRank() {
        return rank;
    }

    @JsonProperty("rank")
    public void setRank(Integer rank) {
        this.rank = rank;
    }

    @JsonProperty("popularity")
    public Integer getPopularity() {
        return popularity;
    }

    @JsonProperty("popularity")
    public void setPopularity(Integer popularity) {
        this.popularity = popularity;
    }

    @JsonProperty("members")
    public Integer getMembers() {
        return members;
    }

    @JsonProperty("members")
    public void setMembers(Integer members) {
        this.members = members;
    }

    @JsonProperty("favorites")
    public Integer getFavorites() {
        return favorites;
    }

    @JsonProperty("favorites")
    public void setFavorites(Integer favorites) {
        this.favorites = favorites;
    }

    @JsonProperty("synopsis")
    public String getSynopsis() {
        return synopsis;
    }

    @JsonProperty("synopsis")
    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    @JsonProperty("background")
    public String getBackground() {
        return background;
    }

    @JsonProperty("background")
    public void setBackground(String background) {
        this.background = background;
    }

    @JsonProperty("season")
    public String getSeason() {
        return season;
    }

    @JsonProperty("season")
    public void setSeason(String season) {
        this.season = season;
    }

    @JsonProperty("year")
    public Integer getYear() {
        return year;
    }

    @JsonProperty("year")
    public void setYear(Integer year) {
        this.year = year;
    }

    @JsonProperty("broadcast")
    public Broadcast getBroadcast() {
        return broadcast;
    }

    @JsonProperty("broadcast")
    public void setBroadcast(Broadcast broadcast) {
        this.broadcast = broadcast;
    }

    @JsonProperty("producers")
    public List<Producer> getProducers() {
        return producers;
    }

    @JsonProperty("producers")
    public void setProducers(List<Producer> producers) {
        this.producers = producers;
    }

    @JsonProperty("licensors")
    public List<Licensor> getLicensors() {
        return licensors;
    }

    @JsonProperty("licensors")
    public void setLicensors(List<Licensor> licensors) {
        this.licensors = licensors;
    }

    @JsonProperty("studios")
    public List<Studio> getStudios() {
        return studios;
    }

    @JsonProperty("studios")
    public void setStudios(List<Studio> studios) {
        this.studios = studios;
    }

    @JsonProperty("genres")
    public List<Genre> getGenres() {
        return genres;
    }

    @JsonProperty("genres")
    public void setGenres(List<Genre> genres) {
        this.genres = genres;
    }

    @JsonProperty("explicit_genres")
    public List<ExplicitGenre> getExplicitGenres() {
        return explicitGenres;
    }

    @JsonProperty("explicit_genres")
    public void setExplicitGenres(List<ExplicitGenre> explicitGenres) {
        this.explicitGenres = explicitGenres;
    }

    @JsonProperty("themes")
    public List<Theme> getThemes() {
        return themes;
    }

    @JsonProperty("themes")
    public void setThemes(List<Theme> themes) {
        this.themes = themes;
    }

    @JsonProperty("demographics")
    public List<Demographic> getDemographics() {
        return demographics;
    }

    @JsonProperty("demographics")
    public void setDemographics(List<Demographic> demographics) {
        this.demographics = demographics;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
