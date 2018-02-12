package com.example.android.music;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by ahmed on 2/8/2018.
 */

public class Song implements Parcelable{
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

    protected Song(Parcel in) {
        name = in.readString();
        image = in.readInt();
        band = in.readString();
        length = in.readInt();
        releaseDate = in.readInt();
    }

    public static final Creator<Song> CREATOR = new Creator<Song>() {
        @Override
        public Song createFromParcel(Parcel in) {
            return new Song(in);
        }

        @Override
        public Song[] newArray(int size) {
            return new Song[size];
        }
    };

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

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name);
        parcel.writeInt(image);
        parcel.writeString(band);
        parcel.writeInt(length);
        parcel.writeInt(releaseDate);
    }
}
