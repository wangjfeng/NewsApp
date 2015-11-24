package com.teyang.huzhe.newsapp.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Toast;

import com.teyang.huzhe.newsapp.R;
import com.teyang.huzhe.newsapp.app.AppApplication;
import com.teyang.huzhe.newsapp.model.Article;
import com.teyang.huzhe.newsapp.adapter.ArticleListAdapter;
import com.teyang.huzhe.newsapp.model.Articles;

import java.util.ArrayList;
import java.util.List;

import butterknife.ButterKnife;
import butterknife.InjectView;
import retrofit.Call;
import retrofit.Callback;
import retrofit.Response;
import retrofit.Retrofit;

public class BaseActivity extends AppCompatActivity {
    /**
     * 列数
     */
    private final static int SPAN_COUNT = 4;
    private Call articleListCall;
    private List<Article> articleList;
    private ArticleListAdapter articleListAdapter;

    @InjectView(R.id.toolbar)
    Toolbar toolbar;
    @InjectView(R.id.recyclerview)
    RecyclerView recyclerview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base);
        ButterKnife.inject(this);
        setSupportActionBar(toolbar);
        initValues();
        initRecyclerView(recyclerview);
        getData();
    }

    private void initValues() {
        articleList = new ArrayList<>();
        articleListAdapter = new ArticleListAdapter(articleList);

        articleListCall = AppApplication.getRetrofitClient().getApiService().
                getArticleList();
    }

    private void initRecyclerView(RecyclerView recyclerview) {
        recyclerview.setLayoutManager(new LinearLayoutManager(BaseActivity.this));
        recyclerview.setItemAnimator(new DefaultItemAnimator());
        recyclerview.setAdapter(articleListAdapter);
        articleListAdapter.setListener(new ArticleListAdapter.onItemClickListener() {
            @Override
            public void onItemClicked(View view, int position) {
                Intent intent = new Intent(BaseActivity.this,ContentActivity.class);
                intent.putExtra("sid",articleList.get(position).getSid());
                startActivity(intent);
            }
        });
    }

    private void getData() {

        articleListCall.enqueue(new Callback<Articles>() {
            @Override
            public void onResponse(Response<Articles> response, Retrofit retrofit) {
                articleList = response.body().getArticles();
                articleListAdapter.addListItem(articleList);
            }

            @Override
            public void onFailure(Throwable t) {
                String s = t.getMessage();
            }
        });
    }

    private void reLoad() {

        articleListCall.clone().enqueue(new Callback<Articles>() {
            @Override
            public void onResponse(Response<Articles> response, Retrofit retrofit) {
                articleList = response.body().getArticles();
                articleListAdapter.addListItem(articleList);
            }

            @Override
            public void onFailure(Throwable t) {
                reLoad();
            }
        });
    }
}
