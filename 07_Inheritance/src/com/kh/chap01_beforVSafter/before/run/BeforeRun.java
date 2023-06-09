package com.kh.chap01_beforVSafter.before.run;

import com.kh.chap01_beforVSafter.before.model.vo.Desktop;
import com.kh.chap01_beforVSafter.before.model.vo.SmartPhone;
import com.kh.chap01_beforVSafter.before.model.vo.Tv;

public class BeforeRun {

	public static void main(String[] args) {
		
		//DESKTEP 객체생성
		//BRAND 
		Desktop d = new Desktop("삼성", "D-01", "ㅇㅇ", 20000, true);
		
		Tv t = new Tv("LG", "L-01", "ㅂㅂ", 30000, 24);
		
		SmartPhone s = new SmartPhone("kt폰", "k-01", "아이폰", 40000, "ktkt");
		
		System.out.println(d.information());
		System.out.println(t.information());
		System.out.println(s.information());
		
		
		//유지보수요청 pName > prioductName 으로 바꾸고 제조일자 추가 
		
		//세 클래스에 공통적인 필드와 메서드들이 존재함 
		//이런 중복된 코드들을 따로 "부모클래스"로 한번만 정의해두면 코드를 줄일 수 있다.
		//=>수정과 같ㅇ느 유지보수 요청이 들어왔을 때 일일히 찾아서 수정할 필요없이
		//	한번만 정의해둔 부모클래스만 수정하면 전체적으로 반영됨
		
		//세클래스가 공통적으로 가지고 있는것
		//=>brand , pCode,pName,price, getter/setter/information
		//product 공통 클래스 미리 정의해볼것!
	}
	

}
