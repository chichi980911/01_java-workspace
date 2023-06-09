package com.kh.chap01_beforVSafter.after.run;

import com.kh.chap01_beforVSafter.after.model.vo.Desktop;
import com.kh.chap01_beforVSafter.after.model.vo.SmartPhone;
import com.kh.chap01_beforVSafter.after.model.vo.Tv;

public class AfterRun {
	public static void main (String[] args) {
		/*
		 * 상속의 장점
		 * 보다 적은 양의 코드로 새로운 클래스 작성 가능
		 * 중복된 코드를 별도로 관리하고 있기 때문에 코드의 변경에 용이하다.유지보수가 쉽다.
		 */
		//상속의 특징 
		//자식 객체를 가지고 부모클래스에 있는 메서드를 마치 내거처럼 호출가능
		//부모클래스에 있는 메서들르 오버라이딩을 통해 자식 클래스에서 재정의가능
		//오버라이딩 하는 순간 자식클래스에 있는 메서드 우선권을 가진다.
		//클래스간의 상속은 다중상속이 불가능하다(단일 상속만 가능)
		
		//desktop 객체생성
		Desktop d = new Desktop("삼성", "D-01", "짱짱데스크탑" ,20000, true);
		
		//Tv객체생성
		Tv t = new Tv("엘지", "T-01", "얇은 티비", 300000, 65);
		
		//smartphone객체생성
		SmartPhone s = new SmartPhone("kt", "K-01","쓰레기티비", 50000, "케이티");
		
		System.out.println(d.information());
		System.out.println(t.information());
		System.out.println(s.information());
		System.out.println();
		
		s.setPrice(8787);//부모 클래스에 있는 메서드 호출가능하다.
		
		
		
		
		
	}

}
