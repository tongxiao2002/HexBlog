<template>
  <div id="homepage" class="homepage">
    <Sidebar id="sideBar"/>    <!-- 导航栏 -->
    <ArticleColumn id="articleColumn"/>
  </div>
</template>

<script>

import Sidebar from '../components/Home/TheSidebar.vue'
import ArticleColumn from '../components/Home/ArticleColumn.vue'

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
    Sidebar,
    ArticleColumn
  },
}
</script>

<style>
  .homepage {
    background-color: rgb(21, 22, 22)
  }
</style>
