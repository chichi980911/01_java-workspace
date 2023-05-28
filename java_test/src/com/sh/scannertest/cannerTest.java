package com.sh.scannertest;

import java.util.Scanner;
//자바 스캐너 클래스 임포트

public class cannerTest {
	public void userProfile() {

		Scanner sc = new Scanner(System.in);
		//스캐너 객체 생성

		System.out.print("이름을 입력해주세요 :");
		String name = sc.nextLine();

		System.out.print("나이을 입력해주세요 :");
		int age = sc.nextInt();

		System.out.print("태어난 년도를 입력해주세요 :");
		String year = sc.next();

		System.out.print("태어난 월을 입력해주세요 :");
		String month = sc.next();

		System.out.print("태어난 일을 입력해주세요 :");
		String day = sc.next();

		System.out.print("키를 입력해주세요 :");
		int height = sc.nextInt();

		System.out.print("성별을 입력해주세요 (남/여) :");
		char female = sc.next().charAt(0);

		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age +"살");
		System.out.println("생년월일 : " + year + "-" + month + "-" + day);
		System.out.println("키 : " + height + "cm");
		System.out.println("성별 : " + female + "자");
		
		sc.close();
		//스캐너 닫기
		
	}
	
	public void userProfile2() {
		
		Scanner sc = new Scanner(System.in);
		
		
		
		
	}

}


