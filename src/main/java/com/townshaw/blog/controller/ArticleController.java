package com.townshaw.blog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.townshaw.blog.dao.ArticleDO;
import com.townshaw.blog.service.ArticleService;
import java.text.SimpleDateFormat;


@ResponseBody
@RestController
@RequestMapping("/article")
public class ArticleController {
    public SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");

    @Autowired
    ArticleService articleService;

    @CrossOrigin
    @PostMapping("/upload")
    public int addNewArticle(@RequestBody ArticleDO article) {
        int statusCode = articleService.addNewArticle(article);
        return statusCode;
    }
    @CrossOrigin
    @GetMapping("/{articleId}")
    public ArticleDO getArticleById(@PathVariable String articleId) {
        return articleService.getArticleById(articleId);
    }
}
