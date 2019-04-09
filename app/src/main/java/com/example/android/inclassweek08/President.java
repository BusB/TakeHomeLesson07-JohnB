package com.example.android.inclassweek08;

public class President {

    private String name;

    public String getName() {
        return name;
    }

    public String getInfo() {
        return info;
    }

    public int getPhotoResId() {
        return photoResId;
    }

    private String info;
    private int photoResId;

    public President(String name, String info, int photoResId) {
        this.name = name;
        this.info = info;
        this.photoResId = photoResId;
    }
}
