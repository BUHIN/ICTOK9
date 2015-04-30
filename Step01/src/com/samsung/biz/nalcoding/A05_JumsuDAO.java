package com.samsung.biz.nalcoding;

public class A05_JumsuDAO {

	private A05_Jumsu vo = null;

	public A05_JumsuDAO(String name, int kor, int eng, int math, int total, int avg) {
		vo = new A05_Jumsu();
		vo.setName(name);
		vo.setKor(kor);
		vo.setMath(math);
		vo.setEng(eng);
	}

	public void onTotal() {
		vo.setTotal(vo.getKor() + vo.getMath() + vo.getEng());

	}

	public void onAvg() {
		vo.setAvg(vo.getTotal()/3);

	}

	void display() {
		System.out.println(vo.getName() + "님의 총점은 " + vo.getTotal() + "이고 평균은 " + vo.getAvg() + "입니다.");
	}

}
