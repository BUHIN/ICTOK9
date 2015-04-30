package com.samsung.board.impl;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.samsung.board.vo.BoardVO;
import com.samsung.emp.utils.JDBCUtils;

public class BoardDAO {
	private Connection conn = null;
	private PreparedStatement stmt = null;
	private ResultSet rs = null;

	public void updateBoard(BoardVO vo){
		Connection conn = null;
		PreparedStatement stmt = null;
		try {
			conn = JDBCUtils.getConnection();
			// 3단계 = > Query준비
			String sql = "update board set title = ?, content= ? where seq= ?";
			stmt = conn.prepareStatement(sql);
			stmt.setString(1, vo.getTitle());
			stmt.setString(2, vo.getContent());
			stmt.setInt(3, vo.getSeq());
			int cnt = stmt.executeUpdate();
			System.out.println(cnt + "개 수정되었습니다.");
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCUtils.close(conn, stmt);
		}
	}
	
	public void deleteBoard(BoardVO vo){
		Connection conn = null;
		PreparedStatement stmt = null;
		try {
			conn = JDBCUtils.getConnection();
			String sql = "delete from board where seq= ?";
			stmt = conn.prepareStatement(sql);
			stmt.setInt(1, vo.getSeq());
			int cnt = stmt.executeUpdate();
			System.out.println(cnt + "개 삭제되었습니다.");
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCUtils.close(conn, stmt);
		}
	}
	
	public ArrayList<BoardVO> getBoardList(){

		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		ArrayList<BoardVO> list = new ArrayList<>();
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
				list.add(new BoardVO(seq, title, nickname, content, regdate, cnt, userid));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCUtils.close(conn, stmt, rs);
		}
		return list;
	}
	
	public void addBoard(BoardVO vo) {
		try {
			conn = JDBCUtils.getConnection();
			String sql = "insert into board(seq, title, nickname, content, regdate, userid) "
					+ "values( (select nvl(max(seq), 0)+1 from board), ?, ?, ?, sysdate, 'guest')";
			stmt = conn.prepareStatement(sql);
			stmt.setString(1, vo.getTitle());
			stmt.setString(2, vo.getNickname());
			stmt.setString(3, vo.getContent());
			int cnt = stmt.executeUpdate();
			System.out.println(cnt + "개 삽입되었습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCUtils.close(conn, stmt);
		}
	}

	public BoardVO getBoard(BoardVO vo) {

		BoardVO board = new BoardVO();
		try {
			conn = JDBCUtils.getConnection();
			String sql = "select * from board where seq = ?";
			stmt = conn.prepareStatement(sql);
			stmt.setInt(1, vo.getSeq());
			rs = stmt.executeQuery();
			if (rs.next()) {
				board.setSeq(rs.getInt("seq"));
				board.setTitle(rs.getString("title"));
				board.setNickname(rs.getString("nickname"));
				board.setContent(rs.getString("content"));
				board.setRegdate(rs.getDate("regDate"));
				board.setCnt(rs.getInt("cnt"));
				board.setUserid(rs.getString("userid"));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCUtils.close(conn, stmt, rs);
		}
		return board;
	}
}
