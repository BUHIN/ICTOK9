package com.samsung.biz.nalcoding;

public class jumsu {
	public static void main(String[] args) {
		String hondName = "홍길동";
		int hongKor = 90;
		int hongEng = 75;
		int hongMath = 85;
		int hongTotal = hongKor + hongEng + hongMath;
		int hongAvg = hongTotal / 3;
		System.out.println("홍길동의 총점은 : " + hongTotal + ", 홍길동의 평균점수는 : " + hongAvg);
	}
}
