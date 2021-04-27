
package anime.APIObjects.anime;

public class To {

    private Integer day;
    private Integer month;
    private Integer year;

    /**
     * No args constructor for use in serialization
     * 
     */
    public To() {
    }

    /**
     * 
     * @param month
     * @param year
     * @param day
     */
    public To(Integer day, Integer month, Integer year) {
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
