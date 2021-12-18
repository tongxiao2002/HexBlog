package com.townshaw.blog.service;

import com.townshaw.blog.dao.ArticleDO;
import com.townshaw.blog.dao.TagDO;
import com.townshaw.blog.mapper.ArticleMapper;
import com.townshaw.blog.mapper.TagMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;
import java.util.UUID;

@Service
@Transactional
public class ArticleService {
    @Autowired
    ArticleMapper articleMapper;
    @Autowired
    TagMapper tagMapper;

    public ArticleDO getArticleById(String articleId) {
        return articleMapper.selectById(articleId);
    }

    public int addNewArticle(ArticleDO articleFromRequest) {
        // use constructor define in ArticleBean, prevent user provide a wrong id or time.
        ArticleDO article = new ArticleDO(articleFromRequest.getAuthor(),
                                          articleFromRequest.getTitle(),
                                          articleFromRequest.getStem());
        int statusCode = articleMapper.insert(article);
        return statusCode;
    }

    public int addTagsToArticle(ArticleDO article, List<String> tagNames) {
        for (String tagName : tagNames) {
            TagDO tag = tagMapper.selectByName(tagName);
            int statusCode = articleMapper.addTagToArticle(article.getArticleId(), tag.getTagName());
        }
        return 0;
    }
}
