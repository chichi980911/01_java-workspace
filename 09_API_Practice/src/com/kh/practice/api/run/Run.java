package com.kh.practice.api.run;

import java.util.Scanner;

import com.kh.practice.api.controller.BookController;

public class Run {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// BookController 메소드에 접근하기 위해 bc라는 레퍼런스 생성
		BookController bc = new BookController(); 
		
		while(true) {
			// 1. 도서 전체 출력
			System.out.println("-----------1. 기존의 전체 도서 추가---------");
			
			// printAll() 메소드 호출
			bc.printAll();
			
			// 2_1. 추가할 도서 입력 받기
			System.out.println("-----------2. 새로운 도서 추가----------");
			System.out.print("도서명을 입력하시오 : ");
			String newTitle = sc.nextLine();
			
			System.out.print("저자명을 입력하시오 : ");
			String newAuthor = sc.nextLine();
			
			System.out.print("출판사명을 입력하시오 : ");
			String newPublisher = sc.nextLine();
			
			System.out.print("출판일 (2023-06-14 과 같이 '-'구분자를 이용하여 입력하시오) : ");
			String newDate = sc.nextLine(); // 날짜도 먼저 문자열로 받기
			
			System.out.print("가격을 입력하시오 : ");
			String newPrice = sc.nextLine();
			
			// 2_2. 입력받은 값들을 BookController의 insertBook() 메소드로 전달
			bc.insertBook(newTitle, newAuthor, newPublisher, newDate, newPrice);
			
			// 3. 5번째 도서 출간일 출력
			System.out.println("---------3. 6번째 도서 출간일 출력---------");
			//printBookPublishDate() 메소드 호출
			bc.printBookPublisherDate();
			
			// 4. 검색할 도서명 입력 (키워드)
			System.out.println("---------- 4. 도서 검색 ----------");
			System.out.print("검색할 도서명을 입력하시오 : ");
			String searchTitle = sc.nextLine();
			// searchBook(searchTitle) 메소드 호출
			bc.searchBook(searchTitle);
			
			boolean flag = true;
			while(true) {
				System.out.print("도서를 더 추가하시겠습니까?? : ");
				char yn = sc.nextLine().toUpperCase().charAt(0);
			
				if(yn == 'Y') {
					System.out.println("계속 진행하겠습니다.");
					break;
				}
				else if(yn == 'N') {
					flag = false;
					break;
				}
				else {
					System.out.println("잘못 입력하셨습니다. 다시 입력해 주세요.");
				}
			}
			
			if(flag == false) {
				System.out.println("========== 전체 도서 목록 ==========");
				bc.printAll();
				System.out.println("프로그램을 종료합니다. 감사합니다.");
				break;
			}
			
		}
		sc.close();

	}

}
