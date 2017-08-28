package com.gangyu.model;

/**
 * @author Chencongye
 * @version 0.0.0.1
 * @function 这是一个权限实体类
 */

public class RoleInfo {
	/**
	 * 权限编号
	 */
	private int roleId;
	
	/**
	 * 权限名称
	 */
	private String roleName;
	
	/**
	 * 权限权利
	 */
	private String rolePower;
	
	/**
	 * 是否有效
	 */
	private int isUsed;
	
	/**
	 * 生成默认构造方法
	 */
	public RoleInfo() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * 生成RoleId的get方法
	 */
	public int getRoleId() {
		return roleId;
	}

	/**
	 * 生成RoleId的set方法
	 */
	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}

	/**
	 * 生成RoleName的get方法
	 */
	public String getRoleName() {
		return roleName;
	}

	/**
	 * 生成RoleName的set方法
	 */
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	/**
	 * 生成RolePower的get方法
	 */
	public String getRolePower() {
		return rolePower;
	}

	/**
	 * 生成RolePower的set方法
	 */
	public void setRolePower(String rolePower) {
		this.rolePower = rolePower;
	}

	/**
	 * 生成IsUsed的get方法
	 */
	public int getIsUsed() {
		return isUsed;
	}

	/**
	 * 生成IsUsed的set方法
	 */
	public void setIsUsed(int isUsed) {
		this.isUsed = isUsed;
	}
	
}
