package com.kh.func;

import java.util.Scanner;

public class VariavlePractic4 {
	public void InputTest11() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열을 입력하세요 : ");
		String fruit =sc.nextLine();
		
		
		System.out.println("첫 번째 문자 : "+fruit.charAt(0));
		System.out.println("두 번째 문자 : "+fruit.charAt(1));
		System.out.println("세 번째 문자 : "+fruit.charAt(2));
	}

}
