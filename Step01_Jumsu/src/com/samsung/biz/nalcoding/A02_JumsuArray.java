package com.samsung.biz.nalcoding;

public class A02_JumsuArray {

	public static void main(String[] args) {
		String[] name = {"홍길동", "일지매", "임꺽정"};
		int[] hong = {90, 75, 85, 0, 0};
		int[] im = {80, 40, 100, 0, 0};
		int[] jimae = {100, 75, 90, 0, 0};
		
		for(int i = 0; i < hong.length; i++){
			hong[3] = hong[0] + hong[1] + hong[2];
		}
	}

}
