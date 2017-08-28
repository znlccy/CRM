package com.gangyu.model;

/**
 * @author Chencongye
 * @version 0.0.0.1
 * @function 这是其他信息的实体类
 */

public class OtherInfo {
	
	/**
	 * 客户状态编号
	 */
	private int conditionId;

	/**
	 * 客户状态名称
	 */
	private String conditionName;
	
	/**
	 * 客户状态描述
	 */
	private String conditionExplain;
	
	/**
	 * 客户状态是否有效
	 */
	private String conditionIsUsed;
	
	/**
	 * 客户来源编号
	 */
	private int sourceId;
	
	/**
	 * 客户来源是否有效
	 */
	private String sourceIsUsed;
	
	/**
	 * 客户类型编号
	 */
	
	private int customerTypeId;
	
	/**
	 * 客户类型名称
	 */
	private String customerTypeName;

	/**
	 * 客户类型是否有效
	 */
	private String customerTypeIsUsed;
	
	/**
	 * 房屋类型编号
	 */
	private int houseTypeId;
	
	/**
	 * 房屋类型名称
	 */
	private String houseTypeName;
	
	/**
	 * 房屋类型继承人
	 */
	private String houseTypeGenre;
	
	/**
	 * 房屋类型是否有效
	 */
	private String houseTypeIsUsed;
	
	/**
	 * 创建默认构造方法
	 */
	public OtherInfo() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * 生成对应的set和get方法 
	 */
	public int getConditionId() {
		return conditionId;
	}

	public void setConditionId(int conditionId) {
		this.conditionId = conditionId;
	}

	public String getConditionName() {
		return conditionName;
	}

	public void setConditionName(String conditionName) {
		this.conditionName = conditionName;
	}

	public String getConditionExplain() {
		return conditionExplain;
	}

	public void setConditionExplain(String conditionExplain) {
		this.conditionExplain = conditionExplain;
	}

	public String getConditionIsUsed() {
		return conditionIsUsed;
	}

	public void setConditionIsUsed(String conditionIsUsed) {
		this.conditionIsUsed = conditionIsUsed;
	}

	public int getSourceId() {
		return sourceId;
	}

	public void setSourceId(int sourceId) {
		this.sourceId = sourceId;
	}

	public String getSourceIsUsed() {
		return sourceIsUsed;
	}

	public void setSourceIsUsed(String sourceIsUsed) {
		this.sourceIsUsed = sourceIsUsed;
	}

	public int getCustomerTypeId() {
		return customerTypeId;
	}

	public void setCustomerTypeId(int customerTypeId) {
		this.customerTypeId = customerTypeId;
	}

	public String getCustomerTypeName() {
		return customerTypeName;
	}

	public void setCustomerTypeName(String customerTypeName) {
		this.customerTypeName = customerTypeName;
	}

	public String getCustomerTypeIsUsed() {
		return customerTypeIsUsed;
	}

	public void setCustomerTypeIsUsed(String customerTypeIsUsed) {
		this.customerTypeIsUsed = customerTypeIsUsed;
	}

	public int getHouseTypeId() {
		return houseTypeId;
	}

	public void setHouseTypeId(int houseTypeId) {
		this.houseTypeId = houseTypeId;
	}

	public String getHouseTypeName() {
		return houseTypeName;
	}

	public void setHouseTypeName(String houseTypeName) {
		this.houseTypeName = houseTypeName;
	}

	public String getHouseTypeGenre() {
		return houseTypeGenre;
	}

	public void setHouseTypeGenre(String houseTypeGenre) {
		this.houseTypeGenre = houseTypeGenre;
	}

	public String getHouseTypeIsUsed() {
		return houseTypeIsUsed;
	}

	public void setHouseTypeIsUsed(String houseTypeIsUsed) {
		this.houseTypeIsUsed = houseTypeIsUsed;
	}

}
