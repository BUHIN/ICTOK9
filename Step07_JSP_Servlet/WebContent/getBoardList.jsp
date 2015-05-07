<%@page import="com.samsung.biz.board.vo.BoardVO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.samsung.biz.board.impl.BoardDAO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>

<%
	ArrayList<BoardVO>list =  (ArrayList<BoardVO>)request.getAttribute("list");
%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>�� ���</title>
</head>

<body>
	<center>
		<h1>�� ���</h1>
		<h3>
			<%=session.getAttribute("name") %>�� �α��� ȯ���մϴ�...... <a href="logout">Log-out</a>
		</h3>

		<!-- �˻� ���� -->
		<form action="getBoardList" method="post">
			<table border="1" cellpadding="0" cellspacing="0" width="700">
				<tr>
					<td align="right"><select name="searchCondition">
							<option value="TITLE">����
							<option value="CONTENT">����
					</select> <input name="searchKeyword" type="text" /> <input type="submit"
						value="�˻�" /></td>
				</tr>
			</table>
		</form>
		<!-- �˻� ���� -->

		<table border="1" cellpadding="0" cellspacing="0" width="700">
			<tr>
				<th bgcolor="orange" width="100">��ȣ</th>
				<th bgcolor="orange" width="200">����</th>
				<th bgcolor="orange" width="150">�ۼ���</th>
				<th bgcolor="orange" width="150">�����</th>
				<th bgcolor="orange" width="100">��ȸ��</th>
			</tr>
			<%
				for (BoardVO vo : list) {
			%>
			<tr>
				<th width="100"><%=vo.getSeq()%></th>
				<th width="200"><a href="getBoard?seq=<%=vo.getSeq()%>"><%=vo.getTitle()%></a></th>
				<th width="150"><%=vo.getNickname()%></th>
				<th width="150"><%=vo.getRegdate()%></th>
				<th width="100"><%=vo.getCnt()%></th>
			</tr>
			<%
				}
			%>
		</table>
		<br> <a href="addBoard.jsp">���� ���</a>
		
	</center>
</body>
</html>


