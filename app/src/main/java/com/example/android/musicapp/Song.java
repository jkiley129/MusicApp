package com.example.android.musicapp;

public class Song {

    private String mName;
    private String mArtist;
    private String mPhotoString;

    public Song(String name, String artist, String photoString) {
        mName = name;
        mArtist = artist;
        mPhotoString = photoString;
    }

    public String getName() { return mName; }
    public String getArtist() { return mArtist; }
    public String getPhotoString() { return mPhotoString; }
}
