package com.samsung.tv;

public class LgTV implements TV {

	@Override
	public void powerOn() {
		System.out.println("LGTV -> 전원 켜기");
		// TODO Auto-generated method stub

	}

	@Override
	public void powerOff() {
		System.out.println("LGTV -> 전원 끄기");
		// TODO Auto-generated method stub

	}

	@Override
	public void volumnUp() {
		System.out.println("LGTV -> 소리 올리기");
		// TODO Auto-generated method stub

	}

	@Override
	public void volumnDown() {
		System.out.println("LGTV -> 소리 낮추기");
		// TODO Auto-generated method stub

	}
}
