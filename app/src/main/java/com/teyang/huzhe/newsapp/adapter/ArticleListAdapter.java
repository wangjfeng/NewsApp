package com.teyang.huzhe.newsapp.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.teyang.huzhe.newsapp.R;
import com.teyang.huzhe.newsapp.app.AppApplication;
import com.teyang.huzhe.newsapp.model.Article;

import java.util.List;

import butterknife.ButterKnife;
import butterknife.InjectView;

/**
 * Created by g on 2015/11/23.
 */
public class ArticleListAdapter extends RecyclerView.Adapter<ArticleListAdapter.ViewHolder> {
    private List<Article> articleList;
    private onItemClickListener listener;
    public ArticleListAdapter(List<Article> articleList) {
        this.articleList = articleList;
    }

    public interface onItemClickListener{
        void onItemClicked(View view, int position);
    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        ViewHolder viewHolder = new ViewHolder(LayoutInflater.from(
                AppApplication.getContext()).inflate(R.layout.article_list_item, parent,
                false));
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        if(listener != null){
            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    listener.onItemClicked(v,holder.getLayoutPosition());
                }
            });
        }
        holder.articleTitleTv.setText(articleList.get(position).getTitle());
//        Glide.with(AppApplication.getContext()).load(articleList.get(position).
//            getOriginUrl()).into(holder.articleImgIv);

    }

    @Override
    public int getItemCount() {
        return articleList.size();
    }

    public void addItem(Article item, int position) {
        articleList.add(position, item);
        notifyItemInserted(position);
    }

    public void addListItem(List<Article> articles){
        int length = articleList.size();
        for (int i = 0 ; i < articles.size(); i++){
            addItem(articles.get(i), i+ length );
        }
    }

    public void removeItem(Article item) {
        int position = articleList.indexOf(item);
        articleList.remove(position);
        notifyItemRemoved(position);
    }


    class ViewHolder extends RecyclerView.ViewHolder {
        @InjectView(R.id.article_img_iv)
        ImageView articleImgIv;
        @InjectView(R.id.article_title_tv)
        TextView articleTitleTv;

        public ViewHolder(View itemView) {
            super(itemView);
            ButterKnife.inject(this, itemView);
        }
    }

    public List<Article> getArticleList() {
        return articleList;
    }

    public void setArticleList(List<Article> articleList) {
        this.articleList = articleList;
    }

    public onItemClickListener getListener() {
        return listener;
    }

    public void setListener(onItemClickListener listener) {
        this.listener = listener;
    }

}