package com.kh.chap02.loop;

import java.util.Scanner;

public class C_DoWhile {
	
		/*
		 *  *do - while문
		 *  
		 *  [표현식]
		 *  do{
		 *  반복적으로 실행할 코드(*무조건 실행)
		 *  }wile(조건);
		 *  
		 *  첨에 무조건 실행코드 실행 ***
		 *  -->조건식 검사 --> true일 경우 실행코드 실행
		 *  -->조건식 검사 --> true일 경우 실행코드 실행
		 *  -->조건식 검사 --> false일 경우 실행코드 실행x =반복문 빠져나감
		 *  
		 *  기존의 for /while 문과의 차이점
		 *  for/while 문 같은 경우에는 조건 검사 후에 true 여야만 수행
		 *  근데 do -while 문은 조건검사 없이 무조건 한 번은 수행함
		 */
		
		public void method1() {
			int num =1;
			do {
				System.out.println(num);
			}while(false);
			
		}
		
		public void method2() {
			// 1 2 3 4 5
			
			int i = 1;
			do {
				System.out.printf(i + " ");
				i++;
			}while(i <= 5 );
		}
		
		public void method3() {
			//1부터 사용자가 입력한 수 까지의 총 합계
			
			Scanner sc = new Scanner(System.in);
			
			System.out.print("숫자 입력 : ");
			int num = sc.nextInt();
			
			int sum = 0;
			int i = 0;
			
			do {
				sum += i;
				i++;
			}while(false);
			System.out.println("1부터"+ num +"까지의 총합계 : " + sum);
		}
	}

