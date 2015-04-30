package com.samsung.biz.nalcoding;

public class JumsuVO {

	private String name;
	private int kor;
	private int eng;
	private int math;
	private int total;
	private int avg;
	private int java;
	
	
	public JumsuVO() {
		super();
	}
	public JumsuVO(String name, int kor, int eng, int math, int total, int avg,
			int java) {
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.total = total;
		this.avg = avg;
		this.java = java;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public int getAvg() {
		return avg;
	}
	public void setAvg(int avg) {
		this.avg = avg;
	}
	public int getJava() {
		return java;
	}
	public void setJava(int java) {
		this.java = java;
	}
	@Override
	public String toString() {
		return "JumsuVO [name=" + name + ", kor=" + kor + ", eng=" + eng
				+ ", math=" + math + ", total=" + total + ", avg=" + avg
				+ ", java=" + java + "]";
	}
	

/*
	주소값을 같게 함?
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + avg;
		result = prime * result + eng;
		result = prime * result + kor;
		result = prime * result + math;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + total;
		return result;
	}

	equals overriding 은 내용비교(주소비교가 아닌)
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		JumsuVO other = (JumsuVO) obj;
		if (avg != other.avg)
			return false;
		if (eng != other.eng)
			return false;
		if (kor != other.kor)
			return false;
		if (math != other.math)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (total != other.total)
			return false;
		return true;
	}
	
	*/
	
	
}
