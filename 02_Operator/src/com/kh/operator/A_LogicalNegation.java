package com.kh.operator;

public class A_LogicalNegation {
	public void method1() {
		System.out.println("true의 부정 : " + !true);
		System.out.println("false의 부정 : " + !false);
		
		boolean b1 = true;
		System.out.println("b1의 부정 : "+ !b1);
		
		boolean b2 = !b1;
		System.out.println("b2 : " + b2); //false
		
		boolean b3 = (5>3);
		System.out.println("b3 : " + b3);
	}
	
	
	}


