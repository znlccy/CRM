package com.gangyu.model;

import java.util.Date;

/**
 * @author Chencongye
 * @version 0.0.1
 * @instruction 这是通知信息实体类
 */

public class NoticeInfo {
	
	/**
	 * 公告人编号
	 */
	private int userId;
	
	/**
	 * 公告人姓名
	 */
	private String userName;
	
	/**
	 * 公告编号
	 */
	private int noticeId;
	
	/**
	 * 公告主题
	 */
	private String noticeItem;
	
	/**
	 * 公告内容
	 */
	private String noticeContent;
	
	/**
	 * 公告时间
	 */
	private Date noticeTime;
	
	/**
	 * 公告截止时间
	 */
	private Date noticeEndTime;
	
	/**
	 * 公告是否有效
	 */
	private String noticeIsUsed;
	
	/** 
	 * 生成公告的默认构造方法
	 */
	public NoticeInfo() {
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

	public int getNoticeId() {
		return noticeId;
	}

	public void setNoticeId(int noticeId) {
		this.noticeId = noticeId;
	}

	public String getNoticeItem() {
		return noticeItem;
	}

	public void setNoticeItem(String noticeItem) {
		this.noticeItem = noticeItem;
	}

	public String getNoticeContent() {
		return noticeContent;
	}

	public void setNoticeContent(String noticeContent) {
		this.noticeContent = noticeContent;
	}

	public Date getNoticeTime() {
		return noticeTime;
	}

	public void setNoticeTime(Date noticeTime) {
		this.noticeTime = noticeTime;
	}

	public Date getNoticeEndTime() {
		return noticeEndTime;
	}

	public void setNoticeEndTime(Date noticeEndTime) {
		this.noticeEndTime = noticeEndTime;
	}

	public String getNoticeIsUsed() {
		return noticeIsUsed;
	}

	public void setNoticeIsUsed(String noticeIsUsed) {
		this.noticeIsUsed = noticeIsUsed;
	}
	
}
