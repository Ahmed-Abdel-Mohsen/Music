package com.example.android.music;

/**
 * Created by ahmed on 2/8/2018.
 */

public class Song {
    private String name;
    private int image;
    private String band;
    private int length;
    private int releaseDate;

    public Song(String name, int image, String band, int length, int releaseDate) {
        this.name = name;
        this.image = image;
        this.band = band;
        this.length = length;
        this.releaseDate = releaseDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getBand() {
        return band;
    }

    public void setBand(String band) {
        band = band;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(int releaseDate) {
        this.releaseDate = releaseDate;
    }
}
