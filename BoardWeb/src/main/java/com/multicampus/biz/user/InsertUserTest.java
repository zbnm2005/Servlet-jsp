package com.multicampus.biz.user;

public class InsertUserTest {
	public static void main(String[] args) {
		UserDAO dao = new UserDAO();
		
		// 회원 가입
		UserVO vo = new UserVO();
		vo.setRole("Admin");
		vo.setPassword("aaa123");
		vo.setName("에이");				
		vo.setId("aaa");
		dao.insertUser(vo);
		
		// 회원 목록 검색
		dao.getUserList(vo);
	}
}







