package com.kh.practice.comp.func;

import java.util.Scanner;

public class CompExample {
	public void method1() {
		Scanner sc = new Scanner(System.in);

		System.out.print("정수 : ");
		int num = sc.nextInt();

		if (num < 1) {
			System.out.println("양수가아닙니다.");
		}
		for (int i = 1; i <= num; i++) {

			if (i % 2 == 0) {
				System.out.print("수");
			} else if (i % 2 == 1) {
				System.out.print("박");
			}
		}
	}

	public void method2() {
		Scanner sc = new Scanner(System.in);

		for (;;) {

			System.out.print("정수 : ");
			int num = sc.nextInt();

			if (num < 1) {
				System.out.println("양수가아닙니다.");
				continue;
			}
			for (int i = 1; i <= num; i++) {

				if (i % 2 == 0) {
					System.out.print("수");
				} else if (i % 2 == 1) {
					System.out.print("박");
				}
			}
			break;
		}
	}
	public void method3() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 : ");
		String str = sc.nextLine();
		System.out.print("문자 : ");
		char ch = sc.next().charAt(0);
		
		char[] arr = new char[str.length()];
		
		for(int i =0; i<str.length();i++) {
			arr[i]=str.charAt(i);
		}
		
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			
		if(ch==arr[i]) {
			count++;
		}
		}
		System.out.println(str+" 안에 포함된 " + ch + " 개수 : " + count);
	}
}
