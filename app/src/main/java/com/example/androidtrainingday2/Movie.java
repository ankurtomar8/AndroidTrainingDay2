package com.example.androidtrainingday2;

import android.os.Parcel;
import android.os.Parcelable;

public class Movie implements Parcelable {
    private String Title;
    private String Genre;

    protected Movie(Parcel in) {
        Title = in.readString();
        Genre = in.readString();
    }

    public static final Creator<Movie> CREATOR = new Creator<Movie>() {
        @Override
        public Movie createFromParcel(Parcel in) {
            return new Movie(in);
        }

        @Override
        public Movie[] newArray(int size) {
            return new Movie[size];
        }
    };

    public String getTitle() {
        return Title;
    }

    public String getGenre() {
        return Genre;
    }

    public Movie(String name, String genre)
    {
        Title = name;
        Genre = genre;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(Title);
        parcel.writeString(Genre);
    }
}
