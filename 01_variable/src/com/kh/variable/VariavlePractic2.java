package com.kh.variable;

import java.util.Scanner;

public class VariavlePractic2 {
	public void InputTest10() {
		
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
