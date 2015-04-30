package com.samsung.emp.view;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.samsung.emp.utils.JDBCUtils;

/**
 * Servlet implementation class GetEmpList
 */
@WebServlet(urlPatterns = { "/getBoardList" }, initParams = {
		@WebInitParam(name = "name", value = "ȫ�浿"),
		@WebInitParam(name = "age", value = "20") })
public class GetBoardList extends HttpServlet {
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<meta charset='UTF-8'>");
		out.println("<title>Employee List</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h3>게시물 목록</h3>");
		
		
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		try {
			conn = JDBCUtils.getConnection();
			String sql = "select * from board order by seq desc";
			stmt = conn.prepareStatement(sql);
			rs = stmt.executeQuery();
			while (rs.next()) {
				int seq = rs.getInt("seq");
				String title = rs.getString("title");
				String nickname = rs.getString("nickname");
				String content = rs.getString("content");
				Date regdate = rs.getDate("regDate");
				int cnt = rs.getInt("cnt");
				String userid = rs.getString("userid");
				out.print(seq + " - " + nickname + " - " + title+ " - " + regdate+ " - " + 
						cnt + " - " + userid+ "<br>");
			}
			out.println("</body>");
			out.println("</html>");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCUtils.close(conn, stmt, rs);
		}

	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		request.setCharacterEncoding("utf-8");
		doGet(request, response);
	}

}
