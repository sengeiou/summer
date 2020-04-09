import Vue from 'vue';
import './plugins/axios'

import axios from 'axios';

import ElementUI from 'element-ui';
import 'element-ui/lib/theme-chalk/index.css';

import App from './App.vue';
import router from './router';
import store from './store';

Vue.config.productionTip = false;

axios.defaults.baseURL = 'http://localhost:8080/api';
axios.defaults.withCredentials = true;
axios.interceptors.response.use(
  response => response,
  error => {
    if (error) {
      store.commit('logout')
      router.replace('/login')
    }
    return Promise.reject(error)
  });
Vue.prototype.$axios = axios;

Vue.use(ElementUI);

new Vue({
  router,
  store,
  render: h => h(App)
}).$mount('#app');
