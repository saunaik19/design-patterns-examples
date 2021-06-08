package com.saurabh.example.designpatterns.creational.prototype;

import java.util.Date;

public class Movie implements PrototypeCapable{

    private String movieName;
    private Date releaseYear;
    private Double ratings;


    @Override
    public PrototypeCapable clone() throws CloneNotSupportedException {
        System.out.println("cloning Movie Object...");
        return (Movie)super.clone();
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public void setReleaseYear(Date releaseYear) {
        this.releaseYear = releaseYear;
    }

    public void setRatings(Double ratings) {
        this.ratings = ratings;
    }

    public String getMovieName() {
        return movieName;
    }

    public Date getReleaseYear() {
        return releaseYear;
    }

    public Double getRatings() {
        return ratings;
    }


}
