package com.townshaw.blog.dao;

import java.util.Date;
import java.util.Objects;
import java.util.UUID;

public class ArticleDO {
    /**
     * Article ID type: String(UUID)
     */
    private String articleId;
    /**
     * Author type: string
     */
    private String author;
    /**
     * publish_date type: Date
     */
    private Date publishDate;
    /**
     * Title type: String
     */
    private String title;
    /**
     * stem type: String
     */
    private String stem;

    public ArticleDO() {
        this.articleId = "";
        this.author = "";
        this.publishDate = new Date();
        this.title = "";
        this.stem = "";
    }

    public ArticleDO(UUID articleId, String author, Date publishDate, String title, String stem) {
        this.articleId = Objects.requireNonNullElseGet(articleId, UUID::randomUUID).toString();
        this.author = author;
        this.publishDate = publishDate;
        this.title = title;
        this.stem = stem;
    }

    public ArticleDO(UUID articleId, String author, String title, String stem) {
        this.articleId = Objects.requireNonNullElseGet(articleId, UUID::randomUUID).toString();
        this.author = author;
        this.title = title;
        this.stem = stem;
    }

    public String getArticle_id() {
        return this.articleId;
    }

    public ArticleDO setArticle_id(String articleId) {
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

    public Date getPublish_date() {
        return this.publishDate;
    }

    public ArticleDO setPublish_date(String publishDate) {
        this.publishDate = new Date();
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

    @Override
    public String toString() {
        return "articleId = " + this.articleId
                + "\nauthor = " + this.author
                + "\npublishDate = " + this.publishDate.toString()
                + "\ntitle = " + this.title
                + "\nstem = " + this.stem;
    }
}
