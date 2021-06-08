package com.saurabh.example.designpatterns.creational.prototype;

import java.util.Date;

public class Show implements PrototypeCapable{

    private String showName;
    private Date showReleaseYear;
    private Double showRatings;
    @Override
    public PrototypeCapable clone() throws CloneNotSupportedException {
        System.out.println("cloning Show Object...");
        return (Show)super.clone();
    }

    public String getShowName() {
        return showName;
    }

    public void setShowName(String showName) {
        this.showName = showName;
    }

    public Date getShowReleaseYear() {
        return showReleaseYear;
    }

    public void setShowReleaseYear(Date showReleaseYear) {
        this.showReleaseYear = showReleaseYear;
    }

    public Double getShowRatings() {
        return showRatings;
    }

    public void setShowRatings(Double showRatings) {
        this.showRatings = showRatings;
    }
}
