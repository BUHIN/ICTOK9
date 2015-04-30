package com.samsung.biz.impl;

import com.samsung.biz.nalcoding.JumsuVO;

public class Two implements Jumsu{
	private JumsuVO vo = null;

	public Two() {
		super();
	}

	public Two(String name, int kor, int eng) {
		vo = new JumsuVO();
		vo.setName(name);
		vo.setKor(kor);
		vo.setEng(eng);
	}

	public void onTotal() {
		vo.setTotal(vo.getKor() + vo.getEng());
	}

	public void onAvg() {
		vo.setAvg(vo.getTotal() / 2);
	}

	public void display() {
		onTotal();
		onAvg();
		System.out.println(vo.getName() + " " + vo.getTotal() + " "
				+ vo.getAvg());
	}

}
