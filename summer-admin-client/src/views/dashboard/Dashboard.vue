<template>
  <v-app id="dashboard">
    <AppBar />
    <NavDrawer :expandOnHover="expandOnHover" />
    <Content />
    <!-- <Settings /> -->
  </v-app>
</template>

<script>
import AppBar from "@/components/AppBar.vue";
import NavDrawer from "@/components/NavDrawer.vue";
import Content from "@/components/Content.vue";
// import Settings from "@/components/Settings.vue";

export default {
  name: "Dashboard",

  components: {
    AppBar,
    NavDrawer,
    Content,
    // Settings
  },

  data() {
    return {
      expandOnHover: false
    };
  }
};
</script>
