package com.kh.chap03_class.run;

import com.kh.chap03_class.model.vo.Person;
import com.kh.chap03_class.model.vo.Product;

public class ClassRun {

	public static void main(String[] args) {
	
		Product S_tv = new Product();
		Product S_tv1 = new Product();
		Product S_tv2 = new Product();
		
		
//		
		S_tv.setpName("sanghotv");
		S_tv.setPrice(200);
		S_tv.setBrand("sh");
//		
		System.out.println(S_tv.information());
//		S_tv1.setpName("bugtv");
//		S_tv1.setPrice(300);
//		S_tv1.setBrand("th");
//		
//		S_tv2.setpName("icetv");
//		S_tv2.setPrice(500);
//		S_tv2.setBrand("ah");
//		
//		System.out.println("====상품1====");
//		System.out.println("상품명 : "+S_tv.getpName());
//		System.out.println("가격 : "+S_tv.getPrice()+"원");
//		System.out.println("브랜드 : "+S_tv.getBrand());
//		
//		
//		System.out.println("====상품2====");
//		System.out.println("상품명 : "+S_tv1.getpName());
//		System.out.println("가격 : "+S_tv1.getPrice()+"원");
//		System.out.println("브랜드 : "+S_tv1.getBrand());
//		
//		
//		System.out.println("====상품3====");
//		System.out.println("상품명 : "+S_tv2.getpName());
//		System.out.println("가격 : "+S_tv2.getPrice()+"원");
//		System.out.println("브랜드 : "+S_tv2.getBrand());
		
		//생성후 필드에 당김 값을 확인해 보면 jvm이 초기화를 진행해줬다는 것을 알 수있다.
		Person p = new Person();
		System.out.println(p.getId());
		System.out.println(p.getAge());
		System.out.println(p.getGender());
		
		p.setId("user01");
		p.setPwd("pwd01");
		p.setName("김상호");
		p.setAge(20);
		p.setPhone("010-1111-2222");
		p.setEmail("abc@naver.com");
		p.setGender('M');
		
		System.out.println("======값 대입후======= ");
		System.out.println(p.getId());
		System.out.println(p.getAge());
		System.out.println(p.getEmail());
		System.out.println(p.getName());
		System.out.println(p.getPhone());
		System.out.println(p.getPwd());
		System.out.println(p.getGender());
		
		System.out.println(p.information2());
	
	
	}
	

}
