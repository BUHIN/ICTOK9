package com.samsung.biz.nalcoding;

public class JumsuFour extends JumsuTwo{
	public JumsuFour(String name, int kor, int eng, int math, int java){
		super(name, kor, eng);
		vo.setMath(math);
		vo.setJava(java);
	}
	
	public void onTotal(){
		vo.setTotal(vo.getKor()+vo.getEng()+vo.getMath()+vo.getJava());
	}
	public void OnAvg(){
		vo.setAvg(vo.getTotal()/4);
	}
	public void onFour(){
		System.out.println("Four Class");
	}
}
