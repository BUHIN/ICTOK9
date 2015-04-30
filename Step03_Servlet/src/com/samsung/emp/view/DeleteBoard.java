package com.samsung.emp.view;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.samsung.emp.utils.JDBCUtils;

public class DeleteBoard extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Connection conn = null;
		PreparedStatement stmt = null;
		try {
			conn = JDBCUtils.getConnection();
			String sql = "delete from board where seq= ?";
			stmt = conn.prepareStatement(sql);
			stmt.setInt(1, 9);
			int cnt = stmt.executeUpdate();
			System.out.println(cnt + "개 삭제되었습니다.");
			response.sendRedirect("getBoardList");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCUtils.close(conn, stmt);
		}
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
