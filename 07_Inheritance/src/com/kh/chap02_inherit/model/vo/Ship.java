package com.kh.chap02_inherit.model.vo;

import java.awt.Point;

public class Ship extends Vehicle{
	private int propeller;
	
	public Ship() {
		
	}
	
	public Ship(String name, double mileage, String kind , int propeller) {
		super(name,mileage,kind);
		this.propeller = propeller;
	}
	
	public int getShip() {
		return propeller;
	}
	public void setShip(int propeller) {
		this.propeller = propeller;
	}
	public String intformation() {
		return super.information() + ", Propeller : " + propeller;
	}
	
	@Override
	public void howToMove() {
		System.out.println("프로펠러를 돌려서 움직인다");
	}
}
