package com.samsung.biz.nalcoding;

public class A05_JumsuMain {

	public static void main(String[] args) {
		A05_Jumsu hong = new A05_Jumsu();
		A05_Jumsu im = new A05_Jumsu();
		A05_Jumsu jimae = new A05_Jumsu();
		
		hong.name="홍길동";
		hong.kor=90;
		hong.eng=100;
		hong.math=80;
		hong.total=hong.kor+hong.eng+hong.math;
		hong.avg=hong.total/3;
	}

}
