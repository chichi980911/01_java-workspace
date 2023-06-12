package com.kh.chap_01poly.part01.basic.bodel.vo;

public class Child2 extends Parent {
	private int n;
	
	public Child2() {
		
	}
	public Child2(int x , int y, int n) {
		super(x,y);
		this.n = n;
	}
	public int getN() {
		return n;
	}
	public void setN(int n) {
		this.n = n;
	}
	public void printChild2() {
		System.out.println("둘째야");
	}
	@Override
	public void parent() {
		System.out.println("나 두번쨰 자식이야");
	}
}
