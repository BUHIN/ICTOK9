package com.samsung.biz.nalcoding;

// 내가 만든 클래스도 변수명(변수타입)이다.
// 이렇게 만들면 다양한 타입의 변수를 하나의 이름으로 관리할 수 있다.
public class A05_Jumsu {
	private String name;
	private int kor, eng, math, total, avg;

/*	public A05_Jumsu() {
		super();
	}

	public A05_Jumsu(String name, int kor, int eng, int math, int total, int avg) {
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.total = total;
		this.avg = avg;
	}*/

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public int getAvg() {
		return avg;
	}

	public void setAvg(int avg) {
		this.avg = avg;
	}

}
