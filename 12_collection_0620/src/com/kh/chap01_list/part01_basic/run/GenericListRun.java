package com.kh.chap01_list.part01_basic.run;

import java.util.ArrayList;
import java.util.List;

import com.kh.chap01_list.part01_basic.model.vo.Music;

public class GenericListRun {

	public static void main(String[] args) { 
		//<Music>로 제네릭 설정 (Music 객체만 저장 가능) <>로 설정된 같은 타입 데이터만 추가가능
		ArrayList<Music> list = new ArrayList<Music>();
		
		list.add(new Music("dan","dandan"));
		list.add(new Music("ean","EanEan"));
		//list.add("fan"); 다른 타입 담기 불가 
		
		System.out.println(list);
		
		list.add(1,new Music("fan","FanFan"));
		
		System.out.println(list);
		
		List<Music> sub =list.subList(0, 2);
		list.addAll(sub);
		System.out.println(list);
		
		Music m = list.get(3);
		System.out.println(m);
		
		for (Music o: list) {
			System.out.println(o);
		}
		
		/*
		 * 제네릭 = <> 
		 * 사용하는 이유 
		 * 1.명시된 타입의 객체만 저장하도록 제한을 둘 수 있다.
		 * 2.컬렉션에 저장된 객체를 꺼내서 사용할 때 매번 형변환 하는 절차 생략 가능
		 */
		
		
		
		
		
		
		
	}

}
