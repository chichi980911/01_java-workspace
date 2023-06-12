package com.kh.chap_01poly.part01.basic.bodel.vo;

public class Child1 extends Parent{
	
	private int z;
	
	public Child1 () {
		
	}
	public Child1 (int x , int y , int z) {
		super(x,y);
		this.z = z;
	}
	public int getZ() {
		return z;
	}
	public void setZ(int z) {
		this.z = z;
	}
	public void printChild1() {
		System.out.println("첫째야");
	}
	@Override
	public void parent() {
		System.out.println("나 첫번쨰 자식이야");
	}
}
