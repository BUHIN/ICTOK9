package com.samsung.biz.users.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.samsung.biz.users.vo.UserVO;
import com.samsung.biz.utills.JDBCUtils;

public class UserDAO {
	private Connection conn = null;
	private PreparedStatement stmt = null;
	private ResultSet rs = null;

	public UserVO login(UserVO vo) {
		UserVO user = null;
		try {
			conn = JDBCUtils.getConnection();
			String sql = "select * from users where id=? and password=?";
			stmt = conn.prepareStatement(sql);
			stmt.setString(1, vo.getId());
			stmt.setString(2, vo.getPassword());

			rs = stmt.executeQuery();
			if (rs.next()) {
				user = new UserVO(rs.getString(1), rs.getString(2),
						rs.getString(3), rs.getString(4));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return user;
	}
}
