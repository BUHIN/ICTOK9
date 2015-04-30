package com.samsung.biz.nalcoding;

public class Jumsu3 extends JumsuTwo {

	public Jumsu3(String name, int kor, int eng, int math) {
		super(name, kor, eng);
		vo.setMath(math);
	}
	
	public void onTotal(){
		vo.setTotal(vo.getKor()+vo.getEng()+vo.getMath());
	}
	public void OnAvg(){
		vo.setAvg(vo.getTotal()/3);
	}
	public void onThree(){
		System.out.println("Three Class");
	}
}
