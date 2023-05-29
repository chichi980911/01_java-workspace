package com.kh.operator;

import java.util.Scanner;

public class E_Logical {
	/*
	 * 논리연산자 (이항연산자)
	 * 두 개의 논리값(true , false)을 연산해주는 연산자
	 * 논리연산한 결과마저도 논리값이다
	 * 
	 * 논리값 && 논리값 : 왼쪽과 오른쪽 둘다 true일 경우 결과값은 true
	 * 논리값 || 논리값 : 왼쪽과 오른쪽 둘다 true일 경우 결과값은 true
	 * 
	 */
	public void method1() {
		
		//사용자가 입력한 정수값이 1부터100사이의 값인지 확인
		
		System.out.print("정수 하나 입력 : ");
		Scanner sc = new Scanner(System.in);
		int num =sc.nextInt();
		
//		boolean result = (1 <= num <=100); 쪼개서 해야함
		boolean result = (num >= 1) && (num <= 100); 
		//true true일때만 true 반환 num 값이 1이상이고 num값이 100이하
		//&&의미 : ~이고,그리고, ~하면서
		
		System.out.println("사용자가 입력한 값이 1이상 100이하 입니까? :" + result);
		//&&  : 두개의 조건 모두가 true여야 && 연산의 결곽밧이 최종적으로 true
		// 	  : 둘중에 하나라도 false가 있을 경우 && 연산의 결과값은 false
		sc.close();
	}
	public void method2() {
		//사용자가 입력한 문자값이 영어 대문자인지 확인 'A~Z': A = 65~90
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자 하나 입력 : ");
		char ch = sc.nextLine().charAt(0);
		
		//첫번쨰 방법 boolean result = (65 <= ch <=90); 불가능하기 떄문에 쪼개기
//		boolean result = (ch >= 65) && (ch <= 90);
//		System.out.println("사용자가 입력한 값이 대문자 입니까? :" + result);

		//두번째 방법 
		boolean result2 = (ch >= 'A')&& (ch <= 'Z');
		System.out.println("사용자가 입력한 값이 대문자 입니까? :" + result2);
		sc.close();
	}
	public void method3() {
		//사용자에게 성별을 입력 받은 후 여자인지 확인
		Scanner sc = new Scanner(System.in);
		
		System.out.print("성별을 입력해주세요 (M/F) : ");
		char gender =sc.nextLine().charAt(0);
		
		boolean result =(gender =='F') || (gender == 'f');
		// ||의미 : ~이거나 , 또는 ~
		System.out.println("사용자가 여자입니까? " + result);
		// || : 두개의 조건중 하나라도 true가 있다면 || 연산의 결과값은 true
		//      두개의 조건중 모두 false || 연산의 결과값이 false
		sc.close();
		
	}
	public void method4() {
		//사용자에게 입력을 받아 게임을 종료하는 프로그램
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("게임을 종료하시려면 y를 입력해주세요 : ");
		char ch = sc.nextLine().charAt(0);
		
		boolean result = (ch == 'y') || (ch == 'Y');
		System.out.println("사용자가 입력한 값이 y 또는 Y 입니까? " + result);

		//&& : 두개의 조건이 모두 true 여야 결과값이 true 이다 
		//(AND == ~이고 , 그리고 , ~이면서 , ~뿐만아니라)
		//true && true => true
		//true && false => false
		//false && true => false
		//false && false => false
		//&&연산자 기준으로 앞의결과가 false 인경우 뒤의 조건 실행하지 않는다.
		
		// || : 두개의 조건중 하나라도 true라면 결과값이 true 이다 (or = 또는, ~이거나)
		//true || true => true
		//true || false => true
		//false || true => true
		//false || false => false
		//||연산자 기준으로 앞의결과가 true 인경우 뒤의 조건 굳이 실행하지 않는다.
		sc.close();
		
	}
	
	public void method5() {
		int num = 10;
//		boolean result1 =(num < 5) && (++num >0);
		boolean result1 =(num > 5) && (++num >0);
		System.out.println("result1 : " + result1);
		System.out.println("num : " + num);
		
		int num2 = 10;
//		boolean result2 = (num2 < 20) || (++num2 > 0 );
		boolean result2 = true || (++num2 > 0); 
		//Dead code : 절대 실행될일 없는 코드
		
		System.out.println("result2 : " + result2);
		System.out.println("num2 : " + num2);
		
		
	}
}
