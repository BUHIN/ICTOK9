package com.samsung.emp.view;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.samsung.board.impl.BoardDAO;
import com.samsung.board.vo.BoardVO;

/**
 * Servlet implementation class GetEmpList
 */
@WebServlet(urlPatterns = { "/getBoardList" }, initParams = {
		@WebInitParam(name = "name", value = "ȫ�浿"),
		@WebInitParam(name = "age", value = "20") })
public class GetBoardList extends HttpServlet {
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
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
		out.println("<h3>게시물 목록</h3>");
		BoardDAO dao = new BoardDAO();
		ArrayList<BoardVO>list = new ArrayList<>();
		list = dao.getBoardList();
		for (BoardVO board : list) {
			out.println(board.getSeq()+"-"+board.getTitle()+"-"+board.getNickname()+"-"+board.getContent()+"-"+board.getRegdate()+"-"+board.getCnt()+"<br>");
		}
		out.println("</body>");
		out.println("</html>");
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		request.setCharacterEncoding("utf-8");
		doGet(request, response);
	}

}
