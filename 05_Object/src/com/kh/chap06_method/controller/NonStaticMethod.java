package com.kh.chap06_method.controller;

public class NonStaticMethod {
	/*
	 * 
	 * 패키지명:소문자 시작
	 * 클래스명:대문자로 시작
	 * 변수명:소문자로 시작
	 * 메소드명: 소문자로 시작 
	 * 공통:카멜케이스
	 * 
	 * 
	 * 메소드 
	 * 표현법
	 * 접근제한자[예약어 (생략가능)]반환형(반환값의 자료형) 메소드명([매개변수1,매개변수2...]){
	 * 수행내용;
	 * [return 결과값;]
	 * }
	 */
	
	
	//1. 매개변수 없고 반환값도 없는 메서드
	public void method1() {
//		return 0;
		System.out.println("매개변수와 반환값이 둘다 없는 메서드 입니다");
	}
	
	//2.매개변수 없고 반환값은 있는 메서드
	public String method2() {
		System.out.println("매개변수는 없고 반환값은 있다.");
		return "123";
	}
	//3.매개변수는 있고 반환값은 없는 메서드
	public void method3(int num1, int num2) {
		System.out.println("매개변수는 있고 반환값은 없는 메서드 입니다.");
		
		if(num2 != 0) {
			System.out.println("num1 / num2 : " + num1 / num2 );
		}else {
			System.out.println("0으로 나눌 수 없습니다.");
		}
	}
	
	//4.매개변수도 있고 반환값도 있는 메서드
	//문자열의 정수값을 전달 받아서 해당 문자열의 해당 정수 인덱스의 문자값을 뽑아서 반환
	//apple 전달받아서 2번 인덱스 뽑아줘
	public char method4(String str, int index) {
		System.out.println("매개변수와 반환 값 둘다 있는 메서드 입니다.");
		return str.charAt(index);
	}
	

}
