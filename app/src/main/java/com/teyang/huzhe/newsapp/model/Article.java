package com.teyang.huzhe.newsapp.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by g on 2015/11/20.
 */
public class Article {

    @SerializedName("sid")
    @Expose
    private String sid;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("tags")
    @Expose
    private String tags;
    @SerializedName("hits")
    @Expose
    private String hits;
    @SerializedName("add_time")
    @Expose
    private String addTime;
    @SerializedName("pubtime")
    @Expose
    private String pubtime;
    @SerializedName("author")
    @Expose
    private String author;
    @SerializedName("source")
    @Expose
    private String source;
    @SerializedName("modtime")
    @Expose
    private String modtime;
    @SerializedName("thumb_id")
    @Expose
    private String thumbId;
    @SerializedName("origin_url")
    @Expose
    private String originUrl;
    @SerializedName("modtime_desc")
    @Expose
    private String modtimeDesc;
    @SerializedName("comm_count")
    @Expose
    private String commCount;

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
     * The title
     */
    public String getTitle() {
        return title;
    }

    /**
     *
     * @param title
     * The title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     *
     * @return
     * The tags
     */
    public String getTags() {
        return tags;
    }

    /**
     *
     * @param tags
     * The tags
     */
    public void setTags(String tags) {
        this.tags = tags;
    }

    /**
     *
     * @return
     * The hits
     */
    public String getHits() {
        return hits;
    }

    /**
     *
     * @param hits
     * The hits
     */
    public void setHits(String hits) {
        this.hits = hits;
    }

    /**
     *
     * @return
     * The addTime
     */
    public String getAddTime() {
        return addTime;
    }

    /**
     *
     * @param addTime
     * The add_time
     */
    public void setAddTime(String addTime) {
        this.addTime = addTime;
    }

    /**
     *
     * @return
     * The pubtime
     */
    public String getPubtime() {
        return pubtime;
    }

    /**
     *
     * @param pubtime
     * The pubtime
     */
    public void setPubtime(String pubtime) {
        this.pubtime = pubtime;
    }

    /**
     *
     * @return
     * The author
     */
    public String getAuthor() {
        return author;
    }

    /**
     *
     * @param author
     * The author
     */
    public void setAuthor(String author) {
        this.author = author;
    }

    /**
     *
     * @return
     * The source
     */
    public String getSource() {
        return source;
    }

    /**
     *
     * @param source
     * The source
     */
    public void setSource(String source) {
        this.source = source;
    }

    /**
     *
     * @return
     * The modtime
     */
    public String getModtime() {
        return modtime;
    }

    /**
     *
     * @param modtime
     * The modtime
     */
    public void setModtime(String modtime) {
        this.modtime = modtime;
    }

    /**
     *
     * @return
     * The thumbId
     */
    public String getThumbId() {
        return thumbId;
    }

    /**
     *
     * @param thumbId
     * The thumb_id
     */
    public void setThumbId(String thumbId) {
        this.thumbId = thumbId;
    }

    /**
     *
     * @return
     * The originUrl
     */
    public String getOriginUrl() {
        return originUrl;
    }

    /**
     *
     * @param originUrl
     * The origin_url
     */
    public void setOriginUrl(String originUrl) {
        this.originUrl = originUrl;
    }

    /**
     *
     * @return
     * The modtimeDesc
     */
    public String getModtimeDesc() {
        return modtimeDesc;
    }

    /**
     *
     * @param modtimeDesc
     * The modtime_desc
     */
    public void setModtimeDesc(String modtimeDesc) {
        this.modtimeDesc = modtimeDesc;
    }

    /**
     *
     * @return
     * The commCount
     */
    public String getCommCount() {
        return commCount;
    }

    /**
     *
     * @param commCount
     * The comm_count
     */
    public void setCommCount(String commCount) {
        this.commCount = commCount;
    }

}