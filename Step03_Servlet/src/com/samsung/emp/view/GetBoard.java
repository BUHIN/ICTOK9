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
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.samsung.emp.utils.JDBCUtils;

public class GetBoard extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
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
		out.println("<h3>사원 목록</h3>");
		
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		try {
			conn = JDBCUtils.getConnection();
			// 3단계 = > Query준비
			String sql = "select * from board where seq = ?";
			stmt = conn.prepareStatement(sql);
			stmt.setInt(1, 1);
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
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=UTF-8");
		doGet(request, response);
	}

}
