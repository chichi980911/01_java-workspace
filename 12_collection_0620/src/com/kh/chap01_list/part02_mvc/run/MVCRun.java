package com.kh.chap01_list.part02_mvc.run;

import com.kh.chap01_list.part02_mvc.view.MusicMenu;

public class MVCRun {

	public static void main(String[] args) {
		/*
		 * MVC패턴 - 각 클래스 마다 역할(데이터 , 화면 , 요청처리)을 부여해서 작업 
		 *		=> 유지보수가 용이하다
		 * 
		 * -M :	model - 데이터를 담당하는 역할(데이터를 담기 위한 클래스, 비즈니스 로직 처리, 보관함과 연결해서 입출력)
		 * -V : view  - 화면을 담당하는 역할 즉, 사용자에게 보여지는 시각적인 요소(출력문 print , 입력문 Scanner)
		 * -C : controller - 사용자가 요청한 내용을 처리한 후 그 결과를 돌려주는 역할 (출력문 같은거 안씀)
		 * 
		 */
		
		MusicMenu mm = new MusicMenu();
		mm.mainMenu();
		
		
		
	}

}
