package com.kh.chap03.branch;

import java.util.Scanner;
//스캐너
public class A_Break {
	/*
	 * 분기문 break : 반복문 안에 사용되는 분기문 break 가 실행되는 순간 현재 속해있는 반복문을 빠져나감
	 * 
	 * 유의사항 : switch문 안의 break;는 단지 switch 문만을 빠져나가는 구문
	 */

	public void method1() {
		// 랜덤값 (1~100) 발생 시키고 그 랜덤값 출력 (이 과정 매번 반복)
		// 단 발생된 랜덤값이 3의배수 일 경우 (3으로 나눴을때 나머지가 0일 경우) 반복문을 빠져나와보자

		while (true) {
			int random = (int) (Math.random() * 100 + 1);
			System.out.println("random 값 : " + random);

			if (random % 3 == 0) {
				break; // 반복문을 강제로 뻐져 나가게 하는구문
			}
		}

	}

	public void method2() {
		// 사용자에게 문자열을 입력 받아 해당그 문자열의 길이 출력(무한 반복)
		// 단, 사용자가 입력한 문자열이 "exit" 일 경우 반복문을 빠져나감

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("문자열을 입력하세요 : ");
			String str = sc.nextLine();

			if (str.equals("exit")) {// 사용자가 입력한 문자가 "exit"일때
				System.out.println("프로그램을 종료합니다.");
				break;
			} else {// 아닐경우 =>문자열의 길이 출력
				System.out.println("문자열의 길이는 : " + str.length());
			}

		}
	}
	public void method3() {
		//사용자에게 단(2~9)를 입력받아 해당 단을 출력 프로그램 종료
		//혹시라도 잘못된 단을 입력했을 경우 다시 단을 입력받도록 유도
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("단 (2~9)을 입력해주세요 : ");
			int dan =sc.nextInt();
			
			if(dan >=2 && dan<=9) {//잘 입력했을경우
				
				for(int i = 1; i<=9; i++) {
					System.out.printf("%d x %d = %d\n",dan,i,dan*i);
					
				}break;
				
			}else {//잘못 입력했을 경우 }
				System.out.println("잘못 입력했습니다 . 다시 입력해주세요");
			}
		}
		
	}
}
