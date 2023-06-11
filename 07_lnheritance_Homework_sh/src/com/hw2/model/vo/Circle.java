package com.hw2.model.vo;

public class Circle extends Point {
	private int redius;
	
	
	public Circle() {
		
	}
	public Circle(int x, int y, int redius) {
		super(x,y);
		this.redius = redius;
		
	}
	//메서드
	public int getRedius() {
		return redius;
	}
	public void setRedius(int redius) {
		this.redius = redius;
	}

	@Override
	public void draw() {
		super.draw();
		
		
		double a = Math.PI * redius*redius ;
		double b =  Math.PI * redius*2 ;
		
		
		
		System.out.printf("면적 : %.1f\n" ,  a );
		System.out.printf("둘레 : %.1f\n" , b);
		
	}

}
