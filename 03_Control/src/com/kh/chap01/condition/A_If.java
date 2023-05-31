package com.kh.chap01.condition;

import java.util.Scanner;

public class A_If {
	/*
	 * 기본적으로 프로그램 진행은 순차진행 단,순차적인 흐름을 바꾸고자 한다면 제어문이라는걸 이용해서 직접 제어 가능
	 * 
	 * 선택적으로 실행시키고자 할 떄 => 조건문 반복적으로 실행시키고자 할 떄 => 반복문 그 외의 흐름을 제어 => 분기문
	 * 
	 * *조건문 "조건식" 을 통해 참이냐 거짓이냐를 판단해서 참일 경우 그에 해당하는 코드 실행 조건식의 결과 true / false 여야한다
	 * 보통 조건식에서는 비교연산자 (대소,동등), 논리연산자 (&& , ||)를 주로 사용한다.
	 * 
	 * *조건문은 크게 if 문과 switch문으로 나뉨
	 */

	public void method1() {
		Scanner sc = new Scanner(System.in);

		System.out.println("정수 하나 입력 : ");
		int num = sc.nextInt();

		/*
		 * **단독 if 문 [표현법] if(조건식) { ..실행시키고자 하는 코드 }
		 * 
		 * 조건식은 if 랑 친하다.
		 * 
		 * ==>조건식이 참(true)일 경우 => 중괄호 블럭 안의 코드 실행 ==>조건식이 거짓 (false)인 경우 => 중괄호 블럭 안의 코드
		 * 무시하고 넘어감
		 * 
		 */

		if (num > 0) {
			System.out.println("양수다");
		}
		if (num <= 0) {
			System.out.println("양수가 아니다");
		}

	}

	public void method2() {
		Scanner sc = new Scanner(System.in);

		System.out.printf("정수 하나 입력 : ");
		int num = sc.nextInt();

		if (num > 0) {
			System.out.println("양수다");
		} else {
			System.out.println("양수가아니다");
		}
	}

	public void method3() {
		Scanner sc = new Scanner(System.in);

		System.out.print("정수 하나 입력 : ");
		int num = sc.nextInt();
		/*
		 * *if -else if - else문 같은 비교대상으로 여러개의 조건을 제시해야 될 경우 [표현식] if(조건식){ ..실행코드1
		 * }else if(조건식){ 실행코드2.. }else if(조건식){ 실행코드2.. }else{ 실행코드 3.. 생략가능 }
		 */

		if (num > 0) {
			System.out.println("양수다.");
		} else if (num == 0) {
			System.out.println("0이다");
		} else {
			System.out.println("음수다");
		}
	}

	public void method4() {
		// 사용자에게 나이를 입력받아 어린이 청소년 성인
		// ~13 이하 : 어린이
		// 13초과~19 세 이하 : 청소년
		// 19세초과 : 성인
		Scanner sc = new Scanner(System.in);

		System.out.print("나이를 입력 해주세요 : ");
		int age = sc.nextInt();

//		 if(age <= 13){
//			 System.out.println("어린이입니다.");
//		 }else if(age <= 19) {
//			 System.out.println("청소년입니다.");
//		 }else {
//			 System.out.println("성인입니다");
//		 }
		String result;
		if (age <= 13) {
			result = "어린이입니다.";
		} else if (age <= 19) {
			result = "청소년입니다.";
		} else {
			result = "성인입니다";
		}
		System.out.println(result);
	}

	public void method5() {
		// 이름,성별 입력
		// 성별M(m),F(f) 입력하면 남학생이다. 여학생이다.
		// 단,성별을 잘못 입력하면 성별을 잘못 입력하셨습니다.

		Scanner sc = new Scanner(System.in);

		System.out.print("이름 : ");
		String name = sc.nextLine();

		System.out.print("성별(M(m)/F(f) : ");
		char gender = sc.next().charAt(0);

//		if(gender == 'M' || gender == 'm'){
//			System.out.println("남학생이다.");
//		}else if (gender == 'F'|| gender == 'f') {
//			System.out.println("여학생이다.");
//		}else {
//			System.out.println("성별을 잘못 입력하셨습니다");
//		}
		String result = ""; // 변수 초기화
		if (gender == 'M' || gender == 'm') {
			result = "남학생";
		} else if (gender == 'F' || gender == 'f') {
			result = "여학생.";
		} else {
			System.out.println("성별을 잘못 입력하셨습니다");
			return;// 해당 이 메소드 자체를 빠져나가는 구문
					// 여기서 breack를 썻다면 아래 Sysout 출력 하기 때문에 return 사용
		}
		System.out.println(name + "님은 " + result + "입니다");

	}

	public void method6() {
		Scanner sc = new Scanner(System.in);

		System.out.print("이름 입력 : ");
		String name = sc.nextLine();

		/*
		 * 1, 1, 2, 4, 8, 4, 8, 2 기본자료형:boolean,byte,short,int,long,float,double,char
		 * 참조자료형:String
		 * 
		 * 기본자료형들 끼리는 동등 비교시에는 ==,!= 사용가능하다 단 참조자료형은 ==,!= 사용시 정상적으로 비교가 되지 않는다.
		 * =>equals()메소드를 이용해서 비교해야한다. [표현법] 문자열.equals(문자열);
		 */

		/*
		 * String == 비교 불가능 if(name =="차은우") { System.out.println("차은우님 반갑습니다."); }else
		 * { System.out.println("안녕히 가세요"); }
		 */

		if (name.equals("차은우")) {
			System.out.println("차은우님 반갑습니다.");
		} else {
			System.out.println("안녕히 가세요");
		}

	}

	// 조건문 중첩 사용
	public void method7() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 입력(양수만) : ");
		int num =sc.nextInt();
		
		
		if(num > 0){//양수일경우 짝홀가리기
			if(num % 2 ==0) {//양수이면서 짝수일 경우
				System.out.println("짝수입니다.");
			}else {
				System.out.println("홀수입니다");
			}
			
			}else {
			System.out.println("양수가 아닙니다. 잘못 입력하셨습니다.");
		}
	}
}
