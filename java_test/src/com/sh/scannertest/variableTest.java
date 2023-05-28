package com.sh.scannertest;

public class variableTest {
	public void litererTest() {
		
		long i = 10_000_000_000l;
		System.out.println(i);
		//**실수형 리터럴 접미사가 붙지 않아도 10. , .10 , le3=10의n제곱을 의미 
		//double 8byte 소수점8자리 이상 d
		//float 4byte 소수점 7자리 까지 f
		float f = 2.0f;
		System.out.println(f);
		
		float f2 = 2;
		System.out.println(f2);
		//double 타입이 float 타입보다 크기 떄문에 값 저장 가능하다.
		double f3 = 3.1f;
		System.out.println(f3);
		
		
		byte b =127;
		System.out.println(b);
		//byte는 -128 ~ 127 까지

//		-128은 범위를 벗어나서 저장 불가능 
//		byte b2 =128;
//		System.out.println(b2);
		
		int b2 = 128;
		System.out.println(b2);
	}

}
