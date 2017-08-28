package com.gangyu.model;

import java.util.Date;

/**
 * @author Chencongye
 * @version 0.0.1
 * @introduce 这是客户信息实体类
 */

public class CustomerInfo {

	/**
	 * 客户应对的数目
	 */
	private int customerNum;
	
	/**
	 * 客户编号
	 */
	private int customerId;
	
	/**
	 * 客户状态编号
	 */
	private int conditionId;
	
	/**
	 * 客户状态
	 */
	private String customerCondition;
	
	/**
	 * 客户类型编号
	 */
	private int typeId;
	
	/**
	 * 客户类型
	 */
	private String customerType;
	
	/**
	 * 客户所属员工编号
	 */
	private int useId;
	
	/**
	 * 客户所属员工
	 */
	private String customerForUser;
	
	/**
	 * 客户来源编号
	 */
	private String customerSource;
	
	/**
	 * 客户姓名
	 */
	private String customerName;
	
	/**
	 * 客户性别
	 */
	private String customerSex;
	
	/**
	 * 客户手机号码
	 */
	private String customerMobile;
	
	/**
	 * 客户QQ号码
	 */
	private String customerQQ;
	
	/**
	 * 客户住址
	 */
	private String customerAddress;
	
	/**
	 * 客户邮箱
	 */
	private String customerEmail;
	
	/**
	 * 客户备注
	 */
	private String customerRemark;
	
	/**
	 * 客户职位
	 */
	private String customerJob;
	
	/**
	 * 客户微博
	 */
	private String customerBlog;
	
	/**
	 * 客户座机号码
	 */
	private String customerTel;
	
	/**
	 * 客户MSN
	 */
	private String customerMSN;
	
	/**
	 * 客户出生日期
	 */
	private Date customerBirthday;
	
	/**
	 * 客户添加时间
	 */
	private Date customerAddTime;
	
	/**
	 * 客户添加人
	 */
	private String customerAddMan;
	
	/**
	 * 客户修改时间
	 */
	private Date customerChangeTime;
	
	/**
	 * 客户修改人
	 */
	private String customerChangeMan;
	
	/**
	 * 客户所属公司
	 */
	private String customerCompany;
	
	/**
	 * 客户是否有效
	 */
	private String isUsed;
	
	/**
	 * 生成构造函数
	 */
	public CustomerInfo() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * 生成对应的set和get方法
	 */
	public int getCustomerNum() {
		return customerNum;
	}

	public void setCustomerNum(int customerNum) {
		this.customerNum = customerNum;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public int getConditionId() {
		return conditionId;
	}

	public void setConditionId(int conditionId) {
		this.conditionId = conditionId;
	}

	public String getCustomerCondition() {
		return customerCondition;
	}

	public void setCustomerCondition(String customerCondition) {
		this.customerCondition = customerCondition;
	}

	public int getTypeId() {
		return typeId;
	}

	public void setTypeId(int typeId) {
		this.typeId = typeId;
	}

	public String getCustomerType() {
		return customerType;
	}

	public void setCustomerType(String customerType) {
		this.customerType = customerType;
	}

	public int getUseId() {
		return useId;
	}

	public void setUseId(int useId) {
		this.useId = useId;
	}

	public String getCustomerForUser() {
		return customerForUser;
	}

	public void setCustomerForUser(String customerForUser) {
		this.customerForUser = customerForUser;
	}

	public String getCustomerSource() {
		return customerSource;
	}

	public void setCustomerSource(String customerSource) {
		this.customerSource = customerSource;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerSex() {
		return customerSex;
	}

	public void setCustomerSex(String customerSex) {
		this.customerSex = customerSex;
	}

	public String getCustomerMobile() {
		return customerMobile;
	}

	public void setCustomerMobile(String customerMobile) {
		this.customerMobile = customerMobile;
	}

	public String getCustomerQQ() {
		return customerQQ;
	}

	public void setCustomerQQ(String customerQQ) {
		this.customerQQ = customerQQ;
	}

	public String getCustomerAddress() {
		return customerAddress;
	}

	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}

	public String getCustomerEmail() {
		return customerEmail;
	}

	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}

	public String getCustomerRemark() {
		return customerRemark;
	}

	public void setCustomerRemark(String customerRemark) {
		this.customerRemark = customerRemark;
	}

	public String getCustomerJob() {
		return customerJob;
	}

	public void setCustomerJob(String customerJob) {
		this.customerJob = customerJob;
	}

	public String getCustomerBlog() {
		return customerBlog;
	}

	public void setCustomerBlog(String customerBlog) {
		this.customerBlog = customerBlog;
	}

	public String getCustomerTel() {
		return customerTel;
	}

	public void setCustomerTel(String customerTel) {
		this.customerTel = customerTel;
	}

	public String getCustomerMSN() {
		return customerMSN;
	}

	public void setCustomerMSN(String customerMSN) {
		this.customerMSN = customerMSN;
	}

	public Date getCustomerBirthday() {
		return customerBirthday;
	}

	public void setCustomerBirthday(Date customerBirthday) {
		this.customerBirthday = customerBirthday;
	}

	public Date getCustomerAddTime() {
		return customerAddTime;
	}

	public void setCustomerAddTime(Date customerAddTime) {
		this.customerAddTime = customerAddTime;
	}

	public String getCustomerAddMan() {
		return customerAddMan;
	}

	public void setCustomerAddMan(String customerAddMan) {
		this.customerAddMan = customerAddMan;
	}

	public Date getCustomerChangeTime() {
		return customerChangeTime;
	}

	public void setCustomerChangeTime(Date customerChangeTime) {
		this.customerChangeTime = customerChangeTime;
	}

	public String getCustomerChangeMan() {
		return customerChangeMan;
	}

	public void setCustomerChangeMan(String customerChangeMan) {
		this.customerChangeMan = customerChangeMan;
	}

	public String getCustomerCompany() {
		return customerCompany;
	}

	public void setCustomerCompany(String customerCompany) {
		this.customerCompany = customerCompany;
	}

	public String getIsUsed() {
		return isUsed;
	}

	public void setIsUsed(String isUsed) {
		this.isUsed = isUsed;
	}
	
}
