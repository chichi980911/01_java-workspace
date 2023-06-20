package com.kh.chap03_map.part02_properties.run;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import com.kh.chap03_map.part01_hashMap.model.vo.Snack;

public class PropertiesRun1 {
		//properties : map 계열의 컬렉션 = > 키 +벨류 세트로 저장
		//HashMap과의 차이점 : properties에는 키값도 String,벨류도 String 사용
			
	public static void main(String[] args) {

		Properties prop = new Properties();
		/*
		prop.put("다이제", new Snack("초코맛", 1500));
		prop.put("새우깡", new Snack("새우맛", 500));
		
		System.out.println(prop);
		System.out.println(prop.get("다이제"));
		
		//properties 사용하는 경우 주로 Properties에 담긴 것들을 파일로 출력 또는 입력 받아올 떄 사용
		//properties에서 제공하는 store(), load() 메서드를 사용하기 위해서
		
		try {
			prop.store(new FileOutputStream("test.properties"),"properties Test");
			//ClassCastException
			//내부적으로 store 실행시 Properties에 담겨있는 키 + 벨류 세트로 String 형변환 해서 출력함
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		*/
	
		//파일 입출력 하고 싶으면 다른 메서드 사용해야한다
		
		//1.setProperty(String key, String value)
		prop.setProperty("List", "ArrayList");
		prop.setProperty("set", "HashSet");
		prop.setProperty("Map", "HashMap");
		prop.setProperty("Map", "Properties");
		
		System.out.println(prop); // 저장 순서 유지 안됨, key값 중복시 덮여씌워짐
		
		//2.getProperty(String key) : String 
		System.out.println(prop.getProperty("List"));
		System.out.println(prop.getProperty("원숭이")); //존재하지 않는 키값 제시하면 null 반환

		try {
			//3. store(OutputStream os,String comments) : Properties 에 담겨있는 key-value 값들을 파일로 출력
			prop.store(new FileOutputStream("test.properties"), "properties test");
			//4. store(OutputStream os,String comments) : 
			prop.storeToXML(new FileOutputStream("test.xml"), "properties");
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
