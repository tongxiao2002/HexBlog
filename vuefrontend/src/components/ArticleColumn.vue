<template>
  <div id="articleColumn" class="articleColumn">
    <ArticleEntry v-for="article in articleList"
                  v-bind:key="article.articleId"
                  v-bind:articleId="article.articleId"
                  v-bind:author="article.author"
                  v-bind:title="article.title"
                  v-bind:stem="article.stem"
                  v-bind:createTime="article.createTime"></ArticleEntry>
  </div>
</template>


<script>
import ArticleEntry from '../components/ArticleEntry.vue'
import { getRequest } from '../utils/api'

export default {
  name: "ArticleColumn",
  data() {
    return {
      articleList: []
    }
  },
  components: {
    ArticleEntry
  },
  methods: {
    getAllArticle: function() {
      getRequest("/article/fetchall").then(resp => {
        if (resp.status == 200) {
          let dataList = resp.data
          var articleList = []
          for (let article of dataList) {
            article.createTime = new Date(article.createTime)
            articleList.push(article)
          }
          this.articleList = articleList
        }
      })
    }
  },
  beforeMount() {
    this.getAllArticle()
  }
}

</script>

<style>
  .articleColumn {
    position: absolute;
    left: 300px;
  }
</style>
