import Vue from 'vue'
import VueRouter from 'vue-router'

import Home from '../views/Home.vue'
import Admin from '../views/Admin.vue'

Vue.use(VueRouter)

const routes = [
  {
    path: '/',
    name: 'Home',
    component: Home
  },
  {
    path: '/about',
    name: 'About',
    // route level code-splitting
    // this generates a separate chunk (about.[hash].js) for this route
    // which is lazy-loaded when the route is visited.
    component: () => import(/* webpackChunkName: "about" */ '../views/About.vue')
  },
  {
    path: '/admin',
    name: 'Admin',
    component: Admin,
    // meta: {
    //   requireAuth: true
    // },
    // children: [
      // {
      //   path: '/admin/dashboard',
      //   name: 'Dashboard',
      //   component: DashBoard,
      //   meta: {
      //     requireAuth: true
      //   }
      // }
    // ]
  }
]

const router = new VueRouter({
  routes
})

// router.beforeEach((to, from, next) => {
//   if (store.state.username && to.path.startsWith('/admin')) {
//     initAdminMenu(router, store)
//   }
//   if (store.state.username && to.path.startsWith('/login')) {
//     next({
//       path: 'admin/dashboard'
//     })
//   }
//   // 如果前端没有登录信息则直接拦截，如果有则判断后端是否正常登录（防止构造参数绕过）
//   if (to.meta.requireAuth) {
//     if (store.state.username) {
//       axios.get('/authentication').then(resp => {
//         if (resp) {
//           next()
//         }
//       })
//     } else {
//       next({
//         path: 'login',
//         query: { redirect: to.fullPath }
//       })
//     }
//   } else {
//     next()
//   }
// })

// const initAdminMenu = (router, store) => {
//   // 防止重复触发加载菜单操作
//   if (store.state.adminMenus.length > 0) {
//     return
//   }
//   axios.get('/menu').then(resp => {
//     if (resp && resp.status === 200) {
//       var fmtRoutes = formatRoutes(resp.data.result)
//       router.addRoutes(fmtRoutes)
//       store.commit('initAdminMenu', fmtRoutes)
//     }
//   })
// }

// const formatRoutes = (routes) => {
//   let fmtRoutes = []
//   routes.forEach(route => {
//     if (route.children) {
//       route.children = formatRoutes(route.children)
//     }

//     let fmtRoute = {
//       path: route.path,
//       component: resolve => {
//         require(['./components/admin/' + route.component + '.vue'], resolve)
//       },
//       name: route.name,
//       nameZh: route.nameZh,
//       iconCls: route.iconCls,
//       meta: {
//         requireAuth: true
//       },
//       children: route.children
//     }
//     fmtRoutes.push(fmtRoute)
//   })
//   return fmtRoutes
// }
export default router
