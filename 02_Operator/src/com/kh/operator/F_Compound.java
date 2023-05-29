package com.kh.operator;

public class F_Compound {
	/*
	 * 복합 대입 연산자
	 * 산술연산자와 대입연산자가 결합돼있는 형태(산술연산 먼저 사용 후 대입연산 사용)
	 * 사용이유 : 연산처리 속도가 빨라지므로 사용하는것을 권장한다
	 * += , -= , /=, %=, *=
	 * a = a+3; => a += 3;
	 * a = a-3; => a -= 3;
	 * a = a*3; => a *= 3;
	 * a = a%3; => a %= 3;
	 * a = a/3; => a /= 3;
	 */
	public void method1() {
		int num = 12;
		System.out.println("최초 : num : "+ num);
		
//		num = num; = has no effect =변화(효과)없는 코드 
		
		num = num + 11;
		System.out.println("1. 11증가시킨 num : "+ num);
		
		num += 11;
		System.out.println("2. 11증가시킨 num : "+ num);
		
		num -= 5;
		System.out.println("3. 5감소시킨 num : "+ num);
		
		num *= 2;
		System.out.println("4. 2배증가시킨 num : "+ num);
		
		num /= 2;
		System.out.println("5. 2배감소시킨 num : "+ num);
		
		num %= 2;
		System.out.println("5. num 2로나눈 나머지 값 : "+ num);
		
		//String은 산술연산 중 +만 가능하다.
		String str = "Hello";
		str = str + "World";
		str += ".com";
		
		System.out.println(str);
		
	}
	
}
