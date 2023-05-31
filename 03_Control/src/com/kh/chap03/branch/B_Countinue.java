package com.kh.chap03.branch;
//
public class B_Countinue {
	/*
	 * continue = 반복문 안에 기술되는 구문 continue; 구문 실행시 그 뒤의 구문을 실행하지 않고 현재 속해있는 반복문 위로
	 * 올라간다.
	 * 
	 */

	public void method1() {
		// for문으로 1 ~ 10 까지의 홀수 출력 1 3 5 7 9
		/*
		 * for(int i = 1; i<=9; i++) { if(i % 2 ==1) { System.out.print(i+ " "); } }
		 */
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) { // i값이 짝수일 경우
				continue; // 건너뛰기
				// 반복문을 실행하지 않고 반복문의 위로 올라감 => 증감식으로 가라
			}
			System.out.print(i + " ");
		}
	}

	public void method2() {
		// 1부터100까지의 총합계
		// 단 ,6의 배수 값은 빼고 덧셈 연산 하겠다.

		// 1. 1 1부터 100까지의 총합계 먼저 for문으로 작성

		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 6 == 0) {// 6의배수
				continue;// 건너뛰고 증감만
			}
			sum += i; // 누적합공식

		}
		System.out.println("1부터 100까지의 합계 : " + sum);

	}

	public void method3() {
		// 2~9단까지 출력
		// 3의 배수 제외

		for (int dan = 2; dan <= 9; dan++) {
			if (dan % 3 == 0) {
				continue;
			}
			System.out.println("=====" + dan + "단" + "=====");
			for (int i = 1; i <= 9; i++) {
				System.out.printf("%d X %d = %d\n", dan, i, dan * i);
			}
		}

	}
}
