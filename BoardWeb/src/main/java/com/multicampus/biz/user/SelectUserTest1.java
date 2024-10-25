package com.multicampus.biz.user;

import java.util.List;

public class SelectUserTest1 {
	public static void main(String[] args) {
		UserDAO dao = new UserDAO();
		
		// 회원 목록 검색
		UserVO vo = new UserVO();
		List<UserVO> userList = dao.getUserList(vo);
		
//		// Case-1
//		for (UserVO user : userList) {
//			System.out.println("---> " + user.toString());
//		}
		
//		// Case-2
//		for (UserVO user : userList) {
//			System.out.println(user.getId() + " : " + user.getRole());
//		}
		
		// Case-3
		System.out.println("회원 수 : " + userList.size());
	}
}







