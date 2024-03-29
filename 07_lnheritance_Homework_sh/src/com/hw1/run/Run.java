package com.hw1.run;

import com.hw1.model.vo.Student;

import java.util.Scanner;

import com.hw1.model.vo.Employee;
import com.hw1.model.vo.Person;

public class Run {// public class Run{
	public static void main(String[] args) {
		// 3명의 학생 정보를 기록할 수 있게 객체 배열 할당 (Student[])
		// 위의 사용 데이터 참고하여 3명의 학생 정보 초기화
		// 위의 학생 정보 모두 출력

		Student[] st = new Student[3];

		st[0] = new Student("홀길동", 20, 178.2, 70.0, 1, "정보시스템공학과");
		st[1] = new Student("김말똥", 21, 187.3, 80.0, 2, "경영학과");
		st[2] = new Student("강개순", 23, 167.0, 45.0, 4, "정보통신공학과");

		for (int i = 0; i < st.length; i++) {
			System.out.println(st[i]);
		}

		// 최대 10명의 사원 정보를 기록할 수 있게 배열을 할당 (Employee[])
		// 사원들의 정보를 키보드로 계속 입력 받고 → while(true) 무한 반복문을 통해
		// 입력받은 정보들을 가지고 매개변수 생성자를 이용하여 객체 배열에 객체 생성

		Employee[] em = new Employee[10];
		int count = 0;

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("사원 정보를 입력하세요.");

			System.out.print("이름 : ");
			String name = sc.nextLine();

			System.out.print("나이 : ");
			int age = sc.nextInt();

			System.out.print("신장 : ");
			double h = sc.nextDouble();

			System.out.print("몸무게 : ");
			double w = sc.nextDouble();

			System.out.print("급여 : ");
			int s = sc.nextInt();

			sc.nextLine();
			System.out.print("부서 : ");
			String d = sc.nextLine();

			Employee employee = new Employee(name, age, h, w, s, d);
			employee.setName(name);
			employee.setAge(age);

			em[count] = employee;
			count++;
			System.out.print("계속 추가할건가요 ? (Y/N) : ");
			char ch = sc.nextLine().charAt(0);

			if (ch == 'n' || ch == 'N') {
				break;
			}
			if(count ==10) {
				break;
			}
		}
		for (int i = 0; i < count; i++) {
			System.out.println("현재까지입력한사원정보 : " + em[i]);
		}
	}

}

// 한명씩 추가 될때마다 카운트함
// 계속 추가할 것인지 물어보고, 대소문자 상관없이 y이면 계속 객체 추가
// ‘n’일 경우 더 이상 그만 입력 받도록 …
// 배열에 담긴 사원들의 정보를 모두 출력
