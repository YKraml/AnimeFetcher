
package anime.episodes;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "episode_id",
    "title",
    "title_japanese",
    "title_romanji",
    "aired",
    "filler",
    "recap",
    "video_url",
    "forum_url"
})

public class Episode {

    @JsonProperty("episode_id")
    private Integer episode_id;
    @JsonProperty("title")
    private String title;
    @JsonProperty("title_japanese")
    private String title_japanese;
    @JsonProperty("title_romanji")
    private String title_romanji;
    @JsonProperty("aired")
    private String aired;
    @JsonProperty("filler")
    private Boolean filler;
    @JsonProperty("recap")
    private Boolean recap;
    @JsonProperty("video_url")
    private String video_url;
    @JsonProperty("forum_url")
    private String forum_url;

    @JsonProperty("episode_id")
    public Integer getEpisode_id() {
        return episode_id;
    }


    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    @JsonProperty("title_japanese")
    public String getTitle_japanese() {
        return title_japanese;
    }



    @JsonProperty("title_romanji")
    public String getTitle_romanji() {
        return title_romanji;
    }



    @JsonProperty("aired")
    public String getAired() {
        return aired;
    }


    @JsonProperty("filler")
    public Boolean getFiller() {
        return filler;
    }


    @JsonProperty("recap")
    public Boolean getRecap() {
        return recap;
    }


    @JsonProperty("video_url")
    public String getVideo_url() {
        return video_url;
    }

    @JsonProperty("forum_url")
    public String getForum_url() {
        return forum_url;
    }


}
