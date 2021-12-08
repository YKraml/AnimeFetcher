package anime.stats; 
public class Stats {
    private String request_hash;
    private boolean request_cached;
    private int request_cache_expiry;
    private int watching;
    private int completed;
    private int on_hold;
    private int dropped;
    private int plan_to_watch;
    private int total;
    private Scores scores;

    public String getRequest_hash() {
        return request_hash;
    }

    public boolean isRequest_cached() {
        return request_cached;
    }

    public int getRequest_cache_expiry() {
        return request_cache_expiry;
    }

    public int getWatching() {
        return watching;
    }

    public int getCompleted() {
        return completed;
    }

    public int getOn_hold() {
        return on_hold;
    }

    public int getDropped() {
        return dropped;
    }

    public int getPlan_to_watch() {
        return plan_to_watch;
    }

    public int getTotal() {
        return total;
    }

    public Scores getScores() {
        return scores;
    }
}
