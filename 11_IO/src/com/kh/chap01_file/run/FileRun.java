package com.kh.chap01_file.run;

import java.io.File;
import java.io.IOException;

public class FileRun {

	public static void main(String[] args) {

	//메모리는 휘발성이다.
	//기록하기 위해 파일이 필요하다.
		
	//간단하게 파일(file)만들어지는 과정
	//java.io.file 클래스
	
		//	File f1 = new File();  java.io.file 클래스에는 기본생성자가 없다.
	
		//	1.경로 지정 하지 않은 상태로 파일 생성
		//	2.createNewFile 메서드까지 실행해야만 실제 파일이 만들어짐
		
	try {
		//1.경로 지정 하지 않은 상태로 파일 생성 - 현재 프로젝트에 파일 생성된다.
		File f1 = new File("test.txt");
		f1.createNewFile();
		
		//2.경로지정한 경우 -존재하는 폴더에 파일 생성 >해당 경로까지 지정 
		//File f2 = new File("GG:\\test.txt"); // 혹여 존재하지 않는 경로 제시시IOexception
		//f2.createNewFile();
		
		//3.파일 생성시 폴더 같이 생성
//		File f3 = new File("D:\\temp\\test.txt");
//		f3.createNewFile();

		//순서 - 폴더 먼저 생성 후 파일 생성
		File tempFolder = new File("D:\\temp\\");
			tempFolder.mkdir();
		
		File f3 = new File("D:\\temp\\test.txt");
		f3.createNewFile();
		
		//실행할때마다 파일이 계속 만들어지나요 ?
		//파일이 존재하면 그냥 덮어 쓰기 된다.
		
		System.out.println(f1.exists());
		System.out.println(new File("ttt.text").exists());
		
		System.out.println(f1.isFile()); // 파일이냐?
		System.out.println(tempFolder.isFile());
		
		// ----------------------------------------------
		
		File folder = new File("parent");
		folder.mkdir();
		
		File file = new File("parent\\person.txt");
		file.createNewFile();
		
		System.out.println("파일명 : " + file.getName());
		//절대경로 
		System.out.println("절대경로 : " + file.getAbsolutePath());
		System.out.println("파일 용량 : " + file.length()); // 아무것도 안써있으면 0
		System.out.println("상위폴더 : " + file.getParent());
		
		
	} catch (IOException e) {	
		e.printStackTrace();
	}
	
	/*
	 * 프로그램 상에 데이터를 외부매체로 출력을 한다거나 외부매체로부터 입력을 받아올꺼임!!
	 * 반드시 외부매체와 통하는 통로를 만들어야한다 = 스트림 
	 * 
	 * 스트림의 특징
	 * -스트림 : 개울 / 한방향으로 흐름 
	 * -단반향 : 입력이면 입력 / 출력이면 출력만 가능하다
	 * 			=> 입/출력 동시 다발적으로 하고자 한다면? 입력용 스트림/출력용 스트림 따로 열어야됨!!
	 * -선입선출 (FIFO) : 먼저 들어간데이터가 먼저 나온다.//통로가 파이프 같은 개념 
	 * -시간지연(delay) 이라는 문제가 생길 수 있음 
	 * 
	 * *스트림의 구분 
	 * > 통로의 사이즈 (1byte 짜리 / 2byte 짜리 )
	 * -1.바이트 스트림 :1byte짜리만 왔다갔다 할 수 있을 정도의 사이즈(좁은통로)
	 * 입력(InputStream) 출력(OutStream)
	 *
	 * -2.문자 스트림 : 2byte 짜리도 왔다갔다 할 수 있을 정도의 사이즈 =>입력 / 출력 
	 * 입력(Reader) /출력(Writer)
	 * 
	 * > 외부매체에 직접 연결하는 유무
	 * -기반 스트림 : 외부매체와 직접적으로 연결되는 통로(필수)
	 * -보조 스트림 : 말 그래도 보조 역할을 하는 통로(속도를 빠르게 한다거나, 그 외에 유용한 기능 제공)
	 * 				보조스트림 단독으로는 사용불가!! 기반스트림은 반드시 기본적으로 있어야 됨!!
	 * 
	 * 우리는 외부매체를 파일로 해보자!!
	 * 첨부파일 기능 구현 할 때 필요한 개념!
	 * 
	 */
	
	}

}
