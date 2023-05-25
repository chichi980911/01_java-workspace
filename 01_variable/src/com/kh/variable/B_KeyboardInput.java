package com.kh.variable;

import java.util.Scanner;

//사용자가 키보드로 입력한 값을 받아들이는 Scanner 실습
public class B_KeyboardInput {
	public void InputTest1() {
	
		
		/*
		 * 키보드로 값을 입력받는 방법
		 * scanner를 사용한다.
		 * 즉 java.util.Scanner 클래스를 이용하는 것이다.
		 * Scanner 클래스 내부의 메소드를 호출해서 입력받는 것
		 */
		
		//스캐너 생성
		
		Scanner sc = new Scanner(System.in);
		
		//System.in 은 입력받은 값을 바이트단위로 받아들이겠다는 의미 
	
		System.out.print("아무거나 입력해보세요 :");
		
		
		String message = sc.nextLine();
		System.out.println("입력받은 내용 :" + message);
		
		sc.close();
		
	}
	
	//inputTest2() 메소드 생성  당신의 이름은 무엇입니까? 
	//String name 저장 출력 
	
	/*1.inputest2 생성
	 *2.스캐너 생성
	 *3. 
	 */
	public void InputTest2() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("당신의 이름은 무엇입니까? :");
		
		
		String name = sc.nextLine();
//		System.out.println("입력받은 내용 :" + name);
		
		//사용자가 입력한 값을 문자열로 받아오는 메소드(nextLine(), next())
		//String name = sc.next();
		//next() : 사용자가 입력한 값 중 공백이 있을 경우 공백 이전까지의 값만 읽어옴 
		// 			따라서 거주지 처럼 공백이 있는 데이터는 제대로 된 값을 못가져 올 수 도 있다.
		//next() : 사용자가 입력한 값 모두 읽어옴 (엔터 전 까지의 모든 값)
		
		System.out.print("당신의 나이는 몇 살입니까 ? : ");
		int age = sc.nextInt(); // 사용자가 입력한 값을 정수로 읽어 들이는 메소드
//		System.out.println("입력받은 내용 :" + age);
		
		System.out.print("당신의 키는 몇 입니까? (소수점 첫째 자리까지):");
		double height =sc.nextDouble(); //사용자가 입력한 값을 실수로 읽어 들이는 메소드
		
		System.out.println(name + "님은" + age +"살이며, 키는" + height +"입니다");
		
		sc.close();
	}
	
	public void InputTest3() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름: ");
		String name = sc.nextLine();
		
		System.out.print("나이 : ");
		int age = sc.nextInt();
		//버퍼에 남아있는 엔터를 비워주는 코드를 추가
		sc.nextLine();
		
		
		System.out.print("주소 : ");
		String address = sc.nextLine();
		
		System.out.print("키 :");
		double key = sc.nextDouble();
		
		
		System.out.println(name + "님은" + age +"살이며,사는곳은 " + address + "이고,키는" + key +"cm입니다");
		sc.close();
	}
	
	public void InputTest4() {
		
		//스캐너 생성
		Scanner sc = new Scanner(System.in);
		
		//문자열을 입력 받을 때 => sc.nextLine() 
		//문자열을 공백까지 => sc.next() 
		//실수값을 입력 받을 떄 => sc.double()
		
		System.out.print("이름 : ");
		String name = sc.nextLine();
		
		System.out.print("성별(M/F) : ");
		//char gender = sc.nextChar(); nextChar() 와 같은 메소드는 존재하지 않음
		char gender = sc.nextLine().charAt(0);
		//문자열.charAT(인덱스) : 해당 문자열로부터 해당 인덱스의 문자를 추출해주는 메소드 이다.
		
		
		
		System.out.print("나이 : ");
		int age = sc.nextInt();
		
		System.out.print("키 : ");
		double height = sc.nextDouble();
		
		/*
		 * xxx님의 개인정보
		 * 성별 : x
		 * 나이 : x
		 * 키 : xxx.x
		 */
		System.out.println(name + " 님의 개인정보");
		System.out.println("성별 : " + gender);
		System.out.println("나이 : " + age);
		System.out.println("키 : " + height);
		
	
		
	}
	
	public void charAtTest() {
		String str = "Hello";
		
		//변수에 기록하여 출력하는 방식
		char ch = str.charAt(0);
		System.out.println(ch);
		
		//바로 출력하는 방식 
		System.out.println(str.charAt(3));
		
//		System.out.println(str.charAt(12));
//		존재하지 않는 인덱스 올퓨 StringIndexOutOfBoundsException
				
	}
	
	/*
	 * 정리 
	 * 1.콘솔창에(모니터) 출력하기 위해 : Syetem.out.print[ln]() 메소드 이용 
	 * 2.콘솔창에 (키보드) 입력받기 위해 : Scanner 이용해서(nextLine(), next(),nextInt(),nextDouble()...)
	 * **주의사항 
	 * 1)sc.nextxxx() 메소드 뒤에 sc.nextLine()메소드가 와야될 경우 
	 * sc.nextLine()메소드를 한번더 써줘서 버퍼에 남아 있는 '엔터'를 뺴주는 과정 필수
	 * 2)'문자'값을 입력받아야 될 경우
	 * sc.nextLine() 메소드를 통해 우선 문자열로 받고 그 뒤에 ./chatAt(인덱스값) 메소드를 통해서 문자 추출
	 * 
	 * 
	 */
	

}
