<template>
  <div id="blog-overview">
    <sui-segment attached="top">
      <sui-grid :columns="2" textAlign="middle">
        <sui-grid-column>
          <h3 is="sui-header">博客</h3>
        </sui-grid-column>
        <sui-grid-column textAlign="right">
          共<h3 is="sui-header" color="orange" style="display: inline-block">14</h3>篇
        </sui-grid-column>
      </sui-grid>
    </sui-segment>

    <sui-segment attached>
      <sui-grid :columns="2" textAlign="middle">
        <sui-grid-column>
          <h3 is="sui-header">博客</h3>
        </sui-grid-column>
        <sui-grid-column textAlign="right">
          共<h3 is="sui-header" color="orange" style="display: inline-block">14</h3>篇
        </sui-grid-column>
      </sui-grid>
    </sui-segment>

    <sui-segment attached>
      <sui-grid :columns="2" textAlign="middle">
        <sui-grid-column>
          <router-link to="/" is="sui-button" color="teal" basic size="mini">上一页</router-link>
        </sui-grid-column>
        <sui-grid-column textAlign="right">
          <router-link to="/" is="sui-button" color="teal" basic size="mini">下一页</router-link>
        </sui-grid-column>
      </sui-grid>
    </sui-segment>
  </div>
</template>

<script>
export default {
  name: "BlogOverview",
  props: {
    msg: String
  }
};
</script>

<style scoped>
#foot-bar {
  padding-top: 5em !important;
  padding-bottom: 5em !important;
}
</style>
