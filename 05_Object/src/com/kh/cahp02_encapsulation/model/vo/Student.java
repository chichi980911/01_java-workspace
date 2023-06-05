package com.kh.cahp02_encapsulation.model.vo;

public class Student {
	//나만의 자료형 
	//필드
	//접근제한자 자료형 변수명 
	private String name;
	private int age;
	private double height;
	private int kScore;
	private int mScore;

	
	//메소드
//	표현법
//	접근제한자 [예약어] 반환형(void=반환 값 x ) 메소드명([매개변수]){
//	실행코드}
	
	
//	private void method1(int a ) {//매개변수
//		int b =10;//일반변수
//	}
//	
	
// setter 메소드
// 해당 필드에 대입시키고자 하는 값 전달 받아 해당 필드에 대입시켜주는 기능의 메소드 

	
//	public void setName(String newName) {
////		System.out.println(newName);
////		매개변수 : 해당 메소드 호출시 전달값을 받아주기 위한 변수 선언문
//		
//		name = newName;
		
		public void setName(String name) {//관례적인 표현
			//name = name; 색이 없음 
			//필드명과 매개변수명이 동일한 시점에는 해당 메소드 영역에서 만들어진 변수가 우선순위가 더 높다.
			this.name = name; //필드부 name 과 받아올 매개변수 name
	}
		public void setAge(int age) {
			this.age = age;
		}
		public void setHeight(double height) {
			this.height = height;
		}
		public void setKScore(int kScore) {
			this.kScore = kScore;
		}
		public void setMScore(int mScore) {
			this.mScore = mScore;
		}
		

		//getter 메소드 
		//해당 필드에 담긴 값을 반환 해주는 역활을 수행
		public String getName() { // void 아니다 어떤 자료형을 던져줄지 써야한다.
			return name;
		}
		public int getAge() {
			return age;
		}
		public double getHeight() {
			return height;
		}
		public int getKScore() {
			return kScore;
		}
		public int getMScore() {
			return mScore;
		}
	}

