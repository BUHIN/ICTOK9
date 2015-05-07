package com.samsung.view.board;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.samsung.biz.board.impl.BoardDAO;
import com.samsung.biz.board.vo.BoardVO;

public class GetBoard extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		String name = (String) session.getAttribute("name");
		if(name == null){
			response.sendRedirect("login.jsp");
			return;
		}
		request.setCharacterEncoding("EUC-KR");
		int seq = Integer.parseInt(request.getParameter("seq"));
		
		BoardVO vo = new BoardVO();
		vo.setSeq(seq);
		BoardDAO dao = new BoardDAO();
		BoardVO board = dao.getBoard(vo);
	
		//request, session, context 중에
		//view페이지로의 전달은 request에 담는다.
		//object타입으로 담는다.
		request.setAttribute("board", board);
	
		RequestDispatcher view = request.getRequestDispatcher("getBoard.jsp");
		//forward로 이동하면서 현재 사용중인 request와 response를 보내 준다.
		view.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("euc-kr");
		doGet(request, response);
	}

}
