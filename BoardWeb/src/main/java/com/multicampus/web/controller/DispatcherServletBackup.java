package com.multicampus.web.controller;

import java.io.IOException;
import java.util.List;

import com.multicampus.biz.board.BoardDAO;
import com.multicampus.biz.board.BoardVO;
import com.multicampus.biz.user.UserDAO;
import com.multicampus.biz.user.UserVO;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class DispatcherServletBackup extends HttpServlet {
	private static final long serialVersionUID = 1L;	
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 1. 사용자 요청 path를 추출한다.
		String uri = request.getRequestURI();
		String path = uri.substring(uri.lastIndexOf("/"));
		
		// 2. 추출된 path에 따라 요청을 분기처리한다.
		if(path.equals("/loginView.do")) {
		} else if(path.equals("/login.do")) {
		} else if(path.equals("/logout.do")) {
		} else if(path.equals("/insertUserView.do")) {
		} else if(path.equals("/insertUser.do")) {
		} else if(path.equals("/insertBoardView.do")) {
		}  else if(path.equals("/insertBoard.do")) {
		} else if(path.equals("/updateBoard.do")) {
		} else if(path.equals("/deleteBoard.do")) {
		} else if(path.equals("/getBoard.do")) {
		} else if(path.equals("/getBoardList.do")) {
		} else {
			System.out.println("요청 URL을 확인하세요.");
		}
	}

}
