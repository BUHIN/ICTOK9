package com.samsung.biz.impl;
//어떤 클래스를 사용할 지 지정해서 그 클래스를 생성해서 리턴하는 목적으로 만든 클래스
public class JumsuFactory {
	public Object getBean(){
		Jumsu jumsu = new Three("홍길동", 90, 80, 100);
		return jumsu;
	}
}
