package com.kh.chap06_method.run;

import java.util.Scanner;

import com.kh.chap06_method.controller.NonStaticMethod;
import com.kh.chap06_method.controller.OverlodingTest;
import com.kh.chap06_method.controller.StaticMethod;

public class MethodRun {

	public static void main(String[] args) {
		//=============Nonstatic method=====================
		
//		NonStaticMethod a = new NonStaticMethod();
//		
//		//1.매개변수도 없고 반환값도 없는 메서드 호출 
//		//n.method(10); x 안된다.
//		a.method1();
//		
//		//2.매개변수 없고 반환값은 있는 메서드 호출
////		int str = a.method2();
////		String str = a.method2();
//		System.out.println(a.method2());
//		
////		3.매개변수는 있고 반환값은 없는 메서드
////		a.method3(); 매개변수 없으면 오류가 난다.
////		a.method3(10); 매개변수 개수 맞지 않으면 오류가 난다.
////		a.method3("ㅋㅋ","ㅎㅎ"); 매개변수 타입이 맞지 않아도 오류가 난다.
////		int a = a.method3(8,3); 반환값이 없기 때문에 변수에 담을 수 없다.
//		a.method3(10, 5);
//		a.method3(10, 0);
//		
////		4.매개변수도 있고 반환값도 있는 메서드 호출
////		char ch = a.method4("lemon",1);
////		System.out.println(ch);
////		System.out.println(a.method4("lemon", 1));
//		
////		사용자에게 매개변수를 입력받아서 해당메서드 호출
//		Scanner sc = new Scanner(System.in);
//		System.out.print("문자열 입력 : ");
//		String str = sc.nextLine();
//		System.out.print("인덱스 입력 : ");
//		int index = sc.nextInt();
//		
//		//유효성 검사 해보기 
//		//index 0 이상이고 문자열의 길이보다 작을때만
//		if(index >= 0 && str.length()>index) {
//			System.out.println("결과 : " + a.method4(str, index));
//		}else {
//			System.out.println("인덱스 값이 부적절합니다.");
//		}
		//=============static method=====================
		//생성없이 바로 호출 가능
		//Math.random();
		StaticMethod.method1();
		System.out.println(StaticMethod.method2());
		StaticMethod.method3("김상호");
		System.out.println(StaticMethod.method4("apple","apple"));
		//return 추력해야만 확인 가능 
		
		//=============overlodingtest=====================
		OverlodingTest ot = new OverlodingTest();
		ot.test();
		ot.test(0, null);
		
		ot.test("1", 0);
		
		//오버로딩의 대표적인 예 =>print()
		
	}
	
}
