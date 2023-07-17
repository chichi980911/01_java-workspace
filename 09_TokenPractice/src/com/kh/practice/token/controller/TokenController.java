package com.kh.practice.token.controller;

import java.util.StringTokenizer;

public class TokenController {
	
	// 기본 생성자
	public TokenController() {}
	
	// 매개변수와 반환값 모두 가지고 있는 메소드
	// 공백을 토큰으로 처리한 문자열 반환
	public String afterToken(String str) {
		// 매개변수로 받아온 str을 StringTokenizer를 이용하여
		// 띄어쓰기를 없애고 없앤 문자열 반환
		
		// java.util.StringTokenizer 클래스를 이용
		// 현재 stn에 str의 문자열이 " "을 기준으로 하나하나 쪼개져서 저장되어 있는 상태
		StringTokenizer stn = new StringTokenizer(str, " ");
		
		/*
		// 현재 토큰의 개수를 count 변수에 저장
		int count = stn.countTokens();
		
		// count 수만큼 배열을 할당
		char[] arr = new char[count];
		
		// 각 토큰마다 하나의 문자로 저장되어 있기 때문에 토큰의 0번 인덱스를 배열의 각 인덱스에 초기화
		for(int i = 0; i < count; i++) {
			arr[i] = stn.nextToken().charAt(0);
		}
		
		// 초기화 된 배열을 문자열로 변환
		str = String.valueOf(arr);
		
		// count만큼 for문을 돌려 각각의 토큰값을 str에 저장
		for(int i = 0; i < count; i++) {
			str += stn.nextToken();
		}
		*/

		// str을 ""로 초기화
		str = "";
		
		// 토큰이 남아있다면 str에 토큰값을 저장
		while(stn.hasMoreTokens()) {
			str += stn.nextToken();
		}
		
		// 문자열을 반환값으로 지정
		return str;
		
	}
	
	// 매개변수와 반환값 모두 가지고 있는 메소드
	// 첫 글자만 대문자로 바꾼 문자열 반환
	public String firstCap(String input) {
		// 매개변수로 받아온 input의 첫 번째 글자만 대문자로 바꾼 문자열 반환
		
		// input의 첫번째 문자만 떼서 대문자로 바꾸고
		String str1 = input.substring(0, 1).toUpperCase();
		// input에서 나머지 문자들도 뗀 후에
		String str2 = input.substring(1);
		// 그 두개를 다시 합친다
		input = str1.concat(str2);
		
		// 합친 값을 반환값으로 지정
		return input;
	}
	
	// 매개변수와 반환값 모두 가지고 있는 메소드
	// 문자열 안에 찾을 문자 개수가 몇 개 들어가 있는지 반환
	public int findChar(String input, char one) {
		// 매개변수의 문자가 문자열 안에 몇 개가 들어가 있는지 반환
		
		// 문자열에 있는 문자의 개수를 셀 변수 count를 0으로 초기화
		int count = 0;
		
		// input의 길이만큼 for문을 돌려
		for(int i = 0; i < input.length(); i++) {
			// 입력한 문자 one과 일치하는 게 있다면
			if(input.charAt(i) == one) {
				// count를 하나씩 올린다
				count++;
			}
		}
		// 누적된 count 값을 반환값으로 지정
		return count;
	}

}
