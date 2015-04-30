package com.samsung.tv;
//어떤 객체 사용할 지 결정
public class TVFactory {
	public TV getBean(String tv){
		if(tv.equals("Samsung")){
			return new SamsungTV();
		}else if(tv.equals("LG")){
			return new LGTV();
		}else{
			return null;
		}
	}
}
