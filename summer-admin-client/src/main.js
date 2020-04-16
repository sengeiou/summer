import Vue from 'vue'

import axios from 'axios'

import App from './App.vue'
import router from './router'
import store from './store'
import vuetify from './plugins/vuetify';

Vue.config.productionTip = false

axios.defaults.baseURL = 'http://localhost:8080/api';
axios.defaults.responseType = 'json';
axios.defaults.timeOut = 10000;

window.vm = new Vue({
  router,
  store,
  vuetify,
  render: h => h(App)
}).$mount('#app')
