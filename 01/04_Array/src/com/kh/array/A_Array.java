package com.kh.array;

import java.util.Scanner;

public class A_Array {

	public void method1() {
//		//배열
//		//변수
//		int num1 = 0;
//		int num2 = 1;
//		int num3 = 2;
//		int num4 = 3;
//		int num5 = 4;
//		
//		//출력하고자 할때도 일일이 출력해야함 
//		System.out.println(num1);
//		System.out.println(num2);
//		System.out.println(num3);
//		System.out.println(num4);
//		System.out.println(num5);
//		//총합계를 구할 떄도 일일이 더해줘야함
//		int sum = num1 +num2+num3+num4+num5;
//		
		/*
		 * 1.배열 선언(여러개의 값을 보관할 배열을 만든다.) [배열 선언 표현식] 자료형 배열명[]; 자료형[] 배열명;
		 */

//		int a; //변수
//		
////		int arr[]; //배열 형식
//		int[] arr2; //오로지 int 값만을 담을 수 있다.
//		
		// 2.배열할당(이 배열에 몇개의 값들을 보관할껀지 크기를 지정하는 과정,그 개수만큼 방이 만들어진다.)
//		//[표현법]
//		//배열명 = new자료형[배열크기];
//		arr2 = new int[5]; 

		// **배열 선언과 동시에 할당 (배열 만듦과 동시에 크기지정 )
		int[] arr = new int[5];

		/*
		 * 3. 값 대입 [표현식] 배열명[인덱스] = 값;
		 * 
		 */
//		arr[0] = 0;
//		arr[1] = 1;
//		arr[2] = 2;
//		arr[3] = 3;
//		arr[4] = 4;

		// 배열의 장점 : 반복문 활용이 가능하다.
		for (int i = 0; i <= 4; i++) {
			arr[i] = i;
		}
		// 출력시 반복문 활용 가능
		for (int i = 0; i <= 4; i++) {
			System.out.println(arr[i]);
		}
		System.out.println(arr); // arr이라는 박스에는 "주소값" 이라는게 담겨있다.
//		System.out.println(arr[0]);
//		System.out.println(arr[1]);
//		System.out.println(arr[2]);
//		System.out.println(arr[3]);
//		System.out.println(arr[4]);
//		

	}

	public void method2() {
		int i = 10;

		// 배열선언과 동시에 할당
		int[] iArr = new int[5];
		System.out.println(iArr);

		double[] dArr = new double[3];
		System.out.println(dArr);

		/*
		 * 실제 리터럴(값)을 곧바로 담을 수 있는 변수를 일반 변수라고 말하며 주소값을 담고 있는 변수는 참조변수 (레퍼런스 변수) 라고 한다.
		 * 
		 * 기본자료형(boolean ,char, byte , long , float ,double) 특징 소문자로 시작하고 소문자로 끝난다.
		 * 일반변수이며 실제 리터럴값을 바로 담는 변수
		 * 
		 * 배열자료형/String(int[], double[], char[], short[], String) 주소값을 담는 변수 =>
		 * 참조변수(레퍼런스 변수)
		 */

	}

	public void method3() {
		int[] iArr = new int[3];// 0~2번 인덱스

		double[] dArr = new double[4];// 0~3번 인덱스

		// 배열 선언하고 크기지정(할당) 까지만 한 상태
		// 그럼 각각의 인덱스에 초기화가 돼있을까

		for (int i = 0; i <= 2; i++) {
			System.out.println(iArr[i]);
		}
		System.out.println("==================");

		for (int i = 0; i <= 3; i++) {
			System.out.println(dArr[i]);
		}

		// 각 인덱스에 초기화(값 대입)을 하지 않아도 값들이 담겨있다
		// 이유는 Heap 이라는 공간은 절대 비워둘 수 없음 따라서 공간이 만들어 질때 JVM이 기본적으로 초기화(값 대입)을 진행해준다.
	}

