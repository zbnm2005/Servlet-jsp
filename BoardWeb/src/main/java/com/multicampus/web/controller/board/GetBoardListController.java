package com.multicampus.web.controller.board;

import java.util.List;

import com.multicampus.biz.board.BoardDAO;
import com.multicampus.biz.board.BoardVO;
import com.multicampus.web.controller.Controller;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class GetBoardListController implements Controller {

	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("글 목록 검색 처리");
		
		// 1. 사용자 입력정보 추출
		String searchCondition = request.getParameter("searchCondition");
		String searchKeyword = request.getParameter("searchKeyword");
		
		// Null Check
		if(searchCondition == null) searchCondition = "title";
		if(searchKeyword == null) searchKeyword = "";
		
		// 세션에 검색 관련 정보를 저장한다.
		request.setAttribute("condition", searchCondition);
		request.setAttribute("keyword", searchKeyword);
		
		// 2. DB 연동 처리
		BoardVO vo = new BoardVO();
		vo.setSearchCondition(searchCondition);
		vo.setSearchKeyword(searchKeyword);
		
		BoardDAO dao = new BoardDAO();
		List<BoardVO> boardList = dao.getBoardList(vo);
		
		// 3. 검색 결과를 request에 등록하고 글목록 화면으로 이동한다. 
		request.setAttribute("boardList", boardList);
		
		return "getBoardList";
		
	}

}
