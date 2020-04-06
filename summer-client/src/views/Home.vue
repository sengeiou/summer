<template>
  <div id="home">
    <nav-bar />
  </div>
</template>

<script>
import NavBar from "@/components/NavBar.vue";

export default {
  name: "Home",
  components: {
    "nav-bar": NavBar
  }
};
</script>
