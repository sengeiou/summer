import Vue from 'vue'
import Vuex from 'vuex'

Vue.use(Vuex)

export const SET_DRAWER = 'SET_DRAWER'
export const SET_AUTHENTICATION = 'SET_AUTHENTICATION'

export default new Vuex.Store({
  state: {
    barColor: 'rgba(0, 0, 0, .8), rgba(0, 0, 0, .8)',
    barImage: 'https://demos.creative-tim.com/material-dashboard/assets/img/sidebar-1.jpg',
    drawer: null,
    authentication: {
      authenticated: false,
      authorities: [],
      token: '',
      decoded: {
        header: { alg: '' },
        payload: {
          iss: '',
          sub: '',
          userid: 0,
          iat: 0,
          exp: 0,
          nbf: 0,
          scp: ''
        },
        signature: ''
      }
    }
  },
  mutations: {
    [SET_DRAWER](state, payload) {
      state.drawer = payload
    },
    [SET_AUTHENTICATION](state) {
      var token = localStorage.getItem('AUTH_TOKEN');
      if (token) {
        state.authentication.token = token;
        state.authentication.authenticated = true;
      } else {
        state.authentication.authenticated = false;
        localStorage.clear();
      }
    },
  },
  actions: {
  },
  modules: {
  }
})
