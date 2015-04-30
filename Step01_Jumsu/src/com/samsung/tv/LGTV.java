package com.samsung.tv;

public class LGTV implements TV{

	@Override
	public void powerOn() {
		System.out.println("LgTV => 전원 켜기");
	}

	@Override
	public void volumeUp() {
		System.out.println("LgTV => 소리 키우기");
		
	}

	@Override
	public void volumeDown() {
		System.out.println("LgTV => 소리 줄이기");
		
	}

	@Override
	public void powerOff() {
		System.out.println("LgTV => 전원 끄기");
		
	}

}
