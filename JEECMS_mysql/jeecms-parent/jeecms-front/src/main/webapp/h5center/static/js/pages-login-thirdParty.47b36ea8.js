(window["webpackJsonp"]=window["webpackJsonp"]||[]).push([["pages-login-thirdParty"],{"075b":function(t,n,i){"use strict";i.r(n);var e=i("8d73"),a=i("a8cb");for(var o in a)"default"!==o&&function(t){i.d(n,t,function(){return a[t]})}(o);i("19fc");var r=i("2877"),d=Object(r["a"])(a["default"],e["a"],e["b"],!1,null,"2a9a9a76",null);n["default"]=d.exports},"12c8":function(t,n,i){var e=i("fd75");"string"===typeof e&&(e=[[t.i,e,""]]),e.locals&&(t.exports=e.locals);var a=i("4f06").default;a("323ba6a6",e,!0,{sourceMap:!1,shadowMode:!1})},"19fc":function(t,n,i){"use strict";var e=i("12c8"),a=i.n(e);a.a},"67c9":function(t,n,i){"use strict";Object.defineProperty(n,"__esModule",{value:!0}),n.default=void 0,i("28a5");var e=i("c9ca"),a={name:"thirdLogin",data:function(){return{thirdId:"",isCelerity:!0,thirdData:{},rapidUsername:"",boundPsw:"",boundUsername:""}},methods:{getUrlArg:function(t){console.log("search ?:"+window.location.hash.split("?")[1]);var n=window.location.hash.split("?")[1];console.log("url:"+n);var i=n.indexOf("="),e=n.substr(i+1,n.length);console.log(e),e?(this.thirdId=e,this.fetchThirdPartyInfo()):this.$message("获取用户信息失败")},fetchThirdPartyInfo:function(){var t=this;this.$request.fetchThirdPartyInfo({thidId:this.thirdId}).then(function(n){200==n.code?(t.thirdData=JSON.parse(n.data),t.rapidUsername=n.data.nickname,t.judge()):t.$message(n.message)})},judge:function(){this.thirdData.bind&&(localStorage.setItem("JEECMS-Auth-Token",this.thirdData["JEECMS-Auth-Token"]),uni.navigateTo({url:"/pages/personal/index/index"}))},rapidGo:function(){var t=this;this.$request.fetchThirdPartyBind({loginWay:1,loginType:this.thirdData.loginType,thirdId:this.thirdData.uid,nickname:this.thirdData.nickname,username:this.rapidUsername,psw:""}).then(function(n){200==n.code?(localStorage.setItem("JEECMS-Auth-Token",t.res.data["JEECMS-Auth-Token"]),uni.navigateTo({url:"/pages/personal/index/index"})):t.$message(n.message)})},boundGo:function(){var t=this;this.$request.fetchThirdPartyBind({loginWay:2,loginType:this.thirdData.loginType,thirdId:this.thirdData.uid,nickname:this.thirdData.nickname,username:this.boundUsername,psw:(0,e.desEncrypt)(this.boundPsw)}).then(function(n){200==n.code?(localStorage.setItem("JEECMS-Auth-Token",t.res.data["JEECMS-Auth-Token"]),uni.navigateTo({url:"/pages/personal/index/index"})):t.$message(n.message)})},onRapid:function(){this.isCelerity=!0},onNoRapid:function(){this.isCelerity=!1}},onShow:function(){this.getUrlArg("thirdId")}};n.default=a},"8d73":function(t,n,i){"use strict";var e=function(){var t=this,n=t.$createElement,i=t._self._c||n;return i("v-uni-view",{staticClass:"content thirdLogin"},[i("v-uni-view",{staticClass:"back"},[i("uni-icons",{staticClass:"iconfont iconfanhui",on:{click:function(n){n=t.$handleEvent(n),t.backLogin()}}})],1),i("v-uni-view",{staticClass:"third-cont"},[t.isCelerity?i("v-uni-view",{staticClass:"third-header"},[i("v-uni-text",{staticClass:"pitch-on",on:{click:function(n){n=t.$handleEvent(n),t.onRapid()}}},[t._v("快速登录")]),i("v-uni-text",{staticClass:"heder-two",on:{click:function(n){n=t.$handleEvent(n),t.onNoRapid()}}},[t._v("绑定账户")])],1):i("v-uni-view",{staticClass:"third-header"},[i("v-uni-text",{on:{click:function(n){n=t.$handleEvent(n),t.onRapid()}}},[t._v("快速登录")]),i("v-uni-text",{staticClass:"heder-two pitch-on",on:{click:function(n){n=t.$handleEvent(n),t.onNoRapid()}}},[t._v("绑定账户")])],1),t.isCelerity?i("v-uni-view",{staticClass:"celerity"},[i("v-uni-view",{staticClass:"Regular celerity-header"},[t._v("您在JEECMS新闻网的用户名为")]),i("v-uni-input",{staticClass:"Medium celerity-input",attrs:{type:"text",placeholder:"请输入昵称"},model:{value:t.rapidUsername,callback:function(n){t.rapidUsername=n},expression:"rapidUsername"}}),i("v-uni-button",{staticClass:"uni-button third-btn",attrs:{disabled:!t.rapidUsername},on:{click:function(n){n=t.$handleEvent(n),t.rapidGo(n)}}},[t._v("直接进入")])],1):t._e(),t.isCelerity?t._e():i("v-uni-view",{staticClass:"bound"},[i("v-uni-input",{staticClass:"Medium bound-input",attrs:{type:"text"},model:{value:t.boundUsername,callback:function(n){t.boundUsername=n},expression:"boundUsername"}}),i("v-uni-input",{staticClass:"Medium bound-input",attrs:{type:"password"},model:{value:t.boundPsw,callback:function(n){t.boundPsw=n},expression:"boundPsw"}}),i("v-uni-button",{staticClass:"uni-button bound-btn",attrs:{disabled:!t.boundUsername||!t.boundPsw},on:{click:function(n){n=t.$handleEvent(n),t.boundGo(n)}}},[t._v("绑定并登录")])],1)],1)],1)},a=[];i.d(n,"a",function(){return e}),i.d(n,"b",function(){return a})},a8cb:function(t,n,i){"use strict";i.r(n);var e=i("67c9"),a=i.n(e);for(var o in e)"default"!==o&&function(t){i.d(n,t,function(){return e[t]})}(o);n["default"]=a.a},fd75:function(t,n,i){n=t.exports=i("2350")(!1),n.push([t.i,'@charset "UTF-8";\n/**\r\n * 这里是uni-app内置的常用样式变量\r\n *\r\n * uni-app 官方扩展插件及插件市场（https://ext.dcloud.net.cn）上很多三方插件均使用了这些样式变量\r\n * 如果你是插件开发者，建议你使用scss预处理，并在插件代码中直接使用这些变量（无需 import 这个文件），方便用户通过搭积木的方式开发整体风格一致的App\r\n *\r\n */\n/**\r\n * 如果你是App开发者（插件使用者），你可以通过修改这些变量来定制自己的插件主题，实现自定义主题功能\r\n *\r\n * 如果你的项目同样使用了scss预处理，你也可以直接在你的 scss 代码中使用如下变量，同时无需 import 这个文件\r\n */\n/* 颜色变量 */\n/* 行为相关颜色 */\n/* 文字基本颜色 */\n/* 背景颜色 */\n/* 边框颜色 */\n/* 尺寸变量 */\n/* 文字尺寸 */\n/* 图片尺寸 */\n/* Border Radius */\n/* 水平间距 */\n/* 垂直间距 */\n/* 透明度 */\n/* 文章场景相关 */.content.thirdLogin .back[data-v-2a9a9a76]{padding-left:%?40?%;height:%?88?%;line-height:%?88?%;font-size:%?30?%;color:#999}.content.thirdLogin .third-cont[data-v-2a9a9a76]{padding:%?60?% %?110?%}.content.thirdLogin .third-cont .third-header[data-v-2a9a9a76]{display:-webkit-box;display:-webkit-flex;display:-ms-flexbox;display:flex;height:%?50?%;line-height:0;color:#666;font-size:%?40?%;font-weight:450}.content.thirdLogin .third-cont .third-header .pitch-on[data-v-2a9a9a76]{font-size:%?50?%;color:#333;font-weight:500}.content.thirdLogin .third-cont .third-header .heder-two[data-v-2a9a9a76]{margin-left:%?60?%}.content.thirdLogin .third-cont .celerity[data-v-2a9a9a76]{width:100%}.content.thirdLogin .third-cont .celerity .celerity-header[data-v-2a9a9a76]{margin-top:%?79?%;font-size:%?28?%;color:%?28?%;margin-bottom:%?6?%}.content.thirdLogin .third-cont .celerity .celerity-input[data-v-2a9a9a76]{width:100%;height:%?100?%;line-height:%?100?%;border-bottom:%?1?% solid #f0f0f0;color:#333;font-size:%?28?%}.content.thirdLogin .third-cont .celerity .third-btn[data-v-2a9a9a76]{width:%?458?%;height:%?86?%;line-height:%?86?%;font-size:%?30?%;color:#fff;margin:0 auto;margin-top:%?60?%;border-radius:%?43?%}.content.thirdLogin .third-cont .bound[data-v-2a9a9a76]{padding:%?27?% 0;width:100%}.content.thirdLogin .third-cont .bound .bound-input[data-v-2a9a9a76]{width:100%;height:%?120?%;line-height:%?120?%;border-bottom:%?1?% solid #f0f0f0;color:#333;font-size:%?28?%}.content.thirdLogin .third-cont .bound .bound-btn[data-v-2a9a9a76]{width:%?458?%;height:%?86?%;line-height:%?86?%;font-size:%?30?%;color:#fff;margin:0 auto;margin-top:%?60?%;border-radius:%?43?%}',""])}}]);