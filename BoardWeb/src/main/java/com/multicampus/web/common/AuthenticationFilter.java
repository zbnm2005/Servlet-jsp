package com.multicampus.web.common;

import java.io.IOException;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebFilter(urlPatterns = {"/deleteBoard.do", 
		                  "/getBoardList.do", 
		                  "/getBoard.do"})
public class AuthenticationFilter extends HttpFilter implements Filter {
	private static final long serialVersionUID = 1L;

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
    	HttpServletRequest req = (HttpServletRequest) request;
    	HttpServletResponse res = (HttpServletResponse) response;
		
		// 0. 세션 체크
    	HttpSession session = req.getSession();
    	
    	// 세션에 저장된 상태 정보 활용
    	if(session.getAttribute("user") == null) {
    		// 세션에 userId 정보가 없으면 로그인 인증을 안한 브라우저로 판단한다.
    		RequestDispatcher rd = req.getRequestDispatcher("loginView.do");
    		rd.forward(req, res);
    	} else {
    		chain.doFilter(request, response);
    	}

	}

}
