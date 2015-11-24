package com.teyang.huzhe.newsapp.ui.action;

import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import com.teyang.huzhe.newsapp.R;
import com.teyang.huzhe.newsapp.ui.base.BaseActivity;

public class ToolBarTitle extends BaseActivity {
    protected Toolbar toolbar;

	@Override
	public void setContentView(int layoutResID) {
		super.setContentView(getView(LayoutInflater.from(this).inflate(
				layoutResID, null)));
		init();
	}

	private View getView(View view) {
		LinearLayout linearView = new LinearLayout(this);
		linearView.setOrientation(LinearLayout.VERTICAL);
		View barView = LayoutInflater.from(this).inflate(R.layout.include_toolbar,
				null);
		linearView.addView(barView, LayoutParams.MATCH_PARENT,
				LayoutParams.WRAP_CONTENT);
		RelativeLayout relativeView = new RelativeLayout(this);
		relativeView.addView(view, LayoutParams.MATCH_PARENT,
				LayoutParams.MATCH_PARENT);
		if (isShow) {
			relativeView.addView(getLodeView(), LayoutParams.MATCH_PARENT,
					LayoutParams.MATCH_PARENT);
			startAnim();
		}
		linearView.addView(relativeView, LayoutParams.MATCH_PARENT,
				LayoutParams.MATCH_PARENT);
		return linearView;
	}

	/** 是否加载等待框 */
	private boolean isShow;

	protected void setShowLoading(boolean isShow) {
		this.isShow = isShow;
	}

	/** 初始化 */
	protected void init() {
        toolbar=(Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
		getSupportActionBar().setDisplayHomeAsUpEnabled(true);
	}

    public void setTitle(int string){
        toolbar.setTitle(string);
    }

    public void setToolbarColor(int color){toolbar.setTitleTextColor(color);}
}
