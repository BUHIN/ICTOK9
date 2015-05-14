package com.samsung.view.board;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.catalina.Session;

import com.joonghyun.jisu.vo.BoardVO;
import com.samsung.biz.board.impl.BoardDAO;

public class AddBoard extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String title = request.getParameter("btitle");
		String content = request.getParameter("bcontent");
		/*String today="";
		if(request.getParameter("regdate")!=null){
			today = request.getParameter("regdate");
		}*/
		HttpSession session = request.getSession();
		String id  = (String) session.getAttribute("id");
		
		BoardVO vo = new BoardVO();
		vo.setBtitle(title);
		vo.setBcontent(content);
		vo.setId(id);
		
		BoardDAO dao = new BoardDAO();
		dao.addBoard(vo);
		
		response.sendRedirect("getBoardList");
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		doGet(request, response);
	}

}
