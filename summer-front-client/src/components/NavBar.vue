<template>
  <b-navbar toggleable="lg" type="dark" variant="dark" fixed="top" id="nav-bar">
    <b-container>

      <b-navbar-brand to="/">Company</b-navbar-brand>

      <b-navbar-toggle target="navbarResponsive" />
      <b-collapse id="navbarResponsive" is-nav>
        <b-navbar-nav class="ml-auto">
          <b-nav-item v-for="item in items"
                      :key="item.name" :to="item.to"
                      :active="item.name === active">
            {{ item.name }}
          </b-nav-item>
        </b-navbar-nav>
      </b-collapse>

    </b-container>
  </b-navbar>
</template>

<script>
export default {
  name: "NavBar",
  data() {
    return {
      active: "Homepage",
      items: [
        { name: "Homepage", to: "/" },
        { name: "About", to: "/about" },
        { name: "Products", to: "/products" },
        { name: "Contacts", to: "/contacts" }
      ]
    };
  },
  props: {
    msg: String
  }
};
</script>
