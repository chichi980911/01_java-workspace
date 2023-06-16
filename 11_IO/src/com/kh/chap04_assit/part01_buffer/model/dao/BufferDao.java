package com.kh.chap04_assit.part01_buffer.model.dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferDao {

	/*
	 * 보조스트림 : 기반스트림만으로 부족했던 성능을 보다 향상 시켜주는 스트림 기반스트림에서 제공하지 않는 추가적인 메서드 제공 (데이터전송
	 * 속도 향상+ @ ) >>외부매체와 직접적으로 연결되는 스트림 아님!! >>단독 사용 불가 (반드시 기반스트림과 함께 사용)
	 * 
	 * 
	 */

	// 프로그램 > 파일 (출력)
	public void fileSave() {
		// FileWriter 기반 스트림 사용 필수
		// 파일과 직접적으로 연결 2바이트 단위로 출력할 수 있는 스트림

		// BufferdWriter : 버퍼라는 공간을 제공해주는 보조스트림 (속도 향상) : 기반 스트림이랑 이름을 맞춰야한다.
		//

		// BufferedWriter bw = new BufferedWriter("c_buffer.txt"); //보조스트림 단독사용불가

		// 1.기반스트림 먼저 생성
		// FileWriter fw = new FileWriter("c_buffer.txt");

		// 2.보조스트림 생성시 기반 스트림을 전달하면서 생성
		// BufferedWriter bw = new BufferedWriter(fw);

		// 위의 두줄을 한줄로 작성

//		BufferedWriter bw = null;
//		try {
//			bw = new BufferedWriter(new FileWriter("c_buffer.txt"));
//
//			// write 메서드 사용
//			bw.write("안녕하세요\n");
//			bw.write("HI");
//			bw.newLine(); // 추가적인 메서드 활용가능
//			bw.write("바이");
//
//			// 버퍼라는 공간에 계속 쌓아뒀다가 한번에 출력해줌 => 속도 향상
//
//		} catch (IOException e) {
//			e.printStackTrace();
//		} finally {
//			try {
//				bw.close();
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//		}
		// try ~with ~resource 구문으로 자원반납까지 더 간단하게 작업할 수 있다.
		// jdk7 버전 이상부터 
		
		/*
		 * [표현법]
		 * try(try블럭 내에서 사용할 스트림 객체 생성구문) { // 알아서 try 다 끝나면 해당 스트림 반납까지 다해줌
		 * 
		 * }catch(예외클래스 e) {
		 * 
		 * }
		 */
		 	try {
				BufferedWriter bw = new BufferedWriter(new FileWriter("c_buffer.txt"));
				bw.write("안녕하세요\n");
				bw.write("반갑습니다");
				bw.newLine();
				bw.write("ㅂㅂ");
			
				
		 	} catch (IOException e) {
				e.printStackTrace();
				
			}//자원반납 구문 안써도 된다 \자동으로 반납까지 해줌
	}
	
	//프로그램 < 파일 (입력)
	public void fileRead() {
		//FileReader: 파일과 연결해서 2바이트 단위로 데이터를 입력 받을 수 있는 기반스트림 
		//BufferdReader : 속도 향상에 도움이 되는 보조스트림 
		
		try(BufferedReader br = new BufferedReader(new FileReader("c_buffer.txt"));) {
			
			
//		
			//br.read()
//			System.out.println(br.readLine());//파일의 끝을 반나면 null 이 나온다.
//			br.readLine();   //한문장씩 가져오게 되어 있고 반환형 String
			
			String value = null;
			while((value =br.readLine()) != null) { //null과 비교할때는 equlas(x)
				System.out.println(value);
			}
			
		} catch (FileNotFoundException e) {//자식
			e.printStackTrace();
		} catch (IOException e1) {//부모
			e1.printStackTrace();
		}
		
	}
	
}
