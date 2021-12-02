
package anime.APIObjects.top.anime;

import java.util.List;
public class TopSearch {

    private String request_hash;
    private Boolean request_cached;
    private Integer request_cache_expiry;
    private List<Top> top = null;

    /**
     * No args constructor for use in serialization
     * 
     */
    public TopSearch() {
    }

    /**
     * 
     * @param top
     * @param request_hash
     * @param request_cached
     * @param request_cache_expiry
     */
    public TopSearch(String request_hash, Boolean request_cached, Integer request_cache_expiry, List<Top> top) {
        super();
        this.request_hash = request_hash;
        this.request_cached = request_cached;
        this.request_cache_expiry = request_cache_expiry;
        this.top = top;
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

    public List<Top> getTop() {
        return top;
    }

    public void setTop(List<Top> top) {
        this.top = top;
    }

}
