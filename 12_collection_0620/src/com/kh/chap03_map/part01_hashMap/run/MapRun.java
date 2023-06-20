package com.kh.chap03_map.part01_hashMap.run;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.Map.Entry;

import com.kh.chap03_map.part01_hashMap.model.vo.Snack;

public class MapRun {

	public static void main(String[] args) {
		
		HashMap hm = new HashMap();
		
		//계층구조
		//List 계열 set 계열의 클래스들은 collection구현한 클래스다.
		//=> 객체를 추가하고자 할 떄 공통적으로 add 메서드 이용 
		
		//Map 계열은 collection을 구현한 클래스가 아니다.
		//=> 추가하고자 할 때 put 메서드 이용 (이때 key + value 세트로 담아야 한다 )
		
		//1.put(K key, V value) : 컬렉션에 키 벨류 세트로 추가시켜주는 메서드
		hm.put("다이제", new Snack("초코맛", 1500));
		hm.put("칸초", new Snack("단맛", 600));
		hm.put("새우깡", new Snack("짠맛",500));
		hm.put("포테이토칩", new Snack("짠맛",500));
		
		System.out.println(hm); // {키 = 벨류}
		
		//저장되는 순서는 유지되지 않는다. 벨류값이 중복되어도 키 값이 중복되지 않으면 저장된다.
		
		hm.put("새우깡", new Snack("매운맛", 700));
		System.out.println(hm);
		
		//동일한 키 값으로 다시 추가하는 경우 value 덮어 씌어진다(중복된 키 사용 불가)
		
		
		//2.get(Object key) : V => 컬렉션에서 해당 키값을 가지는 value 값을 반환시켜주는 메서드 
		Snack s = (Snack)hm.get("다이제");
		System.out.println(s);
		
		//3. size() : 컬렉션에 담겨있는 객체들의 개수 반환
		System.out.println("몇 개 있을까 ? : "+ hm.size()+ "개 있음");
		
		//4. replace(k key, V value) => 컬렉션에서 해당 키값을 찾아서 다시 전달한 value 값으로 수정시켜주는 메서드 )
		hm.replace("포테이토칩", new Snack("원숭이맛" , 6000)); // 없는 키값 제시시 무시함
		System.out.println(hm);
		
		//5. remove(Object Key) => 컬렉션에서 해당 키 값 찾아서 그 키-벨류 세트로 삭제시켜주는 메서드
		hm.remove("포테이토칩");
		System.out.println(hm);
		
		
		System.out.println("======================");
		
		//map 공간에 모든 키값과 벨류값 다 출력하고자 할때
		//for each문 안된다.
		//ArrayList도 안된다.
		
		//Iterator 반복자 이용
		
//		Iterator it = hm.iterator(); iterator()호출불가 List 계열 또는 Set 계열에서만 쓸 수 있는 메서드
		
		//Map을 Set으로 바꿔주는 메서드 제공 
		//Map계열 => Set 계열
		
		//1. keySet() 메서드 이용하는 방법
		//1) hm에 있는 키들만 Set에 담기 (키들의 집합형태)
		Set keySet = hm.keySet();

		//2) 1번 과정에서 작업된 keyset을 Iterator에 담기
		//keySet.iterator() : Iterator
		Iterator itkey = keySet.iterator();
		
		//3) 반복문을 통해 뽑기
		while(itkey.hasNext()) {
			String key = (String)itkey.next();
			Snack value = (Snack)hm.get(key);
			System.out.println(key + "=" + value);
		}
		
		
		//2. entrySet() 메서드 이용하는 벙법
		
		//1)hm.entrySet() : set
		Set entrySet = hm.entrySet();
		
		//2)entrySet.interator() : Iterator
		Iterator itEntry = entrySet.iterator();
		
		//3)반복문을 통해 가져오기
		while(itEntry.hasNext()) {
			Entry entry = (Entry)itEntry.next();
			
			String key = (String)entry.getKey();
			Snack value = (Snack)entry.getValue();
			System.out.println(key + "=" + value);
			
		}
		
		
	
	
	
	
	
	}

}
