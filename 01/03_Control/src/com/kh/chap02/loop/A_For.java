package com.kh.chap02.loop;

import java.util.Scanner;

public class A_For {
	/*
	 * 반복문 프로그램 흐름을 제어하는 제어문 중 하나 어떤 실행코드를 반복적으로 수행시켜줌
	 * 
	 * 크게 두 종류로 나뉨(for 문 / while문(do -while문))
	 * 
	 * *for문 [표현법] for (초기식; 조건식; 증감식 ){//반복 횟수를 지정하기 위해 제시하는 것들 반복적으로 실행시키고자 하는 구문;
	 * } -초기식 : 반복문이 수행될 때 "시작부분에서 처음 한번만 실행되는 구문" (보통 반복문 안에서 사용될 변수를 선언 및 초기화 하는
	 * 구문) -조건식 : "반복문이 수행될 조건"을 작성하는 구문 조건식이 true일 경우 해당 구문을 실행 조건식이 fasle가 되는 순간
	 * 반복을 멈추고 빠져나옴 (보통 초기식에 제시된 변수를 가지고 조건식을 작성한다.)
	 * 
	 * -증감식 : 반복문을 제어하는 변수 값을 증감 시키는 구문 (보통 초기식에 제시된 변수를 가지고 증감연산자 (++,--)를 사용함)
	 * 
	 */
	public void method1() {
		// "안녕하세요"를 5번 반복해서 실행하기
		for (int i = 1; i <= 5; i++) {// i값이 1에서 5까지 매번 1 증가하는 동안 반복 수행
			// 반복할 코드
			System.out.println("안녕하세요");

		}
		for (int i = 0; i <= 4; i++) {// i값이 0에서 4까지 매번 1씩증가하는 동안 반복 수행
			// (0,1,2,3,4) 총 5회수행 후 for 문 빠져나옴
			System.out.println("반갑습니다");
		}

		for (int i = 11; i <= 15; i++) {// i값이 11에서부터 15까지 매번 1씩 증가하는 동안
			// 반복수행(11,12,13,14,15=>총 5회수행)
			System.out.println("저리가세요");
		}

		for (int i = 1; i <= 9; i += 2) {// 5번 수행 }
			System.out.println("HI");// i값이 1에서 0까지 매번 2씩 증가하는 동안 반복 수행

		}
	}

	public void method2() {
		for (int i = 1; i <= 5; i++) {
			// 1~5까지 출력해라
			// 출력할 수 있는 방법 Sysout 5번 찍고 반복되는 구문과 반복되지 않는 구문 구분
			// 반복 구문 입력 후 반복되지 않는 구문 ()칸에 넣기
			System.out.println(i);
		}
	}

	public void method3() {
		for (int i = 5; i >= 1; i--) {
			System.out.print(i + " ");
		}
	}

	public void method4() {
		// 1부터 10까지의 홀수만을 출력
//		for(int i= 1; i <= 10; i+=2 ) { //i값이 1에서부터 9까지 매번 2씩증가되는 동안 반복 수행 총5회
//			System.out.print(i+" ");
//			
//		}

		for (int i = 1; i <= 10; i++) {// i값이 1부터 10까지 매번 1씩 증가되는동안 반복 수행 (10번)
			if (i % 2 == 1) {// i를 2로 나눈 나머지가 1 =홀수
				System.out.print(i + " ");
			}
		}
	}

	public void method5() {
		// 1 2 3 4 5~ 10 까지 for문 고정
		for (int i = 0; i <= 9; i++) {
			System.out.println((i + 1) + " ");
		}

	}

	// 누적합
	public void method6() {
		// 1에서부터 10까지의 총합계

		// 방법1.int sum = 1 + 2 + 3 ~10;
		// 방법2.
		/*
		 * int sum = 0; sum += 1; => sum = sum + 1; 0+1 sum += 2; => sum = sum + 2;
		 * 0+1+2 sum += 3; => sum = sum + 3; 0+1+2+3 sum 변수에 누적해서 합산하는게 반복적으로 진행됨 단 누적해서
		 * 더하고자 하는 값이 1에서부터 10까지 1씩 증가되는걸 파악할 수 있음
		 */
		int sum = 0;

		for (int i = 1; i <= 10; i++) {

			sum += i;// 누적합공식
		}
		System.out.println("1부터 10까지의 합: " + sum);
	}

	public void method7() {
		// 사용자에게 값을 입력받아 1부터 입력받은 수가까지의 합계 출력
		Scanner sc = new Scanner(System.in);
		//while문 
		while(true) {
			System.out.print("1이상의 정수 :  ");
			int num = sc.nextInt();

			if (num > 0) {
				//누적합
				//1.sum변수 생성
				int sum = 0;
				//2.for문 돌리기
				for (int i = 1; i <= num; i++) {
					sum += i;
				}
				System.out.println("1부터" + num + "까지의 합 : " + sum);
				break;
			} else {
				System.out.println("잘못 입력했습니다. 다시 입력해주세요");
			}
		}

//		System.out.println("1이상의 정수 :  ");
//		int num = sc.nextInt();
//
//		if (num > 0) {
//			//누적합
//			//1.sum변수 생성
//			int sum = 0;
//			//2.for문 돌리기
//			for (int i = 1; i <= num; i++) {
//				sum += i;
//			}
//			System.out.println("1부터" + num + "까지의 합 : " + sum);
//
//		} else {
//			System.out.println("잘못 입력했습니다");
//		}

	}

