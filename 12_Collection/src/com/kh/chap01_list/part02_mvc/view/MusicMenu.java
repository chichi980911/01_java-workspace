package com.kh.chap01_list.part02_mvc.view;

import java.util.ArrayList;
import java.util.Scanner;

import com.kh.chap01_list.part02_mvc.controller.MusicController;
import com.kh.chap01_list.part02_mvc.model.vo.Music;

//화면을 담당하는 클래스(출력문 , 입력문)

/**
 * @author ksh
 * @since 2023.06.20
 * @version 1.0
 *
 */
public class MusicMenu {
	private MusicController mc = new MusicController();
	private Scanner sc = new Scanner(System.in);

	// 메인화면 : 프로그램 실행시 처음 보여주는 화면
	public void mainMenu() {
		// System.out.println("메인 메뉴");
		while (true) {

			System.out.println("\n ======= welcome 별밤 ========");
			System.out.println("1. 새로운 곡 추가");
			System.out.println("2. 곡 전체 조회");
			System.out.println("3. 특정 곡 삭제");
			System.out.println("4. 특정 곡 검색");
			System.out.println("5. 특정 곡 수정");
			System.out.println("0. 프로그램 종료");

			System.out.print(">>>>메뉴 선택 : ");
			int menu = sc.nextInt();
			sc.nextLine();

			switch (/* 동등비교대상 */ menu) {
			case 1:
				insertMusic();
				break;
			case 2:
				selectMusic();
				break;
			case 3:
				deleteMusic();
				break;
			case 4:
				searchMusic();
				break;
			case 5:
				updateMusic();
				break;
			case 0:
				System.out.println("프로그램을 종료합니다.");
				return;
			default:
				System.out.println("다시 입력하세요.");
				break;

			}
		}

	}

	// alt +shift +j

	/**
	 * 1.새로운 곡 추가 화면
	 */
	public void insertMusic() {
		System.out.println("\n====== 새로운 곡 추가 ======");
		System.out.print("제목 입력 : ");
		String title = sc.nextLine();

		System.out.print("가수 입력 : ");
		String artist = sc.nextLine();

		// 곡 추가 요청 보내기 (사용자의 요청을 처리하는 컨트롤러단)
		// 사용자가 입력한 곡명 , 가수명 같이 넘기기
		// 컨트롤러 메서드 호출
		mc.insertMusic(title, artist);
		System.out.println("곡 추가가 완료되었습니다.");
	}

	/**
	 * 2.곡 선택
	 */

	public void selectMusic() {
		System.out.println("\n====== 전체곡 리스트======");

		// 전체곡 조회 요청 (controller 메소드 호출)
		ArrayList<Music> list = mc.selectMusic();

		/*
		 * 리스트가 비어 있다면 for문이 실행되지 않는다. for(int i = 0 ; i < list.size();i++) {
		 * System.out.println(list.get(i)); }
		 */
		if (list.isEmpty()) {// 현재 리스트가 비어있을경우
			System.out.println("현재 존재하는 곡이 없습니다.");
		} else {// 하나라도 담겨 있을 경우
			for (int i = 0; i < list.size(); i++) {
				System.out.println(list.get(i));
			}
		}
	}

	/**
	 * 3.삭제
	 */
	public void deleteMusic() {
		System.out.println("\n====== 특정곡 삭제 ======");
		System.out.print("삭제하고자 하는 곡 명 : ");
		String title = sc.nextLine();

		int result = mc.deleteMusic(title);
		if (result == 1) {// 삭제가 잘된경우
			System.out.println("성공적으로 삭제 되었습니다.");
			selectMusic();
		} else {// 삭제가 안된경우
			System.out.println("삭제할 곡을 찾지 못했습니다.");
		}

	}

	/**
	 * 4.검색
	 */
	public void searchMusic() {
		System.out.println("\n====== 특정곡 검색 ======");
		/*
		 * System.out.print("검색할곡명(키워드도 가능) : "); String keyword = sc.nextLine();
		 * 
		 * ArrayList<Music> searchList = mc.searchMusic(keyword);
		 * 
		 * System.out.println("\n =====검색결과====="); if (searchList.isEmpty()) {
		 * System.out.println("검색 결과가 없습니다."); } else { for(int i=0;
		 * i<searchList.size(); i++) { System.out.println(searchList.get(i)); }
		 * 
		 * }
		 */

		// 2.심화버전
		System.out.println("1) 제목으로 검색  ");
		System.out.println("2) 가수명으로 검색  ");
		System.out.print(">>메뉴선택 : ");
		int menu = sc.nextInt();

		sc.nextLine();

		System.out.print("검색 키워드 : ");
		String keyword = sc.nextLine();

		mc.searchMusic(menu, keyword);

		ArrayList<Music> searchList = mc.searchMusic(menu, keyword);

		System.out.println("\n =====검색결과=====");
		if (searchList.isEmpty()) {
			System.out.println("검색 결과가 없습니다.");
		} else {
			for (int i = 0; i < searchList.size(); i++) {
				System.out.println(searchList.get(i));
			}
		}

	}

	/**
	 * 5.곡 수정
	 */
	public void updateMusic() {
		System.out.println("\n =====곡 수정 =====");
		System.out.println("수정하고자 하는 곡명 : ");
		String title =sc.nextLine();
		
		System.out.println("수정내용(가수) : ");
		String upArtist = sc.nextLine();
		
		
		System.out.println("수정내용(곡명) : ");
		String upTitle = sc.nextLine();
		
		int result = mc.updateMusic(title,upArtist,upTitle);
		
		if(result > 0 ) {
			System.out.println("수정 완료되었습니다.");
			selectMusic();
		}else {
			System.out.println("수정할 곡을 찾지 못했습니다.");
		}
		
		

	}

}
