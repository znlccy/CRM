package com.gangyu.service;

import java.util.List;

import com.gangyu.model.UserInfo;

/**
 * @author Chencongye
 * @version 0.0.1
 * @introduce 这是登录业务逻辑接口
 */

public interface LoginService {
    
	/**
	 * 查询员工信息
	 * @param userInfo
	 * @return
	 */
	public List<UserInfo> query(UserInfo userInfo);
	
	/**
	 * 查询员工所有信息
	 * @param userInfo
	 * @return
	 */
	public UserInfo getAllList(String userNum);
	
}
