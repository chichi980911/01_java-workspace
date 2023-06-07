package com.kh.chap04_field.run;

import com.kh.chap04_field.model.vo.FieldTest1;
import com.kh.chap04_field.model.vo.FieldTest2;
import com.kh.chap04_field.model.vo.FieldTest3;

public class FieldRun {

	public static void main(String[] args) {
		
		//----------FieldTest1----------
//		FieldTest1 f =new FieldTest1();
//		//stack 영역 f1
//		f.test(10);
		//----------FieldTest2----------
//		FieldTest2 f = new FieldTest2(); //heap 영역에 필드부에 있는 변수 생성
//		//public
//		System.out.println(f.pub);
		
		//protected 같은 패키지내에서는 접근가능 다른 패키지일때 상속일때만 가능
//		System.out.println(f.pro);
		
		//default : 오로지 같은 패키지 내에서만 접근 가능
//		System.out.println(f.def);
		
		//private : 오로지 같은 클래스 에서만 접근 가능 
		//System.out.println(f.pri);
		
		//-------FieldTest3-------------
		System.out.println(FieldTest3.sta);
		//수정하고 싶다면?
		FieldTest3.sta = "ㅇㅇㅇ";
		System.out.println(FieldTest3.sta);
		
		System.out.println(FieldTest3.STA_FIN);
//		FieldTest3.STA_FIN= "ㅇㅇㅇ";//불가능
		
		System.out.println(Math.PI);
		System.out.println(Math.random()); // static : 기울힘
	}

}
