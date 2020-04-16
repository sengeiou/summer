<template>
  <div id="app">
    <router-view />
  </div>
</template>

<script>
import { mapMutations } from "vuex";

import { SET_AUTHENTICATION } from "@/store";

export default {
  name: "App",

  methods: {
    ...mapMutations({
      setAuthentication: SET_AUTHENTICATION
    })
  },

  created() {
    this.setAuthentication();
  }
};
</script>
