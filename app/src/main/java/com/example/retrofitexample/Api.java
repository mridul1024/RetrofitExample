package com.example.retrofitexample;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Api {
    String BASE_URL = "http://simplifiedcoding.net/demos/";

    @GET("marvel")
    Call<List<Hero>> getHeros();
}
