//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.example.bellman_task.Remote;

import com.example.bellman_task.Interface.BellmanServices;


import retrofit2.Retrofit;
import retrofit2.Retrofit.Builder;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClient {
    private static Retrofit retrofit;

    public RetrofitClient() {
    }

    public static Retrofit getInstance() {
        String baseurl = "http://bellman-bd.restart-technology.com/api/";
        if (retrofit == null) {
            retrofit = (new Builder()).baseUrl(baseurl).addConverterFactory(GsonConverterFactory.create()).build();
        }

        return retrofit;
    }

    public static BellmanServices getClient() {
        return (BellmanServices)getInstance().create(BellmanServices.class);
    }
}
