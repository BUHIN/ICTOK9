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

import com.samsung.board.impl.BoardDAO;
import com.samsung.board.vo.BoardVO;
import com.samsung.emp.utils.JDBCUtils;

public class UpdateBoard extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		BoardVO vo = new BoardVO();
		vo.setTitle("새 제목");
		vo.setContent("새 내용");
		vo.setNickname("새 작성자");
		vo.setSeq(8);
		BoardDAO dao = new BoardDAO();
		dao.updateBoard(vo);
		response.sendRedirect("getBoardList");
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
