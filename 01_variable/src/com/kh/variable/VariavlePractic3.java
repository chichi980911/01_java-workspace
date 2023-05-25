package com.kh.variable;

import java.util.Scanner;

public class VariavlePractic3 {
	public void AreaPerimeter() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("가로 값을 입력해주세요 : ");
		double width = sc.nextDouble();
		System.out.println("가로 :" + width);
		
		System.out.print("세로 값을 입력해주세요 : ");
		double lengh = sc.nextDouble();
		System.out.println("새로 :" + lengh);
		
		System.out.println("면적 : " + (width*lengh));
		System.out.println("둘레 : " + (width*2 + lengh*2));
		
		
		
		
		
		


		
	}
	

}
