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
		
		String result="";
		if(num10 >= 40 && num11 >= 40 && num12 >= 40 && num14  >= 60) {
			result="합격";
		}else{result="불합격";
		}
			
		
		System.out.println("합계 : " + num13);
		System.out.println("평균 : " + num14);
		System.out.println(result);
		
		sc.close();
	}
			
		
		
		
		
	

	public void practice8() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("주민번호를 입력하세요(-포함) : ");
		char ju = sc.next().charAt(7);
		
	
		if(ju == '1' || ju == '3') {
			System.out.println("남자");
		}else if(ju=='2' || ju=='4') {
			System.out.println("여자");
		}else {System.out.println("다시입력하세요");}
		
		sc.close();
		
		
		
		
//		
		sc.close();
	}
	public void practice9() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수1 : ");
		int num16 = sc.nextInt();
		System.out.print("정수2 : ");
		int num17 = sc.nextInt();
		System.out.print("입력 : ");
		int num18 = sc.nextInt();
		
		if (num16 >= num18 || num18 > num17) {
			System.out.println("true");
		}  else {
			System.out.println("false");
		}
		
		
		
	}
	
	public void practice10() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력1 : ");
		int num19 = sc.nextInt();
		System.out.print("입력2 : ");
		int num20 = sc.nextInt();
		System.out.print("입력3 : ");
		int num21 = sc.nextInt();
		
		if(num19==num20 && num19==num21) {
			System.out.println("true");
		}else {System.out.println("false");}
	}
	public void practice11() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("A사원의 연봉 : ");
		int num22 = sc.nextInt();
		System.out.print("B사원의 연봉 : ");
		int num23 = sc.nextInt();
		System.out.print("C사원의 연봉 : ");
		int num24 = sc.nextInt();
		
		double num25 = num22*1.4;
		double num26 = num22;
		double num27 = num22 * 1.15;
		
		String s1 = "3000 이상";
		String s2 = "3000 미만";
		
		System.out.println(num25);
		System.out.println(num26);
		System.out.println(num27);
		
		
		
		System.out.println("A사원 연봉/연봉+a : " + num22 + "/" + num25);
		System.out.println(num25 >=3000.0 ? s1 : s2);
		System.out.println("B사원 연봉/연봉+a : " + num23 + "/" +num26);
		System.out.println(num26 >=3000.0 ? s1 : s2);
		System.out.println("C사원 연봉/연봉+a : " + num24 + "/" +num27);
		System.out.println(num27 >=3000.0 ? s1 : s2);
	}
	
<<<<<<< HEAD
}
=======
}
>>>>>>> 5b64b1e42bb69432d162cb8cd188f3508c895fd4
