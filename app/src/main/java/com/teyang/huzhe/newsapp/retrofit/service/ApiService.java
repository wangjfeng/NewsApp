package com.teyang.huzhe.newsapp.retrofit.service;

import com.teyang.huzhe.hzframework.app.model.Articles;
import com.teyang.huzhe.hzframework.app.model.NewsContent;


import retrofit.Call;
import retrofit.http.GET;
import retrofit.http.Query;

/**
 * Created by g on 2015/11/6.
 */
public interface ApiService {
    @GET("/article/listJson/category/basketball")
    Call<Articles> getArticleList();

    @GET("/article/showListJson")
    Call<NewsContent> getArticleContent(@Query("sid") String sid);
}
