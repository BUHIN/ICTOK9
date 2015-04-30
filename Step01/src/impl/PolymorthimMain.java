package impl;

public class PolymorthimMain {
	public static void main(String[] args) {
		//Jumsu jumsu = new Two("홍길동", 90,80);
		
		//사용할 객체는 Factory로 부터 주입받아  DI 사용한다.
		//의존성 주입(DI)
		
		JumsuFactory factory = new JumsuFactory();
		Jumsu jumsu = (Jumsu) factory.getBean();
		
		jumsu.display();
	}
}
