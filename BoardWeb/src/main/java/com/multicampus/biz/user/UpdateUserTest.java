package com.multicampus.biz.user;

public class UpdateUserTest {
	public static void main(String[] args) {
		UserDAO dao = new UserDAO();
		
		// 회원 수정
		UserVO vo = new UserVO();
		vo.setRole("User");
		vo.setId("aaa");
		dao.updateUser(vo);
		
		// 회원 목록 검색
		dao.getUserList(vo);
	}
}







