package com.kh.chap04_field.model.vo;

public class Run {

	public static void main(String[] args) {
		// ----------FieldTest2----------
		FieldTest2 f = new FieldTest2(); // heap 영역에 필드부에 있는 변수 생성
		// public
		System.out.println(f.pub);

		// protected 같은 패키지내에서는 접근가능 다른 패키지일때 상속일때만 가능
		System.out.println(f.pro);

		// default : 오로지 같은 패키지 내에서만 접근 가능
		System.out.println(f.def);

		// private : 오로지 같은 클래스 에서만 접근 가능
//		System.out.println(f.pri);
	}

}
