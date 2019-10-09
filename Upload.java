package com.example.firebasestorage;

public class Upload {
    private String mName;
    private String mImageUrl;

    public Upload(){
        //to work with the firebase database
        //needed dont delete
    }

    public Upload(String name, String imageurl) {
        if (name.trim().equals("")){
            name = "no name";
        }
        mName = name;
        mImageUrl = imageurl;
    }

    public String getName(){
        return mName;
    }

    public void setName(String name){
        mName= name;
    }

    public String getImageUrl(){
        return mImageUrl;
    }

    public void setImageUrl(String imageUrl){
        mImageUrl = imageUrl;
    }
}
