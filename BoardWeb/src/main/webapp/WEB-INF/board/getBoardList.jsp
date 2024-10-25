<%@page contentType="text/html; charset=UTF-8"%>

<%@include file="../layout/header.jsp" %>

<center>
<h3><font color="red">${user.name }</font>님 환영합니다.^^</h3>

<form action="getBoardList.jsp" method="get">
<table border="1" cellpadding="0" cellspacing="0" width="800">
	<tr>
		<td align="right">
			<select name="searchCondition">
				<option value="title"   <c:if test="${condition == 'title' }">selected</c:if>>제목
				<option value="content" <c:if test="${condition == 'content' }">selected</c:if>>내용
			</select>
			<input name="searchKeyword" value="${keyword }" type="text"/>
			<input type="submit" value="검색"/>
		</td>
	</tr>
</table>
</form>

<table border="1" cellpadding="0" cellspacing="0" width="800">
	<tr>
		<th width="100" bgcolor="orange">번호</th>
		<th width="300" bgcolor="orange">제목</th>
		<th width="150" bgcolor="orange">작성자</th>
		<th width="150" bgcolor="orange">등록일</th>
		<th width="100" bgcolor="orange">조회수</th>
	</tr>
	
	<c:forEach var="board" items="${boardList }">
	<tr>
		<td>${board.seq }</td>
		<td><a href="getBoard.do?seq=${board.seq }">${board.title }</a></td>
		<td>${board.writer }</td>
		<td>${board.regDate }</td>
		<td>${board.cnt }</td>
	</tr>
	</c:forEach>
	
</table>

</center>

<%@include file="../layout/footer.jsp" %>
