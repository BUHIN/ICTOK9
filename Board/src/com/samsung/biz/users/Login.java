package com.samsung.biz.users;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.joonghyun.jisu.vo.UserVO;
import com.samsung.biz.users.impl.UserDAO;

public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		String id = request.getParameter("id");
		String password = request.getParameter("password");

		UserVO vo = new UserVO();
		vo.setId(id);
		vo.setPassword(password);

		UserDAO dao = new UserDAO();
		UserVO user = dao.login(vo);
		if (user != null) {
			HttpSession session = request.getSession();
			session.setAttribute("name", user.getName());
			session.setAttribute("id", user.getId());
			response.sendRedirect("getBoardList");

		} else {
			response.sendRedirect("login.jsp");
		}

	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		doGet(request, response);
	}

}
