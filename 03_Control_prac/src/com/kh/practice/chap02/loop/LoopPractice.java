package com.kh.practice.chap02.loop;

import java.util.Scanner;

//스캐너
public class LoopPractice {
	public void method1() {
		// 사용자로 부터 양의 정수를 입력 받고 1~ 받은 정수 까지 출력
		// 1미만인 숫자를 입력한 경우 에러문구 출력

		Scanner sc = new Scanner(System.in);

		System.out.print("1이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();
		int j = 1;

		if (num > j) {
			for (int i = 1; i <= num; i++) {
				System.out.print(i + " ");
			}

		} else {
			System.out.println("1이상의 숫자를 입력하세요");
		}
	}

	public void method2() {

		Scanner sc = new Scanner(System.in);

		for (;;) { // 추가
			System.out.print("1이상의 숫자를 입력하세요 : ");
			int num = sc.nextInt();
			int j = 1;

			if (num > j) {
				for (int i = 1; i <= num; i++) {
					System.out.print(i + " ");
				}
				break; // 추가
			} else {
				System.out.println("1이상의 숫자를 입력하세요");
			}
		}
	}

	public void method3() {
		Scanner sc = new Scanner(System.in);

		System.out.print("1이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();
		int j = 1;

		if (num >= j) {
			for (int i = 1; i <= num; num--) {
				System.out.print(num + " ");
			}

		} else {
			System.out.println("1이상의 숫자를 입력하세요");
		}
	}

	public void method4() {
		Scanner sc = new Scanner(System.in);
		for (;;) {
			System.out.print("1이상의 숫자를 입력하세요 : ");
			int num = sc.nextInt();
			int j = 1;

			if (num >= j) {
				for (int i = 1; i <= num; num--) {
					System.out.print(num + " ");
				}
				break;

			} else {
				System.out.println("1이상의 숫자를 입력하세요");
			}
		}
	}

	public void method5() {
		Scanner sc = new Scanner(System.in);

		System.out.print("정수를 하나 입력하세요 : ");
		int num = sc.nextInt();

		if (num > 0) {
			int sum = 0;
			for (int i = 1; i <= num; i++) {
				sum += i;
			}
			System.out.println("1부터" + num + "까지의 값 : " + sum);
		}

	}

	public void method6() {
		Scanner sc = new Scanner(System.in);

		System.out.print("첫 번쨰 숫자 : ");
		int num = sc.nextInt();
		System.out.print("두 번쨰 숫자 : ");
		int num2 = sc.nextInt();

		if (num <= num2) {
			for (int i = num; i <= num2; i++) {
				System.out.println(i);
			}
		} else {
			for (int i = num2; i <= num; i++) {
				System.out.println(i);
			}
		}

//			if (start <= end) {
//	            for (int i = start; i <= end; i++) {
//	                System.out.println(i);
//	            }
//	        } else {
//	            for (int i = start; i >= end; i--) {
//	                System.out.println(i);
//	            }
	}

	public void method7() {
		Scanner sc = new Scanner(System.in);

		System.out.print("첫 번쨰 숫자 : ");
		int num = sc.nextInt();
		System.out.print("두 번쨰 숫자 : ");
		int num2 = sc.nextInt();

		if (num <= num2 && num >= 1 && num2 >= 1) {
			for (int i = num; i <= num2; i++) {
				System.out.print(i + " ");
			}
		} else if (num < 1 || num2 < 1) {
			System.out.println("1이상의 숫자를 입력해주세요");

		} else {
			for (int i = num2; i <= num; i++) {
				System.out.print(i + " ");
			}
		}

	}

	public void method8() {

		Scanner sc = new Scanner(System.in);

		System.out.print("숫자 : ");
		int num = sc.nextInt();
		System.out.println("==== 4단 ====");
		for (int i = 1; i < 10; i++) {

			System.out.println(num + " X " + i + " = " + num * i);
		}

	}

	public void method9() {

		//// 스캐너 사용
		/// 2~9까지 구구단 출력
		/// 입력받은 단부터 시작하도록 조건
		// 9를 초과하는 숫자가 들어오면 9이하 숫자 출력
		Scanner sc = new Scanner(System.in);

		System.out.print("숫자 : ");
		int num = sc.nextInt();

		if (num > 9) {
			System.out.println("9이하의 숫자만 입력해주세요");
		} else {
			for (int j = num; j < 10; j++) {
				System.out.println("====" + j + "단 ====");
				for (int i = 1; i < 10; i++) {

					System.out.println(j + " X " + i + " = " + j * i);
				}
				System.out.println();
			}

		}

	}

	public void method10() {
		Scanner sc = new Scanner(System.in);
		for (;;) {
			System.out.print("숫자 : ");
			int num = sc.nextInt();

			if (num > 9) {
				System.out.println("9이하의 숫자만 입력해주세요");
				continue;
			} else {
				for (int j = num; j < 10; j++) {
					System.out.println("====" + j + "단 ====");
					for (int i = 1; i < 10; i++) {

						System.out.println(j + " X " + i + " = " + j * i);
					}
					System.out.println();
				}
				break;

			}

		}
	}

	public void method11() {
		Scanner sc = new Scanner(System.in);

		System.out.print("시작 숫자 : ");
		int num1 = sc.nextInt();
		System.out.print("공차 : ");
		int num2 = sc.nextInt();

		for (int i = 0; i < 10; i++) {
			System.out.print(num1 + " ");
			num1 += num2;
		}

	}

	public void method12() {
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("연산자 (+, -, *, /, %): ");
			String sign = sc.nextLine();

			if (sign.equals("exit")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}

			System.out.print("정수1: ");
			int num1 = sc.nextInt();
			System.out.print("정수2: ");
			int num2 = sc.nextInt();

			sc.nextLine();//버퍼제거
			
			if (sign.equals("/") && num2 == 0) {
				System.out.println("0으로 나눌 수 없습니다. 다시 입력해주세요.");
				
				continue;
			}

			int result;
			switch (sign) {
			case "+":
				result = num1 + num2;
				System.out.println(num1 + " + " + num2 + " = " + result);
				break;
			case "-":
				result = num1 - num2;
				System.out.println(num1 + " - " + num2 + " = " + result);
				break;
			case "*":
				result = num1 * num2;
				System.out.println(num1 + " * " + num2 + " = " + result);
				break;
			case "/":
				result = num1 / num2;
				System.out.println(num1 + " / " + num2 + " = " + result);
				break;
			case "%":
				result = num1 % num2;
				System.out.println(num1 + " % " + num2 + " = " + result);
				break;
			default:
				System.out.println("없는 연산자입니다. 다시 입력해주세요.");
			}
		}

		sc.close();
	}

	public void method13() {
		Scanner sc = new Scanner(System.in);

		System.out.print("정수 입력: ");
		int num = sc.nextInt();

		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public void method14() {
		Scanner sc = new Scanner(System.in);

		System.out.print("정수 입력: ");
		int num = sc.nextInt();

		for (int i = 1; i <= num; i++) {
			for (int j = i; j <= num; j++) {

				System.out.print("*");
			}
			System.out.println();
		}
	}
}
