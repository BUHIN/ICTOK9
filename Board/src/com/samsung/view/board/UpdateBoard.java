package com.samsung.view.board;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.joonghyun.jisu.vo.BoardVO;
import com.samsung.biz.board.impl.BoardDAO;

public class UpdateBoard extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		int bseq = Integer.parseInt(request.getParameter("bseq"));
		String btitle = request.getParameter("btitle");
		String bcontent = request.getParameter("bcontent");
			
		BoardVO vo = new BoardVO();
		vo.setBseq(bseq);
		vo.setBtitle(btitle);
		vo.setBcontent(bcontent);
		BoardDAO dao = new BoardDAO();
		dao.updateBoard(vo);
		response.sendRedirect("getBoardList");
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		doGet(request, response);
	}

}
