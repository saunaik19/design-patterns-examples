package com.saurabh.example.designpatterns.creational.prototype;

import java.util.Date;

public class Album implements PrototypeCapable{

    private String albumName;
    private Date albumReleaseYear;
    private Double albumRatings;
    @Override
    public PrototypeCapable clone() throws CloneNotSupportedException {
        System.out.println("cloning Movie Object...");
        return (Album)super.clone();
    }

    public String getAlbumName() {
        return albumName;
    }

    public void setAlbumName(String albumName) {
        this.albumName = albumName;
    }

    public Date getAlbumReleaseYear() {
        return albumReleaseYear;
    }

    public void setAlbumReleaseYear(Date albumReleaseYear) {
        this.albumReleaseYear = albumReleaseYear;
    }

    public Double getAlbumRatings() {
        return albumRatings;
    }

    public void setAlbumRatings(Double albumRatings) {
        this.albumRatings = albumRatings;
    }
}