	public void method4() {
		int[] arr = new int[5];

		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		arr[4] = 5;

		for (int i = 0; i <= 4; i++) {
			arr[i] = i + 1;
		}
		for (int i = 0; i < 5; i++)
			System.out.println(arr[i]);
		System.out.println(arr);// 주소 값 배열의자료형 + @ +주소값의 16진수 형태
		System.out.println(arr.hashCode());
		System.out.println("배열의 길이 : " + arr.length);

		// 배열 크기 변경 요청 ==> 배열은 크기변경 불가능 다시 새로 작성

	}

	public void method5() {

		int result = 0;// 선언과 동시에 초기화
		// 배열 쓰면서 볼 수 있는 오류 모음
//		int[] arr; 1.크기지정 까먹음

		int[] arr = null; // 아무것도 참조하고 있지 않는 상태
		// null 가지고 메소드를 호출한다거나 특정 어딘가에 접근하고자 한다면 항상오류 발생!
		// nullpointerException
//		System.out.println(arr);
//		System.out.println(arr.hashCode());
		System.out.println(arr.length);
		System.out.println(arr[0]);

	}

	public void method6() {
		int[] arr = new int[5];

//		arr[0]=2;
//		arr[1]=4;
//		arr[2]=6;
//		arr[3]=8;
//		arr[4]=10;

		for (int i = 0; i < arr.length; i++) {
			arr[i] = 2 * (i + 1);
		}
		for (int i = 0; i <= 4; i++) {
			System.out.println(arr[i]);
		}
//		for(int i=0; i<arr.length; i++) {
////			System.out.println(arr[i]);
//		}
//		
//		int value =2;
//		for(int i = 0; i<arr.length; i++) {
//			arr[i] =value;
//			value +=2;
//		}
//		
		System.out.println("arr의 해쉬코드 값 : " + arr.hashCode());
		System.out.println("arr의 길이 : " + arr.length);
//		arr[5]= 12; ArrayIndexOutOfBoundsException 배열의 부적절한 인덱스 제시시 에러

		// * 배열의 가장 큰 단점
		// -한번 배열의 크기를 지정하면 변경이 불가능하다.
		// =>배열의 크기를 변경하고자 한다면 다시 만들어야한다.

		// 새로 생성가능하지만 stack 영역의 참조변수를 새로생성하는 것이아닌 (재사용) 참조변수가 가리키는 heap주소가 변경된다.
		// new를 사용해서 heap 영역의 배열을 새로 생성 new int[5],new int[7] 2개가 생성된다.
		// 이후 new int[5] 생성된 배열은 어디에도 참조되어 있지 않기 떄문에 특정시간이 지나면 jvm의 garbage collector
		// (자동메모리관리) 기능으로 소멸된다.

		arr = new int[7];
		System.out.println("변경된 후의 arr의 해쉬코드값 : " + arr.hashCode());
		System.out.println("변경된 후의 arr의 길이 : " + arr.length);

		// 만약 배열을 강제로 삭제시키고자 한다면 연결고리를 끊으면 된다.
		// arr = null 아무것도 참조하지 않겠다
		arr = null;
		System.out.println("삭제후 arr : " + arr);
//		System.out.println("변경된 후의 arr의 해쉬코드값 : " + arr.hashCode());
//		System.out.println("변경된 후의 arr의 길이 : " + arr.length);
		// null.xxx() ==> NullPoniterException 발생
	}

	public void method7() {
		// 배열 선언, 할당 , 초기화(값대입) 다 동시에 하기

		// [표현식1]
		int[] arr1 = new int[] { 1, 2, 3, 4 };

		// [표현식2]
		int[] arr2 = { 1, 2, 3, 4 };

		// 각각의 주소값을 비교하기 떄문에 false
		System.out.println("arr1이랑 arr2가 같나요? : " + (arr1 == arr2));
		// 주소는 다르지만 담겨있는 값은 같기 떄문에 true
		System.out.println("arr1이랑 arr2가 같나요? : " + (arr1[1] == arr2[1]));

	}

