package com.kh.chap_01poly.part01.basic.run;

import com.kh.chap_01poly.part01.basic.bodel.vo.Child1;
import com.kh.chap_01poly.part01.basic.bodel.vo.Parent;
import com.kh.chap_01poly.part01.basic.bodel.vo.Child2;

public class PolyRun {

	public static void main(String[] args) {

		// 기억해둘 것 !! '=' 기준으로 해서 왼쪽과 오른쪽의 자료형(타입)은 갈아야됨!
		System.out.println("1.부모타입 레퍼런스로 부모객체를 다루는 경우");

		Parent p1 = new Parent();
		p1.printParent();

		System.out.println("==================================");
		// 2.
		// p1 레퍼헌스로 parent 에만 접근 가능

		System.out.println("2. 자식타입 레퍼런스로 자식객체를 다루는 경우");
		Child1 c1 = new Child1();

		c1.printChild1();
		c1.printParent();
		// 내부적으로 자동형변환 되었다.
		// ((parent)(c1.)).printParent();
		// c1 레퍼런스로 child1 ,parnet 둘다 접근 간능
		// Parent 접근시 자동으로 형변환 된것

		System.out.println("==================================");
		// 3.
		System.out.println("부모타입 레퍼런스로 자식 객체를 다루는 경우 (다형성)");
		Parent p2 = /* (parent) */new Child1(); // >자동 형변환 된것
		p2.printParent();
		((Child1) p2).printChild1(); // 강제 형변환을 하면 호출은 가능!!

		// p2 레퍼런스로 지금 당장은 Parent에만 접근 가능하지만
		// Child1에 접근하고자 한다면 강제형변환을 하면 접근은 가능하다.
//		
//		1.UperCasting
//		자식 타입 > 부모타입 형변환
//		자동형변환
//		ex) 자식 ,부모 메서드

//		2.DownCasting
//		부모타입 > 자식타입 형변환
//		강제형변환 
//		ex)((자식)(부모)).자식 메서드();

//		!상속 구조아니면 안된다

		// 다형성의정의
		// 부모타입으로 부터 파생된 여러 타입의 자식 객체들을 부모클래스 타입 하나로도 다룰 수 있다.

		// 다형성을 쓰는 목적
		// 다형성을 배우기전
		// ex)
		Child1[] arr1 = new Child1[2];
		arr1[0] = new Child1(1, 2, 4);
		arr1[1] = new Child1(2, 3, 5);

		Child2[] arr2 = new Child2[2];
		arr2[0] = new Child2(1, 2, 5);
		arr2[1] = new Child2(2, 6, 8);

		// --------------------------------
		// 다형성(부모타입의 레퍼런스) 적용후
		Parent[] arr = new Parent[4];
		// Parent 타입
		arr[0] = new Child1(1, 2, 4);
		arr[1] = new Child2(1, 2, 5);
		arr[2] = new Child1(2, 3, 5);
		arr[3] = new Child2(6, 4, 2);
		// 하나의 부모 타입만으로 여러 자식 객체들을 받을 수 있음 => 편리하다 코드길이 감소
		System.out.println("--------------------------------");
//		arr[0].printChild1();
		((Child1) arr[0]).printChild1();
		((Child2) arr[1]).printChild2();
		((Child1) arr[2]).printChild1();
		((Child2) arr[3]).printChild2();

		System.out.println("=============반복문 이용해서 출력==========");
		for (int i = 0; i < arr.length; i++) {
			/*
			 * instanceof 연산자 => 연산결과 true / false 현재 레퍼런스가 실질적으로 어떤 클래스 타입을 참조하는지 확인할 때
			 * 사용한다.
			 */

//			if (i == 0 || i==2) {
//				((Child1)arr[i]).printChild1(); 
//			}else{((Child2)arr[i]).printChild2(); }
			if (arr[i] instanceof Child1) {// 해당 레퍼런스가 실제 child1를 참조하고 있다면 true 아니면 false를 바노한
				((Child1) arr[i]).printChild1();
			} else {
				((Child2) arr[i]).printChild2();
			}

		}

//		Parent pp = new Child1();
//		pp.parent();
		/*
		 * 동적바인딩 
		 * 프로그램이 실행되기 전에는 컴파일 되면서 정적바인딩(레퍼런스 타입의 메서드를 가리킴 )
		 * 단, 실질적으로 참조하는 자식클래스에 해당 메서드가 오버라이딩 돼있다면 
		 * 프로그램 실행시 동적으로 그 자식클래스의 오버라이딩 된 메서드를 찾아서 실행
		 */
		System.out.println("============");
		for(int i =0; i<arr.length; i++) {
			arr[i].parent();
		}
		
		
	}
}
