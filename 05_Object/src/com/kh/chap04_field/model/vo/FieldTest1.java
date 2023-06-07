package com.kh.chap04_field.model.vo;

/*
 * >>변수 구분 
 * 
 * -전역변수 :클래스 영역에 바로 선언한 변수 --> 클래스 내에서면 어디서든 전역으로 다 사용 가능
 * 
 * -지역변수 :클래스 영역 내 특정 구역({}에 선언한 변수 ex)메소드내 변수)-->선언된 지역에서만 사용가능하다.
 * 			*특정한 구역 : 메소드{}, 제어문(if , for){}등등...
 * 
 * 
 * 1.전역변수
 * -필드 == 멤버변수 == 인스턴스 변수
 * 생성시점:new 연산자를 통해서 객체 생성시
 * 소멸시점:객체 소멸시 같이 소멸
 * 
 * 클래스 변수 ==static변수 => 예약어 static 을 붙히면 클래스변수가 된다.
 * 
 * 2.지역변수 
 * 생성시점:지역변수가 속해 있는 구역({}) 실행 또는 호출될 때 메모리 영역에 할당 
 * 소멸시점:특정한 구역({}) 종료시 소멸
 * 
 */

public class FieldTest1 { //클래스 영역 시작
	//전역변수 
	private int a;
	
	public void method1() {
		int b = 10; // 지역변수 
		System.out.println(b);
		
		if(true) {
			int c = 20;
		}
	}
	
	
	public void method2() {
		System.out.println("변수a의값 : " + a);
	
	}
	//멤버변수(인스턴스 변수) => 전역변수 
	private int global; 
	
	
	public void test(int num) {//test 메서드 시작}
	//매개 변수 또한 지역변수 즉 , 메소드 영역 내에서만 쓸 수 있다.
		
	//지역변수(메소드 영역내 에 선언)
	//int local;
	int local = 10;

	
	//멤버변수 출력
	//멤버변수는 해당 객체 생성시 jvm이 초기화
	//초기화 x ,하지만 오류나지 않는다 new 연산자를 만나면 heap 영역에 생성됨
	System.out.println("global 값 : "+ global);
	
	//매개변수 출력
	//매개변수는 메서드 호출시 반드시 인자값을 받을 거기 떄문에 초기화 되어 있지 않아도된다.
	System.out.println(num);
	
	//지역변수 출력
	System.out.println(local);
	}//test 메서드 영역 끝
	
} //클래스영역 끝
