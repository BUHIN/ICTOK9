package com.samsung.biz.impl;

public class Polymorphism {

	public static void main(String[] args) {

		//사용할 객체는 Factory로부터 주입받아 사용한다(DI - 의존성 주입)
		JumsuFactory factory = new JumsuFactory();
		Jumsu jumsu = (Jumsu)factory.getBean();
		jumsu.display();
	}

}
