package com.kh.cha01_oneVSmany.model.run;

import java.util.Scanner;

import com.kh.cha01_oneVSmany.model.vo.Book;

public class ObdectRun {
	public static void main(String[] args) {

		// 복습
		// 방법1. 기본생성자로 생성 한 후 setter 메서드를 이용해서 값 초기화
//		Book b = new Book();
//		b.setTitle("자바의 정석");
//		b.setAuthor("김상호");
//		b.setPrice(10000);
//		b.setPublisher("ks");

		// 방법2. 매개변수 생성자를 통해서 생성과 동시에 값을 초기화
//		Book b = new Book("자바의 정석 " , "차은우 ", 10000, "ks");

		// [응용] 사용자에게 입력 받은 값으로 객체 생성 후 초기화
		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("도서명 : ");
//		String title = sc.nextLine();
//		
//		System.out.print("저자명 : ");
//		String author = sc.nextLine();
//		
//		System.out.print("가격 : ");
//		int price = sc.nextInt();
//		
//		sc.nextLine();
//		
//		System.out.print("출판사 : ");
//		String publisher = sc.nextLine();
//		
//		Book b = new Book(title,author,price,publisher);
//		System.out.println(b.information());

		// 세개의 Book 객체를 관리해야 한다면?
		Book b1 = null;
		Book b2 = null;
		Book b3 = null;

		// 3권의 도서에 대한 정보를 반복적으로 사용자에게 입력받기
		// => 입력받은 후 각 객체 생성과 동시에 초기화(값대입)
		for (int i = 0; i < 3; i++) {
			System.out.println(i + 1 + "번째 도서정보 입력");

			System.out.print("도서명 : ");
			String title = sc.nextLine();

			System.out.print("저자명 : ");
			String author = sc.nextLine();

			System.out.print("가격 : ");
			int price = sc.nextInt();

			sc.nextLine();

			System.out.print("출판사 : ");
			String publisher = sc.nextLine();

			if (i == 0) {
				b1 = new Book(title, author, price, publisher);
			} else if (i == 1) {
				b2 = new Book(title, author, price, publisher);
			} else {
				b3 = new Book(title, author, price, publisher);
			}

		}
		//객체생성끝
		
		//전체 도서 정보 조회하기 ==> 각 객체의 출력문 작성
		System.out.println(b1.information());
		System.out.println(b2.information());
		System.out.println(b3.information());
		
		//도서 제목으로 검색하는 서비스 
		System.out.print("검색할 책 제목 : ");
		String search = sc.nextLine();
		
		if(b1.getTitle().equals(search)) {
			System.out.println(b1.information());
		}
		if(b2.getTitle().equals(search)) {
			System.out.println(b2.information());
		}
		if(b3.getTitle().equals(search)) {
			System.out.println(b3.information());
		}
		
		
	}
}
