package com.kh.cap01_poly.part02_electronic.controller;

import com.kh.cap01_poly.part02_electronic.model.vo.Desktop;
import com.kh.cap01_poly.part02_electronic.model.vo.NoteBook;
import com.kh.cap01_poly.part02_electronic.model.vo.Tablet;

//다형성 적용 x 

public class ElectronicShop1 {
	
	//용산 전자상가에 있는 가게
	//필드부
//	private int price 기본자료형
//실제로 객체 생성된 것은 아님 
//필드가 메모리상에 확보되는 순간 => 객체생성되는 순간 	
	private Desktop desk;
	private NoteBook note;
	private Tablet tab;

	
	//객체 생성 후 초기화된 값 불러오는 메서드 생성
	public void insert(Desktop d) {//Desktop d = new Desktop(매개변수);
		desk =d;
	}
	public void insert(NoteBook n) {//NoteBook n = new NoteBook(매개변수);
		note = n;
	}
	public void insert(Tablet t) {//Tablet t = new Tablet(매개변수)
		tab = t;
	}
	
	//조회용 메서드 
	public Desktop selectDesktop() {
		return desk;
	}
	public NoteBook selectNoteBook() {
		return note;
	}
	public Tablet selectTablet() {
		return tab;
	}
}
