package com.townshaw.blog.mapper;

import com.townshaw.blog.dao.TagDO;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.List;

@Repository
public interface TagMapper {

    int insert(TagDO tagDO);

    int updateById(TagDO tagDO);

    int deleteById(@Param("tagId") String tagId);

    int selectById(@Param("tagId") String tagId);

    TagDO selectByName(@Param("tagName") String tagName);

    List<TagDO> selectByIds(@Param("tagIds") Collection<String> tagIds);

}
