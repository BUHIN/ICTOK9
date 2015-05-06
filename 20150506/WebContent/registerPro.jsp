<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="com.samsung.biz.utils.JDBCUtils"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<%
	request.setCharacterEncoding("utf-8");
	String name = request.getParameter("name");
	String password = request.getParameter("password");
	String email = request.getParameter("email");
	int age = Integer.parseInt(request.getParameter("age"));
	int gender = Integer.parseInt(request.getParameter("gender"));
	
	Connection conn = JDBCUtils.getConnection();
	String sql = "insert into husers values((select nvl(max(seq), 0)+1 from husers),?,?,?,?,?)";	
	PreparedStatement stmt = conn.prepareStatement(sql);
	stmt.setString(1, name);
	stmt.setString(2, password);
	stmt.setString(3, email);
	stmt.setInt(4, age);
	stmt.setInt(5, gender);
	stmt.executeUpdate();
	response.sendRedirect("login.jsp");
%>
<body>
</body>
</html>