package com.samsung.tv;

public class TVUser {
	public static void main(String[] args) {
		
	TvFactory factory = new TvFactory();
	TV tv = factory.getBean("lg");
		
	//TV tv = new SamsungTV();
	tv.powerOn();
	tv.powerOff();
	tv.volumnUp();
	tv.volumnDown();
	
	}
}
