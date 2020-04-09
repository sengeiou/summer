<template>
  <el-container id="admin">
    <el-header :height="'80px'" style="background-color: #409EFF">
      <admin-header />
    </el-header>
    <!--<el-row style="height: 100%;">-->
    <el-container>
      <!-- <el-aside style="height: 112%; margin-top: -80px; width: 250px"> -->
      <el-aside>
        <admin-menu></admin-menu>
      </el-aside>
      <el-main>
        <router-view />
      </el-main>
    </el-container>
  </el-container>
</template>

<script>
import AdminMenu from "@/components/AdminMenu.vue";
import AdminHeader from "@/components/AdminHeader.vue";

export default {
  name: "Admin",
  components: {
    "admin-menu": AdminMenu,
    "admin-header": AdminHeader
  },
  data() {
    return {
      dialogVisible: false
    };
  },
  mounted() {
    // this.$router.replace('/admin/dashboard')
  }
};
</script>

<style>
</style>
