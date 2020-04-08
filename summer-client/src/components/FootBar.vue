<template>
  <sui-segment id="foot-bar" inverted vertical>
    <sui-container textAlign="center">
      <sui-grid divided class="inverted">
        <sui-grid-row>
          <sui-grid-column :width="3">
            <sui-list link inverted>
              <sui-list-item>
                <sui-image src="/static/images/qrcode.png" size="tiny" rounded />
              </sui-list-item>
            </sui-list>
          </sui-grid-column>

          <sui-grid-column :width="3">
            <h4 is="sui-header" inverted>巴拉巴拉</h4>
            <sui-list link inverted>
              <router-link is="sui-list-item" to="/">Semantic</router-link>
              <router-link is="sui-list-item" to="/">Semantic</router-link>
              <router-link is="sui-list-item" to="/">Semantic</router-link>
            </sui-list>
          </sui-grid-column>

          <sui-grid-column :width="3">
            <h4 is="sui-header" inverted>巴拉巴拉</h4>
            <sui-list link inverted>
              <router-link is="sui-list-item" to="/">Semantic</router-link>
              <router-link is="sui-list-item" to="/">Semantic</router-link>
              <router-link is="sui-list-item" to="/">Semantic</router-link>
            </sui-list>
          </sui-grid-column>

          <sui-grid-column :width="7">
            <h4 is="sui-header" inverted>巴拉巴拉</h4>
            <p>jiaosnoijaoi joiasj jiaonjo ajoaint jioat</p>
          </sui-grid-column>
        </sui-grid-row>

        <sui-divider class="section" inverted />

        <sui-grid-row>
          <sui-grid-column>
            <p>2020</p>
          </sui-grid-column>
        </sui-grid-row>
      </sui-grid>
    </sui-container>
  </sui-segment>
</template>

<script>
export default {
  name: "FootBar",
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
