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
	private Scanner sc = new Scanner(System.in);
	private MusicController mc = new MusicController();
	
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
			
			switch(menu) {
			case 1: insertMusic();
				break;         
			case 2: selectMusic();
				break;
			case 3: deleteMusic();
				break;
			case 4: searchMusic();
				break;
			case 5:	updateMusic();
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
		System.out.print("추가할 곡 명 : ");
		String title = sc.nextLine();
		
		System.out.print("추가할 아티스트 명  : ");
		String artist = sc.nextLine();
		
		mc.insertMusic(title,artist);
		System.out.println("곡추가 완료");
		
	
	}

	/**
	 * 2.곡 선택
	 */

	public void selectMusic() {
		System.out.println("==========전체곡 조회 메뉴 ===========");
		
	
		ArrayList<Music> list = mc.selectMusic();
		for(int i =0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
	}

	/**
	 * 3.삭제
	 */
	public void deleteMusic() {
		
		System.out.println("==========곡 삭제 메뉴 ===========");
		System.out.print("삭제할 곡명을 적어주세요 : ");
		String title =sc.nextLine();
		int result = mc.deleteMusic(title);
		
		if(result == 1) {
			System.out.println("곡이 삭제되었습니다.");
			selectMusic();
		}else {System.out.println("입력하신 곡은 없습니다.");
		}

	}

	/**
	 * 4.검색
	 */
	public void searchMusic() {
		System.out.println("==========곡 조회 메뉴 ===========");
		
		System.out.println("1) 곡 명 검색 ");
		System.out.println("2) 아티스트 검색 ");
		System.out.print("<< 메뉴를 고르세요 : ");
		int menu = sc.nextInt();
		sc.nextLine();
		
		System.out.print("검색 키워드 :  ");
		String keyword= sc.nextLine();
	
		
		ArrayList<Music> searchList = mc.searchMusic(menu,keyword);
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
		mc.updateMusic();
		
	}
}
