<template>
  <v-navigation-drawer
                       id="nav-drawer"
                       v-model="drawer"
                       :dark="barColor !== 'rgba(228, 226, 226, 1), rgba(255, 255, 255, 0.7)'"
                       :expand-on-hover="expandOnHover"
                       :right="$vuetify.rtl"
                       :src="barImage"
                       mobile-break-point="960"
                       app
                       width="260"
                       v-bind="$attrs">

    <template v-slot:img="props">
      <v-img :gradient="`to bottom, ${barColor}`" v-bind="props" />
    </template>

    <template v-slot:default>

      <v-divider class="mb-1" />

      <v-list dense nav>
        <v-list-item>
          <v-list-item-avatar class="align-self-center" color="white" contain>
            <v-img src="https://demos.creative-tim.com/vuetify-material-dashboard/favicon.ico" max-height="30" />
          </v-list-item-avatar>
          <v-list-item-content>
            <v-list-item-title class="title" v-text="profile.title" style="line-height: normal" />
          </v-list-item-content>
        </v-list-item>
      </v-list>

      <v-divider class="mb-2" />

      <v-list expand nav>
        <template v-for="(item, i) in computedItems">
          <ListItemGroup v-if="item.children" :key="`group-${i}`" :item="item">
            <!--  -->
          </ListItemGroup>
          <ListItem v-else :key="`item-${i}`" :item="item" />
        </template>
      </v-list>

    </template>

    <!--
    <template v-slot:append>
      <ListItem :item="{ title: 'upgrade'/*$t('upgrade')*/, icon: 'mdi-package-up', to: '/upgrade'}" />
    </template>
     -->

  </v-navigation-drawer>
</template>

<script>
import { mapState } from "vuex";

import ListItem from "@/components/ListItem.vue";

export default {
  name: "NavDrawer",

  components: {
    ListItem
  },

  props: {
    expandOnHover: { type: Boolean, default: false }
  },

  data() {
    return {
      items: [
        {
          icon: "mdi-view-dashboard",
          title: "dashboard",
          to: "/"
        },
        {
          icon: "mdi-account",
          title: "user",
          to: "/pages/user"
        },
        {
          title: "rtables",
          icon: "mdi-clipboard-outline",
          to: "/tables/regular-tables"
        },
        {
          title: "typography",
          icon: "mdi-format-font",
          to: "/components/typography"
        },
        {
          title: "icons",
          icon: "mdi-chart-bubble",
          to: "/components/icons"
        },
        {
          title: "google",
          icon: "mdi-map-marker",
          to: "/maps/google-maps"
        },
        {
          title: "notifications",
          icon: "mdi-bell",
          to: "/components/notifications"
        }
      ]
    };
  },

  computed: {
    ...mapState(["barColor", "barImage"]),
    drawer: {
      get() {
        return this.$store.state.drawer;
      },
      set(val) {
        this.$store.commit("SET_DRAWER", val);
      }
    },
    computedItems() {
      return this.items.map(this.mapItem);
    },
    profile() {
      return {
        avatar: true,
        title: "Vuetify MD" //this.$t("avatar")
      };
    }
  },

  methods: {
    mapItem(item) {
      return {
        ...item,
        children: item.children ? item.children.map(this.mapItem) : undefined
        //title: this.$t(item.title)
      };
    }
  }
};
</script>

<style lang="sass">
  @import '~vuetify/src/styles/tools/_rtl.sass'

  #nav-drawer
    background-color: black

    .v-list-group__header.v-list-item--active:before
      opacity: .24

    .v-list-item
      &__icon--text,
      &__icon:first-child
        justify-content: center
        text-align: center
        width: 20px

        +ltr()
          margin-right: 24px
          margin-left: 12px !important

        +rtl()
          margin-left: 24px
          margin-right: 12px !important

    .v-list--dense
      .v-list-item
        &__icon--text,
        &__icon:first-child
          margin-top: 10px

    .v-list-group--sub-group
      .v-list-item
        +ltr()
          padding-left: 8px

        +rtl()
          padding-right: 8px

      .v-list-group__header
        +ltr()
          padding-right: 0

        +rtl()
          padding-right: 0

        .v-list-item__icon--text
          margin-top: 19px
          order: 0

        .v-list-group__header__prepend-icon
          order: 2

          +ltr()
            margin-right: 8px

          +rtl()
            margin-left: 8px
</style>
