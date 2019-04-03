package com.buffalo.Twitter;

import java.io.*;

import com.google.gson.Gson;
import twitter4j.*;
import twitter4j.conf.ConfigurationBuilder;

public class TwitterData {
    public void Tweets (String[] terms, String lang, double lg, double lt) {
        double longitude = lg;
        double latitude = lt;
        ConfigurationBuilder cb = new ConfigurationBuilder();
        cb.setDebugEnabled(true).setOAuthConsumerKey("x24SGtuHssK6qa1frV3WcHu0o")
                .setOAuthConsumerSecret("uARzA0vsZZ6kZCzWDLIvOV2zNm88MLCeu9kqDTB3gDTjC94tt8")
                .setOAuthAccessToken("4228949054-66c2B50214SyGmH2WIlmiNmpG9uUfDICMNSUfgu")
                .setOAuthAccessTokenSecret("pNlVBVBioVOVegRFO87tTCN6mamXCAgcYfYjvnRGu6GJ1")
                .setJSONStoreEnabled(true);
        TwitterFactory tf = new TwitterFactory(cb.build());
        Twitter twitter = tf.getInstance();
        QueryResult result = null;
        for(String s: terms) {
            Query query = new Query(s);
            query.geoCode(new GeoLocation(lg, lt), 200, Query.KILOMETERS);
            query.lang(lang);
            query.setCount(10000);
            try {
                result = twitter.search(query);
            } catch (TwitterException e1) {
                // TODO Auto-generated catch block
                e1.printStackTrace();
            }
        }
        // CSVWriter writer = new CSVWriter(new FileWriter("text.csv"), '\t');


        PrintWriter pw;
        //String fileName = "data.json";
        try {
            pw = new PrintWriter(new File("new_test.json"));
            StringBuilder sb = new StringBuilder();
            sb.append("[");
           // JSONObject jsonObj = new JSONObject(sb.toString());
            for (Status status : result.getTweets()) {

                Gson gson = new Gson();
                String json = gson.toJson( status );

                //  System.out.println("@" + status.getUser().getScreenName() + ":" + status.getText());
                //String tweetJson = TwitterObjectFactory.getRawJSON(status);
                //JSONObject jsonObject = new JSONObject(tweetJson);
                sb.append(json);
                sb.append(',');
                //storeJSON(tweetJson,fileName) ;
                //pw.write(jsonObject.toJSONString());
            }
            sb.append("{}]");
            pw.write(sb.toString());
            pw.close();
        }
        catch (IOException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }
    }
    private void storeJSON(String rawJSON, String fileName) throws IOException {
        FileOutputStream fos = null;
        OutputStreamWriter osw = null;
        BufferedWriter bw = null;
        try {
            fos = new FileOutputStream(fileName);
            osw = new OutputStreamWriter(fos, "UTF-8");
            bw = new BufferedWriter(osw);
            bw.write(rawJSON);
            bw.flush();
        } finally {
            if (bw != null) {
                try {
                    bw.close();
                } catch (IOException ignore) {
                }
            }
            if (osw != null) {
                try {
                    osw.close();
                } catch (IOException ignore) {
                }
            }
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException ignore) {
                }
            }
        }
    }
}
