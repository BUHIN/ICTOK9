package com.samsung.emp.view;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.samsung.emp.utils.JDBCUtils;

public class AddBoard extends HttpServlet {
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		Connection conn = null;
		PreparedStatement stmt = null;
		try {
			// 1단계 => 사용할 클래스를 올리자
			Class.forName("oracle.jdbc.driver.OracleDriver");

			// 2단계 -> DB연결
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			conn = DriverManager.getConnection(url, "hr", "hr");
			// 3단계 = > Query준비
			String sql = "insert into board(seq, title, nickname, content, regdate, userid) "+ 
					"values( (select nvl(max(seq), 0)+1 from board), ?, ?, ?, sysdate, 'guest')";
			stmt = conn.prepareStatement(sql);
			stmt.setString(1, "새로운 타이틀");
			stmt.setString(2, "새로운 이름");
			stmt.setString(3, "새로운 내용");
			int cnt = stmt.executeUpdate();
			System.out.println(cnt + "개 삽입되었습니다.");
			response.sendRedirect("getBoardList");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCUtils.close(conn, stmt);
		}
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
	}

}
