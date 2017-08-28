package com.gangyu.dao;

import java.util.List;

import com.gangyu.model.CustomerCareInfo;


public interface CustomerCareDao {
	/**
	 * 根据条件查询关怀信息
	 * @author Chencongye
	 * @param customerInput,queryType
	 * @return List
	 */
	public List<CustomerCareInfo> getList(String customerInput ,String queryType);
	
	/**
	 * 根据员工ID查询关怀信息
	 * @author Chencongye
	 * @param careId
	 * @return CustomerCareInfo
	 */
	public CustomerCareInfo getCare(int careId);
	
	/**
	 * 添加关怀信息
	 * @author Chencongye
	 * @param careInfo
	 * @return true or false
	 */
	public boolean add(CustomerCareInfo careInfo);
	
	/**
	 * 删除关怀信息(根据careId来删除关怀信息)
	 * @author Chencongye
	 * @param careId
	 * @return true or false
	 */
	public boolean delete(int careId);
	
	/**
	 * 修改关怀信息
	 * @author Chencongye
	 * @param careInfo
	 * @return true or false
	 */
	public boolean update(CustomerCareInfo careInfo,int careId);
}
