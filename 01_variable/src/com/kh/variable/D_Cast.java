package com.kh.variable;

public class D_Cast {
//	1.형변환 :  값의 자료형을 바꾸는 것 
//	컴퓨터에서의 값 처리 규칙 (즉, 형변환이 필요한 상황)
//	1-1 대입 연산자를 기준으로 왼쪽과 오른쪽은 같은 자료형이여야 한다
//	ex)int a = 문자x , int b = 8 정수o
//	다른 자료형의 값을 대입하기 위해서는 형 변환 필수
//	[표현법] 변수명 =(자료형)값; ex)int a =(int)8.0;
//	1-2 같은 자료형 끼리만 연산이 가능 (값+값) 

	//형변환 종류
	//1.자동 형변환 => 자동으로 형변환이 이뤄짐
	//2.강제(명시적) 형변환 => 자동형변환이 불가능 하기 떄문에 직접 형번환을 해줌
	//[표현법] (바꿀자료형) 값 
	//*주의사항 boolean 타입은 형변환 불가능하다.

	public void autoCasting(){
		//자동형변환
		//예제1
		//값의 범위가 작은 자료형과 큰 자료형간의 연산시  
		//자동으로 범위가 작은 자료형을 큰 자료형으로 변환 후 처리해줌
		//ex) int = 4byte < double = 8byte 반대는 자동변환 불가능 
		
		int i1 = 12;
		double d1 = i1; 
		
		System.out.println(d1);
		
		int i2 = 12;
		double d2 = 3.3; 
		
		double result =i2+d2;
		System.out.println("result : " + result);
		
		//예제2 int(4byte) > long(8byte)
		int i3 = 1000;
		long I3 = i3;
		System.out.println(I3);
		
		//예제3 float(4byte) > double(8byte)
		
		float f4 = 1.0f; //1.0 double > float double은 long보다 크기 떄문에 자동변환불가
		double d4 = f4;
		System.out.println(d4);
		
		//예제4 특이케이스
		//long(8byte) > float(4byte)
		//float이 실수형이기 때문에 long 형보다 표현 가능한 수의 범위가 더 커서 자동형변환 가능 
		
		long l5 = 100000000000L;
		float f5 = l5;
		System.out.println(f5);
		
		//예제5 아스키코드 =각 문자들마다 고유한 숫자가 지정되어 있어 쌍방향으로 형변환 가능
		//char 는 음수값 지정 불가 char 범위 0~65535
		//char(2byte) <=> int(4byte)
		int num ='A';
		System.out.println(num);
		
		char ch = 91;
		System.out.println(ch);
		
		char ch1 = 71;
		System.out.println(ch1);
		
		//예제6 
		//byte 또는 short 간의 연산 
		byte b1 = 1;
		byte b2 = 10;
		
		byte b3 = (byte)(b1 +b2);
		System.out.println(b3);
		
		//byte b3 = b1 +b2; byte,short는 연산시 무조건 int 형으로 처리한다. 
		//연산 범위가 더 큰 int 형 > byte형에 대힙 불가
		//사용하고 싶다면 강제 형변환 

		
	}
	
	public void forceCasting() {
		//강제형변환 : 큰 크기의 자료형을 작은 크기의 자료형으로 바꾸는 것 
		//double(8byte) => float(4byte) 큰 > 작
		double d1 = 4.0;
		float f1 = (float)d1;
		
		//double(8byte) => int(4byte)
		int iNum = 10;
		double dNum = 5.89;
		
		//int iSum = 자동(double)iNum + dNum; // 자동 형변환으로 int 타입이
		//double 타입으로 변경되어 계산된다.
		//해결방법
		//1.연산결과를 int형으로 강제형변환
		//결과값을 형변환을 통해 정수값만 출력된다 10 +5.89 int형 변환으로 0.89 제외 후 정수 끼리 덧셈 
		//데이터 손실 발생 
		int iSum = (int)(iNum + dNum);
		System.out.println("iSum : "+ iSum); 
		
		//2.double형 값 만을 int 형으로 강제형변환
		//값만 변경하더라도 타입이 맞지 않아 정수끼리 더해짐 
		int iSum2 = iNum + (int)dNum;
		System.out.println(iSum2);
		
		//3.연산결과를 double 변수에 대입
		double iSum3 = iNum + dNum;
		System.out.println("iSum : " + iSum3);
		
		//데이터 손실 테스트
		int iNum2 = 290;
		byte bNum2 = (byte)iNum2;
		//byte는 -128~127 값을 가지고 있기 때문에 그이외 값들은 무작위로 반환한다. 
		System.out.println(bNum2);
	}


}




