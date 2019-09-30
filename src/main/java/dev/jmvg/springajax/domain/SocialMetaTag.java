package dev.jmvg.springajax.domain;

import java.io.Serializable;

public class SocialMetaTag implements Serializable {
    private String title;
    private String site;
    private String url;
    private String image;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "SocialMetaTag{" +
                "title='" + title + '\'' +
                ", site='" + site + '\'' +
                ", url='" + url + '\'' +
                ", image='" + image + '\'' +
                '}';
    }
}
