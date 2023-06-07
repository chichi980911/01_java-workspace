package com.hw1.model.vo;

public class Product {
	// 매개변수 생성자를 이용하여 3개의 객체 생성 (위의 사용 데이터 참고)
	// 객체가 가진 필드 값 출력 확인
	// 각 객체의 가격을 모두 120만원으로 변경 / 부가세율도 모두 0.05로 변경
	// 객체가 가진 필드 값 출력 확인
	// 각 객체의 가격에 부가세율을 적용한 실제 가격을 계산해서 출력함
	// ** 실제가격 = 가격 + (가격 * 부가세율)

	//필드부
	private String productId;
	private String productName;
	private String productArea;
	private int price;
	private double tax;
	
	//생성자부
	public Product () {
		
	}
	public Product (String productId,String productName,String productArea,int price,double tax) {
		this.productId = productId;
		this.productName = productName;
		this.productArea = productArea;
		this.price = price;
		this.tax = tax;
	}
	
	//메소드부
	public String information() {
		return "상품명 : " + productName;
	}
	public String information2() {
		return "부가세 포함 가격 : " + (price + (int)(price*tax))+"원";
	}
	public String information3() {
		return productId+" "+productName+" "+productArea+" "+price+" "+tax;
	}
	
	//getter/setter
	public String getproductId() {
		return productId;
	}
	public void setproductId(String productId) {
		this.productName = productId;
	}
	
	public String getproductName() {
		return productName;
	}
	public void setproductName(String productName) {
		this.productName = productName;
	}
	
	public String getproductArea() {
		return productArea;
	}
	public void setproductArea(String productArea) {
		this.productArea = productArea;
	}
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public double getTax() {
		return tax;
	}
	public void setTax(double tax) {
		this.tax = tax;
	}
	

}
