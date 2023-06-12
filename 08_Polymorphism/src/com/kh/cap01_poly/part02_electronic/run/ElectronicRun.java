package com.kh.cap01_poly.part02_electronic.run;

import com.kh.cap01_poly.part02_electronic.ElectronicShop2;
import com.kh.cap01_poly.part02_electronic.controller.ElectronicShop1;
import com.kh.cap01_poly.part02_electronic.model.vo.Desktop;
import com.kh.cap01_poly.part02_electronic.model.vo.NoteBook;
import com.kh.cap01_poly.part02_electronic.model.vo.Tablet;

public class ElectronicRun {
	public static void main(String[] args) {
		
		//실행용 클래스는 납품업체 
		
		//1.다형성 적용 x (ElectronicShop1)
		ElectronicShop1 es = new ElectronicShop1();
		//es에서 마련해 놓은 desk, note,tab 이라는 필드에 객체를 생성 해서 넣어주기 위함
		
		//메서드 사용해서 생성
		//먼저 필요한메서드 생각
		
		//아직은 없는 메서드
		//추가용 메서드 =>insert
		
		//데스크탑이라는 객체 생성해서 넘기는 메서드 
		
		es.insert(new Desktop("삼성", "데땁", 1200000, "gt1030"));
		
		//노트북이라는 객체 생성해서 넘기는 메서드
		es.insert(new NoteBook("lg", "그램", 200000, 30));
		
		//태블릿 이라는 객체 생성해서 넘기는 메서드
		es.insert(new Tablet("apple", "아이패드", 800000, false));
		
		//가게에 해당 객체들이 잘 생성 돼어있는지 확인
		//조회용 메서드 =>select();
		
//		es.selectDesktop();
		Desktop d = es.selectDesktop();
		NoteBook n = es.selectNoteBook();
		Tablet t = es.selectTablet();
		System.out.println(d);
		System.out.println(n);
		System.out.println(t);
		
//		insert 처럼 select 도 같은 이름으로 하면 안되는 이유는 ? 
//		매개변수가 없기 떄문에 수불가능하다 .
	
		//현재는 메서드가 6개 
		//다형성 적용 
		
//		//2. 다형성 적용했을 경우 (ElectronicShop2)
//		ElectronicShop2 es = new  ElectronicShop2();
//		
//		//추가용 메서드 => 
//		es.insert(new Desktop("삼성", "대땁", 1202220, "sdsd1020"));
//		es.insert(new NoteBook("lg", "그램", 200000, 30));
//		es.insert(new Tablet("apple", "아이패드", 800000, false));
//		
//		//조회용 메서드 =>select
//		//이번에는 이름을 하나로
//		
//		//es.select(인덱스값);
////		Desktop d = es.select(0);
//		//실제로 들어있는 값은 dosktop 이 맞으나 반환형 electronic 이라서 맞춰야함 
//				
//		Desktop d = (Desktop)es.select(0);
//		NoteBook n = (NoteBook)es.select(1);
//		Tablet t = (Tablet)es.select(2);
//		
//		System.out.println(d);
//		System.out.println(n);
//		System.out.println(t);
//	}

}
}
