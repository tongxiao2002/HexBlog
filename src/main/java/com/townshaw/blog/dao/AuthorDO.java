package com.townshaw.blog.dao;

import java.util.Date;

public class AuthorDO {
    /**
     * userId type: String(UUID)
     */
    private String userId;
    /**
     * userName type: String
     */
    private String userName;
    /**
     * createTime type: Date
     */
    private Date createTime;
    /**
     * updateTime type: Date
     */
    private Date updateTime;

    public AuthorDO() {
        this.userId = "";
        this.userName = "";
        this.createTime = null;
        this.updateTime = null;
    }

    public AuthorDO(String userId, String userName) {
        this.userId = userId;
        this.userName = userName;
    }

    public AuthorDO(String userId, String userName, Date createTime, Date updateTime) {
        this.userId = userId;
        this.userName = userName;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public String getUserId() {
        return this.userId;
    }

    public AuthorDO setUserId(String userId) {
        this.userId = userId;
        return this;
    }

    public String getUserName() {
        return this.userName;
    }

    public AuthorDO setUserName(String userName) {
        this.userName = userName;
        return this;
    }

    public Date getCreateTime() {
        return this.createTime;
    }

    public AuthorDO setCreateTime(Date createTime) {
        this.createTime = createTime;
        return this;
    }

    public Date getUpdateTime() {
        return this.updateTime;
    }

    public AuthorDO setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    @Override
    public String toString() {
        return "userId = " + this.userId
                + "\nuserName = " + this.userName
                + "\ncreateTime = " + this.createTime.toString()
                + "\nupdateTime = " + this.updateTime.toString();
    }
}
