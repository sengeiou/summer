<template>
  <v-app id="login">
    <v-content>
      <v-container class="fill-height" fluid>
        <v-row align="center" justify="center">
          <v-col cols="12" sm="8" md="4">
            <v-card class="elevation-12">

              <v-toolbar color="primary" dark flat>
                <v-toolbar-title>登录</v-toolbar-title>
              </v-toolbar>

              <v-card-text>
                <v-form>
                  <v-text-field label="用户名" type="text" name="username" />
                  <v-text-field id="password" label="密码" type="password" name="password" />
                </v-form>
              </v-card-text>

              <v-card-actions>
                <v-spacer />
                <v-btn color="primary">登录</v-btn>
              </v-card-actions>

            </v-card>
          </v-col>
        </v-row>
      </v-container>
    </v-content>
  </v-app>
</template>

<script>
import tokenService from "@/services/token-service";
import SET_AUTHENTICATION from "@/store.js";
import { mapMutations } from "vuex";

export default {
  name: "Login",

  props: {
    source: String
  },

  data() {
    return {
      auth: {
        username: "",
        password: ""
      }
    };
  },

  methods: {
    ...mapMutations({
      setAuthentication: SET_AUTHENTICATION
    }),
    login() {
      var tokenPromise = tokenService.getToken(this.auth);
      tokenPromise.then().catch();
      this.setAuthentication();
    }
  }
};
</script>
