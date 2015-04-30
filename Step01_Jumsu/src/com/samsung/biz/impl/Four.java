package com.samsung.biz.impl;

import com.samsung.biz.nalcoding.JumsuVO;

public class Four implements Jumsu{
	private JumsuVO vo = null;

	public Four(String name, int kor, int eng, int math, int java){
		vo = new JumsuVO();
		vo.setName(name);
		vo.setKor(kor);
		vo.setEng(eng);
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

	@Override
	public void onAvg() {
		onTotal();
		onAvg();
		System.out.println(vo.getName() + " " + vo.getTotal() + " " + vo.getAvg());
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		
	}
}
