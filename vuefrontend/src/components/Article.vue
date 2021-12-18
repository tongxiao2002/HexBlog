<template>
  <div id="article">
    <p>写入文章</p>
    <form>
      <input v-model="author" type="text" placeholder="作者" required>
      <input v-model="title" type="text" placeholder="标题" required>
      <input v-model="stem" type="text" placeholder="文本" required>
      <button type="submit" v-on:click="postArticle">提交!</button>
      <h1>{{ getAuthor }}</h1>
    </form>
  </div>
</template>


<script>
  import { getRequest, postRequest } from '../utils/api'

  export default {
    name: "Article",
    data() {
      return {
        author: "",
        title: "",
        stem: "",
        getAuthor: ""
      }
    },
    methods: {
      postArticle() {
        postRequest("/article/upload", {"author": this.author, "title": this.title, "stem": this.stem})
      },
      getArticle() {
        getRequest("/article/718459e2-567a-11ec-b8e9-d9c8f93e746a").then(resp => {
          if (resp.status == 200) {
            this.getAuthor = resp.data.author
          }
        })
      }
    },
    beforeMount() {
      this.getArticle()
    }
  }

</script>
