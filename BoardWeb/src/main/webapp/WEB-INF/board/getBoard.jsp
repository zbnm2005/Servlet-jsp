<%@page contentType="text/html; charset=UTF-8"%>

<%@include file="../layout/header.jsp" %>

<center>

<form action="updateBoard.do" method="post">
<input name="seq" type="hidden" value="${board.seq }"/>
<table border="1" width="500" cellpadding="0" cellspacing="0">
	<tr>
		<td bgcolor="orange" width="100">제목</td>
		<td><input name="title" type="text" size="50" value="${board.title }"/></td>
	</tr>
	<tr>
		<td bgcolor="orange">작성자</td>
		<td><input name="writer" type="text" size="30" value="${board.writer }" disabled/></td>
	</tr>
	<tr>
		<td bgcolor="orange">내용</td>
		<td><textarea name="content" rows="10" cols="50">${board.content }</textarea></td>
	</tr>
	<tr>
		<td bgcolor="orange">등록일</td>
		<td><input name="writer" type="text" size="30" value="${board.regDate }" disabled/></td>
	</tr>
	<tr>
		<td bgcolor="orange">조회수</td>
		<td><input name="writer" type="text" size="30" value="${board.cnt }" disabled/></td>
	</tr>

	<c:if test="${user.role == 'Admin' }">
	<tr>
		<td bgcolor="orange">글삭제</td>
		<td><a href="deleteBoard.do?seq=${board.seq }">게시글 삭제</a></td>
	</tr>
	</c:if>
	
	<tr>
		<td colspan="2" align="center">
			<input type="submit" value="게시글 수정"/>
      	</td>
	</tr>
</table>
</form>

</center>


<%@include file="../layout/footer.jsp" %>






