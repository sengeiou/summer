(window["webpackJsonp"]=window["webpackJsonp"]||[]).push([["pages-personal-user-details"],{"0a9e":function(e,t,a){"use strict";var i=a("c1c2"),n=a.n(i);n.a},2000:function(e,t,a){t=e.exports=a("2350")(!1),t.push([e.i,'@charset "UTF-8";\n/**\r\n * 这里是uni-app内置的常用样式变量\r\n *\r\n * uni-app 官方扩展插件及插件市场（https://ext.dcloud.net.cn）上很多三方插件均使用了这些样式变量\r\n * 如果你是插件开发者，建议你使用scss预处理，并在插件代码中直接使用这些变量（无需 import 这个文件），方便用户通过搭积木的方式开发整体风格一致的App\r\n *\r\n */\n/**\r\n * 如果你是App开发者（插件使用者），你可以通过修改这些变量来定制自己的插件主题，实现自定义主题功能\r\n *\r\n * 如果你的项目同样使用了scss预处理，你也可以直接在你的 scss 代码中使用如下变量，同时无需 import 这个文件\r\n */\n/* 颜色变量 */\n/* 行为相关颜色 */\n/* 文字基本颜色 */\n/* 背景颜色 */\n/* 边框颜色 */\n/* 尺寸变量 */\n/* 文字尺寸 */\n/* 图片尺寸 */\n/* Border Radius */\n/* 水平间距 */\n/* 垂直间距 */\n/* 透明度 */\n/* 文章场景相关 */.uni-popup[data-v-25c9447e]{position:fixed;top:0;bottom:0;left:0;right:0;z-index:998;overflow:hidden}.uni-popup__mask[data-v-25c9447e]{position:absolute;top:0;bottom:0;left:0;right:0;z-index:998;background:rgba(0,0,0,.4);opacity:0}.uni-popup__mask.ani[data-v-25c9447e]{-webkit-transition:all .3s;-o-transition:all .3s;transition:all .3s}.uni-popup__mask.uni-bottom[data-v-25c9447e],.uni-popup__mask.uni-center[data-v-25c9447e],.uni-popup__mask.uni-top[data-v-25c9447e]{opacity:1}.uni-popup__wrapper[data-v-25c9447e]{position:absolute;z-index:999;-webkit-box-sizing:border-box;box-sizing:border-box}.uni-popup__wrapper.ani[data-v-25c9447e]{-webkit-transition:all .3s;-o-transition:all .3s;transition:all .3s}.uni-popup__wrapper.top[data-v-25c9447e]{top:0;left:0;width:100%;-webkit-transform:translateY(-100%);-ms-transform:translateY(-100%);transform:translateY(-100%)}.uni-popup__wrapper.bottom[data-v-25c9447e]{bottom:0;left:0;width:100%;-webkit-transform:translateY(100%);-ms-transform:translateY(100%);transform:translateY(100%)}.uni-popup__wrapper.center[data-v-25c9447e]{width:100%;height:100%;display:-webkit-box;display:-webkit-flex;display:-ms-flexbox;display:flex;-webkit-box-pack:center;-webkit-justify-content:center;-ms-flex-pack:center;justify-content:center;-webkit-box-align:center;-webkit-align-items:center;-ms-flex-align:center;align-items:center;-webkit-transform:scale(1.2);-ms-transform:scale(1.2);transform:scale(1.2);opacity:0}.uni-popup__wrapper-box[data-v-25c9447e]{position:relative;-webkit-box-sizing:border-box;box-sizing:border-box}.uni-popup__wrapper.uni-custom .uni-popup__wrapper-box[data-v-25c9447e]{border-radius:%?10?%;padding:%?40?% 0;background-color:#fff}.uni-popup__wrapper.uni-custom.center .uni-popup__wrapper-box[data-v-25c9447e]{position:relative;max-width:80%;max-height:80%;overflow-y:scroll}.uni-popup__wrapper.uni-custom.bottom .uni-popup__wrapper-box[data-v-25c9447e],.uni-popup__wrapper.uni-custom.top .uni-popup__wrapper-box[data-v-25c9447e]{width:100%;max-height:500px;overflow-y:scroll}.uni-popup__wrapper.uni-bottom[data-v-25c9447e],.uni-popup__wrapper.uni-top[data-v-25c9447e]{-webkit-transform:translateY(0);-ms-transform:translateY(0);transform:translateY(0)}.uni-popup__wrapper.uni-center[data-v-25c9447e]{-webkit-transform:scale(1);-ms-transform:scale(1);transform:scale(1);opacity:1}',""])},"2ada":function(e,t,a){"use strict";a.r(t);var i=a("3643"),n=a("dac9");for(var s in n)"default"!==s&&function(e){a.d(t,e,function(){return n[e]})}(s);a("0a9e");var o=a("2877"),r=Object(o["a"])(n["default"],i["a"],i["b"],!1,null,"240aebf8",null);t["default"]=r.exports},"2e1d":function(e,t,a){"use strict";Object.defineProperty(t,"__esModule",{value:!0}),t.default=void 0;var i={name:"UniPopup",props:{animation:{type:Boolean,default:!0},type:{type:String,default:"center"},custom:{type:Boolean,default:!1},maskClick:{type:Boolean,default:!0},show:{type:Boolean,default:!0}},data:function(){return{ani:"",showPopup:!1}},watch:{show:function(e){e?this.open():this.close()}},created:function(){},methods:{clear:function(){},open:function(){var e=this;this.$emit("change",{show:!0}),this.showPopup=!0,this.$nextTick(function(){setTimeout(function(){e.ani="uni-"+e.type},30)})},close:function(e){var t=this;!this.maskClick&&e||(this.$emit("change",{show:!1}),this.ani="",this.$nextTick(function(){setTimeout(function(){t.showPopup=!1},300)}))}}};t.default=i},3643:function(e,t,a){"use strict";var i=function(){var e=this,t=e.$createElement,a=e._self._c||t;return a("v-uni-view",{staticClass:"content user-details"},[a("page-head",{attrs:{pageTitle:"个人信息",title:e.operateText},on:{click:function(t){t=e.$handleEvent(t),e.operate()}}}),a("v-uni-view",{staticClass:"header"},[e.detailsData.headerImg&&e.detailsData.headerImg.url?a("v-uni-view",{staticClass:"header-img",style:"background-image: url("+e._data.$baseUrl+e.detailsData.headerImg.url+");",on:{click:function(t){t=e.$handleEvent(t),e.showShadow(t)}}},[a("v-uni-view",{staticClass:"header-camera",staticStyle:{"background-image":"url('static/img/icon/xiangji.png')"}})],1):a("v-uni-view",{staticClass:"header-img",staticStyle:{"background-image":"url('static/img/icon/yidenglu.png')"},on:{click:function(t){t=e.$handleEvent(t),e.showShadow(t)}}},[a("v-uni-view",{staticClass:"header-camera",staticStyle:{"background-image":"url('static/img/icon/xiangji.png')"}})],1)],1),a("v-uni-view",{staticClass:"divide"}),a("uni-popup",{ref:"popup",staticClass:"popup-box",attrs:{type:"center"}},[a("v-uni-view",{staticClass:"header-title Medium"},[e._v("选择头像")]),a("v-uni-view",{staticClass:"Kerley"}),a("v-uni-view",{staticClass:"header-alter Regular",on:{click:function(t){t=e.$handleEvent(t),e.take()}}},[e._v("拍照")]),a("v-uni-view",{staticClass:"Kerley"}),a("v-uni-view",{staticClass:"header-alter Regular",on:{click:function(t){t=e.$handleEvent(t),e.photo()}}},[e._v("从相册选择")])],1),a("v-uni-view",{staticClass:"details-from"},[a("v-uni-view",{staticClass:"details-list"},[a("v-uni-text",{staticClass:"details-label"},[e._v("真实姓名")]),a("v-uni-input",{class:e.isOperate?"darkColor":"simpleColor",attrs:{type:"text",disabled:!e.isOperate,maxlength:e.realnameMax,placeholder:e.realnamePla},model:{value:e.detailsData.realname,callback:function(t){e.$set(e.detailsData,"realname",t)},expression:"detailsData.realname"}})],1),a("v-uni-view",{staticClass:"details-list"},[a("v-uni-text",{staticClass:"details-label"},[e._v("性别")]),a("v-uni-label",{staticClass:"radio"},[a("v-uni-radio-group",{on:{change:function(t){t=e.$handleEvent(t),e.radioChange(t)}}},[a("v-uni-label",{staticClass:"radio"},[a("v-uni-radio",{attrs:{disabled:!e.isOperate,value:"1",checked:1==e.detailsData.isGender}}),a("v-uni-text",{class:e.isOperate?"darkColor":"simpleColor"},[e._v("男")])],1),a("v-uni-label",{staticClass:"radio"},[a("v-uni-radio",{attrs:{disabled:!e.isOperate,value:"2",checked:2==e.detailsData.isGender}}),a("v-uni-text",{class:e.isOperate?"darkColor":"simpleColor"},[e._v("女")])],1)],1)],1)],1),a("v-uni-view",{staticClass:"details-list"},[a("v-uni-text",{staticClass:"details-label"},[e._v("手机号")]),a("v-uni-input",{class:e.isOperate?"darkColor":"simpleColor",attrs:{type:"text",disabled:!e.isOperate,maxlength:e.telephoneMax,placeholder:e.telephonePla},model:{value:e.detailsData.telephone,callback:function(t){e.$set(e.detailsData,"telephone",t)},expression:"detailsData.telephone"}})],1),a("v-uni-view",{staticClass:"details-list"},[a("v-uni-text",{staticClass:"details-label"},[e._v("个性签名")]),a("v-uni-input",{class:e.isOperate?"darkColor":"simpleColor",attrs:{type:"text",disabled:!e.isOperate,maxlength:e.signMax,placeholder:e.signPla},model:{value:e.detailsData.sign,callback:function(t){e.$set(e.detailsData,"sign",t)},expression:"detailsData.sign"}})],1)],1)],1)},n=[];a.d(t,"a",function(){return i}),a.d(t,"b",function(){return n})},5190:function(e,t,a){"use strict";a.r(t);var i=a("2e1d"),n=a.n(i);for(var s in i)"default"!==s&&function(e){a.d(t,e,function(){return i[e]})}(s);t["default"]=n.a},"54c3":function(e,t,a){"use strict";a.r(t);var i=a("7720"),n=a("5190");for(var s in n)"default"!==s&&function(e){a.d(t,e,function(){return n[e]})}(s);a("56b1");var o=a("2877"),r=Object(o["a"])(n["default"],i["a"],i["b"],!1,null,"25c9447e",null);t["default"]=r.exports},"55cd":function(e,t,a){var i=a("2000");"string"===typeof i&&(i=[[e.i,i,""]]),i.locals&&(e.exports=i.locals);var n=a("4f06").default;n("099973c2",i,!0,{sourceMap:!1,shadowMode:!1})},"56b1":function(e,t,a){"use strict";var i=a("55cd"),n=a.n(i);n.a},"69f1":function(e,t,a){t=e.exports=a("2350")(!1),t.push([e.i,'@charset "UTF-8";\n/**\r\n * 这里是uni-app内置的常用样式变量\r\n *\r\n * uni-app 官方扩展插件及插件市场（https://ext.dcloud.net.cn）上很多三方插件均使用了这些样式变量\r\n * 如果你是插件开发者，建议你使用scss预处理，并在插件代码中直接使用这些变量（无需 import 这个文件），方便用户通过搭积木的方式开发整体风格一致的App\r\n *\r\n */\n/**\r\n * 如果你是App开发者（插件使用者），你可以通过修改这些变量来定制自己的插件主题，实现自定义主题功能\r\n *\r\n * 如果你的项目同样使用了scss预处理，你也可以直接在你的 scss 代码中使用如下变量，同时无需 import 这个文件\r\n */\n/* 颜色变量 */\n/* 行为相关颜色 */\n/* 文字基本颜色 */\n/* 背景颜色 */\n/* 边框颜色 */\n/* 尺寸变量 */\n/* 文字尺寸 */\n/* 图片尺寸 */\n/* Border Radius */\n/* 水平间距 */\n/* 垂直间距 */\n/* 透明度 */\n/* 文章场景相关 */.content.user-details[data-v-240aebf8]{width:100%}.content.user-details .header[data-v-240aebf8]{width:100%;padding:%?60?% 0 %?60?%}.content.user-details .header .header-img[data-v-240aebf8]{width:%?150?%;height:%?150?%;margin:0 auto;border-radius:50%;background-size:cover;background-position:50%;background-repeat:no-repeat;position:relative}.content.user-details .header .header-img .header-camera[data-v-240aebf8]{position:absolute;bottom:0;right:0;background-color:#fff;background-position:50%;background-repeat:no-repeat;background-size:60%;width:%?50?%;height:%?50?%;border-radius:50%}.content.user-details .divide[data-v-240aebf8]{width:100%;height:%?20?%;background-color:#f5f5fa}.content.user-details .popup-box .header-title[data-v-240aebf8]{width:%?400?%;height:%?100?%;line-height:%?100?%;color:#333;font-size:%?32?%;text-align:center}.content.user-details .popup-box .Kerley[data-v-240aebf8]{width:%?320?%;margin:0 auto;height:%?2?%;background-color:#fafafa}.content.user-details .popup-box .header-alter[data-v-240aebf8]{width:%?400?%;height:%?80?%;line-height:%?80?%;color:#333;font-size:%?28?%;text-align:center}.content.user-details .popup-box .header-alter[data-v-240aebf8]:hover{background-color:#e6e6e6;color:#e30b20}.content.user-details .details-from[data-v-240aebf8]{padding:0 %?40?%}.content.user-details .details-from .details-list[data-v-240aebf8]{height:%?100?%;line-height:%?100?%;display:-webkit-box;display:-webkit-flex;display:-ms-flexbox;display:flex;width:100%;border-bottom:%?1?% solid #f0f0f0}.content.user-details .details-from .details-list .details-label[data-v-240aebf8]{width:%?168?%;color:#999;font-size:%?26?%}.content.user-details .details-from .details-list uni-input[data-v-240aebf8]{width:%?500?%;height:%?100?%;line-height:%?100?%}.content.user-details .simpleColor[data-v-240aebf8]{color:#666}.content.user-details .darkColor[data-v-240aebf8]{color:#333}',""])},7720:function(e,t,a){"use strict";var i=function(){var e=this,t=e.$createElement,a=e._self._c||t;return e.showPopup?a("v-uni-view",{staticClass:"uni-popup"},[a("v-uni-view",{staticClass:"uni-popup__mask",class:[e.ani,e.animation?"ani":"",e.custom?"":"uni-custom"],on:{click:function(t){t=e.$handleEvent(t),e.close(!0)}}}),a("v-uni-view",{staticClass:"uni-popup__wrapper",class:[e.type,e.ani,e.animation?"ani":"",e.custom?"":"uni-custom"],on:{click:function(t){t=e.$handleEvent(t),e.close(!0)}}},[a("v-uni-view",{staticClass:"uni-popup__wrapper-box",on:{click:function(t){t.stopPropagation(),t=e.$handleEvent(t),e.clear(t)}}},[e._t("default")],2)],1)],1):e._e()},n=[];a.d(t,"a",function(){return i}),a.d(t,"b",function(){return n})},c1c2:function(e,t,a){var i=a("69f1");"string"===typeof i&&(i=[[e.i,i,""]]),i.locals&&(e.exports=i.locals);var n=a("4f06").default;n("635ed901",i,!0,{sourceMap:!1,shadowMode:!1})},d4f5:function(e,t,a){"use strict";var i=a("288e");Object.defineProperty(t,"__esModule",{value:!0}),t.default=void 0,a("7f7f"),a("c5f6");var n=i(a("54c3")),s={name:"userDetails",components:{uniPopup:n.default},data:function(){return{operateText:"编辑",levelIcon:"",isOperate:!1,Memberinfo:{},detailsData:{headerImg:{url:""},realname:"",isGender:1,sign:"",telephone:""},realnamePla:"",telephonePla:"",signPla:"",rules:{telephone:[this.$rules.required("请输入手机号"),this.$rules.mobile()],realname:[this.$rules.required("请输入真实姓名")],sign:[],isGender:[this.$rules.required("请输入选择")]},signMax:null,realnameMax:null,telephoneMax:null}},mounted:function(){this.fetchMemberinfo()},methods:{fetchMemberinfo:function(){var e=this;this.$request.fetchMemberinfo().then(function(t){200==t.code&&(e.detailsData=t.data.dataField,e.detailsData.gender.value&&(e.detailsData.isGender=e.detailsData.gender.value),e.levelIcon=t.data.levelIcon,e.Memberinfo=t.data,e.putPlaceholder())})},operate:function(){this.isOperate?this.finish():(this.operateText="完成",this.isOperate=!0)},finish:function(){var e=this;this.$rules.validator(this.detailsData,this.rules).then(function(){e.$request.fetchMemberinfoPut({telephone:e.detailsData.telephone,realname:e.detailsData.realname,json:{sign:e.detailsData.sign,gender:{value:Number(e.detailsData.isGender)}}}).then(function(t){200==t.code?(e.$message("修改个人信息成功"),e.operateText="编辑",e.isOperate=!1):e.$message(t.message)})}).catch(function(t){e.$message(t)})},showShadow:function(){this.$refs.popup.open()},take:function(){var e=this;uni.chooseImage({count:1,sizeType:["original","compressed"],sourceType:["camera"],success:function(t){var a=t.tempFilePaths;uni.uploadFile({url:"http://192.168.0.200:8700/member/upload/o_upload",filePath:a[0],name:"uploadFile",formData:{addToRes:!0,"JEECMS-Auth-Token":localStorage.getItem("JEECMS-Auth-Token"),"Redirect-Header":!1,"Content-Type":"application/json"},success:function(t){var a=JSON.parse(t.data);200==a.code&&(e.detailsData.headerImg={},e.detailsData.headerImg.url="",e.detailsData.headerImg.url=a.data.fileUrl,e.fetchMemberinfoCustom(a.data.resourceId))}})}})},photo:function(){var e=this;uni.chooseImage({count:1,sizeType:["original","compressed"],sourceType:["album"],success:function(t){var a=t.tempFilePaths;uni.uploadFile({url:"http://192.168.0.200:8700/member/upload/o_upload",filePath:a[0],name:"uploadFile",formData:{addToRes:!0,"JEECMS-Auth-Token":localStorage.getItem("JEECMS-Auth-Token"),"Redirect-Header":!1,"Content-Type":"application/json"},success:function(t){var a=JSON.parse(t.data);200==a.code&&(e.detailsData.headerImg={},e.detailsData.headerImg.url="",e.detailsData.headerImg.url=a.data.fileUrl,e.fetchMemberinfoCustom(a.data.resourceId))}})}})},fetchMemberinfoCustom:function(e){var t=this;e+="",this.$request.fetchMemberinfoCustom({attrName:"headerImg",attrValue:e,attrType:"imageUpload"}).then(function(e){200==e.code?(t.$message("上传头像成功"),t.$refs.popup.close()):t.$message(e.message)})},putPlaceholder:function(){for(var e=this.Memberinfo.renderingField.formListBase,t=0;t<e.length;t++)"realname"==e[t].value.name?(this.realnamePla=e[t].value.tip,this.realnameMax=e[t].value.max):"telephone"==e[t].value.name?(this.telephonePla=e[t].value.tip,this.telephoneMax=e[t].value.max):"sign"==e[t].value.name&&(this.signPla=e[t].value.tip,this.signMax=e[t].value.max)},radioChange:function(e){this.isOperate&&(this.detailsData.isGender=e.target.value)}}};t.default=s},dac9:function(e,t,a){"use strict";a.r(t);var i=a("d4f5"),n=a.n(i);for(var s in i)"default"!==s&&function(e){a.d(t,e,function(){return i[e]})}(s);t["default"]=n.a}}]);