<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="registerPro.jsp" method="post">
	<table border="1" cellpadding="0" cellspacing="0">
	<tr><td>이름</td>
	    <td><input type="text" name="name"/></td>
	</tr>
	<tr>
		<td>비밀번호</td>
		<td><input type="password" name="password"/></td>
	</tr>
	<tr>
		<td>이메일</td>
		<td><input type="email" name="email"/></td>
	</tr>
	<tr>
		<td>나이</td>
		<td><input type="number" name="age" step="1" min="10" max="100"/></td>
	</tr>
	<tr>
		<td>성별</td>
		<td><input type="radio" name="gender" value="1"/>남자
		&nbsp;<input type="radio" name="gender" value="2"/>여자</td>
	</tr>
	<tr><td colspan="2" align="center">
	<input type="submit" value="회원가입"/></td></tr>
	</table>
</form>
</body>
</html>