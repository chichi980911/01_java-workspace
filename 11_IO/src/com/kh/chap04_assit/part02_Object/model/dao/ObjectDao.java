package com.kh.chap04_assit.part02_Object.model.dao;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.kh.chap04_assit.part02_Object.model.vo.Phone;

public class ObjectDao {
	
	//프로그램 ----> 파일 (출력)
	//관상용이 아닌 나중에 읽어오기 위해 만드는 것
	public void fileSave() {
		
		//출력할 데이터 (phone 객체)
		Phone p1 = new Phone("아이폰",1300000);
		
		Phone p2 = new Phone("갤럭시",1200000);
		
		Phone p3 = new Phone("플립", 1500000);
		
		//객체단위로 출력해줄 수 있는 보조스트림 필요
		
		//ObjecXXX => write,Reader가 없다.
		//바이트 기반 스트림 
		
		//FileOutputStream : 파일과 연결해서 1바이트 단위로 출력할 수 있는 기반 스트림
		//ObjectOutputStream : 객체단위로 출력할 수 있도록 도움을 주는 보조 스트림 (ObjectWrite없음)
		
		
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("d_phone.txt"))) {
			oos.writeObject(p1);
			oos.writeObject(p2);
			oos.writeObject(p3);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
		//프로그램 < ---- 파일 (입력)
		public void fileRead() {
			
			try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("d_phone.txt"))){
				
				
//				System.out.println(ois.readObject());
//				System.out.println(ois.readObject());
//				System.out.println(ois.readObject());
//				System.out.println(ois.readObject());//파일의 끝을 만나는 순간 예외 발생 
				while(true) {
					System.out.println(ois.readObject());
				}
				
			} catch (EOFException e) {
//				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				
			}
			
			
		
	}

}
