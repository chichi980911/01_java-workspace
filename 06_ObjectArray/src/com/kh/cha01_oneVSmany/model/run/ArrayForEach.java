package com.kh.cha01_oneVSmany.model.run;

import java.util.Scanner;

import com.kh.chap02_objectArray.model.vo.Phone;

public class ArrayForEach {

	public static void main(String[] args) {
		int [] arr = {10,20,30};
		//for each문(향상된 for문 , 개선된 for 문)
		//배열 또는 컬렉션과 함께 사용됨 
		//배열 또는 컬렉션의 0번 인덱스부터 마지막 인덱스까지 순차적으로 모두 접근할 목적일 때

		
		/*
		 * [표현법]
		 * for(순차적으로 접근할 값을 담을 변수 선언 :순차적으로 접근할 배열 또는 컬렉션){
		 * 		//반복횟수 == 배열 또는 컬렉션의 크기만큼 반복
		 * 		반복적으로 실행할 내용
		 * }
		 */
		
		//단순 for문  
//		for (int i =0; i < arr.length ; i++) {
//			System.out.println(arr[i]);
//		}
		for(int value : arr) {//value = arr[0] , value = arr[1],
			//value =arr[2]
			System.out.println(value);
		}
		//ex)
		//객체 배열
		Phone[] p = new Phone[3];
		
		p[0] = new Phone("갤", "삼성",150000, "s23");
		p[1] = new Phone("아", "아이폰",100000, "9s");
		p[2] = new Phone("엘", "롤리팝",130000, "v2");
		
//		for() {}
//		System.out.println(p[0].information());
//		p[2].setBrand("여");
		
		int total = 0;
		for(Phone phone : p){ //phone =p[0],phone =p[1],phone =p[2]
			System.out.println(phone.information());
			total += phone.getPrice();
		}
		System.out.println(total);
		
		System.out.println("평균가 : " + total /p.length + "원");
		
		//구매하고자 하는 핸드폰
		//롤리팝
		//가격 : xx원 => 향상된 for 문 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("구매하고 싶은 핸드폰 : ");
		String str = sc.nextLine();
		
		for(Phone Phone : p) {
			if(Phone.getBrand().equals(str)) {
				System.out.println("가격 : " + Phone.getPrice()+"원");
			} 
		}
		
		
		
		
		
		
		

	}

}
