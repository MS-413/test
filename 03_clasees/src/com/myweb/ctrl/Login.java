package com.myweb.ctrl;

import com.myweb.data.MemberDatas;

public class Login {

	public static void main(String[] args) {
		System.out.println("SINGLETON");
		for (int i = 0; i < 5; i++) {
			MemberDatas myacc =  MemberDatas.getInstance();
			myacc.setUserId("ID"+i);
			myacc.setUserPwd("pwd"+i);
			System.out.print(myacc.getUserId());
			System.out.print(myacc.getUserPwd());
			System.out.println(myacc);
		}
		System.out.println("GENERAL CONSTRUCTOR");
		for (int i = 0; i < 5; i++) {
			MemberDatas myacc = new MemberDatas();
			myacc.setUserId("ID"+i);
			myacc.setUserPwd("pwd"+i);
			System.out.print(myacc.getUserId());
			System.out.print(myacc.getUserPwd());
			System.out.println(myacc);
		}

	}

}
