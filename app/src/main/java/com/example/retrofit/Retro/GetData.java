package com.example.retrofit.Retro;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface GetData {

    @GET("/posts")
    Call<List<Retro>> getPosts();
}
