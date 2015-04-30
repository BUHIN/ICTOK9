package com.samsung.emp.view;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.samsung.board.impl.BoardDAO;
import com.samsung.board.vo.BoardVO;
import com.samsung.emp.utils.JDBCUtils;

public class GetBoard extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<meta charset='UTF-8'>");
		out.println("<title>Employee List</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h3>사원 목록</h3>");
		
		BoardVO vo = new BoardVO();
		vo.setSeq(3);
		
		BoardDAO dao = new BoardDAO();
		BoardVO board = dao.getBoard(vo);
		
		out.println(board.getSeq()+"-"+board.getTitle()+"-"+board.getNickname()+"-"+board.getContent()+"-"+board.getRegdate()+"-"+board.getCnt()+"-");
		
		out.println("</body>");
		out.println("</html>");
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=UTF-8");
		doGet(request, response);
	}

}
