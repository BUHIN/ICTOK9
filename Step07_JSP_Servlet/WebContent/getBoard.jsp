<%@page import="com.samsung.biz.board.impl.BoardDAO"%>
<%@page import="com.samsung.biz.board.vo.BoardVO"%>
<%@page import="com.samsung.biz.utills.JDBCUtils"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">

<%
	//GetBoard �������� board��� �̸�����  request�� ��� ����
	//���� �������� �̵������Ƿ� request���� board��
	//����� �����Ͱ� �����Ǿ� �ִ�
	//���� �� �ݵ�� down casting
	BoardVO board= (BoardVO)request.getAttribute("board");

	
%>

<title>�� ��</title>
</head>

<body>
	<center>
		<h3>�� ��</h3>
		<h3><%=session.getAttribute("name") %>�� �α��� ȯ���մϴ�...... <a href="logout">Log-out</a></h3>
		<hr>

		<form action="updateBoard" method="post">
			<input name="seq" type="hidden" value="<%=board.getSeq() %>" />
			<table border="1" cellpadding="0" cellspacing="0">
				<tr>
					<td>����</td>
					<td align="left"><input name="title" type="text"
						value="<%=board.getTitle()%>" /></td>
				</tr>
				<tr>
					<td>�ۼ���</td>
					<td align="left"><%=board.getNickname() %></td>
				</tr>
				<tr>
					<td>����</td>
					<td align="left"><textarea name="content" cols="40" rows="10"><%=board.getContent() %></textarea></td>
				</tr>
				<tr>
					<td>�����</td>
					<td align="left"><%=board.getRegdate() %></td>
				</tr>
				<tr>
					<td>��ȸ��</td>
					<td align="left"><%=board.getCnt() %></td>
				</tr>
				<tr>
					<td colspan="2" align="center"><input type="submit"
						value="�� ����" /></td>
				</tr>
			</table>
		</form>
		<hr>
		<a href="addBoard.jsp">�۵��</a>&nbsp;&nbsp;&nbsp; <a
			href="deleteBoard?seq=<%=board.getSeq()%>">�ۻ���</a>&nbsp;&nbsp;&nbsp; <a
			href="getBoardList">�۸��</a>
	</center>
</body>
</html>









