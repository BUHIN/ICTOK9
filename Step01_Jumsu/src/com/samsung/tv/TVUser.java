package com.samsung.tv;

public class TVUser {
	public static void main(String[] args) {
		TVFactory factory = new TVFactory();
		TV tv = factory.getBean("Samsung");
	
		
		tv.powerOn();
		tv.volumeUp();
		tv.volumeDown();
		tv.powerOff();
		
		
		
	}
}
