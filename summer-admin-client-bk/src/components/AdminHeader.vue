<template>
  <div id="admin-header">
    <router-link to="/admin">Summer</router-link>
    <i class="el-icon-switch-button" v-on:click="logout" style="font-size: 40px; float: right"></i>
  </div>
</template>

<script>
//import { createRouter } from "../../router";

export default {
  name: "AdminHeader",
  methods: {
    // logout() {
    //   var _this = this;
    //   this.$axios
    //     .get("/logout")
    //     .then(resp => {
    //       if (resp && resp.data.code === 200) {
    //         _this.$store.commit("logout");
    //         _this.$router.replace("/index");
    //         // 清空路由，防止路由重复加载
    //         const newRouter = createRouter();
    //         _this.$router.matcher = newRouter.matcher;
    //       }
    //     })
    //     .catch(failResponse => {});
    // }
  }
};
</script>

<style scoped>
#admin-header {
  height: 80px;
  opacity: 0.85;
  line-height: 40px;
  min-width: 900px;
}

.el-icon-switch-button {
  cursor: pointer;
}
</style>
