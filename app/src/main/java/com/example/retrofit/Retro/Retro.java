package com.example.retrofit.Retro;

import com.google.gson.annotations.SerializedName;

public class Retro {
    //step1: define all the data members contained in the server and set up there getters and setters
    /*In my case the json structure must be similat to this :
        [
            {
                "userId": 1,
                "id": 2,
                "title": "singh",
                "body": "hey there"
             },
             {
             .
             .
             }
    */
    @SerializedName("userId")//the name in quotes must be same as the key stored at the server
    private String UserId;
    @SerializedName("id")
    private String Id;
    @SerializedName("title")
    private String Title;
    @SerializedName("body")
    private String Body;

    public Retro(String userId, String id, String title, String body) {
        UserId = userId;
        Id = id;
        Title = title;
        Body = body;
    }
    //Setting up getters and setters
    public String getUserId() {
        return UserId;
    }

    public void setUserId(String userId) {
        UserId = userId;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getBody() {
        return Body;
    }

    public void setBody(String body) {
        Body = body;
    }
}
