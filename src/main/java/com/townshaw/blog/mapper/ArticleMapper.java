package com.townshaw.blog.mapper;

import com.townshaw.blog.dao.ArticleDO;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.List;

@Repository
public interface ArticleMapper {

    int insert(ArticleDO article);

    int insertWithoutDate(ArticleDO article);

    int updateById(ArticleDO article);

    int deleteById(@Param("articleId") String articleId);

    ArticleDO selectById(@Param("articleId") String articleId);
    ArticleDO selectByAuthor(@Param("author") String author);

    List<ArticleDO> selectByIds(@Param("articleIds") Collection<String> articleIds);

}

