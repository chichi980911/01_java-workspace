package com.kh.operator;

public class C_Arithmetic {
	public void method1() {
		int num1 = 10;
		int num2 = 3;
		
		/*
		 * 산술연산자
		 * [+,- ,*,%]
		 * 우선순위[*,%] >[+,-]
		 * 
		 */
		
		
		//System.out.println("num1 + num2 =" + num1 + num2);  
		//결과 값 = 103 
		System.out.println("num1 + num2 = " + (num1 + num2));
		//System.out.println("num1 + num2 =" + num1 - num2);
		//실행 되지도 않음 문자-숫자  
		System.out.println("num1 - num2 = " + (num1 - num2));
		// * % 우선순위가 놓아 + 보다 먼저 계산 하지만 가독성을 위해 ()를 사용을 권장
		System.out.println("num1 * num2 = " + (num1 * num2));
		//몫을 출력하는 연산자 /
		System.out.println("num1 * num2 = " + (num1 / num2));
		//나머지를 출력하는 연산자 % 짝/홀
		//값 % 2 ==0 짝수
		//값 % 2 ==1 홀수
		//값 % 5 ==0 은 5의 배수
		//값 % 3 ==0 은 3의 배수
		System.out.println("num1 * num2 = " + (num1 % num2));
		
	}
	public void quiz1(){
	      int a = 5;
	      int b = 10;
	      int c = (++a) + b; 
	      int d = c / a;   
	      int e = c % a;   
	      int f = e++;   
	      int g = (--b) + (d--);
	      int h = 2; 
	      int i = (a++) + b / (--c / f) * (g-- - d) % (++e + h);
	   
	   
	      System.out.println("a : " + a); 
	      System.out.println("b : " + b); 
	      System.out.println("c : " + c);   
	      System.out.println("d : " + d);   
	      System.out.println("e : " + e);   
	      System.out.println("f : " + f);   
	      System.out.println("g : " + g);   
	      System.out.println("h : " + h);   
	      System.out.println("i : " + i);   
	   }
		
	
		
		
	}
	
	


