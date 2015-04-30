package com.samsung.biz.nalcoding;

public class JumsuMain {

	public static void main(String[] args) {


		JumsuTwo hong = new JumsuTwo("홍길동", 70, 80);
		JumsuTwo jimae = new JumsuFour("홍길동", 70, 80, 90, 28);
		
		int top = 0;
		JumsuTwo topPerson = null;
		JumsuTwo[] jumsu = {hong, jimae};
		for(int i = 0; i < jumsu.length; i++){
			jumsu[i].display();
			
			if(jumsu[i].vo.getAvg() > top){
				topPerson = jumsu[i];
			}
			System.out.println(top);
			System.out.println(topPerson.vo.getName());
		}
	}

}
