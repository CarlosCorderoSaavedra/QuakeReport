package com.example.android.quakereport;

/**
 * Created by carlos.cordero on 9/6/17.
 */

public class Earthquake {

    private String mMagnitude;
    private String mDate;
    private String mLocate;

    public Earthquake(String magnitude,  String locate , String date) {

        mMagnitude = magnitude;
        mLocate = locate;
        mDate = date;
    }

    public String getMagnitude() {return mMagnitude;}

    public String getLocate() {return mLocate;}

    public String getDate() {return mDate;}

}
