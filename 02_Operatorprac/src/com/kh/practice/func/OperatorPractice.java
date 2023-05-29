package com.kh.practice.func;

import java.util.Scanner;

public class OperatorPractice {
	public void practice1(){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 : ");
		int num = sc.nextInt();
		System.out.print("입력한 정수는 : " + num + "입니다");
		
		String result = (num <= 0) ? "양수가 아닙니다" : "양수입니다";
		System.out.println(result);
		
		sc.close();
	}
	
	public void practice2() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 : ");
		int num2 = sc.nextInt();
		
		String result = (num2 > 0) ? "양수입니다" : (num2 == 0) ? "0입니다" : "음수입니다";
		System.out.println(result);
		sc.close();
		
	}
	
	public void practice3() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 : ");
		int num3 = sc.nextInt();
		
		String result = num3 % 2 == 0 ? "짝수입니다" : "홀수입니다";
		System.out.println(result);
		
		sc.close();
		
		
	}
	public void practice4() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("인원 수를 입력해 주세요 : ");
		int num4 = sc.nextInt();
		
		System.out.print("사탕 개수를 입력해 주세요 : ");
		int num5 = sc.nextInt();
		
		int num7 = (num5 / num4);
		int num8 = (num5 % num4);
		
		System.out.println("1인당 사탕 개수 : " + num7); 
		System.out.println("남는 사탕 개수 : " + num8); 
		
		
		
		sc.close();
		
		
		
		
	}
	public void practice5() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 : ");
		String name = sc.nextLine();
		
		System.out.print("학년(숫자만) : ");
		int grade = sc.nextInt();
		
		System.out.print("반(숫자만) : ");
		int classroom =sc.nextInt();
		
		System.out.print("번호(숫자만) : ");
		int number =sc.nextInt();
		
		sc.nextLine();
		
		System.out.print("성별(M/F) : ");
		char gender =sc.nextLine().charAt(0);
		
		System.out.print("성적(소수점 아래 둘째자리까지) : ");
		double schoolgrade = sc.nextDouble();
		
		String result = (gender == 'M') ? "남학생" : "여학생";
		System.out.println(grade+"학년 "+classroom+"반 "+number+"번 "+name+" " +result+"의 성적은 "+schoolgrade+"이다.");
		sc.close();
		
	}
	public void practice6() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이 : ");
		
		int num9 = sc.nextInt();
		String result = (num9 <= 13) ? "어린이" : (num9 > 19) ? "성인" : "청소년";
		
		System.out.println(result);
	}
	public void practice7() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 : ");
		int num10 = sc.nextInt();
		
		System.out.print("영어 : ");
		int num11 = sc.nextInt();
		
		System.out.print("수학 : ");
		int num12 = sc.nextInt();
		
		int num13 = (num10 +num11 +num12);
		double num14 = (num13 / 3);
		//실패
		//국어 영어 수학의 점수가 각각 40점이면 합격
		//세과목의 평균이 60점 이상일떄 합격 아닐시 불합격 
		
			
			
		
			
		
		
		
		
		System.out.println("합계 : " + num13);
		System.out.println("평균 : " + num14);
		sc.close();
	}
			
		
		
		
		
	

	public void practice8() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("주민번호를 입력하세요(-포함) : ");
		char ju = sc.next().charAt(7);
		
		System.out.println(ju);
		
		//실패
//		String result = //ju 에 입력된 수가 1 또는 3일때 "남자" 반환
//						//ju 에 입력된 수가 2 또는 4일때 "여자" 반환
//		
		sc.close();
	}
	public void practice9() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수1 : ");
		int num16 = sc.nextInt();
		System.out.println("정수2 : ");
		int num17 = sc.nextInt();
		
		
		sc.close();
	}
	
}
