package com.kh.chap02_inherit.run;

import java.util.ArrayList;

import com.kh.chap02_inherit.model.vo.Airplane;
import com.kh.chap02_inherit.model.vo.Car;
import com.kh.chap02_inherit.model.vo.Ship;
import com.kh.chap02_inherit.model.vo.Vehicle;

public class InheritRun {
	public static void main (String[] args) {
		
		Car c = new Car("벤틀리", 12.5, "세단", 4);
		Ship s = new Ship("낚시", 3, "ㄴ어선", 20);
		Airplane a = new Airplane("비행기", 0.02, "제트키", 20, 4);
		
		System.out.println(c.information());
		System.out.println(s.information());
		System.out.println(a.information());
		
		c.howToMove();
		s.howToMove();
		a.howToMove();
		
		System.out.println("============================");
		
		ArrayList<Vehicle> list = new ArrayList<>();
		
		list.add(new Car("벤틀리", 12.5, "세단", 4));
		list.add(new Ship("낚시배", 3, "어선", 1));
		list.add(new Airplane("비행기", 0.01, "제트기", 10,4));
		
		for(int i = 0; i<list.size(); i++) {
			System.out.println(list.get(i).information());//동적바인딩
		}
		
		System.out.println("================");
		
		
		
		/*
		 * 상속의 장점 
		 * -보다 적은 양의 코드로 새로운 클래스 작성 가능
		 * -코드를 공통적으로 관리하기 때문에 추가나 변경에 용이 (유지보수 ,생산성 up)
		 * 
		 * 상속의 특징
		 * -클래스간의 상속에 있어서는 다중상속이 안된다(단일 상속만 가능 즉, 부모는 하나다)
		 * -자식객체는 부모클래스에 있는 메서드를 마치 내것처럼 호출가능
		 * +부모클래스에 있는 메서드가 맘에 안들면 자식 클래스에서 오버라이딩 가능하다.
		 * (원하는대로 메서드 재정의 가능 )
		 * -부모클래스에 정의돼있는 protected 필드는 자식 클래스에서 직접 접근 가능 
		 * -명시되어있지는 않지만 모든 클래스(제공하는 클래스, 직접만든 클래스)는 object 클래스의 후손이다.
		 * =>즉,object 클래스에 있는 메서드들 마음대로 호출가능 
		 * =>뿐만 아니라 오버라이딩을 통해 재정의도 가능함 
		 * 
		 * @Override 어노테이션
		 * -생략가능함, 크게 상관 없음(명시 하지 않아도 오버라이딩 된 상태)
		 * -어노테이션 붙이는 이유 
		 * >>부모메서드명이나 매개변수가 수정이 될 경우 찾아보기 쉽다. 
		 * >>자식메서드 기술시 오타가 있을 경우 찾아보기 쉽다.
		 * 
		 */
		
			System.out.println(c.hashCode());
			System.out.println(c.equals(a)); 
			System.out.println(c.toString());//주소값도 to string 메서드 생략
			
	}

}
