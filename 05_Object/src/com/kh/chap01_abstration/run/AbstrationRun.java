package com.kh.chap01_abstration.run;

import com.kh.chap01_abstration.model.vo.Student;

public class AbstrationRun {

	public static void main(String[] args) {
		
//		 1.객체지향언어 : "객체"를 "지향"하는 "언어"로 "객체 중심" 으로 돌아간다. 
//		 2.객체란 : 현실 세계에 독립적으로 존재(목적이 있고 가치가 있고 의미가 있는)하는 모든 것들을 의미한다.
//		 		  현실세계에서는 객체들 간의 상호작용으로 돌아감 (내가 물을 먹는다)
//		 3.객체지향 프로그래밍 : 현실세계의 객체들간의 상호작용을 프로그래밍을 통해 가상세계로 구현하는 것  
//		 
//		 4.구현하고자 하는 프로그램상의 객체를 만들기 위해서
//		 	:클래스 라는 틀을 먼저 만들어야한다. (클래스란? 각 객체들의 속성을 담아낼 그릇 같은 존재)
//		 	>>추상화+캡슐화 접목해서 만들어야한다.
//		 
//		 5.추상화 과정!
//		 	1) 내가 구현하고자 하는 프로그램에서 필요한 객체들을 생각해볼 것 ex)쇼핑몰
//			2) 그 객체들이 가지는 공통적인 속성, 기능들 모두 추출 => 이름, 나이 , 주소, 휴대폰
//			3) 추출한 것들을 가지고 내가 구현하고자 했던 프로그램 "실질적인 목적"에 맞춰서 불필요한 속성, 기능들을 제거 한다.
//			4) 최종적으로 추려진 속성들을 어떤 자료형,어떤 변수명으로 사용할건지 생각하는 것 
//			
//			ex)학생관리 프로그램
//				1)학생관련객체(문동은,박연진,이사라)
//				2)공통적인 속성 및 기능들(이름,나이,주소,전화번호,키,몸무게,달리기속도,학년,반,국어점수,수학점수)
//				3)학생 "인적사항"을 관리하는 프로그램 이라고 한다면 : 이름,나이,주소,전화번호,학년,반
//				  학생 "성적"을 관리하는 프로그램 이라고 한다면 : 이름,학년,반,국어점수,수학점수 등
//				  학생 "건강"을 관리하는 프로그램 :이름,학년,반,키,몸무게,달리기속도
		
//				공통으로 추려진 객체를:"이름 , 나이 , 키" 라고한다면 자료형/변수명 지정
//				
//				4)이름 : String name;
//				  나이 : int age;
//				   키 : double height; 
		
//		6.선정된 것들을 가지고 프로그래밍
//			1)"변수" 만으로 프로그래밍을 한다면 - 변수는 하나의 값만 보관 하기 떄문에 
//			ex)
//			문동은(String name1 = "문동은";  int age1 = 20; double height1 = 162.3;)
//			박연진(String name2 = "박연진";  int age2 = 21; double height2 = 169.3;)
//			이사라(String name3 = "이사라";  int age3 = 22; double height3 = 170.3;)
//			단점 => 수백명에 해당하는 해당하는 학생들을 만들 떄 수천개의 변수가 만들어짐
			
					
//			2)"배열" 만으로 프로그래밍을 한다면 - 배열은 하나의 자료형에 여러개의 값들을 보관할 수 있음
//			ex)
//			이름보관 String[] name = {"문동은","박연진","이사라"};
//			나이보관 int[] age = {"20","21","22"};
//			키보관 double[] height = {"162.3","169.3","170.3"};
//			
//			단점 =>  기존의 학생 정보를 지워야할 때 앞으로 땡기는 과정을 진행해야함 작업시 정보가 틀어질 수 있다. 또한 
//					새로운 학생이 오면 배열을 다시 생성하거나 복사해야함
		
//			1,2)해결방안 
//			
//			구조체=> 여러가지 자료형의 여러개의 값들을 보관할 수 있다. =>클래스
//			
//			ex)
//			class student 클래스 생성 => 객체의  정보를 보관하는 그릇 > 보통 새로운 패키지 내 보관
//			
			//****
			//자바에서 객체를 만들기 위해서는 new 라는 키워드를 통해 Heap 영역에 생성 (공간할당)			
			Student moon = new Student(); //import student 클래스 
			//주소값을 닮고 있음
			System.out.println(moon);
			//메모리 변화 
			//Stack 영역에 student 자료형 생성 > moon 변수 생성
			//heap 영역에 name/age/height 공간 생성 이후 jvm에 의해 초기값들이 세팅되어 있다. 
			
			//각 영역에 "직접 접근" 해서 원하는 값 대입 = public으로 개방되어 있음 
			//arr[0] = 10;
			moon.name="문동은";
			moon.age=20;
			moon.height=162.3;
			
			System.out.println(moon.name + "님의 나이는 "+ moon.age+"살 이고, 키는"+moon.height +"cm 입니다");
			
			Student park = new Student();
			park.name= "박연진";
			park.age= 21;
			park.height= 169.3;
			
			System.out.println(park.name + "님의 나이는 "+ park.age+"살 이고, 키는"+park.height +"cm 입니다");
			
			//필드를 public 접근제한자로 작성
			//=> 필드에 직접적으로 접근해서 값 대입하거나 값을 가져올 수 있다.
			//=> 외부에서 함부로 값을 변질 시키거나 조회권한이 없는 사람이 가져올 수 있는 문제 발생
			//=> 캡술화 작업을 해야한다.
			
			
	}
	
}
