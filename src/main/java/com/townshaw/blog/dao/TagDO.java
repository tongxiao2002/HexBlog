package com.townshaw.blog.dao;

import java.util.UUID;

public class TagDO {
    /**
     * Tag ID type: String(UUID)
     */
    private String tagId;
    /**
     * Tag Name type: String
     */
    private String name;

    public String getTagId() {
        return this.tagId;
    }

    public TagDO setTagId(String tagId) {
        this.tagId = tagId;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public TagDO setName(String name) {
        this.name = name;
        return this;
    }
}
