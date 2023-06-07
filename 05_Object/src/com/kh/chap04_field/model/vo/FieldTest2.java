package com.kh.chap04_field.model.vo;

//필드들의 접근제한자를 테스트 해보기 위한 클래스

public class FieldTest2 { //클래스 시작
	
	/*
	 *필드(멤버변수)에서 사용가능한 접근제한자 4가지 
	 
	 *public => 어디서든 접근가능 (같은 패키지,다른패키지)
	 *protected => 같은 패키지 접근가능, 다른 패키지일 경우 상속구조에서는 접근가능 
	 *default => 같은 패키지에서만 접근가능(다른패키지 일 떄는 절대 불가)
	 *private => 해당 클래스에서만 접근 가능 
	 *
	 *위에서부터 아래로 내려갈수록 접근할 수 있는 범위가 좁아진다.
	 */
	
	public String pub = "public";
	protected String pro = "protected";
	String def = "default";
	private String pri = "private";

}
//클래스 종료