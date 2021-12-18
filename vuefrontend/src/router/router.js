import Vue from 'vue'
import Router from 'vue-router'
// import Article from '../components/Article.vue'
import Home from '../views/Home.vue'

Vue.use(Router)

export default new Router({
    routes: [
        {
            path: '/',
            name: '首页',
            component: Home
        },
        {
            path: '/article',
            name: '文章',
            component: function() {
                return import("../components/Article.vue")
            }
        },
        {
            path: '/test',
            name: 'HelloWord Test',
            component: function() {
                return import('../components/HelloWorld.vue')
            }
        }
    ],
    mode: 'history'
})
