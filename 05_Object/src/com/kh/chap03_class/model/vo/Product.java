package com.kh.chap03_class.model.vo;

//클래스 선언 구문에 작성 가능한 접근제한자 (public , default)
//default 같은 패키지 내에서만 사용가능
public class Product {
	
	//필드부 == 멤버변수 ==인스턴스 변수
	//표현법 접근제한자 타입 필드명
	private String pname;
	private int price;
	private String brand;
	
	//생성자부 - 객체를 생성하기위한 메소드
	//표현법 접근제한자 클래스명 ([매개변수,매개변수,...]){}
	
	//기본 생성자
	public Product() {
		
	}
	
	//메소드부
	//표현법 -접근제한자 [예약어] 반환형 메소드명 (){기능구현코드}
	
	
	public String getpName() {
		return pname;
	}
	public void setpName(String name) {
		this.pname = name;
	}
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	// 유용 할 것 같은 메소드 생성 
	public String information() {
		// return pname; 반환타입을 정할수없으며  리턴값 하나만 가능
		return "pname : "+ pname + ", preice :" +price + ", brand : "+brand;
	}
}
