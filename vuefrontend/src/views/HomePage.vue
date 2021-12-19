<template>
  <div id="homepage" class="homepage">
    <navigation id="naviBar"></navigation>    <!-- 导航栏 -->
    <ArticleColumn id="articleColumn"></ArticleColumn>
  </div>
</template>

<script>

import navigation from '../components/navigation.vue'
import ArticleColumn from '../components/ArticleColumn.vue'

export default {
  name: "HomePage",
  data() {
    return {
      articleList: []
    }
  },
  methods: {

  },
  components: {
    navigation,
    ArticleColumn
  },
}
</script>

<style>
  .homepage {
    background-color: rgb(21, 22, 22)
  }
</style>
