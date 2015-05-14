package com.samsung.view.board;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.joonghyun.jisu.vo.BoardVO;
import com.samsung.biz.board.impl.BoardDAO;

@WebServlet("/UpdateBoardPage")
public class UpdateBoardPage extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int bseq = Integer.parseInt(request.getParameter("bseq"));
		BoardVO vo = new BoardVO();
		vo.setBseq(bseq);
		
		request.setAttribute("board", new BoardDAO().getBoard(vo));
		request.getRequestDispatcher("update.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		doGet(request, response);
	}

}
