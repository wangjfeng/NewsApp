package com.teyang.huzhe.newsapp.retrofit;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.teyang.huzhe.hzframework.app.common.Constant;
import com.teyang.huzhe.hzframework.app.retrofit.service.ApiService;

import retrofit.GsonConverterFactory;
import retrofit.Retrofit;

/**
 * Created by g on 2015/11/6.
 */
public class RetrofitClient {
    private static final String BASE_URL = "";
    private ApiService apiService;

    Gson gson = new GsonBuilder().create();

    public RetrofitClient()
    {
        Retrofit retrofitAdapter = new Retrofit.Builder()
                .baseUrl(Constant.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();

        apiService = retrofitAdapter.create(ApiService.class);
    }

    public ApiService getApiService()
    {
        return apiService;
    }

}
