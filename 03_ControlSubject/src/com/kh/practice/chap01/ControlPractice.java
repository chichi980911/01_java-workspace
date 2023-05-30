package com.kh.practice.chap01;

import java.util.Scanner;

public class ControlPractice {
	public void method1() {
		Scanner sc = new Scanner(System.in);

		System.out.println("1.입력");
		System.out.println("2.수정");
		System.out.println("3.조회");
		System.out.println("4.삭제");
		System.out.println("7.종료");
		System.out.print("메뉴 번호를 입력하세요 : ");

		int num = sc.nextInt();

		String result = "";
		if (num == 1) {
			result = "입력 메뉴입니다.";
		} else if (num == 2) {
			result = "수정 메뉴입니다.";
		} else if (num == 3) {
			result = "조회 메뉴입니다.";
		} else if (num == 4) {
			result = "삭제 메뉴입니다.";
		} else if (num == 7) {
			result = "종료 메뉴입니다.";
		} else {
			result = "해당 메뉴 번호는 없습니다.";

		}
		System.out.println(result);
	}

	public void method2() {
		Scanner sc = new Scanner(System.in);

		System.out.print("숫자를 한개 입력하세요 : ");
		int num = sc.nextInt();

		if (num >= 1 && num % 2 == 0) {
			System.out.println("짝수다");
		} else if (num >= 1 && num % 2 == 1) {
			System.out.println("홀수다");
		} else {
			System.out.println("양수만 입력해주세요");
		}
	}

	public void method3() {
		Scanner sc = new Scanner(System.in);

		System.out.print("국어점수 : ");
		int num = sc.nextInt();
		System.out.print("수학점수 : ");
		int num2 = sc.nextInt();
		System.out.print("영어점수 : ");
		int num3 = sc.nextInt();

		int sum = (num + num2 + num3);
		System.out.println(sum);
		double aver = (sum / 3);
		System.out.println(aver);

		if (num >= 40 || num2 >= 40 || num >= 40 || aver >= 60) {
			System.out.println("축하합니다, 합격입니다!");
		} else {
			System.out.println("불합격입니다.");
		}
	}

	public void method4() {
		Scanner sc = new Scanner(System.in);

		System.out.print("1~12 사이의 정수 입력 : ");
		int num = sc.nextInt();
		// 동등비교
		switch (num) {
		case 3:
		case 4:
		case 5:
			System.out.println(num + "월은 봄입니다.");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println(num + "월은 여름입니다.");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println(num + "월은 가을입니다.");
			break;
		case 12:
		case 1:
		case 2:
			System.out.println(num + "월은 봄입니다.");
			break;
		default:
			System.out.println(num + "월은 잘못 입력된 달입니다.");
		}
	}

	public void method5() {
		Scanner sc = new Scanner(System.in);

		System.out.print("아이디 : ");
		String pushid = sc.nextLine();
		System.out.print("비밀번호 : ");
		int pushpass = sc.nextInt();

		String id = "abc";
		int pass = 123;

		if (id.equals(pushid) && pass == pushpass) {
			System.out.println("로그인 성공");
		} else if (id.equals(pushid) && pass != pushpass) {
			System.out.println("비밀번호가 틀렸습니다");
		} else {
			System.out.println("아이디가 틀렸습니다");
		}

	}

	public void method6() {
		Scanner sc = new Scanner(System.in);

		System.out.print("권한을 확인하고자 하는 회원 등급 (관리자,회원,비회원) : ");
		String auth = sc.nextLine();

		// 동등비교
		switch (auth) {
		case "관리자":
			System.out.println("회원관리,게시글 관리 게시글작성, 댓글 작성 게시글 조회");
			break;
		case "회원":
			System.out.println("게시글 작성, 게시글 조회, 댓글 작성");
			break;
		case "비회원":
			System.out.println("게시글 조회");
			break;
		default:
			System.out.println("다시 실핼하세요");
		}

	}

	public void method7() {
		Scanner sc = new Scanner(System.in);

		System.out.print("키(m)를 입력해 주세요 :  ");
		double height = sc.nextDouble();
		System.out.print("몸무게를 입력해 주세요 :  ");
		double weight = sc.nextDouble();

		double bmi = (weight / (height * height));

		System.out.println("BMI 지수 : " + bmi);

		if (bmi < 18.5) {
			System.out.println("저체중");
		} else if (bmi >= 18.5 && bmi < 23) {
			System.out.println("정상체중");
		} else if (bmi >= 23 && bmi < 25) {
			System.out.println("과체중");
		} else if (bmi >= 25 && bmi < 30) {
			System.out.println("비만");
		} else if (bmi >= 30) {
			System.out.println("고도비만");
		}
	}

