package com.kh.variable;

public class A_Variable {
	public void printVariable() {
		System.out.println("===변수 사용 전 ===");
		
		System.out.println("시급 : 9620원");
		System.out.println("근무일수 : 6일");
		System.out.println("근무시간 : 8시간");
		
		//월급 = 시급 x 근무시간 x 근무일수 
		//차은우 : 0000원 형식으로 출력하고 싶다.
		
		System.out.println("차은우 :" + (9620 * 6 * 8) + "원");
		System.out.println("주지훈 :" + (9620 * 6 * 8) + "원");
		System.out.println("이제훈 :" + (9620 * 6 * 8) + "원");
		
		//변수 사용 후 
		System.out.println("===변수 사용 후 ===");
		
		int pay = 9620;
		int time = 8;
		int day = 6;
		//int pay = 20000;
		
		System.out.println("차은우 :" + (pay * time * day) + "원");
		System.out.println("주지훈 :" + (pay * time * day) + "원");
		System.out.println("이제훈 :" + (pay * time * day) + "원");
		
		/*
		 * 
		 * 변수를 사용하는 이유 
		 * 1.변수는 우선적으로 값에 의미를 부여할 목적으로 쓴다.(가독성이 높다)
		 * 2.단 한번 값을 기록하고 필요할 때마다 가져다 쓰는 목적으로 쓴다.(재 사용성)
		 * 3.유지보수를 쉽게 할 수 있다.
		 */
		
		
		
		
		
	}
	
	//변수의 선언을 공부하기 위한 메소드 
	public void dicleraeVariable() {
		/*
		 * 변수의 선언 
		 * 값을 기록하기 위한 변수를 메모리 공간에 확보, 할당한다. =>값을 보관하기 위한 상자를 만들겠다
		 * 
		 * [표현법] 자료형 변수이름; 
		 * 
		 * 자료형 : 변수의 크기 및 모양을 지정해주는 부분 
		 * 변수이름 : 변수의 이름을 붙여주는 부분 (의미 부여)
		 * 
		 * 변수 선언 시 주의할점 
		 * 1.변수 이름은 소문자로 시작 / 낙타봉 표기법을 지킬 것 예약어는 불가 
		 * 2.같은 영역안 {()} 에서는 동일한 변수명으로 선언 불가 ! 중복 불가능
		 * 3.해당 영역안 {()} 에서 선언한 변수는 그 영역 안에서만 사용 가능
		 * 
		 */
		
		
	
	//====자료형에 대한 개념 -----
	//1.논리형(논리값 = true / false)
	boolean isTrue; //변수만 선언
	boolean isFalse = false; // 1byte 변수선언과 동시에 값을 대입 
	
	isTrue = 1+3 > 1;
	isFalse = 4+2 < 1;
	
	
	
	//2.숫자형
	//2_1.정수형(소수점x)
	byte bNum = -127; //1byte (-128 ~ 127)
	
	short sNum =1000; //2byte
	
	int iNum = 10000; //4byte
	
	long lNum = 100000; //8byte
	
	//2_1.실수형(소숫점o)
	float fNum = 0.0f; //4byte =>소숫점 7자리 까지 표현 가능 
	
	double dNum = 0.12345; //8byte =소숫점 15 
	//float의 경우 double 과 값을 구분하기 위해 값 뒤에 f 사용
		
	//3.문자형	
	//3_1. 문자
	char ch = 'a'; //2byte 홑따옴표 
	char kim;
	kim = '김';
	//3_2. 문자열
	String str;//참조자료형 색깔 안바뀜 
	str = "abc";
	//값이 잘 담겨있는지 확인 
	
	System.out.println("isFalse의 값 " + isFalse);
	System.out.println("isTrue의 값" + isTrue);

	System.out.println(bNum);
	System.out.println(sNum);
	System.out.println(iNum);
	System.out.println(lNum);
	System.out.println(fNum);
	System.out.println(dNum);
	System.out.println(ch);
	System.out.println(kim);
	System.out.println(str);
	
	//상수의 선언
	//[표현법] final 자료형 상수이름(대문자); 
	final int AGE;
	AGE = 10;
	System.out.println("AGE:"+ AGE);
	
	//대표적인 예로 3.14(파이,원주율)
	System.out.println("파이:"+ Math.PI);
	
	//번외 코드의 가독성을 위해 _ 사용 가능
	int etc =999_999_999;
	System.out.println("etc:"+ etc);
	
	/*변수 명명규칙
	 * 1)같은 영역내에 중복된 이름 안됨
	 * int number 중복 선언 불가능 
	 * int numBer;
	
	 * 2)예약어(자바에서 사용되고 있는 키워드)
	 * int true;
	 * int abstract;
	 * int static;
	 * int public;
	 
	 * 3)숫자 사용가능하나  시작이 숫자로 시작하는 건 안됨
	 * 
	 * 4)특수문자 사용가능하나 (= $ 이외 사용불가능)
	 * 
	 * 
	 */
	
	//권장사항 
	//1) 카멜케이스 (두번째 단어부터 대문자 선언)
	//2) 한글 사용가능하나 영문으로 작성 한글작성 지원하지 않는 환경에서는 오류 발생 
	
	
	
	
	
	
	
	}

}
