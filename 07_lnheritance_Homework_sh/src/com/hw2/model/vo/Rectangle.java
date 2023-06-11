package com.hw2.model.vo;

public class Rectangle extends Point {
	private double width;
	
	private double height;
	//생성자
	public Rectangle() {
		
	}
	public Rectangle(int x, int y ,double width, double height) {
		super(x,y);
		this.width = width;
		this.height= height;
		
		
	}
	//메서드
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	@Override
	public void draw() {
		super.draw();
		
		
		System.out.printf("면적 : %.1f\n" ,  width*height );
		System.out.printf("둘레 : %.1f\n" , 2*(width+height));
		
	}
}
