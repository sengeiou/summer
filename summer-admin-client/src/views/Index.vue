<template>
  <v-app>
     <app-bar />
<!--
    <dashboard-core-drawer />

    <dashboard-core-view />

    <dashboard-core-settings /> -->
  </v-app>
</template>

<script>
  export default {
    name: 'Index',

    components: {
      'app-bar': () => import('@/components/AppBar'),
      // DashboardCoreDrawer: () => import('./components/core/Drawer'),
      // DashboardCoreSettings: () => import('./components/core/Settings'),
      // DashboardCoreView: () => import('./components/core/View'),
    },

    data: () => ({
      expandOnHover: false,
    }),
  }
</script>
