package com.teyang.huzhe.newsapp.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.teyang.huzhe.hzframework.R;
import com.teyang.huzhe.hzframework.app.app.AppApplication;
import com.teyang.huzhe.hzframework.app.model.NewsContent;

import butterknife.ButterKnife;
import butterknife.InjectView;
import retrofit.Call;
import retrofit.Callback;
import retrofit.Response;
import retrofit.Retrofit;

public class ContentActivity extends AppCompatActivity {

    @InjectView(R.id.article_img_iv)
    ImageView articleImgIv;
    @InjectView(R.id.article_title_tv)
    TextView articleTitleTv;
    @InjectView(R.id.article_content_tv)
    TextView articleContentTv;

    private String sid;
    private NewsContent content;
    private Call articleContentCall;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content);
        ButterKnife.inject(this);
        sid = getIntent().getStringExtra("sid");
        articleContentCall = AppApplication.getRetrofitClient().getApiService().getArticleContent(sid);
        getData();
    }

    private void getData() {
        articleContentCall.enqueue(new Callback<NewsContent>() {
            @Override
            public void onResponse(Response<NewsContent> response, Retrofit retrofit) {
                content = response.body();
                articleTitleTv.setText(content.getTitle());
                articleContentTv.setText(content.getContent());
                Glide.with(AppApplication.getContext()).load(content.getSrcUrl()).into(articleImgIv);
            }

            @Override
            public void onFailure(Throwable t) {
                String s = t.getMessage();
            }
        });
    }
}
