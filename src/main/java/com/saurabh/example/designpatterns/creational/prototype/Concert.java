package com.saurabh.example.designpatterns.creational.prototype;

import java.util.Date;

public class Concert implements PrototypeCapable{

    private String concertName;
    private Date concertYear;
    private Album albumSungInConcert;
    @Override
    public PrototypeCapable clone() throws CloneNotSupportedException {
        System.out.println("cloning Movie Object...");
        Concert c=(Concert)super.clone();
        Album album= (Album) PrototypeFactory.getInsanceOfEntertainment("album");
        c.setAlbumSungInConcert(album);
        return c;
    }

    public String getConcertName() {
        return concertName;
    }

    public void setConcertName(String concertName) {
        this.concertName = concertName;
    }

    public Date getConcertYear() {
        return concertYear;
    }

    public void setConcertYear(Date concertYear) {
        this.concertYear = concertYear;
    }

    public Album getAlbumSungInConcert() {
        return albumSungInConcert;
    }

    public void setAlbumSungInConcert(Album albumSungInConcert) {
        this.albumSungInConcert = albumSungInConcert;
    }
}
