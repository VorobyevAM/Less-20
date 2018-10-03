package wether;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GlobWether {

    @JsonProperty("consolidated_weather")
    private Wether[] consolidated_weather;

    @JsonProperty("parent")
    private Parent parent;

    @JsonProperty("sources")
    private Source[] sources;




    @JsonProperty("time")
    private String time;

    @JsonProperty("sun_rise")
    private String sunRise;

    @JsonProperty("sun_set")
    private String sunSet;

    @JsonProperty("timezone_name")
    private String timezoneName;



    @JsonProperty("title")
    private String title;

    @JsonProperty("location_type")
    private String locationType;

    @JsonProperty("woeid")
    private String woeid;

    @JsonProperty("latt_long")
    private String lattLong;

    @JsonProperty("timezone")
    private String timezone;

    @Override
    public String toString() {
        return parent + "\nГород: " + title +
                "\nВремя: " + time +
                "\n\nПогода:" + "\n==================" + consolidated_weather[0] +
                "\nВосход: " + sunRise+
                "\nЗакат: " + sunSet + "\n==================" +sources[0];
    }
}
