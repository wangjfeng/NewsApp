package com.teyang.huzhe.newsapp.ui.base;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;

import com.teyang.huzhe.newsapp.R;


public class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    public void onPause() {
        super.onPause();
    }

    private View lodeView;

    private View reloadView;


    public View getLodeView() {
        lodeView = LayoutInflater.from(this).inflate(
                R.layout.activity_base_loading, null);
        reloadView = lodeView.findViewById(R.id.inner_reload);
        ImageView imageview = (ImageView) reloadView
                .findViewById(R.id.failure_iv);
        imageview.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                reloadView.setVisibility(View.GONE);
                setReload();
            }
        });
        return lodeView;
    }

    /**
     * 不显示
     */
    protected void dismissLoadView() {
        if(lodeView == null || lodeView.getVisibility() == View.GONE){return;}
        stopAnim();
    }

    /**
     * 请求 失败
     */
    protected void requsetFail() {
        if (reloadView != null && lodeView.getVisibility() == View.VISIBLE) {
            stopAnim();
            reloadView.setVisibility(View.VISIBLE);
        }
    }

    /**
     * 重新加载
     */
    protected void setReload() {}

    protected void startAnim(){
        lodeView.setVisibility(View.VISIBLE);
    }

    protected void stopAnim(){
        lodeView.setVisibility(View.GONE);
    }
}
