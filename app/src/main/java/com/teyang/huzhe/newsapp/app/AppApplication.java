package com.teyang.huzhe.newsapp.app;

import android.app.Application;
import android.content.Context;
import com.teyang.huzhe.newsapp.retrofit.RetrofitClient;

/**
 * Created by g on 2015/11/6.
 */
public class AppApplication extends Application {
    private static RetrofitClient retrofitClient;
    private static Context context;

    public static RetrofitClient getRetrofitClient(){
        return retrofitClient;
    }

    public static Context getContext(){return context;}

    @Override
    public void onCreate() {
        super.onCreate();
        retrofitClient = new RetrofitClient();
        context = getApplicationContext();
    }
}
