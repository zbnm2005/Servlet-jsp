package com.multicampus.web.controller;

import java.util.HashMap;
import java.util.Map;

import com.multicampus.web.controller.board.DeleteBoardController;
import com.multicampus.web.controller.board.GetBoardController;
import com.multicampus.web.controller.board.GetBoardListController;
import com.multicampus.web.controller.board.InsertBoardController;
import com.multicampus.web.controller.board.InsertBoardViewController;
import com.multicampus.web.controller.board.UpdateBoardController;
import com.multicampus.web.controller.user.InsertUserController;
import com.multicampus.web.controller.user.InsertUserViewController;
import com.multicampus.web.controller.user.LoginController;
import com.multicampus.web.controller.user.LoginViewController;
import com.multicampus.web.controller.user.LogoutController;

public class HandlerMapping {
	// Controller를 구현한 객체들을 저장할 Map
	private Map<String, Controller> mappings;
	
	public HandlerMapping() {
		mappings = new HashMap<String, Controller>();
		
		// key-value 형태로 모든 Controller 객체들을 Map에 등록한다.
		mappings.put("/insertUserView.do", new InsertUserViewController());
		mappings.put("/insertUser.do", new InsertUserController());
		mappings.put("/loginView.do", new LoginViewController());
		mappings.put("/login.do", new LoginController());
		mappings.put("/logout.do", new LogoutController());
		
		mappings.put("/getBoardList.do", new GetBoardListController());
		mappings.put("/getBoard.do", new GetBoardController());
		mappings.put("/insertBoardView.do", new InsertBoardViewController());
		mappings.put("/insertBoard.do", new InsertBoardController());
		mappings.put("/updateBoard.do", new UpdateBoardController());
		mappings.put("/deleteBoard.do", new DeleteBoardController());
	}
	
	public Controller getController(String path) {
		// path에 해당하는 Contoller를 검색하여 리턴한다. 
		return mappings.get(path);
	}
	
}
