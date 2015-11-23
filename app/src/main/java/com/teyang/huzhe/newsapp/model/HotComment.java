package com.teyang.huzhe.newsapp.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by g on 2015/11/20.
 */
public class HotComment {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("sid")
    @Expose
    private String sid;
    @SerializedName("content")
    @Expose
    private String content;
    @SerializedName("item")
    @Expose
    private String item;
    @SerializedName("user")
    @Expose
    private String user;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("label")
    @Expose
    private String label;
    @SerializedName("avatar_url")
    @Expose
    private String avatarUrl;
    @SerializedName("avatar_sid")
    @Expose
    private String avatarSid;
    @SerializedName("good")
    @Expose
    private String good;
    @SerializedName("bad")
    @Expose
    private String bad;
    @SerializedName("timestamp")
    @Expose
    private String timestamp;
    @SerializedName("time")
    @Expose
    private String time;
    @SerializedName("datetime")
    @Expose
    private String datetime;
    @SerializedName("lou")
    @Expose
    private String lou;
    @SerializedName("quoteids")
    @Expose
    private String quoteids;
    @SerializedName("itemSid")
    @Expose
    private String itemSid;
    @SerializedName("quotes")
    @Expose
    private List<Object> quotes = new ArrayList<Object>();

    /**
     *
     * @return
     * The id
     */
    public String getId() {
        return id;
    }

    /**
     *
     * @param id
     * The id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     *
     * @return
     * The sid
     */
    public String getSid() {
        return sid;
    }

    /**
     *
     * @param sid
     * The sid
     */
    public void setSid(String sid) {
        this.sid = sid;
    }

    /**
     *
     * @return
     * The content
     */
    public String getContent() {
        return content;
    }

    /**
     *
     * @param content
     * The content
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     *
     * @return
     * The item
     */
    public String getItem() {
        return item;
    }

    /**
     *
     * @param item
     * The item
     */
    public void setItem(String item) {
        this.item = item;
    }

    /**
     *
     * @return
     * The user
     */
    public String getUser() {
        return user;
    }

    /**
     *
     * @param user
     * The user
     */
    public void setUser(String user) {
        this.user = user;
    }

    /**
     *
     * @return
     * The name
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param name
     * The name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return
     * The label
     */
    public String getLabel() {
        return label;
    }

    /**
     *
     * @param label
     * The label
     */
    public void setLabel(String label) {
        this.label = label;
    }

    /**
     *
     * @return
     * The avatarUrl
     */
    public String getAvatarUrl() {
        return avatarUrl;
    }

    /**
     *
     * @param avatarUrl
     * The avatar_url
     */
    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    /**
     *
     * @return
     * The avatarSid
     */
    public String getAvatarSid() {
        return avatarSid;
    }

    /**
     *
     * @param avatarSid
     * The avatar_sid
     */
    public void setAvatarSid(String avatarSid) {
        this.avatarSid = avatarSid;
    }

    /**
     *
     * @return
     * The good
     */
    public String getGood() {
        return good;
    }

    /**
     *
     * @param good
     * The good
     */
    public void setGood(String good) {
        this.good = good;
    }

    /**
     *
     * @return
     * The bad
     */
    public String getBad() {
        return bad;
    }

    /**
     *
     * @param bad
     * The bad
     */
    public void setBad(String bad) {
        this.bad = bad;
    }

    /**
     *
     * @return
     * The timestamp
     */
    public String getTimestamp() {
        return timestamp;
    }

    /**
     *
     * @param timestamp
     * The timestamp
     */
    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    /**
     *
     * @return
     * The time
     */
    public String getTime() {
        return time;
    }

    /**
     *
     * @param time
     * The time
     */
    public void setTime(String time) {
        this.time = time;
    }

    /**
     *
     * @return
     * The datetime
     */
    public String getDatetime() {
        return datetime;
    }

    /**
     *
     * @param datetime
     * The datetime
     */
    public void setDatetime(String datetime) {
        this.datetime = datetime;
    }

    /**
     *
     * @return
     * The lou
     */
    public String getLou() {
        return lou;
    }

    /**
     *
     * @param lou
     * The lou
     */
    public void setLou(String lou) {
        this.lou = lou;
    }

    /**
     *
     * @return
     * The quoteids
     */
    public String getQuoteids() {
        return quoteids;
    }

    /**
     *
     * @param quoteids
     * The quoteids
     */
    public void setQuoteids(String quoteids) {
        this.quoteids = quoteids;
    }

    /**
     *
     * @return
     * The itemSid
     */
    public String getItemSid() {
        return itemSid;
    }

    /**
     *
     * @param itemSid
     * The itemSid
     */
    public void setItemSid(String itemSid) {
        this.itemSid = itemSid;
    }

    /**
     *
     * @return
     * The quotes
     */
    public List<Object> getQuotes() {
        return quotes;
    }

    /**
     *
     * @param quotes
     * The quotes
     */
    public void setQuotes(List<Object> quotes) {
        this.quotes = quotes;
    }

}