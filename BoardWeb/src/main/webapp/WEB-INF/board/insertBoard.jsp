<%@page contentType="text/html; charset=UTF-8"%>

<%@include file="../layout/header.jsp" %>

<center>

<form action="insertBoard.do" method="post">
<table border="1" width="500" cellpadding="0" cellspacing="0">
	<tr>
		<td bgcolor="orange" width="100">제목</td>
		<td><input name="title" type="text" size="50"/></td>
	</tr>
	<tr>
		<td bgcolor="orange">작성자</td>
		<td><input name="writer" type="text" size="30"/></td>
	</tr>
	<tr>
		<td bgcolor="orange">내용</td>
		<td><textarea name="content" rows="10" cols="50"></textarea></td>
	</tr>
	<tr>
		<td colspan="2" align="center">
			<input type="submit" value="등록버튼"/>
			<input type="reset" value="취소버튼"/>
      	</td>
	</tr>
</table>
</form>

</center>


<%@include file="../layout/footer.jsp" %>






