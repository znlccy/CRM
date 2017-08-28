package com.gangyu.model;

import java.util.Date;


/**
 * @author Chencongye
 * @version 0.0.0.1
 * @function 这是一个用户信息实体类
 */

public class UserInfo {
	
	/**
	 * 员工编号
	 */
	private int userId;
	
	/**
	 * 员工姓名
	 */
	private String userName;
	
	/**
	 * 员工性别
	 */
	private String userSex;
	
	/**
	 * 员工年龄
	 */
	private int userAge;
	
	/**
	 * 部门编号
	 */
	private int departmentId;
	
	/**
	 * 部门名称
	 */
	private String departmentName;
	
	/**
	 * 角色编号
	 */
	private int roleId;
	
	/**
	 * 角色名称
	 */
	private String roleName;
	
	/**
	 * 角色权限
	 */
	private String rolePower;
	
	/**
	 * 用户手机
	 */
	private String userMobile;
	
	/**
	 * 用户座机 
	 */
	private String userTel;
	
	/**
	 * 用户身份证号码
	 */
	private String userIdnum;
	
	/**
	 * 用户邮箱
	 */
	private String userEmail;
	
	/**
	 * 用户地址 
	 */
	private String userAddress;
	
	/**
	 * 用户添加时间 
	 */
	private Date userAddtime;
	
	/**
	 * 用户添加人
	 */
	private String userAddman;
	
	/**
	 * 用户修改时间
	 */
	private Date userChangetime;
	
	/**
	 * 用户修改人
	 */
	private String userChangeman;
	
	/**
	 * 用户兴趣
	 */
	private String userIntest;

	/**
	 * 用户学历
	 */
	private String userDiploma;
	
	/**
	 * 用户银行卡号
	 */
	private String userBankcard;
	
	/**
	 * 用户种族
	 */
	private String userNation;
	
	/**
	 * 用户婚配
	 */
	private String isMarried;
	
	/**
	 * 用户账号
	 */
	private String userNum;
	
	/**
	 * 用户密码
	 */
	private String userPasswd;
	
	/**
	 * 用户是否有效
	 */
	private String isUsed;
	
	/**
	 * 生成构造函数
	 */
	public UserInfo() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * 生成对应的set和get方法
	 */
	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserSex() {
		return userSex;
	}

	public void setUserSex(String userSex) {
		this.userSex = userSex;
	}

	public int getUserAge() {
		return userAge;
	}

	public void setUserAge(int userAge) {
		this.userAge = userAge;
	}

	public int getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public int getRoleId() {
		return roleId;
	}

	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public String getRolePower() {
		return rolePower;
	}

	public void setRolePower(String rolePower) {
		this.rolePower = rolePower;
	}

	public String getUserMobile() {
		return userMobile;
	}

	public void setUserMobile(String userMobile) {
		this.userMobile = userMobile;
	}

	public String getUserTel() {
		return userTel;
	}

	public void setUserTel(String userTel) {
		this.userTel = userTel;
	}

	public String getUserIdnum() {
		return userIdnum;
	}

	public void setUserIdnum(String userIdnum) {
		this.userIdnum = userIdnum;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getUserAddress() {
		return userAddress;
	}

	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}

	public Date getUserAddtime() {
		return userAddtime;
	}

	public void setUserAddtime(Date userAddtime) {
		this.userAddtime = userAddtime;
	}

	public String getUserAddman() {
		return userAddman;
	}

	public void setUserAddman(String userAddman) {
		this.userAddman = userAddman;
	}

	public Date getUserChangetime() {
		return userChangetime;
	}

	public void setUserChangetime(Date userChangetime) {
		this.userChangetime = userChangetime;
	}

	public String getUserChangeman() {
		return userChangeman;
	}

	public void setUserChangeman(String userChangeman) {
		this.userChangeman = userChangeman;
	}

	public String getUserIntest() {
		return userIntest;
	}

	public void setUserIntest(String userIntest) {
		this.userIntest = userIntest;
	}

	public String getUserDiploma() {
		return userDiploma;
	}

	public void setUserDiploma(String userDiploma) {
		this.userDiploma = userDiploma;
	}

	public String getUserBankcard() {
		return userBankcard;
	}

	public void setUserBankcard(String userBankcard) {
		this.userBankcard = userBankcard;
	}

	public String getUserNation() {
		return userNation;
	}

	public void setUserNation(String userNation) {
		this.userNation = userNation;
	}

	public String getIsMarried() {
		return isMarried;
	}

	public void setIsMarried(String isMarried) {
		this.isMarried = isMarried;
	}

	public String getUserNum() {
		return userNum;
	}

	public void setUserNum(String userNum) {
		this.userNum = userNum;
	}

	public String getUserPasswd() {
		return userPasswd;
	}

	public void setUserPasswd(String userPasswd) {
		this.userPasswd = userPasswd;
	}

	public String getIsUsed() {
		return isUsed;
	}

	public void setIsUsed(String isUsed) {
		this.isUsed = isUsed;
	}
	
}
