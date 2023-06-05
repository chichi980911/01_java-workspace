package com.kh.cahp02_encapsulation.run;

import com.kh.cahp02_encapsulation.model.vo.Student;

public class EncapsulationRun {
	public static void main(String[] args) {
		//7. 캡슐화 과정까지 적용해서 완벽한 클래스의 형태를 갖추게끔!!
		//캡슐화 : 추상화를 통해 정의된 속성들과 기능들을 하나로 묶어 관리하는 기법중 하나
		//클래스에서 가장 중요한 목적인 '데이터의 접근 제한' 을 원칙으로 
		//외부로 부터 '데이터의 직접 접근을 막고'
		//간접적으로 데이터를 처리(값 대입 ,값 돌려주기)
		//
		//1)정보은닉 : private - 직접 접근을 막기위해 private 접근 제한자 사용
		//2)setter / getter 메소드 생성
		//setter 메소드:
		//getter 메소드:
		
		Student moon = new Student();
		
//		moon.name = "문동은";
		
//		moon.method1(0);
		
		moon.setName("문동은");
		moon.setAge(20);
		moon.setHeight(160.3);
		moon.setKScore(100);
		moon.setMScore(20);
		
		
		System.out.println(moon.getName());
		System.out.println(moon.getAge());
		System.out.println(moon.getHeight());
		System.out.println(moon.getKScore());
		System.out.println(moon.getMScore());
		
		System.out.println("==수정후==");
		moon.setAge(25);
		
		System.out.println(moon.getAge());
		
	}

}
