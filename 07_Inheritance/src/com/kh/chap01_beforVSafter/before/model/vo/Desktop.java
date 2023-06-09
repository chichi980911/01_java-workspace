package com.kh.chap01_beforVSafter.before.model.vo;

public class Desktop {
	
	//필드
	private String brand;
	private String pCode;
	private String pName;
	private int price;
	private boolean alllnOne;
	
	
	//생성자
	public Desktop() {
		
	}
	public Desktop(String brand,String pCode,String pName,int price,boolean alllnOne) {
		this.brand = brand;
		this.pCode = pCode;
		this.pName = pName;
		this.price = price;
		this.alllnOne = alllnOne;
	}

	
	//메서드
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getpCode() {
		return pCode;
	}
	public void setpCode(String pCode) {
		this.pCode = pCode;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public boolean isAlllnOne() {
		return alllnOne;
	}
	public void setAlllnOne(boolean alllnOne) {
		this.alllnOne = alllnOne;
	}
	public String information() {
		return brand + ", " + pCode + ", " + pName + ", " + price + ", " + alllnOne;
	}
	
}
