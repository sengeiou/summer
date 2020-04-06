<template>
  <sui-segment id="nav-bar" inverted attached>
    <sui-container>
      <sui-menu inverted secondary>
        <h3 is="sui-menu-item" header class="ui teal">博客</h3>
        <router-link is="sui-menu-item" v-for="item in items" :key="item.name" :to="item.to">
          <sui-icon :name="item.icon" />{{ item.name }}
        </router-link>
        <h3 is="sui-menu-item" position="right">博客</h3>
      </sui-menu>
    </sui-container>
  </sui-segment>
</template>

<script>
export default {
  name: "NavBar",
  data() {
    return {
      active: "Home",
      items: [
        { name: "首页", to: "/ok", icon: "home" },
        { name: "分类", to: "/ok", icon: "idea" },
        { name: "标签", to: "/ok", icon: "tags" },
        { name: "关于我", to: "/ok22", icon: "info" }
      ]
    };
  },
  props: {
    msg: String
  }
};
</script>

<style scoped>
</style>
