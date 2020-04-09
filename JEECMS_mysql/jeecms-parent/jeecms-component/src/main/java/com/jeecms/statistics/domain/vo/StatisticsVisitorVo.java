/**   
 * @Copyright:  江西金磊科技发展有限公司  All rights reserved.Notice 仅限于授权后使用，禁止非授权传阅以及私自用于商业目的。
 */

package com.jeecms.statistics.domain.vo;

import java.math.BigDecimal;

/**
 * 访客分析VO
 * 
 * @author: ljw
 * @date: 2019年6月27日 上午11:44:50
 */
public class StatisticsVisitorVo {

	/** 名称 **/
	private String type;
	/** 次数 **/
	private Integer value;
	/** 所占比例 **/
	private BigDecimal decimal;

	public StatisticsVisitorVo() {

	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Integer getValue() {
		return value;
	}

	public void setValue(Integer value) {
		this.value = value;
	}

	public BigDecimal getDecimal() {
		return decimal;
	}

	public void setDecimal(BigDecimal decimal) {
		this.decimal = decimal;
	}

}
