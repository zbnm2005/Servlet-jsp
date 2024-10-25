package com.multicampus.web.controller.user;

import com.multicampus.web.controller.Controller;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class InsertUserViewController implements Controller {

	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
		
		System.out.println("회원 등록 화면으로 이동");
		return "insertUser";
	}

}
