package com.kh.chap05_constructor.run;

import com.kh.chap05_constructor.model.vo.User;

public class ConstructorRun {

	public static void main(String[] args) {
//		//1.기본생성자로 객체 생성
		User u1 = new User();
		System.out.println(u1.information());
//		//각 필드에 jvm 초기값들이 담겨져 있다.
//		
//		
//		//회원가입시 필수 입력사항만 입력받는다면?
//		User u2 = new User();
//		u2.setUserId("user02");
//		u2.setuserPwd("pwd02");
//		u2.setuserName("김상호");
//		System.out.println(u2.information());
		
		//=============기본생성자 위 ===================
		//2.매개변수 3개짜리 생성자로 객체 생성 후 정보 출력
		User u2 = new User("user02","pwd02","차은우");
		System.out.println(u2.information());
		
		//setter를 만들지 않으면 ex) 패스워드 변경인 경우 ,개명을 할 경우
		u2.setuserName("원숭이");
		System.out.println(u2.information());
		
		//getter는?
		//비밀번호를 까먹은 경우에는 비밀번호만 보여줘야한다.
		
		//3.매개변수 5개 짜리 생성자로 객체 생성
		//"user03" "pwd03 "장원영" 23 '여'
		//information출력
		User u3 = new User("user03","pwd03", "장원영" , 23 , 'M');
		System.out.println(u3.information());
	}

}
