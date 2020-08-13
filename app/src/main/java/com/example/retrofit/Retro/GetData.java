package com.example.retrofit.Retro;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface GetData {
//Step 2: define the endpoints within an interface
    //here GET request is made on the url+/posts and if that happens getPosts() method will be called.
    @GET("/posts")
    Call<List<Retro>> getPosts();
}
