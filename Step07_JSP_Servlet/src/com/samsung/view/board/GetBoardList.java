package com.samsung.view.board;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.samsung.biz.board.impl.BoardDAO;
import com.samsung.biz.board.vo.BoardVO;

public class GetBoardList extends HttpServlet {
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		HttpSession session = request.getSession();
		String name = (String) session.getAttribute("name");
		if (name == null) {
			response.sendRedirect("login.jsp");
			return;
		}

		//매개변수값이 안 넘어왔을 때를 대비해서 처리
		//검색을 하지 않으면 넘어오는 값이 없다.
		String searchCondition = "";
		if (request.getParameter("searchCondition") == null) {
			searchCondition="TITLE";
		}else{
			searchCondition=request.getParameter("searchCondition");
		}
		String searchKeyword = "";
		if (request.getParameter("searchKeyword") != null) {
			searchKeyword=request.getParameter("searchKeyword");
		}else{
			searchKeyword="";
		}
		
		//검색을 하지 않았다면
		//searchCondition = >TITLE
		//searchKeyword = > ""
		BoardVO vo = new BoardVO();
		vo.setSearchCondition(searchCondition);
		vo.setSearchKeyword(searchKeyword);
		
		//getBoardList method에 검색값을 넘긴다.
		//이 때 searchKeyword가 빈 문자열이면 전체를 출력
		BoardDAO dao = new BoardDAO();
		ArrayList<BoardVO> list = dao.getBoardList(vo);

		request.setAttribute("list", list);
		RequestDispatcher view = request
				.getRequestDispatcher("getBoardList.jsp");
		view.forward(request, response);
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("euc-kr");
		doGet(request, response);
	}

}
