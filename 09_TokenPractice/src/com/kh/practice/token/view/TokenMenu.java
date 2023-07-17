package com.kh.practice.token.view;

import java.util.Scanner;

import com.kh.practice.token.controller.TokenController;

public class TokenMenu {
	
	private Scanner sc = new Scanner(System.in);
	private TokenController tc = new TokenController();
	
	// 메인 메뉴 출력
	public void mainMenu() {
		// 1. 지정 문자열		=> tokenMenu()
		// 2. 입력 문자열		=> inputMenu()
		// 3. 프로그램 끝내기	=> "프로그램을 종료합니다." 출력 후 종료
		// 잘못 입력했을 시 "잘못 입력하셨습니다. 다시 입력해 주세요." 출력 후 반복
		
		// 9번 입력 전까지 메뉴를 무한 반복
		while(true) {
			System.out.println("1. 지정 문자열");
			System.out.println("2. 입력 문자열");
			System.out.println("9. 프로그램 끝내기");
			
			// 메뉴 번호 입력
			System.out.print("메뉴 번호 : ");
			int num = sc.nextInt();
			
			// 버퍼 제거
			sc.nextLine();
			
			// 입력된 번호에 따른 기능 실행
			switch(num) {
			// 1번은 토큰 메뉴 실행
			case 1 :
				tokenMenu();
				break;
			// 2번은 입력 메뉴 실행	
			case 2 :
				inputMenu();
				break;
			// 9번은 프로그램 종료
			case 9 :
				System.out.println("프로그램을 종료합니다.");
				break;
			// 다른 숫자들은 안내 문구 출력
			default :
				System.out.println("잘못 입력하셨습니다. 다시 입력하세요.");
			}
			// 9번이 입력되면 반복문을 빠져나감
			if(num == 9) {
				break;
			}
			
		}
		
	}
	
	// 토큰 처리 전, 토큰 처리 후 출력
	public void tokenMenu() {
		String str = "J a v a P r o g r a m ";
		// 토큰 처리 전 글자, 토큰 처리 전 개수를 출력
		System.out.println("토큰 처리 전 글자 : " + str);
		System.out.println("토큰 처리 전 개수 : " + str.length());
		
		// TokenController(tc)의 afterToken()의 반환 값을 가지고
		// => 	TokenController의 객체인 tc로 afterToken() 메소드를 호출해서
		//		() 안에 매개변수를 넣어서 결과값인 return을 돌려받는다
		//		=> tc.afterToken(str);
		
		// 토큰 처리 후 글자, 토큰 처리 후 개수, 모두 대분자로 변환한 것을 출력
		String result = tc.afterToken(str);
		
		// 토큰 처리 후 글자 출력
		System.out.println("토큰 처리 후 글자 : " + result);
	
		// 토큰 처리 후 개수 출력
		System.out.println("토큰 처리 후 개수 : " + result.length());
		
		// 글자를 모두 대문자로 변환한 값 출력
		System.out.println("모두 대문자로 변환 : " + result.toUpperCase());
		
	}
	
	// 첫 글자 대문자와 찾을 문자 몇 개 있는지 출력
	public void inputMenu() {
		// 문자열 입력
		System.out.print("문자열을 입력하세요 : ");
		String input = sc.nextLine();
		
		// tc에 firstCap()로 입력 받은 문자열을 넘기고 반환 값 출력
		// => 	TokenController의 객체인 tc로 firstCap() 메소드를 호출해서
		//		() 안에 매개변수를 넣어서 결과값인 return을 돌려받는다
		//		=> tc.firstCap(input);
	
		// tc
		String result = tc.firstCap(input);
		
		// 첫 글자를 대문자로 바꾸고 출력
		System.out.println("첫 글자 대문자 : " + result);
		
		// 문자열에서 찾고 싶은 문자 입력
		System.out.print("찾을 문자를 하나 입력하세요 : ");
		char one = sc.nextLine().charAt(0);
		
		// tc에 findChar()로 위에 입력 받은 문자열과 방금 받은 문자를 인자로 넘겨
		// 반환 값 출력
		int result2 = tc.findChar(input, one);
		System.out.println(one + " 문자가 들어간 개수 : " + result2);
		
	}

}
