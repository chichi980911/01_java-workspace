package com.kh.library.controller;

import java.util.ArrayList;

import com.kh.library.model.vo.Book;
import com.kh.library.model.vo.Magazine;

//BookManager 인터페이스 구현
public class BookController implements BookManager  {
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
		
		for(int i =0; i<list.size();i++) {
			Book book = list.get(i);
			if(book.getbNo().equals(bNo)) {
				return book;
				
			}
		}
		return null;
	}

	@Override
	public ArrayList<Book> searchBookByTitle(String title) {
		return null;
	}

	@Override
	public ArrayList<Book> onlySearchBook() {
		ArrayList<Book> blist = new ArrayList<>();
		
		for(int i = 0; i<list.size(); i++) {
			if(list.get(i) instanceof Magazine) {
				continue;
			}
			blist.add(list.get(i));
		}
		return blist;
	}

	@Override
	public ArrayList<Book> onlySearchMagazine() {
		ArrayList<Book> blist = new ArrayList<>();
		for(int i =0; i<list.size(); i++) {
			if(list.get(i) instanceof Magazine) {
				blist.add(list.get(i));
			}
		}
		
		return blist;
	}

	@Override
	public ArrayList<Book> magazineOfThisYearInfo(int year) {
		return null;
	}

	@Override
	public ArrayList<Book> searchBookByPublisher(String publisher) {
		return null;
	}

	@Override
	public ArrayList<Book> searchBookByPrice(int price) {
		return null;
	}

	@Override
	public int getTotalPrice() {
		return 0;
	}

	@Override
	public int getAvgPrice() {
		return 0;
	}
	
	
	

}
