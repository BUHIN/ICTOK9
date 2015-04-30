package com.samsung.biz.inher;

import java.util.ArrayList;

public class JumsuMain {
	public static void main(String[] args) {
		JumsuTwo hong = new JumsuTwo("홍길동", 100, 50);
		hong.display();

		JumsuThree im = new JumsuThree("임꺽정", 100, 50, 20);
		im.display();

		JumsuFour jimea = new JumsuFour("일지매", 75, 95, 45, 95);
		jimea.display();

		/*
		 * 내가 만든 클래스도 변수의 타입 상속관계에서는 부모는 자식보다 큰 다입이다. 따라서 다음과 같은 정의가 가능 JumsuTwo
		 * > JumsuThree JumsuTwo > JumsuFour
		 */
		JumsuTwo im1 = im;
		JumsuTwo jimea1 = jimea;

		JumsuTwo[] jumsu = { hong, im, jimea };

		int top = 0;
		JumsuTwo topPerson = null;

		ArrayList<JumsuTwo> jumsu2 = new ArrayList<>();
		jumsu2.add(new JumsuTwo("홍길동", 100, 50));
		jumsu2.add(new JumsuThree("임꺽정", 100, 50, 20));
		jumsu2.add(new JumsuFour("일지매", 75, 95, 45, 95));

		for (JumsuTwo su : jumsu2) {
			su.display();

			if (su.vo.getAvg() > top) {
				top = su.vo.getAvg();
				topPerson = su;
			}
		}
		System.out.println(top);
		System.out.println(topPerson.vo.getName());

		/*
		 * for (int i = 0; i < jumsu.length; i++) { if(jumsu[i].vo.getAvg() >
		 * max){ max = jumsu[i].vo.getAvg(); topPerson = jumsu[i]; } }
		 * 
		 * 
		 * }
		 */
		
		JumsuTwo test = new JumsuThree("임꺽정",100,95,45);
		test.onTwo();
		
	}
}
