package impl;

import com.samsung.biz.inher.JumsuVO;

public class Three implements Jumsu{

	private JumsuVO vo = null;

	public Three(String name, int kore, int eng, int math) {
		vo = new JumsuVO();
		vo.setName(name);
		vo.setKor(kore);
		vo.setEng(eng);
		vo.setMath(math);
	}

	public void onTotal() {
		vo.setTotal(vo.getKor() + vo.getEng() + vo.getMath());
	}

	public void onAvg() {
		vo.setAvg(vo.getTotal() / 3);
	}

	public void onThree() {
		System.out.println("three class");
	}

	@Override
	public void display() {
		onTotal();
		onAvg();
		System.out.println(vo);
		System.out.println(vo.getName() + "님의 총점은 " + vo.getTotal() + "이고 평균은 "
				+ vo.getAvg() + "입니다.");
		
	}
}
