package com.kh.library.model.vo;

public class Book {
	private String bNo;
	private String title;
	private String author;
	private String publisher;
	private int price;
	private String description;
	
	public Book() {
		
	}

	public Book(String bNo, String title, String author, String publisher, int price, String description) {
		super();
		this.bNo = bNo;
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.price = price;
		this.description = description;
	}

	public String getbNo() {
		return bNo;
	}

	public void setbNo(String bNo) {
		this.bNo = bNo;
	}

	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Book [bNo=" + bNo + ", title=" + title + ", author=" + author + ", publisher=" + publisher + ", price="
				+ price + ", description=" + description + "]";
	}
	
	
	// 단축키로 생성해보기
	
	
	
	
	

}
