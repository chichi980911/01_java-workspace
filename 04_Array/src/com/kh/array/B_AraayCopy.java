package com.kh.array;

import java.util.Arrays;

//import java.lang 포함되어 있음
public class B_AraayCopy {
	public void method1() {
		//배열 생성 및 배열의 크기 지정 + 배열의 값
		int[] origin = {1,2,3,4,5};
		
		System.out.println("==원본 배열 출력 ==");
		for(int i = 0; i <origin.length; i++) {
			System.out.print(origin[i] + " ");
		}
		System.out.println(); 
		
		//단순하게 origin을 다시 대입시킨 copy 배열 셋팅
		int[] copy = origin;
		System.out.println("==복사본 배열 출력 ==");
		for(int i = 0; i <copy.length; i++) {
			System.out.print(copy[i] + " ");
		}
		System.out.println();
		
		copy[2] = 99;
		System.out.println("===============복사본 배열 값 변경 후 ============");
		System.out.println("==원본 배열 출력 ==");
		for(int i = 0; i <origin.length; i++) {
			System.out.print(origin[i] + " ");
		}
		System.out.println(); 
		
		//단순하게 origin을 다시 대입시킨 copy 배열 셋팅
		
		System.out.println("==복사본 배열 출력 ==");
		for(int i = 0; i <copy.length; i++) {
			System.out.print(copy[i] + " ");
			
		}
		//copy[2]를 가지고 수정해도 원본까지 변경되어 있음
		//왜? origin 과 copy가 같은 곳을 참조하고 있기 때문(즉,같은 주소값을 가리킨다.)
		System.out.println();
		System.out.println("=======주소 / 값 비교 ========");
		System.out.println(origin.hashCode());
		System.out.println(copy.hashCode());
		System.out.println(copy == origin);
		System.out.println(copy[2] == origin[2]);
		
		//얕은 복사 : 주소값을 복사 
	}
	//얕은 복사의 문제를 해결하기 위해서 깊은 복사
	public void method2() {
		//1. for문을 활용한 방법
		//	새로운 배열을 생성한 후 반복문 활용
		//	원본배열의 값들을 새로 만든 배열에 대입하는 방법
		int[] origin = {1,2,3,4,5};
//		//얕은복사 : 주소값 대입
//		int[] copy = origin; 
		int[] copy = new int[5];
		
		for(int i = 0; i<copy.length; i++) {
			copy[i] = origin[i];
		}
		System.out.println("==원본 배열 출력 ==");
		for(int i = 0; i <origin.length; i++) {
			System.out.print(origin[i] + " ");
		}
		System.out.println(); 
		
		//단순하게 origin을 다시 대입시킨 copy 배열 셋팅
		
		System.out.println("==복사본 배열 출력 ==");
		for(int i = 0; i <copy.length; i++) {
			System.out.print(copy[i] + " ");
			
		}
		System.out.println();
		System.out.println(origin.hashCode());
		System.out.println(copy.hashCode());
		System.out.println(copy == origin);
		System.out.println(copy[2] == origin[2]);
		
		/*
		copy[0] = origin[0];
		copy[1] = origin[1];
		copy[2] = origin[2];
		copy[3] = origin[3];
		copy[4] = origin[4];
		*/
		
		
	}
	
	public void method3() {
		//2. 새로운 배열 생성 후 System 이라는 클래스에서 arraycopy()메소드를 이용한 복사
		int[] origin = {1,2,3,4,5};
		int[] copy = new int[10]; //인덱스 0~9 생성 , 초기화x 0 담겨져있음
		
		//System.arraycopy(원본배열명,복사시작할 인덱스, 복사본 배열명,복사본 배열의 복사될 시작 인덱스,복사할 개수);
//		System.arraycopy(origin, 0, copy, 0, 5);
//		System.arraycopy(origin, 0, copy, 2, 5);
		System.arraycopy(origin, 1, copy, 2 , 4);
		
		
		System.out.println(); 
		
		
		System.out.println("origin주소값 : " + origin.hashCode());
		System.out.println("copy주소값 : " +copy.hashCode());
		System.out.println(copy == origin);
		System.out.println(copy[2] == origin[2]);
	}
	public void method4() {
		//3.Arrays 클래스에서 제공하는 copyOf() 메소드 사용
		int[] origin = {1,2,3,4,5};
		//복사본 배열 =Arrays.copyOf(원본배열명,복사할 길이);
//		int[] copy =Arrays.copyOf(origin,5);
//		int[] copy =Arrays.copyOf(origin,3);
		int[] copy =Arrays.copyOf(origin,10);
		
		/*[참고]
		 * java.lang.Math
		 * java.lang.String
		 * java.lang.System
		 * =>java.lang 패키지에 있는 클래스를 쓸 떄는 import 안해도 됨
		 * 
		 * java.util.Scanner
		 * java.util.Arrays
		 * =>java.lang 이외의 패키지에 있는 클래스들을 쓸 떄는 무조건 import 해야함
		 */
		for(int i = 0; i <copy.length; i++) {
			System.out.print(copy[i] + " ");
	}System.out.println();
	/*
	 * Arrays.copyOf()메소드
	 * =>내가 제시한 길이 만큼 복사본 배열크기 할당
	 * =>단 내가 제시한 길이가 원본배열의 크기보다 클 경우 기존의 배열에 있는 값은 다 복사 나머지는 0으로 채운다.
	 * =>	내가 제시한 길이가 원본 배열의 크기보다 작을 경우 기존의 배열에 있는 값 내가 제시한 길이만큼만 복사 
	 * */
	System.out.println("origin주소값 : " + origin.hashCode());
	System.out.println("copy주소값 : " +copy.hashCode());
}
	public void method5() {
		//4.clone() 메소드를 이용한 복사
		//인덱스 지정 불가, 크기지정 별도로 못함
		int[] origin = {1,2,3,4,5};
		//복사본 배열 = 원본 배열, clone();
		int[] copy = origin.clone();
		for(int i = 0; i <copy.length; i++) {
			System.out.print(copy[i] + " ");
			
		}
		System.out.println();
		System.out.println("origin주소값 : " + origin.hashCode());
		System.out.println("copy주소값 : " +copy.hashCode());
		
	}
}
