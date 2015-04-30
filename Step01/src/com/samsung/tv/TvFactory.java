package com.samsung.tv;

public class TvFactory {

	// 어떤 객체를 사용할지를 결정
	public TV getBean(String tv) {
		if (tv.equals("samsung")) {
			return new SamsungTV();
		} else if (tv.equals("lg")) {
			return new LgTV();
		} else{
			return null;
		}
	}
}
