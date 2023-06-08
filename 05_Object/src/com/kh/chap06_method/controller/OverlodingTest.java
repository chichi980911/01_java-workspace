package com.kh.chap06_method.controller;

public class OverlodingTest {
	
	//오버로딩 : 한 클래스 내에 같은 메서드명으로 정의할 수 있는것
	//메서드의 이름은 같고 **매개변수**의 **개수/타입**이 다르면 같은 메서드명으로 오버로딩 가능하다.
	//반환형 타입을 다르게 사용해도 의미가 없으며 무조건 매개변수 타입 또는 개수가 달라야한다.
	//다양한 유형의 호출에 응답할 수 있도록 하는 방식 - 다형성
	
	public void test() {
		System.out.println("a");
	}
	
//	public void test() {
//		System.out.println("b");
//		
//	}
	public void test(int a) {
		
	}
	public void test(int a,int b) {

	}
	public void test(int a,String b) {
	}
	public void test(String a , int b) {
		System.out.println("1111");
	}
	public void test(String str) {
		
	}
//	public int test(String str) {
//		
//	}
}
