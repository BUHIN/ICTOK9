package com.samsung.biz.inher;

public class JumsuTwo {

	protected JumsuVO vo = null;

	public JumsuTwo() {
		super();
	}
	
	public JumsuTwo(String name, int kore, int eng) {
		vo = new JumsuVO();
		
		vo.setName(name);
		vo.setKor(kore);
		vo.setEng(eng);

	}

	public JumsuTwo(String name, int kore, int eng, int math) {
		vo = new JumsuVO();
		
		vo.setName(name);
		vo.setKor(kore);
		vo.setEng(eng);
		vo.setMath(math);

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
		System.out.println(vo);
		System.out.println(vo.getName() + "님의 총점은 " + vo.getTotal() + "이고 평균은 "
				+ vo.getAvg() + "입니다.");
	}
	
	public void onTwo(){
		System.out.println("two class");
	}
}
