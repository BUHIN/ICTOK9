package com.samsung.biz.nalcoding;

public class JumsuTwo {
	protected JumsuVO vo = null;
	
	public JumsuTwo() {
		super();
	}

	public JumsuTwo(String name, int kor, int eng){
			vo = new JumsuVO();
			vo.setName(name);
			vo.setKor(kor);
			vo.setEng(eng);
	}
	
	public void onTotal(){
		vo.setTotal(vo.getKor()+vo.getEng());
	}
	
	public void onAvg(){
		vo.setAvg(vo.getTotal()/2);
	}
	
	public void display(){
		onTotal();
		onAvg();
		System.out.println(vo.getName() + " " + vo.getTotal() + " " + vo.getAvg() + vo.getJava());
	}
	
	public void onTwo(){
		System.out.println("Two Class");
	}
}
