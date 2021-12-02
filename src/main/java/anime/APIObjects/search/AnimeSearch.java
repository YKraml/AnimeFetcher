
package anime.APIObjects.search;

import java.util.List;
public class AnimeSearch {

    private String request_hash;
    private Boolean request_cached;
    private Integer request_cache_expiry;
    private List<Result> results = null;
    private Integer last_page;

    /**
     * No args constructor for use in serialization
     * 
     */
    public AnimeSearch() {
    }

    /**
     * 
     * @param request_hash
     * @param last_page
     * @param request_cached
     * @param request_cache_expiry
     * @param results
     */
    public AnimeSearch(String request_hash, Boolean request_cached, Integer request_cache_expiry, List<Result> results, Integer last_page) {
        super();
        this.request_hash = request_hash;
        this.request_cached = request_cached;
        this.request_cache_expiry = request_cache_expiry;
        this.results = results;
        this.last_page = last_page;
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

    public List<Result> getResults() {
        return results;
    }

    public void setResults(List<Result> results) {
        this.results = results;
    }

    public Integer getLast_page() {
        return last_page;
    }

    public void setLast_page(Integer last_page) {
        this.last_page = last_page;
    }

}
