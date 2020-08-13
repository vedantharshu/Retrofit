package com.example.retrofit.Retro;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitInstance {
    //creating instance of Retrofit API
    private static Retrofit retrofit;
    //Base Url is the url of the server, if you have a local server use localhost:portNumber
    private static final String BASE_URL = "https://jsonplaceholder.typicode.com";

    public static Retrofit getRetrofitInstance(){
        if(retrofit==null){
            //Builder to implement Retrofit
            retrofit = new retrofit2.Retrofit.Builder()
                            .baseUrl(BASE_URL)
                            .addConverterFactory(GsonConverterFactory.create())
                            .build();
        }
        return retrofit;
    }

}
