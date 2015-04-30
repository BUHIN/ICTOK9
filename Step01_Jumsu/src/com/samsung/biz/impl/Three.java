package com.samsung.biz.impl;

import com.samsung.biz.nalcoding.JumsuVO;

public class Three implements Jumsu{
	private JumsuVO vo = null;

	public Three(String name, int kor, int eng, int math) {
		vo = new JumsuVO();
		vo.setName(name);
		vo.setKor(kor);
		vo.setEng(eng);
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

	@Override
	public void onAvg() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void display() {
		onTotal();
		onAvg();
		System.out.println(vo.getName() + " " + vo.getTotal() + " " + vo.getAvg());
	}
}
