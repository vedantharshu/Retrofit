package com.example.retrofit.Retro;

import com.google.gson.annotations.SerializedName;

public class Retro {
    @SerializedName("userId")
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
