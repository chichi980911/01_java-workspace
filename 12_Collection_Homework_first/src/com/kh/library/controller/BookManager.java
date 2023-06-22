package com.kh.library.controller;

import java.util.ArrayList;

import com.kh.library.model.vo.Book;

/*
 * BookManager 인터페이스는 다양한 Book 객체들을 핸들링하는 템플릿 기능을 가지고 있다.
 */
public interface BookManager {
	// 무조건 해당 인터페이스에 있는 함수로 BookController.java 구현할 것
	
	void addBook(Book nBook);
	ArrayList<Book> getAllBook();
	Book searchBookBybNo(String bNo);
	ArrayList<Book> searchBookByTitle(String title);
	ArrayList<Book> onlySearchBook();
	ArrayList<Book> onlySearchMagazine();
	ArrayList<Book> magazineOfThisYearInfo(int year);
	ArrayList<Book> searchBookByPublisher(String publisher);
	ArrayList<Book> searchBookByPrice(int price);
	int getTotalPrice();
	int getAvgPrice();
	

}
