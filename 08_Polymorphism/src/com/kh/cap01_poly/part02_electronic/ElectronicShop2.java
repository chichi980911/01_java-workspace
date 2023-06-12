package com.kh.cap01_poly.part02_electronic;

import com.kh.cap01_poly.part02_electronic.model.vo.Electronic;

//다형성 개념을 적용했을 때!! 
public class ElectronicShop2 {
//자리를 마련하자
//다형성 :부모타입 레퍼런스 하나로 다양한 자식 객체를 담을 수 있음
	
	//부모 : Electronic
	//자식 : Desktop, NoteBook, Tablet
	
	//Parent[] arr = new Parent[4];
	//Parent 타입
	//arr[0] = new Child(1,2,4)
	//arr[1] = new Child(1,2,3)
	
	//부모타입 배열로 모든 자식 객체 다루기
	private Electronic[] elec = new Electronic[3];
	private int count = 0;
	//insert 함수 구현
	//매개변수  => desktop , notebook , tablet 전부 받을 수 있는 부모 electronic생성
	
	public void insert(Electronic any) {
		elec[count++] = any;}
		
		//맨처음 count0 일 떄 new desktop 이 담김
		//elect[0] = new desktop(~~)
	
		//count 1 이었을 경우 
		//any = new notebook()
		//elec[1] = new NoteBook 이거 실행하고 count 2 
		
		//count 2 이었을 경우 
				//any = new tablet()
				//elec[1] = new Tablet 이거 실행하고 count 3
	public Electronic select(int index){
		return elec[index];
	}
		
		
		
	
	
}

