package com.multicampus.web.controller.user;

import com.multicampus.biz.user.UserDAO;
import com.multicampus.biz.user.UserVO;
import com.multicampus.web.controller.Controller;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class LoginController implements Controller {

	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
		
		System.out.println("로그인 처리");
		
		// 1. 사용자 입력정보 추출
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		
		// 2. DB 연동 처리
		UserVO vo = new UserVO();
		vo.setId(id);
		vo.setPassword(password);
		
		UserDAO dao = new UserDAO();
		UserVO user = dao.getUser(vo);
		
		// 3. 화면 이동    	
		if(user != null) {
			// 로그인 성공 시, 상태 정보를 세션에 등록한다. 
			HttpSession session = request.getSession();
			session.setAttribute("user", user);
			
			return "getBoardList.do";
		} else {
			return "loginView.do";
		}
		
	}

}