	public void method8() {
		// 1.크기 10 짜리 정수 배열 생성

		// 2.반복문 활용해서 0번 인덱스 ~ 마지막 인덱스 까지 순차적으로 접근하면서 값 대입
		// 매번 1~100사이에 생성되는 랜덤값

		// 3.반복문을 활용해서 해당 배열의 0번~마지막 인덱스 까지 담겨있는 값 출력
		// ex arr[x] : xx형식으로 출력

		// 1.
		int[] arr = new int[10];
		// 2.
//		arr[0]=random
//		arr[1]=random
//		arr[2]=random
//		arr[3]=random
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 100 + 1);
		}
		// 3.
		for (int i = 0; i < arr.length; i++) {
			System.out.println("arr[" + i + "] : " + arr[i]);
		}

	}

	public void method9() {
		// 1.사용자에게 배열의 길이를 입력을 받은 후
		// 해당 그 크기만큼의 문자열 배열 생성

		Scanner sc = new Scanner(System.in);

		System.out.print("배열의 길이 : ");
		int size = sc.nextInt();
		sc.nextLine();
		String[] arr = new String[size];

		// 2.반복문 활용해서 매번 사용자에게 과일명 입력받아
		// 그 값을 매 인덱스 자리에 대입(0번 ~ 마지막 인덱스)

		for (int i = 0; i < arr.length; i++) {
			System.out.print("좋아하는 과일명을 입력 : ");
			arr[i] = sc.nextLine();// arr[i] 인덱스 값에 사용자가 입력한 값 대입
		}

		// 3.반복문 활용해서 0~마지막 인덱스까지 담긴 값을 출력

		for (int i = 0; i < arr.length; i++) {
			System.out.println("arr[" + i + "]의 값 : " + arr[i]);
		}

	}

	public void method10() {
		// 사용자에게 문자열 하나 입력받은 후
		// 각각의 인덱스에 있는 문자들은 char 배열에 옮겨담아두기

		// 1.사용자에게 문자열 입력 받기

		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 입력 : ");
		String str = sc.nextLine();

		System.out.println("찾고자 하는 문자 : ");
		char ch = sc.nextLine().charAt(0);

		// 2.char배열 생성

		char[] arr = new char[str.length()];

		// 3.반복문 활용해서 해당 문자열에서 각 인덱스별 문자를 char배열의 각 인덱스 대입
		// str.length();
		for (int i = 0; i < str.length(); i++) {
			arr[i] = str.charAt(i);

		}

		// 4.char 배열 출력
		int count = 0;

		for (int i = 0; i < arr.length; i++) {
			System.out.println("arr[" + i + "] : " + arr[i]);
			;

			if (ch == arr[i]) {// 찾으려하는 문자와 배열의 값이 같은경우
				count++;
			}

		}
		System.out.println("찾아진 문자 개수 : " + count);

	}

	public void method11() {
		// 1.사용자에게 배열의 길이 입력받은 후 해당 크기만큼의 정수 배열 생성
		Scanner sc = new Scanner(System.in);

		System.out.print("배열의길이 : "); 
		int num = sc.nextInt(); //*** 자료형 정하기
						///***자료형으로 배열의 길이 대입
		int[] arr = new int[num];

		// 2.반복문 활용해서 0~마지막 인덱스까지 매번 1~100 사이의 랜덤값 발생시켜 대입
				
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 100 + 1);
		}
		// 3.반복문을 활용해서 0~마지막 인덱스까지 담긴 값을 출력과 동시에
		// 해당 그 인덱스에 담긴 값이 짝수인 값들의 총합(누적합)을 구하자
		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			System.out.println("arr[" + i + "] : " + arr[i]);

			if (arr[i] % 2 == 0) {
				sum += arr[i];
				
			}
		}
		
		System.out.println("배열 중 짝수의 총합 : " +sum);
	}
}