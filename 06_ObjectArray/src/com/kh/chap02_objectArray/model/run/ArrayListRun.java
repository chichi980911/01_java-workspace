package com.kh.chap02_objectArray.model.run;

import java.util.ArrayList;
import java.util.Scanner;

import com.kh.chap02_objectArray.model.vo.Phone;

public class ArrayListRun {

	public static void main(String[] args) {
		
		ArrayList<Phone> list = new ArrayList<Phone>(); //jdk 6이상 두번째 제네릭 설정 안해도된다.
		
		list.add(new Phone());
		list.add(new Phone("아이폰", "애플", 100, "14"));
		list.add(new Phone("갤럭시", "삼성", 130, "10"));
		
		
		
		list.get(0).setName("벨벳폰");
		list.get(0).setBrand("엘지");
		list.get(0).setPrice(120);
		list.get(0).setSeries("3");
		
		int total  = 0;
		
		for(int i = 0 ; i < list.size(); i++) {
			System.out.println(list.get(i).information());
			total += list.get(i).getPrice();
			
		}
		System.out.println("총가격 : "  + total + "원");
		System.out.println("평균값 : " + total / list.size() + "원");
		
	
		Scanner  sc = new Scanner(System.in); 
		System.out.print("구매하실 핸드폰 명  : ");
		
		String str = sc.nextLine();
		
		for(Phone p :list) {
			if(p.getName().equals(str)) {
				System.out.println("당신이 구매하고자 하는 휴대폰의 가격은 : " + p.getPrice() + "원 입니다");
			}
			
		}
	}
	
}
