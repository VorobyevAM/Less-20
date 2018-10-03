package wether;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Parent {

    @JsonProperty("title")
    private String title;

    @JsonProperty("location_type")
    private String locationType;

    @JsonProperty("woeid")
    private String woeid;

    @JsonProperty("latt_long")
    private String lattLong;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLocationType() {
        return locationType;
    }

    public void setLocationType(String locationType) {
        this.locationType = locationType;
    }

    public String getWoeid() {
        return woeid;
    }

    public void setWoeid(String woeid) {
        this.woeid = woeid;
    }

    public String getLattLong() {
        return lattLong;
    }

    public void setLattLong(String lattLong) {
        this.lattLong = lattLong;
    }

    @Override
    public String toString() {
        return "Страна: " + title;
    }
}
