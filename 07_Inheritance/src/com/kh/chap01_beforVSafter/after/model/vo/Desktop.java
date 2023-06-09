package com.kh.chap01_beforVSafter.after.model.vo;

			//자식(후손)		  //부모(조상)
public class Desktop extends Product{
	
	private boolean alllnOne;
	
	public Desktop() {
	
	}
	public Desktop(String brand ,String pCode, String pName, int price, boolean alllnOne) {
//		this.brand = brand;// this 는 주소값을 가지고 있어 해당클래스에 존재하고 있지 않기 때문에 에러 
// 		해결방법 1. 부모 클래스에 있는 필드를 protected 접근 제한자로 수정 		
//		super.brand = brand;
//		super.pCode = pCode;
//		super.pName = pName;
//		super.price = price;
//		this.alllnOne = alllnOne;
		
		//해결방법2.부모클래스에 있는 setter 메서드 활용
		//setter 메서드는 public 으로 열려있기 때문에 간접적으로 접근 가능하다.
//		super.setBrand(brand);
//		super.setpCode(pCode);
//		super.setpName(pName);
//		super.setPrice(price);
		
		//해결방법3.부모생성자 호출
		//this 생성자 this(), super 생성자 super() 위치가 항상 위에 있어야한다.
		super(brand,pCode,pName,price);
		this.alllnOne = alllnOne;
	}
	//자식 클래스는 공통된 것들을 뺀건 스스로 만들어야한다.
	//+boolean getter는 get > is 로 변경 
	public boolean isAlllnOne() {
		return alllnOne;
	}
	public void setAlllnOne(boolean alllnOne) {
		this.alllnOne = alllnOne;
	}
	//오버라이딩 :  상속의 개념 부모클래스에 있는 메서드를 가져와서 재정의 하는것 
	//오버로딩과 차이점 매개변수 차이 + 상속
	public String information() {
		return super.information()+", alllnOne : " + alllnOne;
	}
	

}
