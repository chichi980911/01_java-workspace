package com.kh.variable;

public class C_Printf {
	public void printfTest() {
		//1.printf/println/print 차이
		
		//System.out.print(출력하고자 하는 값); // 입력값 출력만 함 (줄바뀜이 발생하지 않는다)
		//System.out.println(출력하고자 하는 값); // 출력 후 (줄바뀜 발생한다.)
		//System.out.printf("출력하고자 하는 형식(포맷)",출력하고자 하는 값); 
		//출력하고자 하는 값들이 제시한 형식(포맷)에 맞춰서 출력만 진행 (줄바꿈 발생 x)
		/*
		 * 2.포맷안에서 쓰일 수 있는 키워드 
		 * %d : 정수
		 * %c : 문자
		 * %s : 문자열
		 * %f : 실수
		 */
		int iNum1 = 10;
		int iNum2 = 20;
		
		//3.
		System.out.println(iNum1 + " " +iNum2);
		System.out.printf("%d  %d\n",iNum1,iNum2);
		System.out.println(); 
		//printf는 줄바꿈이 되지 않아 println(); 을 넣어주거나 printf포맷 뒤에 \n을 넣어준다.
		
		//4.
		//System.out.printf("%d  %d%",iNum1,iNum2);
		System.out.printf("%d  %d%%\n",iNum1,iNum2);
		//%뒤에는 포맷키워드가 와야하지만 %를 출력하고 싶다면 %%두개를 사용
		
		//5.정렬하고자 할떄
		System.out.printf("%5d\n", iNum1); // 양수 5 오른쪽 정렬
		System.out.printf("%-5d\n", iNum1); // 음수 -5 왼쪽정렬
		
		//6.%f 소수점 아래  6자리 까지 보여준다 (0을 채워서라도) 
		double dNum1 = 1.2454548;
		double dNum2 = 4.45;
		//※7.원하는 소수점 자리수까지 출력 하는 방법 %f >%뒤에 소수점 자리수 입력 ex)%.2        
		System.out.printf("%f %f",dNum1, dNum2);
		System.out.println();
		System.out.printf("%.2f %.1f",dNum1, dNum2);
		//8.printf소,대문자 구분  
		char ch ='a';
		String str = "hello";
		System.out.println();
		System.out.printf("%c,%s,%s\n",ch, str ,ch);
		System.out.printf("%C,%S,%S",ch, str ,ch);
		//9.포맷형 연습 B_KeyboardInput 클래스 InputTest3 메서드
				
		
		
		
		
		
		
		
		
	}

}
