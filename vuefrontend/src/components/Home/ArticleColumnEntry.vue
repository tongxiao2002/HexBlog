<template>
  <div id="artcle-entry" class="article-entry">
    <div id="article-inner" class="article-inner">
      <header id="article-header" class="article-header">    <!-- introductory entries for article -->
        <h1><a v-bind:href="articleURL">{{ title }}</a></h1>
      </header>
    </div>
  </div>
</template>

<script>
export default {
  name: "ArticleEntry",
  props: {
    articleId: {
      type: String,
      require: true
    },
    title: {      // 每个 ArticleEntry 项目都是从数据库中提取出来的 Article 列表里的一个元素, 因此需要一个 idx 用来索引每个 Article
      type: String,
      require: true,
    },
    createTime: {
      type: Date,
      require: true
    },
    tags: {
      type: Object,
      require: true
    }
  },
  data() {
    return {
      articleDate: ""
    }
  },
  methods: {
    /**
     * 目标是每个文章的 URL 都由创建时间和标题组成, 比如: http://www.54tianzhisheng.cn/2021/11/11/flink-akka-framesize/
     * 上例为整个项目前端的目标
     * articleURL 从该函数中产出
     */
    getURLFromCreateTime: function(createTime) {
      var month = '' + (createTime.getMonth() + 1)
      var day = '' + createTime.getDate()
      var year = createTime.getFullYear()

      if (month.length < 2)
          month = '0' + month;
      if (day.length < 2)
          day = '0' + day;

    return [year, month, day].join('/') + "/"
    }
  },
  computed: {
    articleURL: function() {
      return this.getURLFromCreateTime(this.createTime) + this.title.replaceAll(" ", "-").toLowerCase()
    }
  },
  beforeMount() {

  }
}
</script>

<style>
  .article-entry {
    margin: 30px;
    position: relative;

  }
  .article-inner {
    border: 1px solid #2f2f2f;
    box-shadow: 4px 4px 18px rgb(0 0 0 / 46%);
  }
  .article-header {
    padding:15px 0px 15px 25px
  }
</style>