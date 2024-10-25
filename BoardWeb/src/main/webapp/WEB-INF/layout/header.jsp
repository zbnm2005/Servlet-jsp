<%@page import="com.multicampus.biz.user.UserVO"%>
<%@page contentType="text/html; charset=UTF-8"%>
<%@page errorPage="errors/boardError.jsp"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<!-- 
	EL(Expression Language)이란?
	JSP 내장 객체(request, session, application)에 등록된 데이터에 접근하기 위한 표현 언어
	request를 가장 먼저 검색하고, 없으면 단계적으로 session과 application을 검색한다.
-->

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>게시판 프로그램</title>
</head>
<body>

<hr>
	<a href="/">Home</a>&nbsp;&nbsp;&nbsp;
	<c:if test="${user == null }">
	<a href="insertUserView.do">회원가입</a>&nbsp;&nbsp;&nbsp;
	<a href="loginView.do">로그인</a>&nbsp;&nbsp;&nbsp;
	</c:if>
	<c:if test="${user != null }">
	<a href="getBoardList.do">글목록</a>&nbsp;&nbsp;&nbsp;
	<a href="insertBoardView.do">글등록</a>&nbsp;&nbsp;&nbsp;
	<a href="logout.do">로그아웃</a>&nbsp;&nbsp;&nbsp;
	</c:if>
<hr>

<br>




