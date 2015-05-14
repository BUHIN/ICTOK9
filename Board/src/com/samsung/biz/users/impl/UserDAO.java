package com.samsung.biz.users.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.joonghyun.jisu.vo.UserVO;
import com.samsung.biz.utills.JDBCUtils;

public class UserDAO {

	Connection conn = null;
	PreparedStatement ps = null;
	ResultSet rs = null;

	public UserVO login(UserVO vo) {
		conn = JDBCUtils.getConnection();
		UserVO user = null;
		String sql = "select * from uservo where id=? and password=?";
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, vo.getId());
			ps.setString(2, vo.getPassword());
			rs = ps.executeQuery();
			if (rs.next()) {
				user = new UserVO(rs.getString(1), rs.getString(2),
						rs.getString(3));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCUtils.close(conn, ps, rs);
		}
		return user;

	}
}
