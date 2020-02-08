package com.example.bellman_task.Interface;

import com.example.bellman_task.Model.BellmanResponse;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface BellmanServices {


    @GET("home")
    Call<BellmanResponse> getinfo(@Query("apiKey") String apiKey);


}
