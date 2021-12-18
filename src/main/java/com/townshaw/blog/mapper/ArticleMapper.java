package com.townshaw.blog.mapper;

import com.townshaw.blog.dao.ArticleDO;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.List;

@Repository
public interface ArticleMapper {

    int insert(ArticleDO article);

    int updateById(ArticleDO article);

    int deleteById(@Param("articleId") String articleId);

    // see https://stackoverflow.com/questions/24968088/how-can-i-pass-multiple-parameters-and-use-them
    int addTagToArticle(@Param("articleId") String articleId, @Param("tagId") String tagId);

    ArticleDO selectById(@Param("articleId") String articleId);

    ArticleDO selectByAuthor(@Param("author") String author);

    List<ArticleDO> selectByIds(@Param("articleIds") Collection<String> articleIds);

    List<String> getArticleTags(@Param("articleId") String articleId);

}

