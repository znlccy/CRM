package com.gangyu.service;

import java.util.List;

import com.gangyu.model.CustomerCareInfo;

/**
 * @author Chencongye
 * @version 0.0.0.1
 * @fuction 这是关怀信息接口
 */

public interface CustomerCareService {
	/**
	 * 根据条件查询关怀信息
	 */
	public List<CustomerCareInfo> getList(String customerInput, String queryType);
	
	/**
	 * 根据id查询关怀信息
	 */
	public CustomerCareInfo getCare(int careId);
	
	/**
	 * 添加关怀信息
	 */
	public boolean add(CustomerCareInfo careInfo);
	
	/**
	 * 删除关怀信息
	 */
	public boolean delete(int careId);
	
	/**
	 * 修改关怀信息
	 */
	public boolean update(CustomerCareInfo careInfo,int careId);
}
