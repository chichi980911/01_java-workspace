package com.kh.operator;

import java.util.Scanner;

public class G_Triple {
//	/*
//	 * 삼항연산자 (항목 3개를 가지고 연산해주는 연산자)
//	 * 
//	 * [표현식]
//	 * 1.조건식 ? 조건식이 참일결우 돌려줄 결과값 : 조건식이 거짓일 경우 돌려줄 결과값
//	 * 2.조건식은 반드시 true or false가 나오도록 작성해야한다
//	 * 주로 비교 , 논리 연산자를 통해 작성됨
//	 */
//
//	public void method1() {
//		//입력받은 정수 값이 양수인지 아닌지 판별 후 출력
//		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("정수를 입력해 주세요 : ");
//		int num = sc.nextInt();
//		
////		  1.조건 2 참 /거짓 여부
////		예제1
////		String result =  (num > 0) ? "양수 입니다 " : "양수가 아닙니다";
//		
//		
////		xx은xxxx
////		7은 양수입니다. -99는 음수입니다
////		조건 sysout한번
//		
//		System.out.print("숫자 하나를 입력해 주세요 : ");
//		int num2 = sc.nextInt();
//		
//		String result2 = (num2 > 0)  ? num2 + "는양수입니다" :num2 + "양수가아닙니다";
//		System.out.println(num2 +"은(는)") + ((num > 0) ? "양수입니다." :"양수가 아닙니다"));"
//		System.out.println(result2);
//		sc.close();
//	}
	public void method2() {
		//입력받은 정수값이 짝수인지홀수인지 판별후 
		//3은 홀수 입니다 4는 짝수입니다. 
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요 : ");
		int num = sc.nextInt();
		String result3 =num % 2 == 0 ? "은 짝수입니다" :"짝수입니다.";
		System.out.println(num + "은(는)" + result3);
		
		sc.close();
		
	}
	
	public void method3() {
		//사용자에게 종료여부를 입력 받아 판별해서 출력
		Scanner sc = new Scanner(System.in);
		
		System.out.print("종료하시려면 y를 입력해주세요 : ");
		char ch = sc.nextLine().charAt(0);
		
		String result = (ch == 'y' || ch == 'Y') ? "프로그램을 종료합니다." : "계속진행하겠습니다.";
		System.out.println(result);
		
		sc.close();
		
	}
	//대소문자 구분 ch >= 'A' && ch >= 'Z'
	public void method4() {
		///영문자 하나를 입력받아서, 영어 소문자인지 아닌지 판별 후 출력
		//a 는 소문자 입니다 . F는 소문자가 아닙니다.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("영문자 하나를 입력하세요 : ");
		char ch = sc.nextLine().charAt(0);
		
		String result =(ch >= 'A' && ch >= 'Z') ? "소문자 입니다." : "소문자가 아닙니다";
		System.out.println(result);
		
		sc.close();
	}
	
	public void method5() {
		//삼항연산자 중첩 양수(+5),음수(-55),0(0)
		//기본틀 (비교 대상) ? true대답 : false대답 인데 
		//예를들어 양의정수, 음의정수, 0 3개의 값을 비교하고 싶다면 
		//(비교대산) > true 출력문 : (비교 한번더 ) : true 출력문 : 나머지출력문 (false)
		Scanner sc = new Scanner(System.in);
		System.out.println("정수값 입력 : ");
		int num = sc.nextInt();
		
		String result = (num > 0) ? "양수입니다" : (num == 0) ? "0입니다." : "음수입니다";
		System.out.println(result);
		
		sc.close();
		
	}
	
	public void method6() {
		//1.사용자에게 두개의 정수를 입력 받고
		//2.+ 또는 - 를 입력받아 그에 맞는 연산 결과 출력 
		//3.단, + - 외의 다른문자를 입력했을 경우 "에러 출력문"
		
		//1구현
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 정수 :");
		int num1 =sc.nextInt();
		
		System.out.print("두번째 정수 :");
		int num2 =sc.nextInt();
		//버퍼에 남아있는 값 제거
		sc.nextLine();
		
		System.out.print("연산자 입력 (+ 또는 -) ");
		char op = sc.nextLine().charAt(0);
		
		String result = (op == '+') ? (num1+num2+"") : (op == '-') ? (num1-num2 +"") : "다시입력하세요";
		System.out.println(result);
		
		sc.close();
		
		
	}
}
