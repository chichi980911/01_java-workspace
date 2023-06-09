package com.kh.chap02_inherit.run;

import com.kh.chap02_inherit.model.vo.Airplane;
import com.kh.chap02_inherit.model.vo.Car;
import com.kh.chap02_inherit.model.vo.Ship;

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
		
		
	}

}
