<%@page contentType="text/html; charset=UTF-8"%>

<%@include file="../layout/header.jsp" %>

<center>
<form action="insertUser.do" method="post">
<table border="1" width="400" cellpadding="0" cellspacing="0">
	<tr>
		<td bgcolor="orange" width="100">아이디</td>
		<td><input name="id" type="text" size="12"/></td>
	</tr>
	<tr>
		<td bgcolor="orange">비밀번호</td>
		<td><input name="password" type="password" size="12"/></td>
	</tr>
	<tr>
		<td bgcolor="orange">이름</td>
		<td><input name="name" type="text" size="30"/></td>
	</tr>
	<tr>
		<td bgcolor="orange">권한</td>
		<td>
			<input name="role" value="User" type="radio" checked/>USER 
      		<input name="role" value="Admin" type="radio"/>ADMIN
      	</td>
	</tr>
	<tr>
		<td bgcolor="orange">자기소개</td>
		<td><textarea name="selfIntro" rows="5" cols="40">여기에 입력해요.</textarea></td>
	</tr>
	<tr>
		<td bgcolor="orange">언어경험</td>
		<td>
			<input name="languages" value="Java" type="checkbox"/>Java
         	<input name="languages" value="Python" type="checkbox" checked/>Python
         	<input name="languages" value="Javascript" type="checkbox"/>Javascript
         	<input name="languages" value="C#" type="checkbox"/>C#
      	</td>
	</tr>
	<tr>
		<td bgcolor="orange">나이</td>
		<td>
			<select name="age">
			 	<option>--선택--
			 	<option>10대
			 	<option>20대
			 	<option>30대
			 	<option>40대
			 	<option>50대
			 	<option>60대 이상
	      	</select>
      	</td>
	</tr>
	<tr>
		<td colspan="2" align="center">
			<input type="submit" value="가입버튼"/>
			<input type="reset" value="취소버튼"/>
      	</td>
	</tr>
</table>
</form>

</center>


<%@include file="../layout/footer.jsp" %>