	public void method8() {
		// 1에서부터 어떤 랜던값(1~10 사이의 랜덤값) 까지의 총 합계
		// 자바에서 제공하는 Math 클래스 활용

		/*
		 * java.lang.Math 클래스 에서 제공하는 random() 메소드 호출 매번 다른 랜덤값을 얻어낼 수 있음 Math.random();
		 * 0.0 ~ 0.999999 사이의 랜덤값 발생
		 * 
		 */
		// int random = Math.random(); //double 형이라서 안됨 double>int
		// int random = Math.random() *10;
		// 0.0 ~10.0 > 0.0 ~ 9.99999
		// int random = Math.random() * 10+1;
		// 1.0.~11.0 > 1.0~10.99999
		int random = (int) (Math.random() * 10 + 1);
		// 1<= random <11 1~10

		// Math.random 공식 = Math.random()* 10 + 1
		// 시작수부터+n개 + 시작수

		System.out.println("랜덤값 : " + random);

		// 누적합 구하는 공식
		// 1.sum 변수 만들기
		int sum = 0;
		// 2.for문 돌리기
		for (int i = 1; i <= random; i++) {
			sum += i;
		}
		// 1부터 random 까지의 합계
		System.out.println("1부터" + random + "까지의 합계 : " + sum);

	}

	public void method9() {
		String str = "Hello";
		// 각 인덱스별 문자를 뽑아서 출력
		/*
		 * H =>str.charAt(0); 출력 e =>str.charAt(1); 출력 l =>str.charAt(2); 출력 l
		 * =>str.charAt(3); 출력 o =>str.charAt(4); 출력
		 * 
		 */

		for (int i = 0; i <= 4; i++) {
			System.out.println(str.charAt(i));
		}
	}

	public void method10() {
		// 사용자에게 문자열 입력 받아서 (str 변수에 대입 )

		Scanner sc = new Scanner(System.in);

		System.out.print("문자열 입력 : ");
		String str = sc.nextLine();

		// 각 인덱스별 문자를 뽑아서 출력

		// apple의 길이 : 5글자
		// 01234

		// strawberry : 10글자
		// 0123456789

		// kiwi : 4글자
		// 0123 :

		// 아하! 마지막 인덱스는 항상(문자열의 길이 -1) 이구나..
		// 추출하고자 하는 인덱스값(문자열의 길이 -1) 까지 매번 1씩 증가
		System.out.println("문자열의 길이 : " + str.length());

		for (int i = 0; i <= str.length() - 1; i++) {
			System.out.println(str.charAt(i));
		}
		/*
		 * i<=str.length()-1; > i<str.length(); 또는 for(int i=0; i<str.length(); i++) {
		 * System.out.println(str.charAt(i)); }
		 * 
		 */

	}

	public void method11() {
		// 구구단 출력
		// 2단 출력하기

		/*
		 * 2 x 1 = 2 2 x 2 = 4 2 x 3 = 6 .. 2 x 8 = 16 2 x 9 = 18
		 */

		for (int i = 1; i < 10; i++) {
//				System.out.println("2 x " + i + " = "+ 2*i);
			System.out.printf("%d x %d = %d\n", 2, i, 2 * i);

		}

	}

	public void method12() {
		// 사용자에게 단을 입력 받아 구구단을 출력하세요
		// int dan;
		// 2~9사이의 정수를 입력 받기
		// 다른 숫자를 입력 했을 경우 :2~9사이의 숫자를 입력해야 합니다.문구 출력
		Scanner sc = new Scanner(System.in);

		System.out.print("구구단 생성 (2~9사이의 정수를 입력해주세요) : ");
		int dan = sc.nextInt();

		if (dan >= 2 && dan < 10) {
			for (int i = 1; i < 10; i++) {
				System.out.printf("%d x %d = %d\n", dan, i, dan * i);
			}
		} else {
			System.out.println("2~9 사이의 숫자를 입력해야 합니다.");
		}
	}

	public void method13() {
		// 2~9사이의 랜덤값을 발생시켜서 랜덤 단을 출력하기
		int dan = (int) (Math.random() * 8 + 2); // 2가 시작수 ,시작수로 부터 몇개의 랜덤값 발생시킬지 곱하면 된다.

		System.out.println("===" + dan + "단===");
		for (int i = 1; i < 10; i++) {
			System.out.printf("%d x %d = %d\n", dan, i, dan * i);
		}

	}

	public void method14() {
		// for문 중첩
		// 1 2 3 4 5
		// 1 2 3 4 5
		// 1 2 3 4 5

		for (int j = 1; j <= 3; j++) {// 3번 반복
			for (int i = 1; i <= 5; i++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
//			for(int i = 1; i<=5; i++) {
//				System.out.print(i+" ");
//			}
	}

	public void method15() {
		// ****
		// ****
		// ****
		// ****

		// 행은 1~4 까지 반복 => 바깥쪽 for 문
		// 매 행이 고정일 때 열은 1~4 까지 반복 => 안쪽 for 문
		for (int j = 1; j < 5; j++) {
			for (int i = 1; i <= 4; i++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

	public void method16() {
		// 1*** =>1행1열
		// *2** =>2행2열
		// **3* =>3행3열
		// ***4 =>4행4열

		for (int j = 1; j <= 4; j++) {// 행
			for (int i = 1; i <= 4; i++) {// 열
				if (j == i) { // 행과 열이 같아질 때 숫자로 표기 i , j 값은 같기 때문에 어떤값이 들어가도 상관이 없다.
					System.out.print(i);
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}

	public void method17() {
		//2단부터 9단까지출력
		//한단을 나오게 해 
		for(int j = 2; j < 10; j++) {
			for(int i = 1; i < 10; i++) {
				System.out.println(j + " X " + i +" = " + j*i);
			}
			System.out.println();
		}
	}
	public void method18() {
		for(;;) {// 조건식 자리 생략시 기본적으로 true =? 무한 반복문
			System.out.println();
		}
	}

}
