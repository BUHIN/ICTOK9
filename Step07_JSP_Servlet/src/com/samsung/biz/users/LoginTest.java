package com.samsung.biz.users;

import com.samsung.biz.users.impl.UserDAO;
import com.samsung.biz.users.vo.UserVO;

public class LoginTest {
	public static void main(String[] args) {
		UserDAO userdao = new UserDAO();
		UserVO vo = new UserVO();
		vo.setId("guest");
		vo.setPassword("guest123");
		UserVO login = userdao.login(vo);
		System.out.println(login);
	}
}
