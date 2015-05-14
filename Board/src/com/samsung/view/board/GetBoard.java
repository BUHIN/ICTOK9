package com.samsung.view.board;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.joonghyun.jisu.vo.BoardVO;
import com.samsung.biz.board.impl.BoardDAO;

public class GetBoard extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		HttpSession session = request.getSession();
		String id = (String) session.getAttribute("id");
		if (id == null) {
			response.sendRedirect("login.jsp");
			return;
		}

		int bseq = Integer.parseInt(request.getParameter("bseq"));

		BoardVO vo = new BoardVO();
		vo.setBseq(bseq);
		BoardDAO dao = new BoardDAO();
		BoardVO board = dao.getBoard(vo);

		request.setAttribute("board", board);
		System.out.println(board);
		request.getRequestDispatcher("view.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
	}

}
