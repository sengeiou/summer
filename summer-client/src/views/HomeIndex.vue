<template>
  <div id="home-index">
    <sui-container>
      <sui-grid>
        <sui-grid-column :width="11">
          <blog-overview />
        </sui-grid-column>

        <sui-grid-column :width="5">
          <h4 is="sui-header" inverted>巴拉巴拉</h4>
          <sui-list link inverted>
            <router-link is="sui-list-item" to="/">Semantic</router-link>
            <router-link is="sui-list-item" to="/">Semantic</router-link>
            <router-link is="sui-list-item" to="/">Semantic</router-link>
          </sui-list>
        </sui-grid-column>
      </sui-grid>
    </sui-container>
  </div>
</template>

<script>
import BlogOverview from "@/components/BlogOverview.vue";

export default {
  name: "HomeIndex",
  props: {
    msg: String
  },
  components: {
    "blog-overview": BlogOverview
  }
};
</script>

<style scoped>
#home-index {
  padding-top: 3em !important;
  padding-bottom: 3em !important;
}
</style>
