package com.teyang.huzhe.newsapp.ui.action;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.teyang.huzhe.newsapp.ui.base.BaseActivity;

public class BaseLodeActivity extends BaseActivity {
    @Override
    public void setContentView(int layoutResID) {
        super.setContentView(getView(LayoutInflater.from(this).inflate(
                layoutResID, null)));
    }

    private View getView(View view) {
        FrameLayout frameLayout = new FrameLayout(this);
        frameLayout.addView(view, ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.WRAP_CONTENT);
        if (isShow) {
            frameLayout.addView(getLodeView(), ViewGroup.LayoutParams.MATCH_PARENT,
                    ViewGroup.LayoutParams.MATCH_PARENT);
            startAnim();
        }
        return frameLayout;
    }

    /** 是否加载等待框 */
    private boolean isShow;

    protected void setShowLoading(boolean isShow) {
        this.isShow = isShow;
    }

}
