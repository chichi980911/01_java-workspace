package com.kh.chap03_override.run;

import com.kh.chap03_override.model.vo.Book;

public class OverrideRun {

	public static void main(String[] args) {
		
		Book bk1 = new Book("수학의 정석", "나수학", 100);
		
		Book bk2= new Book("친고", "고래", 300);
		
		System.out.println(bk1/*.toString() */);
		System.out.println(bk2/*.toString() */);
		
		//출력문에 레퍼런스를 출력하고자 할 때 jvm이 자동으로 해당 레퍼런스 /*.toString() */ 메서드 호풀

		//오버라이딩전 : Object 클래스의 toString( )실행 > 풀클래스명 +@+객체의 해쉬코드읭 16진수값 리턴
		//오버라이딩 후 : Book 클래스의 /*.toString() 해당객체가 가지고 있는 모든 
	}

}
