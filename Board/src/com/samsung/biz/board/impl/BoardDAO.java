package com.samsung.biz.board.impl;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.joonghyun.jisu.vo.BoardVO;
import com.samsung.biz.utills.JDBCUtils;

public class BoardDAO {

	private Connection conn = null;
	private PreparedStatement ps = null;
	private ResultSet rs = null;

	public void addBoard(BoardVO vo) {
		int result= 0;
		conn = JDBCUtils.getConnection();
		String sql = "insert into boardvo values ((select nvl(max(bseq), 0)+1 from boardvo), ?, ?, ?, sysdate)";
		try {

			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, vo.getId());
			ps.setString(2, vo.getBtitle());
			ps.setString(3, vo.getBcontent());
			result = ps.executeUpdate();
			System.out.println(result + "개의 게시물이 등록되었습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCUtils.close(conn, ps, null);
		}
	}
	public void updateBoard(BoardVO vo) {
		conn = JDBCUtils.getConnection();

		try {
			String sql = "update boardvo set btitle=?, bcontent=? where bseq=?";
			ps = conn.prepareStatement(sql);
			ps.setString(1, vo.getBtitle());
			ps.setString(2, vo.getBcontent());
			ps.setInt(3, vo.getBseq());
			int result = ps.executeUpdate();
			System.out.println(result + "개 수정");

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCUtils.close(conn, ps, null);
		}
	}

	public void deleteBoard(BoardVO vo) {
		conn = JDBCUtils.getConnection();
		String sql = "delete from boardvo where bseq=?";
		try {
			ps = conn.prepareStatement(sql);
			ps.setInt(1, vo.getBseq());
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCUtils.close(conn, ps, null);
		}

	}

	public BoardVO getBoard(BoardVO vo) {
		conn = JDBCUtils.getConnection();
		BoardVO result = null;
		String sql = "select * from boardvo where bseq=?";
		try {
			ps = conn.prepareStatement(sql);
			ps.setInt(1, vo.getBseq());
			rs = ps.executeQuery();
			if (rs.next()) {
				result = new BoardVO(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCUtils.close(conn, ps, rs);
		}
		return result;
	}

	public ArrayList<BoardVO> getBoardList() {
		conn = JDBCUtils.getConnection();
		ArrayList<BoardVO> list = new ArrayList<BoardVO>();
		String sql = "select * from boardvo";
		try {
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			while (rs.next()) {
				list.add(new BoardVO(rs.getInt(1), rs.getString(2), rs
						.getString(3), rs.getString(4), rs.getString(5)));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCUtils.close(conn, ps, rs);
		}
		return list;
	}

	/*public ArrayList<BoardVO> getBoardList(BoardVO vo) {
		conn = JDBCUtils.getConnection();
		String sql = "";
		ArrayList<BoardVO> list = new ArrayList<BoardVO>();
		try {
			if (vo.getSearchCondition().equals("TITLE")) {
				sql = "select * from board where title like '%' || ? || '%' order by seq desc";
			} else if (vo.getSearchCondition().equals("CONTENT")) {
				sql = "select * from board where content like '%' || ? || '%' order by seq desc";
			}
			ps = conn.prepareStatement(sql);
			ps.setString(1, vo.getSearchKeyword());
			rs = ps.executeQuery();
			while (rs.next()) {
				list.add(new BoardVO(rs.getInt(1), rs.getString(2), rs
						.getString(3), rs.getString(4), rs.getDate(5), rs
						.getInt(6), rs.getString(7)));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCUtils.close(conn, ps, rs);
		}
		return list;
	}*/
}
