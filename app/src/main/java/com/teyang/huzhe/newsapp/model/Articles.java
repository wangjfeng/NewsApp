package com.teyang.huzhe.newsapp.model;

import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by g on 2015/11/23.
 */
public class Articles {
    @SerializedName("articles")
    @Expose
    private List<Article> articles = new ArrayList<Article>();

    /**
     * @return The articles
     */
    public List<Article> getArticles() {
        return articles;
    }

    /**
     * @param articles The articles
     */
    public void setArticles(List<Article> articles) {
        this.articles = articles;
    }
}
