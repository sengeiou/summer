<template>
  <v-content id="content">
    <router-view />
    <Footer />
  </v-content>
</template>

<script>
import Footer from "@/components/Footer.vue";

export default {
  name: "Content",

  components: {
    Footer
  }
};
</script>
