package com.samsung.employee;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class GetEmp {
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
			String sql = "select * from emp where id = ?";
			stmt = conn.prepareStatement(sql);
			stmt.setInt(1, 100);
			rs = stmt.executeQuery();
			while (rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				String password = rs.getString("password");
				Date hire = rs.getDate("hire");
				int salary = rs.getInt("salary");
				double commission = rs.getDouble("commission");
				int did = rs.getInt("did");
				System.out.println(id+"\t"+name+"\t"+password+"\t"+hire+"\t"+salary+"\t"+commission+"\t"+did);
			}
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
