
package anime.APIObjects.anime;

public class From {

    private Integer day;
    private Integer month;
    private Integer year;

    /**
     * No args constructor for use in serialization
     * 
     */
    public From() {
    }

    /**
     * 
     * @param month
     * @param year
     * @param day
     */
    public From(Integer day, Integer month, Integer year) {
        super();
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public Integer getDay() {
        return day;
    }

    public void setDay(Integer day) {
        this.day = day;
    }

    public Integer getMonth() {
        return month;
    }

    public void setMonth(Integer month) {
        this.month = month;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

}
