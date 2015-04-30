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

public class UpdateBoard extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Connection conn = null;
		PreparedStatement stmt = null;
		try {
			conn = JDBCUtils.getConnection();
			// 3단계 = > Query준비
			String sql = "update board set title = ?, content= ? where seq= ?";
			stmt = conn.prepareStatement(sql);
			stmt.setString(1, "변경 타이틀");
			stmt.setString(2, "변경 내용");
			stmt.setInt(3, 8);
			int cnt = stmt.executeUpdate();
			System.out.println(cnt + "개 수정되었습니다.");
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
