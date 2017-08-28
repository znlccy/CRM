package com.gangyu.model;

import java.util.Date;

/**
 * @author Chencongye
 * @param null
 * @function 这是一个关怀信息model
 * @version 0.0.0.1
 */
public class CustomerCareInfo {
	
	/**
	 * 关怀编号
	 */
	private int careId;
	
	/**
	 * 客户编号
	 */
	private int customerId;
	
	/**
	 * 客户姓名
	 */
	private String customerName;
	
	/**
	 * 关怀主题
	 */
	private String careTheme;
	
	/**
	 * 关怀方式
	 */
	private String careWay;
	
	/**
	 * 关怀时间
	 */
	private Date careTime;
	
	/**
	 * 关怀备注
	 */
	private String careRemark;
	
	/**
	 * 下一次关怀时间
	 */ 
	private Date careNexttime;
	
	/**
	 * 关怀人
	 */
	private String carePeople;
	
	/**
	 * 是否有效
	 */
	private String isUsed;
	
	/**
	 * 生成默认构造方法
	 */
	public CustomerCareInfo() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * 生成相应的set和get方法
	 */
	public int getCareId() {
		return careId;
	}

	public void setCareId(int careId) {
		this.careId = careId;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCareTheme() {
		return careTheme;
	}

	public void setCareTheme(String careTheme) {
		this.careTheme = careTheme;
	}

	public String getCareWay() {
		return careWay;
	}

	public void setCareWay(String careWay) {
		this.careWay = careWay;
	}

	public Date getCareTime() {
		return careTime;
	}

	public void setCareTime(Date careTime) {
		this.careTime = careTime;
	}

	public String getCareRemark() {
		return careRemark;
	}

	public void setCareRemark(String careRemark) {
		this.careRemark = careRemark;
	}

	public Date getCareNexttime() {
		return careNexttime;
	}

	public void setCareNexttime(Date careNexttime) {
		this.careNexttime = careNexttime;
	}

	public String getCarePeople() {
		return carePeople;
	}

	public void setCarePeople(String carePeople) {
		this.carePeople = carePeople;
	}

	public String getIsUsed() {
		return isUsed;
	}

	public void setIsUsed(String isUsed) {
		this.isUsed = isUsed;
	}
	
}
