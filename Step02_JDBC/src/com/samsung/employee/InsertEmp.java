package com.samsung.employee;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class InsertEmp {
	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		try {
			// 1단계 => 사용할 클래스를 올리자
			Class.forName("oracle.jdbc.driver.OracleDriver");

			// 2단계 -> DB연결
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			conn = DriverManager.getConnection(url, "hr", "hr");
			// 3단계 = > Query준비
			String sql = "insert into emp(id, name, password, hire, salary, commission, did) "
					+ "values((select nvl(max(id), 0)+1 from emp),?, ?, sysdate, ?, ?, ?)";
			stmt = conn.prepareStatement(sql);
			stmt.setString(1, "Im");
			stmt.setString(2, "123");
			stmt.setInt(3, 5000);
			stmt.setDouble(4, 0.05);
			stmt.setInt(5, 100);
			int cnt= stmt.executeUpdate();
			System.out.println(cnt+"개 삽입되었습니다.");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (stmt != null) {
				try {
					stmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
