package com.townshaw.blog.dao;

import java.util.UUID;
import java.util.Date;

public class TagDO {
    /**
     * Tag ID type: String(UUID)
     */
    private String tagId;
    /**
     * Tag Name type: String
     */
    private String tagName;
    /**
     * createTime type: Date
     */
    private Date createTime;
    /**
     * updateTime type: Date
     */
    private Date updateTime;

    public TagDO() {
        this.tagId = "";
        this.tagName = "";
        this.createTime = null;
        this.updateTime = null;
    }

    public TagDO(String tagName) {
        this.tagId = UUID.randomUUID().toString();
        this.tagName = tagName;
    }

    public TagDO(String tagId, String tagName, Date createTime, Date updateTime) {
        this.tagId = tagId;
        this.tagName = tagName;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public String getTagId() {
        return this.tagId;
    }

    public TagDO setTagId(String tagId) {
        this.tagId = tagId;
        return this;
    }

    public String getTagName() {
        return this.tagName;
    }

    public TagDO setTagName(String tagName) {
        this.tagName = tagName;
        return this;
    }

    public Date getCreateTime() {
        return this.createTime;
    }

    public TagDO setCreateTime(Date createTime) {
        this.createTime = createTime;
        return this;
    }

    public Date getUpdateTime() {
        return this.updateTime;
    }

    public TagDO setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    @Override
    public String toString() {
        return "tagId = " + this.tagId
                + "\nname = " + this.tagName
                + "\ncreateTime = " + this.createTime.toString()
                + "\nupdateTime = " + this.updateTime.toString();
    }
}
