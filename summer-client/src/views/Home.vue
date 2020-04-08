<template>
  <div id="home">
    <nav-bar />
    <router-view />
    <foot-bar />
  </div>
</template>

<script>
import NavBar from "@/components/NavBar.vue";
import FootBar from "@/components/FootBar.vue";

export default {
  name: "Home",
  components: {
    "nav-bar": NavBar,
    "foot-bar": FootBar
  }
};
</script>
