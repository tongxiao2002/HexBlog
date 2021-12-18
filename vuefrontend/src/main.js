import Vue from 'vue'
import App from './App.vue'
import router from './router/router'

import { library } from '@fortawesome/fontawesome-svg-core'

/* import specific icons */
import { faUserSecret } from '@fortawesome/free-solid-svg-icons'
library.add(faUserSecret)
import { FontAwesomeIcon } from '@fortawesome/vue-fontawesome'
Vue.component('font-awesome-icon', FontAwesomeIcon)

Vue.config.productionTip = false
Vue.config.devtools = true
Vue.config.editor = "VSCode"

/**
 * 实际渲染为：
 * import App from './App'
 * new Vue({
 *     el: '#root',
 *     template: '<App/>',
 *     components: {
 *         App
 *     }
 * })
 */
new Vue({
  /**
   * render: function (createElement) {
   *     return createElement(App);
   * }
   * 
   * 简写为下面
   * render: h => h(App)
   */
  // template: '<App/>',
  router,
  // components: {
  //   App
  // }
  render: h => h(App),
}).$mount("#app")
