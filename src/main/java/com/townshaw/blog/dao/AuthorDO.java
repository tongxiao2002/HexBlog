package com.townshaw.blog.dao;

import java.util.Date;

public class AuthorDO {
    /**
     * authorId type: String(UUID)
     */
    private String authorId;
    /**
     * authorName type: String
     */
    private String authorName;
    /**
     * email type: String
     */
    private String email;
    /**
     * password type: String
     */
    private String password;
    /**
     * createTime type: Date
     */
    private Date createTime;
    /**
     * updateTime type: Date
     */
    private Date updateTime;

    public AuthorDO() {
        this.authorId = "";
        this.authorName = "";
        this.email = "";
        this.password = "";
        this.createTime = null;
        this.updateTime = null;
    }

    public AuthorDO(String authorId, String authorName, String password) {
        this.authorId = authorId;
        this.authorName = authorName;
        this.password = password;
    }

    public AuthorDO(String authorId, String authorName, String email, String password) {
        this.authorId = authorId;
        this.authorName = authorName;
        this.email = email;
        this.password = password;
    }

    public AuthorDO(String authorId, String authorName, Date createTime, Date updateTime) {
        this.authorId = authorId;
        this.authorName = authorName;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public String getAuthorId() {
        return this.authorId;
    }

    public AuthorDO setAuthorId(String authorId) {
        this.authorId = authorId;
        return this;
    }

    public String getAuthorName() {
        return this.authorName;
    }

    public AuthorDO setAuthorName(String authorName) {
        this.authorName = authorName;
        return this;
    }

    public String getEmail() {
        return this.email;
    }

    public AuthorDO setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getPassword() {
        return this.password;
    }

    public AuthorDO setPassword(String password) {
        this.password = password;
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
        String str = "authorId = " + this.authorId + "\nauthorName = " + this.authorName;
        if (this.email != null) {
            str += "\nemail = " + this.email;
        }
        str += "\ncreateTime = " + this.createTime.toString();
        if (this.updateTime != null) {
            str += "\nupdateTime = " + this.updateTime.toString();
        }
        return str;
    }
}
