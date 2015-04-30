package com.samsung.biz.nalcoding;

import java.util.ArrayList;

public class A04_JumsuArrayList {
	
	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>();
		names.add("홍길동");
		names.add("일지매");
		names.add("임꺽정");
		ArrayList<Integer> hong = new ArrayList<Integer>();
		hong.add(90);
		hong.add(80);
		hong.add(35);
		ArrayList<Integer> im = new ArrayList<Integer>();
		im.add(80);
		im.add(80);
		im.add(100);
		ArrayList<Integer> jimae = new ArrayList<Integer>();
		jimae.add(80);
		jimae.add(50);
		jimae.add(100);
		ArrayList<ArrayList<Integer>> jumsu = new ArrayList<ArrayList<Integer>>();
		jumsu.add(hong);
		jumsu.add(im);
		jumsu.add(jimae);
		
		for(int i = 0; i < jumsu.size(); i++){
			ArrayList<Integer> su = jumsu.get(i);
			for(int j=0; j < su.size(); j++){
				su.add(su.get(0)+su.get(1)+su.get(2));
				
			}
			su.add(su.get(3)/3);
			System.out.println(su.get(4));
			System.out.println(names.get(i) + "의 총점은 " + su.get(3) + "이고, 평균은 " + su.get(4));
		}
		
	}

}
