package wether;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Wether {

    @JsonProperty("id")
    private String id;

    @JsonProperty("weather_state_name")
    private String weatherStateName;

    @JsonProperty("weather_state_abbr")
    private String weatherStateAbbr;

    @JsonProperty("wind_direction_compass")
    private String windDirectionCompass;

    @JsonProperty("created")
    private String created;

    @JsonProperty("applicable_date")
    private String applicableDate;

    @JsonProperty("min_temp")
    private String minTemp;

    @JsonProperty("max_temp")
    private String maxTemp;

    @JsonProperty("the_temp")
    private String theTemp;

    @JsonProperty("wind_speed")
    private String windSpeed;

    @JsonProperty("wind_direction")
    private String windDirection;

    @JsonProperty("air_pressure")
    private String airPressure;

    @JsonProperty("humidity")
    private String humidity;

    @JsonProperty("visibility")
    private String visibility;

    @JsonProperty("predictability")
    private String predictability;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getWeatherStateName() {
        return weatherStateName;
    }

    public void setWeatherStateName(String weatherStateName) {
        this.weatherStateName = weatherStateName;
    }

    public String getWeatherStateAbbr() {
        return weatherStateAbbr;
    }

    public void setWeatherStateAbbr(String weatherStateAbbr) {
        this.weatherStateAbbr = weatherStateAbbr;
    }

    public String getWindDirectionCompass() {
        return windDirectionCompass;
    }

    public void setWindDirectionCompass(String windDirectionCompass) {
        this.windDirectionCompass = windDirectionCompass;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public String getApplicableDate() {
        return applicableDate;
    }

    public void setApplicableDate(String applicableDate) {
        this.applicableDate = applicableDate;
    }

    public String getMinTemp() {
        return minTemp;
    }

    public void setMinTemp(String minTemp) {
        this.minTemp = minTemp;
    }

    public String getMaxTemp() {
        return maxTemp;
    }

    public void setMaxTemp(String maxTemp) {
        this.maxTemp = maxTemp;
    }

    public String getTheTemp() {
        return theTemp;
    }

    public void setTheTemp(String theTemp) {
        this.theTemp = theTemp;
    }

    public String getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(String windSpeed) {
        this.windSpeed = windSpeed;
    }

    public String getWindDirection() {
        return windDirection;
    }

    public void setWindDirection(String windDirection) {
        this.windDirection = windDirection;
    }

    public String getAirPressure() {
        return airPressure;
    }

    public void setAirPressure(String airPressure) {
        this.airPressure = airPressure;
    }

    public String getHumidity() {
        return humidity;
    }

    public void setHumidity(String humidity) {
        this.humidity = humidity;
    }

    public String getVisibility() {
        return visibility;
    }

    public void setVisibility(String visibility) {
        this.visibility = visibility;
    }

    public String getPredictability() {
        return predictability;
    }

    public void setPredictability(String predictability) {
        this.predictability = predictability;
    }

    @Override
    public String toString() {
        return "\nСоздано: " + created +
                "\nТекущая температура: " + theTemp +
                "\nДавление: " + airPressure +
                "\nСкорость ветра: " + windSpeed +
                "\nНаправление ветра: " + windDirectionCompass;
    }
}
