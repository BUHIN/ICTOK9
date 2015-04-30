package com.samsung.biz.nalcoding;

public class A01_Jumsu {
	public static void main(String[] args) {
		String hongName = "홍길동";
		int hongKor = 90;
		int hongEng = 75;
		int hongMath = 85;
		int hongTotal = hongKor + hongEng + hongMath;
		int hongAvg = hongTotal/3;
		System.out.println(hongName + "의 평균점수는 " + hongAvg);
		
	}
}
