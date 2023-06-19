package com.kh.chap01_list.part01_basic.run;

import java.util.ArrayList;
import java.util.List;

import com.kh.chap01_list.part01_basic.model.vo.Music;

public class ListRun {
	/*
	 * 컬렉션이란?
	 * 자료구조 개념이 내장되어 있는 클래스로 자바에서 제공하는 "자료구조"를 담당하는 "프레임워크"이다
	 * 
	 * -자료구조 : 방대한 데이터를 보다 호율적으로 관리(조회,정렬,추가,수정,삭제) 할 수 있도록 도와주는 개념
	 * -프레임워크 : 이미 만들어져있는 틀(뼈대) => 가져다 쓰면된다.
	 * 
	 * *배열의 단점과 컬렉션의 장점
	 * >배열의 단점
	 *  1.배열은 우선 크기를 지정해야 하고 한번 지정된 크기를 변경할 수 없다.
	 * 	  새로운 값을 더 추가하고자 한다면 새로운크기의 배열을 만들고 기존데이터를 복사하는 코드를 직접 기술
	 * 	
	 * 	2. 배열 중간 위치에 추가한다거나 삭제하는 경우 매번 값을 땡겨주는 복잡한 알고리즘을 직접 기술해야한다.
	 * 
	 * 
	 *  3. 한 공간에 한 타입의 데이터만 저장 가능하다.
	 *  
	 * >컬렉션의 장점
	 * 	1.크기를 지정해줄 필요가 없다. 만일 지정했다고 하더라도 더 많은 데이터들이 들어오면 알아서 사이즈를 늘려준다.
	 * 	크기의 제약이 없다.
	 * 
	 * 	2.중간에 값을 추가한다거나 삭제하는 경우 값을 땡겨주는 작업(알고리즘)을 직접 기술할 필요가 없다
	 * 	  단지 메서드 호출만으로 알아서 내부적으로 진행된다.
	 * 
	 *  3.한 공간에 여러타입의 데이터 저장 가능
	 *  
	 *  *방대한 데이터들을 단지 보관만 해두고 조회만 할 경우 배열을 많이 사용
	 *  방대한 데이터를 보관 추가 삭제 등의 과정들이 빈번할 경우 컬렉션을 많이 사용
	 *  
	 *  
	 */
	
	public static void main(String[] args) {
		ArrayList list = new ArrayList(3); // 크기 지정 유무 선택 /크기지정 안할시 기본크기 10생성
		
		System.out.println(list);//안에 아무것도 없다.[ ] 비어있는 상태
		System.out.println(list.isEmpty());
		
		// E -> Element : 리스트에 담길 데이터들 (요소)
		
		// 1. add(E e) : 리스트 공간 끝에 전달될 데이터를 추가시켜주는 메서드
		list.add(new Music("d","D"));
		list.add(new Music("a","A"));
		list.add(new Music("c","C"));
		list.add("T");
		//지정된 크기보다 더 많이 넣어도 오류가 나지 않는다. 
		//장점 1 : 크기의 제약이 없다.
		
		//다양한 타입의 데이터를 담을 수 있다 
		//장점 3 : 여러타입 보관 가능
		
		System.out.println(list); // list 특징 : 순서유지 하면서 담김 (0번 인덱스부터 차곡 차곡)
		
		
		//2.add(inedex , E e) : 직접 인덱스를 지정해서 해당 인덱스 위치에 데이터를 추가시켜주는 메서드
		list.add(1, new Music("12","123"));
		
		//중간 위치에 데이터 추가시 복잡한 알고리즘 직접 구현 안함 => 장점 2.
		
		System.out.println(list);
		
		//3. remove(int index) : 해당 인덱스위치의 데이터 삭제시켜주는 메서드 
		list.remove(1);
		
		System.out.println(list);
		
		//4. set (int index , E e) : 해당 인덱스 위치에 데이터를 새로이 전달된 e로 수정시켜주는 메서드
		list.set(1, new Music("qq","QQ"));
		
		System.out.println(list);
		
		//5. size() : 해당 리스트의 사이즈를 반환시켜주는 메서드 (즉, 몇개의 데이터 담겨있는지)
		System.out.println("리스트의 사이즈 : " + list.size()); //배열의 length
		
		//6. get(int index) : 해당 인덱스 위치의 객체를 반환시켜주는 메서드 
		Music m =  (Music)list.get(0);
		String s = (String)list.get(3);
		System.out.println(m);
		System.out.println(s);
		
		System.out.println(((Music)list.get(1)).getTitle());
		//Object 타입이기 떄문에 강제 형변환
		
		//7. subList(int index1, int index2) : List => 추출해서 새로운 List 반환 : substing 같은거
		List sub = list.subList(0, 2);
		System.out.println(sub);
		
		//8.addAll(Collect c) : 컬렉션을 통째로 뒤에 추가시켜주는 메서드
		list.addAll(sub);
		System.out.println(list);
		
		//9.isEmpty() : boolean => 컬렉션이 비어 있는지 묻는 메서드
		System.out.println(list.isEmpty());
		
		//10.clear() : 리스트 안에 있는 내용을 비워주는 메서드 
//		list.clear();
		System.out.println(list);
		System.out.println(list.isEmpty());
		
		//반복문을 통해 순차적으로 출력
		//1. for loop문 
		System.out.println("====================================");
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("====================================");
		//2. 향상된 for 문
		for(Object o : list) { // o = list.get(0) = > o = list.get(1)
			System.out.println(o);
			
		}
	}
}
