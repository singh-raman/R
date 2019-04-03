package com.buffalo.Twitter;


public class Main {

    public static void main(String[] args) {
        String[] keyword = new String[]{"theft","theft","crime","burglary","robbery","kidnapping"};
        String language = "en";
        double latitude = 40.712776;
        double longitude = -74.005974;
        TwitterData collectedData = new TwitterData();
        collectedData.Tweets(keyword,language,latitude,longitude);
    }
}
