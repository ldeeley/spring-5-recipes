package com.lgd.springrecipes;


//This is my POJO
public class Album {

    private String title;
    private String band;

    public Album() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBand() {
        return band;
    }

    public void setBand(String band) {
        this.band = band;
    }

    @Override
    public String toString() {
        return "Album{" +
                "title='" + title + '\'' +
                ", band='" + band + '\'' +
                '}';
    }
}
