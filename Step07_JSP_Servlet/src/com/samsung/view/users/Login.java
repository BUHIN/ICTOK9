package com.samsung.view.users;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.samsung.biz.users.impl.UserDAO;
import com.samsung.biz.users.vo.UserVO;

public class Login extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		
		UserDAO userdao = new UserDAO();
		UserVO vo = new UserVO();
		vo.setId(id);
		vo.setPassword(password);
		UserVO login = userdao.login(vo);
		if(login!=null){
			response.sendRedirect("getBoardList");
			HttpSession session = request.getSession();
			session.setAttribute("name", login.getName());
		}else{
			response.sendRedirect("login.jsp");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("euc-kr");
		doGet(request, response);
	}

}
