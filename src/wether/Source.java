package wether;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Source {

    @JsonProperty("title")
    private String title;

    @JsonProperty("slug")
    private String slug;

    @JsonProperty("url")
    private String url;

    @JsonProperty("crawl_rate")
    private String crawlRate;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getCrawlRate() {
        return crawlRate;
    }

    public void setCrawlRate(String crawlRate) {
        this.crawlRate = crawlRate;
    }

    @Override
    public String toString() {
        return "\nИсточник данных: " + title +
                " " + url;
    }
}
