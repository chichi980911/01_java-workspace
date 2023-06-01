package com.kh.func;

import java.util.Scanner;

public class VariavlePractic2 {
	public void InputTest10() {
		/*
		 * 1.스캐너 생성
		 * 2.두 수를 입력 받는 가이드 문구 출력 및 입력받기 
		 * 3.연산결과 출력
		 * 4.스캐너 반납
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 정수를 입력 해 주세요 :");
		int a = sc.nextInt();
		System.out.println("첫번 째 정수 : " + a);
		
		System.out.print("두번째 정수를 입력 해 주세요 : ");
		int b = sc.nextInt();
		System.out.println("두번 째 정수 : " + b);
		
		System.out.println("더하기 결과 : " + (a+b));
		System.out.println("빼기 결과 : " + (a-b));
		System.out.println("곱하기 결과 : " + (a*b));
		System.out.println("나누기 몫 결과 : " + (a/b));
		
		
		
		
	}

}
