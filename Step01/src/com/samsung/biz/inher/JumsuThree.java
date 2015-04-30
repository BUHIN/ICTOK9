package com.samsung.biz.inher;

public class JumsuThree extends JumsuTwo{
	public JumsuThree(){
		super();
	}
	
	public JumsuThree(String name, int kore, int eng, int math){
		super(name, kore, eng);
		vo.setMath(math);
	}
	
	public void onTotal() {
		vo.setTotal(vo.getKor() + vo.getEng() + vo.getMath());
	}

	public void onAvg() {
		vo.setAvg(vo.getTotal() / 3);
	}

	public void onThree(){
		System.out.println("three class");
	}
}

