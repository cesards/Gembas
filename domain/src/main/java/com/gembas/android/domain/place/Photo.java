package com.gembas.android.domain.place;

public class Photo {

    public final byte[] bytes;
    public final String date;

    public Photo(byte[] bytes, String date) {
        this.bytes = bytes;
        this.date = date;
    }
}
