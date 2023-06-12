package com.kh.cap01_poly.part02_electronic.model.vo;

public class Desktop extends Electronic {
	public static final String cpu = "intel";
	private String graphic;
	
	public Desktop() {
		
	}
	public Desktop(String brand, String name , int price,String graphic) {
		super(brand, name, price);
		this.graphic = graphic;
	}
	public String getGraphic() {
		return graphic;
	}
	public void setGraphic(String graphic) {
		this.graphic = graphic;
	}
	public static String getCpu() {
		return cpu;
	}
	@Override
	public String toString() {
		return super.toString() + "cpu : " + cpu + "graphic : " + graphic;
	}

}
