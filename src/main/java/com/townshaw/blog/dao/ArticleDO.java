package com.townshaw.blog.dao;

import java.util.UUID;
import java.util.Date;

public class ArticleDO {
    /**
     * Article ID type: String(UUID)
     */
    private String articleId;
    /**
     * Author type: String
     */
    private String author;
    /**
     * Title type: String
     */
    private String title;
    /**
     * stem type: String
     */
    private String stem;
    /**
     * createTime type: Date
     */
    private Date createTime;
    /**
     * updateTime type: Date
     */
    private Date updateTime;

    /**
     * no-parameter constructor
     */
    public ArticleDO() {
        this.articleId = "";
        this.author = "";
        this.title = "";
        this.stem = "";
        this.createTime = null;
        this.updateTime = null;
    }

    /**
     * articleId, create_time, update_time will auto-generate by database(articleId by java), user needn't provide.
     * This constructor is used to provide date object to database.
     * @param author        author name
     * @param title         title of the article
     * @param stem          stem of the article (MarkDown text)
     */
    public ArticleDO(String author, String title, String stem) {
        this.articleId = UUID.randomUUID().toString();
        this.author = author;
        this.title = title;
        this.stem = stem;
        this.createTime = null;
        this.updateTime = null;
    }

    /**
     * constructor that user provide all the parameter, will not be used to communicate with db in this application.
     * @param articleId     articleId
     * @param author        author name
     * @param title         title of the article
     * @param stem          steam of the article
     * @param createTime    create time of the article
     * @param updateTime    last update time of the article
     */
    public ArticleDO(String articleId, String author, String title, String stem, Date createTime, Date updateTime) {
        this.articleId = articleId;
        this.author = author;
        this.title = title;
        this.stem = stem;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public String getArticleId() {
        return this.articleId;
    }

    public ArticleDO setArticleId(String articleId) {
        this.articleId = articleId;
        return this;
    }

    public String getAuthor() {
        return this.author;
    }

    public ArticleDO setAuthor(String author) {
        this.author = author;
        return this;
    }

    public String getTitle() {
        return this.title;
    }

    public ArticleDO setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getStem() {
        return this.stem;
    }

    public ArticleDO setStem(String stem) {
        this.stem = stem;
        return this;
    }


    public Date getCreateTime() {
        return this.createTime;
    }

    public ArticleDO setCreateTime(Date createTime) {
        this.createTime = createTime;
        return this;
    }

    public Date getUpdateTime() {
        return this.updateTime;
    }

    public ArticleDO setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    @Override
    public String toString() {
        String str = "articleId = " + this.articleId
                     + "\nauthor = " + this.author
                     + "\ntitle = " + this.title
                     + "\nstem = " + this.stem
                     + "\ncreateTime = " + this.createTime.toString();
        if (this.updateTime != null) {
            str += "\nupdateTime = " + this.updateTime.toString();
        }
        return str;
    }
}
