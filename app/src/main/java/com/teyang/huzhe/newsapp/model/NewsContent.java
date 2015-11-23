package com.teyang.huzhe.newsapp.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by g on 2015/11/20.
 */
public class NewsContent {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("content")
    @Expose
    private String content;
    @SerializedName("metaContent")
    @Expose
    private String metaContent;
    @SerializedName("tags")
    @Expose
    private String tags;
    @SerializedName("hits")
    @Expose
    private String hits;
    @SerializedName("add_time")
    @Expose
    private String addTime;
    @SerializedName("sport")
    @Expose
    private String sport;
    @SerializedName("league")
    @Expose
    private String league;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("author")
    @Expose
    private String author;
    @SerializedName("pubtime")
    @Expose
    private String pubtime;
    @SerializedName("source")
    @Expose
    private String source;
    @SerializedName("mod_time")
    @Expose
    private String modTime;
    @SerializedName("last_update_time")
    @Expose
    private String lastUpdateTime;
    @SerializedName("srcUrl")
    @Expose
    private String srcUrl;
    @SerializedName("cover_img")
    @Expose
    private String coverImg;
    @SerializedName("del_reason")
    @Expose
    private String delReason;
    @SerializedName("del_user")
    @Expose
    private String delUser;
    @SerializedName("cover_hide")
    @Expose
    private String coverHide;
    @SerializedName("contentJson")
    @Expose
    private List<Object> contentJson = new ArrayList<Object>();
    @SerializedName("detailtime")
    @Expose
    private String detailtime;
    @SerializedName("imgsid")
    @Expose
    private String imgsid;
    @SerializedName("imgwh")
    @Expose
    private Integer imgwh;
    @SerializedName("hotComments")
    @Expose
    private List<HotComment> hotComments = new ArrayList<HotComment>();
    @SerializedName("commCount")
    @Expose
    private String commCount;
    @SerializedName("isGdtAd")
    @Expose
    private Boolean isGdtAd;
    @SerializedName("ads")
    @Expose
    private List<Object> ads = new ArrayList<Object>();

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
     * The metaContent
     */
    public String getMetaContent() {
        return metaContent;
    }

    /**
     *
     * @param metaContent
     * The metaContent
     */
    public void setMetaContent(String metaContent) {
        this.metaContent = metaContent;
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
     * The sport
     */
    public String getSport() {
        return sport;
    }

    /**
     *
     * @param sport
     * The sport
     */
    public void setSport(String sport) {
        this.sport = sport;
    }

    /**
     *
     * @return
     * The league
     */
    public String getLeague() {
        return league;
    }

    /**
     *
     * @param league
     * The league
     */
    public void setLeague(String league) {
        this.league = league;
    }

    /**
     *
     * @return
     * The status
     */
    public String getStatus() {
        return status;
    }

    /**
     *
     * @param status
     * The status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     *
     * @return
     * The type
     */
    public String getType() {
        return type;
    }

    /**
     *
     * @param type
     * The type
     */
    public void setType(String type) {
        this.type = type;
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
     * The modTime
     */
    public String getModTime() {
        return modTime;
    }

    /**
     *
     * @param modTime
     * The mod_time
     */
    public void setModTime(String modTime) {
        this.modTime = modTime;
    }

    /**
     *
     * @return
     * The lastUpdateTime
     */
    public String getLastUpdateTime() {
        return lastUpdateTime;
    }

    /**
     *
     * @param lastUpdateTime
     * The last_update_time
     */
    public void setLastUpdateTime(String lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    /**
     *
     * @return
     * The srcUrl
     */
    public String getSrcUrl() {
        return srcUrl;
    }

    /**
     *
     * @param srcUrl
     * The srcUrl
     */
    public void setSrcUrl(String srcUrl) {
        this.srcUrl = srcUrl;
    }

    /**
     *
     * @return
     * The coverImg
     */
    public String getCoverImg() {
        return coverImg;
    }

    /**
     *
     * @param coverImg
     * The cover_img
     */
    public void setCoverImg(String coverImg) {
        this.coverImg = coverImg;
    }

    /**
     *
     * @return
     * The delReason
     */
    public String getDelReason() {
        return delReason;
    }

    /**
     *
     * @param delReason
     * The del_reason
     */
    public void setDelReason(String delReason) {
        this.delReason = delReason;
    }

    /**
     *
     * @return
     * The delUser
     */
    public String getDelUser() {
        return delUser;
    }

    /**
     *
     * @param delUser
     * The del_user
     */
    public void setDelUser(String delUser) {
        this.delUser = delUser;
    }

    /**
     *
     * @return
     * The coverHide
     */
    public String getCoverHide() {
        return coverHide;
    }

    /**
     *
     * @param coverHide
     * The cover_hide
     */
    public void setCoverHide(String coverHide) {
        this.coverHide = coverHide;
    }

    /**
     *
     * @return
     * The contentJson
     */
    public List<Object> getContentJson() {
        return contentJson;
    }

    /**
     *
     * @param contentJson
     * The contentJson
     */
    public void setContentJson(List<Object> contentJson) {
        this.contentJson = contentJson;
    }

    /**
     *
     * @return
     * The detailtime
     */
    public String getDetailtime() {
        return detailtime;
    }

    /**
     *
     * @param detailtime
     * The detailtime
     */
    public void setDetailtime(String detailtime) {
        this.detailtime = detailtime;
    }

    /**
     *
     * @return
     * The imgsid
     */
    public String getImgsid() {
        return imgsid;
    }

    /**
     *
     * @param imgsid
     * The imgsid
     */
    public void setImgsid(String imgsid) {
        this.imgsid = imgsid;
    }

    /**
     *
     * @return
     * The imgwh
     */
    public Integer getImgwh() {
        return imgwh;
    }

    /**
     *
     * @param imgwh
     * The imgwh
     */
    public void setImgwh(Integer imgwh) {
        this.imgwh = imgwh;
    }

    /**
     *
     * @return
     * The hotComments
     */
    public List<HotComment> getHotComments() {
        return hotComments;
    }

    /**
     *
     * @param hotComments
     * The hotComments
     */
    public void setHotComments(List<HotComment> hotComments) {
        this.hotComments = hotComments;
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
     * The commCount
     */
    public void setCommCount(String commCount) {
        this.commCount = commCount;
    }

    /**
     *
     * @return
     * The isGdtAd
     */
    public Boolean getIsGdtAd() {
        return isGdtAd;
    }

    /**
     *
     * @param isGdtAd
     * The isGdtAd
     */
    public void setIsGdtAd(Boolean isGdtAd) {
        this.isGdtAd = isGdtAd;
    }

    /**
     *
     * @return
     * The ads
     */
    public List<Object> getAds() {
        return ads;
    }

    /**
     *
     * @param ads
     * The ads
     */
    public void setAds(List<Object> ads) {
        this.ads = ads;
    }

}