	public void method8() {
		Scanner sc = new Scanner(System.in);

		System.out.print("피연산자1 입력 : ");
		int num = sc.nextInt();

		System.out.print("피연산자2 입력 : ");
		int num2 = sc.nextInt();

		System.out.print("연산자를 입력(+,-,*,/,%) : ");
		sc.nextLine();
		String sign = sc.nextLine();

//		double divide = (num/num2);

		switch (sign) {
		case "+":
			System.out.println(num + " + " + num2 + " = " + (num + num2));
			break;
		case "-":
			System.out.println(num + " - " + num2 + " = " + (num - num2));
			break;
		case "*":
			System.out.println(num + " * " + num2 + " = " + (num * num2));
			break;
		case "/":
			System.out.println(num + " / " + num2 + " = " + (num / (double) num2));
			break;
		case "%":
			System.out.println(num + " % " + num2 + " = " + (num % num2));
			break;
		default:
			System.out.println("잘못 입력하셨습니다. 프로그램을 종료합니다");

		}
	}

	public void method9() {

		Scanner sc = new Scanner(System.in);

		System.out.print("중간 고사 점수 : ");
		int num = sc.nextInt();

		System.out.print("기말 고사 점수 : ");
		int num2 = sc.nextInt();

		System.out.print("과제 점수 : ");
		int num3 = sc.nextInt();

		System.out.print("출석 회수 : ");
		int num4 = sc.nextInt();

		double grade = (num * 0.2);
		double grade1 = (num2 * 0.3);
		double grade2 = (num3 * 0.3);
		double sum = (grade + grade1 + grade2 + num4);

//		System.out.println("===========결과===========");
//		System.out.println("중간 고사 점수 (20) : " + (double) grade);
//		System.out.println("기말 고사 점수 (30) : " + (double) grade1);
//		System.out.println("과제 점수 (30) : " + (double) grade2);
//		System.out.println("출석 점수 (20) : " + (double) num4);
//		System.out.println("총점 : " + sum);

		if (sum >= 70 && num4 >= 15) {
			System.out.println("===========결과===========");
			System.out.println("중간 고사 점수 (20) : " + (double) grade);
			System.out.println("기말 고사 점수 (30) : " + (double) grade1);
			System.out.println("과제 점수 (30) : " + (double) grade2);
			System.out.println("출석 점수 (20) : " + (double) num4);
			System.out.println("총점 : " + sum);
			System.out.println("pass");
		} else if(num4<15){
			System.out.println("===========결과===========");
			System.out.println("Fail [출석 회수 부족 (" + num4 +"/20)]");
		}else {
			System.out.println("===========결과===========");
			System.out.println("중간 고사 점수 (20) : " + (double) grade);
			System.out.println("기말 고사 점수 (30) : " + (double) grade1);
			System.out.println("과제 점수 (30) : " + (double) grade2);
			System.out.println("출석 점수 (20) : " + (double) num4);
			System.out.println("총점 : " + sum);
			System.out.println("Fail [점수 미달]");
		}

	}
	public void method10() {
		//같은 클래스 내 메소드 호출 method();형식으로 불러올 수 있다
		//만약 다른 클래스의 메소드 호출인 경우 클래스의 객체 생성 후 불러와야한다.
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("실행할 기능을 선택하세요.");
		System.out.println("1. 메뉴 출력");
		System.out.println("2. 짝수/홀수");
		System.out.println("3. 합격/불합격");
		System.out.println("4. 계정");
		System.out.println("5. 로그인");
		System.out.println("6. 권한 확인");
		System.out.println("7. BMI");
		System.out.println("8. 계산기");
		System.out.println("9. P/F");
		
		System.out.print("선택 : ");
		int num = sc.nextInt();
		
		switch(num) {
		case 1: method1();
		break;
		case 2: method2();
		break;
		case 3: method3();
		break;
		case 4: method4();
		break;
		case 5: method5();
		break;
		case 6: method6();
		break;
		case 7: method7();
		break;
		case 8: method8();
		break;
		case 9: method9();
		}
		
		
		
	}

}
