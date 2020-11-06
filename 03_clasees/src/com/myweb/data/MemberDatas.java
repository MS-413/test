package com.myweb.data;

public class MemberDatas {
	// 객체 싱글톤으로 변경 
	private static MemberDatas md = new MemberDatas();
	private String userId;
	private String userPwd;
	
	public static MemberDatas getInstance() {
		return md;
	}
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserPwd() {
		return userPwd;
	}
	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}
	
}
