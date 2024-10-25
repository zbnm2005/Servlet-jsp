package com.multicampus.web.controller;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(name = "action", urlPatterns = { "*.do" })
public class DispatcherServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;	
	
	private HandlerMapping handlerMapping;
	private ViewResolver viewResolver;
	
	public void init(ServletConfig config) throws ServletException {
		handlerMapping = new HandlerMapping();
		viewResolver = new ViewResolver();
		
		viewResolver.setPrefix("/WEB-INF/board/");
		viewResolver.setSuffix(".jsp");
	}
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 1. 사용자 요청 path를 추출한다.
		String uri = request.getRequestURI();
		String path = uri.substring(uri.lastIndexOf("/"));
		
		// 2. 요청 path에 해당하는 Controller 객체를 검색한다. 
		Controller ctrl = handlerMapping.getController(path);
		
		// 3. 검색된 Controller를 실행한다. 
		String viewName = ctrl.handleRequest(request, response);
		
		// 4. ViewResolver를 통해 이동할 화면 정보를 완성한다.
		String view = null;
		if(!viewName.contains(".do")) {
			if(viewName.equals("index")) {
				// Controller가 리턴한 뷰이름에 .do가 없고 뷰이름에 .jsp를 추가한다. 
				view = viewName  + ".jsp";
			} else {
				// Controller가 리턴한 뷰이름에 .do가 없고 뷰이름이 index가 아니면 ViewResolver를 사용한다.
				view = viewResolver.getView(viewName);
			}
		} else {
			view = viewName;
		}
		
		// 5. 최종적으로 완성된 화면(view)으로 이동한다.
		RequestDispatcher rd = request.getRequestDispatcher(view);
		rd.forward(request, response);
	}

}
