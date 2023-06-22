package com.kh.library.controller;

import java.util.ArrayList;

import com.kh.library.model.vo.Book;
import com.kh.library.model.vo.Magazine;

//BookManager 인터페이스 구현
public class BookController implements BookManager {

	ArrayList<Book> list = new ArrayList<>();

	@Override
	public void addBook(Book nBook) {
		list.add(nBook);

	}

	@Override
	public ArrayList<Book> getAllBook() {

		return list;
	}

	@Override
	public Book searchBookBybNo(String bNo) {
		Book b = new Book();

		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getbNo().equals(bNo)) {
				b = list.get(i);
				return b;
			}
		}
		return null;
	}

	@Override
	public ArrayList<Book> searchBookByTitle(String title) {
		ArrayList<Book> b2 = new ArrayList<>();
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getTitle().equals(title)) {
				b2.add(list.get(i));
				return b2;
			}
		}
		return null;
	}

	@Override
	//
	public ArrayList<Book> onlySearchBook() {
		ArrayList<Book> BookList = new ArrayList<>();

		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) instanceof Book && !(list.get(i) instanceof Magazine)) {
				BookList.add(list.get(i));
			}
		}
		return BookList;

	}

	@Override
	public ArrayList<Book> onlySearchMagazine() {
		ArrayList<Book> MagazineList = new ArrayList<>();

		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) instanceof Magazine) {
				MagazineList.add(list.get(i));
			}
		}
		return MagazineList;
	}

	@Override
	public ArrayList<Book> magazineOfThisYearInfo(int year) {
		ArrayList<Book> b3 = new ArrayList<>();

		for (int i = 0; i < list.size(); i++) {
			Book book = list.get(i);
			if (book instanceof Magazine) {
				Magazine magazine = (Magazine) book;
				if (magazine.getYear() == year) {
					b3.add(list.get(i));
				}
			}
		}
		if(b3.isEmpty()) {
			return null;
		}else {
			return b3;
		}
	}

	@Override
	public ArrayList<Book> searchBookByPublisher(String publisher) {
		ArrayList<Book> b3 = new ArrayList<>();
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getPublisher().equals(publisher)) {
				b3.add(list.get(i));
				return b3;
			}
		}
		return null;
	}
		
	

	@Override
	public ArrayList<Book> searchBookByPrice(int price) {
		ArrayList<Book> b4 = new ArrayList<>();
		
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).getPrice() < price) {
				b4.add(list.get(i));
			}
		}
		if(b4.isEmpty()) {
			return null;
		}else {
			return b4;
		}
		
	}

	@Override
	public int getTotalPrice() {
		int sum = 0;
		for (int i = 0; i < list.size(); i++) {
			 int price = list.get(i).getPrice();
			sum += /*((int) list.get(i)); */ price;
		}
		return sum;
	}
	@Override
	public int getAvgPrice() {
		int sum = 0;
		int price1 = 0;
		for (int i = 0; i < list.size(); i++) {
			 int price = list.get(i).getPrice();
			sum += price;
			price1 = sum/list.size();
		}
		
		return price1;
		
	}

}
