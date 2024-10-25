package com.multicampus.biz.user;

public class DeleteUserTest {
	public static void main(String[] args) {
		UserDAO dao = new UserDAO();
		
		// 회원 삭제
		UserVO vo = new UserVO();
		vo.setId("aaa");
		dao.deleteUser(vo);
		
		// 회원 목록 검색
		dao.getUserList(vo);
	}
}







