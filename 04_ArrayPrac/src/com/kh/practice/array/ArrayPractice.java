package com.kh.practice.array;

import java.util.Scanner;

public class ArrayPractice {
	public void method1() {
		// 길이가 10인 배열을 선언하고 1부터 10까지의 값을 반복문을 이용하여
		// 순서대로 배열 인덱스에 넣은 후 그 값을 출력하세요.
		int[] arr = new int[10]; // 배열의 크기는 10 인덱스는0~9
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
		}
		for (int i = 0; i < 10; i++) {
			System.out.println(arr[i]);
		}
	}

	public void method2() {
		// 길이가 10인 배열을 선언하고 1부터 10까지의 값을 반복문을 이용하여
		// 역순으로 배열 인덱스에 넣은 후 그 값을 출력하세요.
		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = arr.length - i;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	public void method3() {
		// 사용자에게 입력 받은 양의 정수만큼 배열 크기를 할당하고
		// 1부터 입력 받은 값까지 배열에 초기화한 후 출력하세요.
		Scanner sc = new Scanner(System.in);

		System.out.print("양의 정수 : ");
		int num = sc.nextInt();

		int[] arr = new int[num];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public void method4() {
		// 길이가 5인 String배열을 선언하고 “사과”, “귤“, “포도“, “복숭아”, “참외“로 초기화 한 후
		// 배열 인덱스를 활용해서 귤을 출력하세요.

		String[] str = new String[5];

		str[0] = "사과";
		str[1] = "귤";
		str[2] = "포도";
		str[3] = "복숭아";
		str[4] = "참외";

		System.out.println(str[1]);
	}

	public void method5() {
		// 문자열을 입력 받아 문자 하나하나를 배열에 넣고 검색할 문자가 문자열에 몇 개 들어가 있는지
		// 개수와 몇 번째 인덱스에 위치하는지 인덱스를 출력하세요
		Scanner sc = new Scanner(System.in);

		System.out.print("문자열 : ");
		String str = sc.nextLine();
		System.out.print("문자 : ");
		char ch = sc.next().charAt(0);
		String index = " "; // 누적합 공식 사용 *인덱스 값을 더하는게 아닌 인덱스 값을 각각 표시해야 하기 때문에
							// String 변수 생성후 그안에 값 넣어주기
		int count = 0;

		char[] charr = new char[str.length()];

		for (int i = 0; i < str.length(); i++) {
			charr[i] = str.charAt(i);
			if (charr[i] == ch) {
				index += i + " "; // 입력한 문자와 charr의 변수안에 담겨있는 값이 일치 할 때만 index변수안에 값을 담는다.
				count++;
			}
		}
		System.out.println(str + "에 " + ch + " 가 존재하는 위치(인덱스) : " + index);
		System.out.println(ch + " 의 개수 : " + count);

	}

//		for(int i = 0; i<str.length(); i++) {
//			if(charr[i]==ch) {
//				System.out.println(str+"에 "+ ch + " 가 존재하는 위치(인덱스) : "+ i + " " );
////			}

	public void method6() {
		Scanner sc = new Scanner(System.in);

		String[] str = { "월", "화", "수", "목", "금", "토", "일" };

		System.out.print("0 ~ 6 사이 숫자 입력 : ");
		int num = sc.nextInt();
		if (num > 6) {
			System.out.println("잘못입력하셨습니다.");
		} else {
			System.out.println(str[num] + "요일");
		}
	}

	public void method7() {

		/*
		 * 사용자가 배열의 길이를 직접 입력하여 그 값만큼 정수형 배열을 선언 및 할당하고 배열의 크기만큼 사용자가 직접 값을 입력하여 각각의
		 * 인덱스에 값을 초기화 하세요. 그리고 배열 전체 값을 나열하고 각 인덱스에 저장된 값들의 합을 출력하세요.
		 */
		Scanner sc = new Scanner(System.in);

		System.out.print("정수 : ");
		int num1 = sc.nextInt();

		int[] arr = new int[num1];

		String index = " ";
		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			System.out.print("배열 " + i + " 번째 인덱스에 넣을 값 :");
			int num = sc.nextInt();
			arr[i] = num;

			index += num + " ";
			sum += num;

		}
		System.out.println(index);
		System.out.println(sum);
	}

	public void method8() {

	}

	public void method9() {
		Scanner sc = new Scanner(System.in);

		System.out.print("치킨 이름을 입력하세요 : ");
		String str = sc.nextLine();

		String menu = "양념,간장,마늘,우유";
		String[] arr = menu.split(",");

		for (int i = 0; i < arr.length; i++) {
			if (arr[i].equals(str)) {
				System.out.println(str + "치킨 배달가능");
				return;
			} else if (i == arr.length - 1) {
				System.out.println(str + "치킨은 없는 메뉴입니다.");
			} else {
				continue;

			}

		}
	}

	public void method10() {
		Scanner sc = new Scanner(System.in);

		System.out.print("주민등록번호(-포함) : ");
		String str = sc.nextLine();

		char[] charr = new char[str.length()];

		for (int i = 0; i < str.length(); i++) {
			charr[i] = str.charAt(i);
		}
		char[] copy = new char[charr.length];
		for (int i = 0; i < copy.length; i++) {
			/// 여기까지 i가 7이하일때까지 charr[i] 까지의 값을 복사하고 8부터는 *삽입
			if (i <= 7) {
				copy[i] = charr[i];
			} else {
				copy[i] = '*';
			}
			System.out.print(copy[i]);
		}

	}

	public void method11() {
		int[] arr = new int[10];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 10 + 1);
			System.out.print(arr[i] + " ");
		}
	}

	public void method12() {
		int[] arr = new int[10];

		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;

		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 10 + 1);
			


			if (arr[i] > max)
				max = arr[i];
			
			if (arr[i] < min)
				min = arr[i];
			
			System.out.print(arr[i] + " ");
			

		}
		
		System.out.print("\n최대값 : "+max);
		System.out.print("\n최소값 : "+min);
	}
}
