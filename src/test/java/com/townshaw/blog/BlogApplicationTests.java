package com.townshaw.blog;

import com.townshaw.blog.dao.ArticleDO;
import com.townshaw.blog.mapper.ArticleMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BlogApplicationTests {

    @Autowired
    private ArticleMapper articleMapper;

    @Test
    public void testInsert() {
        ArticleDO test_article = new ArticleDO(null, "TownShaw", "testtest", "testtest_article");
        articleMapper.insertWithoutDate(test_article);
    }

    @Test
    public void testSelectById() {
        ArticleDO test_article = articleMapper.selectById("718459e2-567a-11ec-b8e9-d9c8f93e746a");
        System.out.println(test_article.toString());
    }
}
