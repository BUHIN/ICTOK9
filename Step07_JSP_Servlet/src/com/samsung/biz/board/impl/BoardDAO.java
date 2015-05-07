package com.samsung.biz.board.impl;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.samsung.biz.board.vo.BoardVO;
import com.samsung.biz.utills.JDBCUtils;

public class BoardDAO {

	private Connection conn=null;
	private PreparedStatement ps = null;
	private ResultSet rs = null;
	public void addBoard(BoardVO vo, String today){
		conn=JDBCUtils.getConnection();
		String sql="";
		try {
			if(today.equals("")){
				sql="insert into board(seq, title, nickname, content, regdate, userid) "
						+ "values( (select nvl(max(seq), 0)+1 from board), ?, ?, ?, sysdate, 'guest')";
			}else{
				sql="insert into board(seq, title, nickname, content, regdate, userid) "
						+ "values( (select nvl(max(seq), 0)+1 from board), ?, ?, ?, ?, 'guest')";
			}
			
			PreparedStatement ps=conn.prepareStatement(sql);
			ps.setString(1, vo.getTitle());
			ps.setString(2, vo.getNickname());
			ps.setString(3, vo.getContent());
			if(!today.equals("")){
				Date regdate = Date.valueOf(today);
				ps.setDate(4, regdate);
			}
			ps.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			JDBCUtils.close(conn, ps, null);
		}
	}
	
	public void updateBoard(BoardVO vo){
		conn=JDBCUtils.getConnection();
		
		try {
			String sql = "update board set title=?, content=? where seq=?";
			ps = conn.prepareStatement(sql);
			ps.setString(1, vo.getTitle());
			ps.setString(2, vo.getContent());
			ps.setInt(3, vo.getSeq());
			ps.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			JDBCUtils.close(conn, ps, null);
		}
	}
	
	public void deleteBoard(BoardVO vo){
		conn=JDBCUtils.getConnection();
		String sql = "delete from board where seq=?";
		try {
			ps = conn.prepareStatement(sql);
			ps.setInt(1, vo.getSeq());
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			JDBCUtils.close(conn, ps, null);
		}

	}
	
	public BoardVO getBoard(BoardVO vo){
		conn=JDBCUtils.getConnection();
		BoardVO result = null;
		String sql = "select * from board where seq=?";
		try {
			ps = conn.prepareStatement(sql);
			ps.setInt(1, vo.getSeq());
			rs = ps.executeQuery();
			if(rs.next()){
				result = new BoardVO(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getDate(5), rs.getInt(6), rs.getString(7));
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			JDBCUtils.close(conn, ps, rs);
		}
		return result;
	}

	public ArrayList<BoardVO> getBoardList(BoardVO vo){
		conn=JDBCUtils.getConnection();
		ArrayList<BoardVO> list = new ArrayList<BoardVO>();
		String sql = "";
		try {
		if(vo.getSearchCondition().equals("TITLE")){
			sql = "select * from board where title like '%' || ? || '%' order by seq desc";
		}else if(vo.getSearchCondition().equals("CONTENT")){
			sql = "select * from board where content like '%' || ? || '%' order by seq desc";
		}
			ps = conn.prepareStatement(sql);
			ps.setString(1, vo.getSearchKeyword());
			rs = ps.executeQuery();
			while(rs.next()){
				list.add(new BoardVO(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getDate(5), rs.getInt(6), rs.getString(7)));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			JDBCUtils.close(conn, ps, rs);
		}
		return list;
	}
}
