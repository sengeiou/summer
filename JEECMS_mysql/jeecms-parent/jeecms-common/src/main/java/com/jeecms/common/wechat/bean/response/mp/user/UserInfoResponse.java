package com.jeecms.common.wechat.bean.response.mp.user;

import java.util.List;

import com.jeecms.common.wechat.bean.response.mp.BaseResponse;

/**
 * {@link}https://api.weixin.qq.com/cgi-bin/user/info?access_token=ACCESS_TOKEN&openid=OPENID&lang=zh_CN
 * @Description:通过OpenID来获取用户基本信息的返回参数
 * @author: ljw
 * @date:   2018年7月30日 上午10:05:29     
 * @Copyright:  江西金磊科技发展有限公司  All rights reserved. 
 * Notice 仅限于授权后使用，禁止非授权传阅以及私自用于商业目的。
 */
public class UserInfoResponse extends  BaseResponse{

	/**用户是否订阅该公众号标识，值为0时，代表此用户没有关注该公众号，拉取不到其余信息。**/
	private Integer subscribe;
	/**用户的标识，对当前公众号唯一**/
	private String openid;
	/**用户的昵称**/
	private String nickname;
	/**用户的性别，值为1时是男性，值为2时是女性，值为0时是未知**/
	private Integer sex;
	/**用户所在城市**/
	private String city;
	/**用户所在国家**/
	private String country;
	/**用户所在省份**/
	private String province;
	/**用户的语言，简体中文为zh_CN**/
	private String language;
	/**用户头像，最后一个数值代表正方形头像大小（有0、46、64、96、132数值可选，0代表640*640正方形头像），用户没有头像时该项为空。若用户更换头像，原有头像URL将失效。**/
	private String headimgurl;
	/**用户关注时间，为时间戳。如果用户曾多次关注，则取最后关注时间**/
	private Long subscribeTime;
	/**只有在用户将公众号绑定到微信开放平台帐号后，才会出现该字段。**/
	private String unionid;
	/**公众号运营者对粉丝的备注，公众号运营者可在微信公众平台用户管理界面对粉丝添加备注**/
	private String remark;
	/**用户所在的分组ID（兼容旧的用户分组接口）**/
	private Integer groupid;
	/**用户被打上的标签ID列表**/
	private List<Integer> tagidList;
	/**返回用户关注的渠道来源**/
	private String subscribeScene;
	/**二维码扫码场景（开发者自定义）**/
	private Integer qrScene;
	/**二维码扫码场景描述（开发者自定义）**/
	private String qrSceneStr;
	
	public Integer getSubscribe() {
		return subscribe;
	}
	public void setSubscribe(Integer subscribe) {
		this.subscribe = subscribe;
	}
	public String getOpenid() {
		return openid;
	}
	public void setOpenid(String openid) {
		this.openid = openid;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public Integer getSex() {
		return sex;
	}
	public void setSex(Integer sex) {
		this.sex = sex;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public String getHeadimgurl() {
		return headimgurl;
	}
	public void setHeadimgurl(String headimgurl) {
		this.headimgurl = headimgurl;
	}
	public Long getSubscribeTime() {
		return subscribeTime;
	}
	public void setSubscribeTime(Long subscribeTime) {
		this.subscribeTime = subscribeTime;
	}
	public String getUnionid() {
		return unionid;
	}
	public void setUnionid(String unionid) {
		this.unionid = unionid;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public Integer getGroupid() {
		return groupid;
	}
	public void setGroupid(Integer groupid) {
		this.groupid = groupid;
	}
	public List<Integer> getTagidList() {
		return tagidList;
	}
	public void setTagidList(List<Integer> tagidList) {
		this.tagidList = tagidList;
	}
	public String getSubscribeScene() {
		return subscribeScene;
	}
	public void setSubscribeScene(String subscribeScene) {
		this.subscribeScene = subscribeScene;
	}
	public Integer getQrScene() {
		return qrScene;
	}
	public void setQrScene(Integer qrScene) {
		this.qrScene = qrScene;
	}
	public String getQrSceneStr() {
		return qrSceneStr;
	}
	public void setQrSceneStr(String qrSceneStr) {
		this.qrSceneStr = qrSceneStr;
	}
	
	
}
