package com.kh.chap03_override.model.vo;

public class Book /*extends Object*/ {
	
	private String title;
	private String author;
	private int price;
	
	public Book() {
		
	}
	public Book(String title, String author, int price) {
		this.title = title;
		this.author = author;
		this.price =price;
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
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	/*오버라이딩
	 * - 자식 클래스가 상속받고 있는 부모클래스의 메서드를 재정의(재작성)
	 * - 부모가 제공하는 메서드를 자식이 일부 고쳐서 사용하겠다는 의미
	 * - 자식객체를 통해 실행시 자식메서드가 우선권을 가짐 
	 * 
	 * *오버라이딩 성립조건
	 * 부모 메서드명과  동일
	 * 매개변수의 개수 ,자료형,순서 동일(매개변수명은 상관없다.)
	 * 부모메서드의 반환형 동일 
	 * 부모메서드의 접근제한자보다 범위가 같거나 커야한다.
	 * ex) 부모메서드의 접근제한자 protected일 경우 오버라이딩 하는 메서드는 접근제한자가 protected 또는 public 사용
	 * 규약의 개념이 들어가 있다.  
	 * 
	 */
	@Override
	public String toString() {
		return "title : " + title + "author : " + author + "price : " + price;}
}
