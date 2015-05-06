<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="com.samsung.biz.utils.JDBCUtils"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<%
	Connection conn = JDBCUtils.getConnection();
	String sql = "select * from husers order by seq desc";
	PreparedStatement stmt = conn.prepareStatement(sql);
	ResultSet rs = stmt.executeQuery();
%>
</head>
<body>
	<table border="1" cellpadding="0" cellspacing="0" width="700">
		<tr>
			<th bgcolor="orange" width="100">번호</th>
			<th bgcolor="orange" width="200">이름</th>
			<th bgcolor="orange" width="150">이메일</th>
			<th bgcolor="orange" width="150">나이</th>
			<th bgcolor="orange" width="100">성별</th>
		</tr>
		<%
			while (rs.next()) {
				int seq = rs.getInt("seq");
		%>
		<tr>
			<td width="100"><%=seq%></td>
			<td width="200"><%=rs.getString("name")%></a></td>
			<td width="150"><%=rs.getString("email")%></td>
			<td width="150"><%=rs.getInt("age")%></td>
			<%
				if (rs.getInt("gender") == 1) {
			%>
			<td width="100">남자</td>
			<%
				}else{
			%>
			<td width="100">여자</td>
			<% 
				}
			%>
		</tr>
		<%
			}
		%>
	</table>
	<a href="register.jsp">회원 가입</a>
</body>
</html>