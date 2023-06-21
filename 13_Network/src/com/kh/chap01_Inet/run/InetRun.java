package com.kh.chap01_Inet.run;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetRun {

	public static void main(String[] args) {
		/*
		 * 네트워크(Network) : 여러대 컴퓨터들이 연결되어 있는 통신망 같은거
		 * 					=>이런 네트워크를 통해 서로간의 데이터 교환 가능
		 * 
		 * ip주소 : 네트워크 상 각 컴퓨터들을 식별해줄 수 있는 번호
		 * 
		 * *서버와 클라이언트
		 * >서버  : 클라이언트에게 서비스를 제공해 주는 프로그램(클라이언트 요청을 처리해서 응답)
		 * >클라이언트 : 서버에 요청하는 컴퓨터 (서비스를 제공받는 고객) 
		 * 
		 * -서버에 요청하기 위해서는 그 요청하고자 하는 서버의 ip주소 또는 도메인,포트번호 알아야함
		 * - 
		 * 
		 */
		
		//Inet adress : 네트워크 정보를 확인 할 수 있는 클래스 
		try {
			InetAddress localhost = InetAddress.getLocalHost();
			System.out.println(localhost); // 내 pc 명 /내 ip 주소
			
			System.out.println("내 pc 명 : " + localhost.getHostName());
			System.out.println("내 ip 주소 : " + localhost.getHostAddress());
			
			//내가 알고있는 도메[인을 통해서 그 서버 관련된 정보 얻기
			
			InetAddress googleHost = InetAddress.getByName("www.google.com");
			System.out.println("구글 서버명 : " + googleHost.getHostName());
			System.out.println("구글 ip주소 : " + googleHost.getHostAddress());
			System.out.println("=============================");
			
			//도메인을 통해서 서버관련한 것들을 배열로 받을 수 있다.
			InetAddress[] naverhost = InetAddress.getAllByName("www.naver.com");
			System.out.println("네이버 호스트 갯수 : " + naverhost.length);
			
			for(InetAddress n :naverhost) {
				System.out.println("네이버 서버명 : " +n.getHostName());
				System.out.println("네이버의 ip 주소 : " + n.getHostAddress());
			}
			System.out.println();
		
		
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
	}
	
	/*
	 * 현재 구동중인 서버가 있으면
	 * 클라이언트 그 서버로 요청보낼 수 있다. => 응답결과 돌려줌
	 * 요청과 응답에 의해서 프로그램은 돌아감 (통신 한다 표현)
	 * 웹 통신 방식 http 프로토콜 통신 
	 * 
	 * 자바만을 가지고 서버와 클라이언트 간의 간단한 통신 
	 * 이때 데이터를 입출력하고자 한다면 서버와 클라이언트 간의 스트림(연결통로) 
	 * 
	 * *소켓 : 프로세스간의 통신을 담당하는 것 (스트림을 연결하기 위한 문 )
	 * 		소켓 프로그래밍 (TCP 방식 / UDP방식)
	 * 		-TCP 방식 - 단점- 데이터의 전송속도가 느리다! 장점 - 데이터가 정확하고 안정적이다 (신뢰성이 요구되는 프로그램 : HTTP,이메일)
	 * 		-UDP 방식 - 단점- 신뢰성 없는 데이터가 전송 될 수 있다  장점 -데이터의 전송속도가 빠르다 (데이터를 빠른속도로 전송하고자 하는 프로그램 : 실시간 동영상 서비스) 
	 *		-
	 * */

}
