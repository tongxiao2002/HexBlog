package com.townshaw.blog.mapper;

import com.townshaw.blog.dao.TagDO;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.List;

@Repository
public interface TagMapper {
    public TagDO selectByName(String tagName);

}
