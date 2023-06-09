package com.hw1.run;

import com.hw1.model.vo.Employee;

public class Run {
	// 객체 배열을 크기 3으로 할당 한 뒤
	// 0번 인덱스에는 기본생성자를 통해서 객체 생성
	// 1번 인덱스에는 매개변수 6개짜리 생성자를 이용해서 객체 생성
	// 2번 인덱스에는 매개변수 10개짜리 생성자를 이용하여 객체 생성 후 출력
	// 3개의 객체 중 값이 없는 필드에 각각 값을 넣은 뒤 다시 출력(임의로)
	// 직원 각각의 보너스가 적용된 1년 연봉을 계산하여 출력
	// 보너스가 적용된 연봉 = (급여 +(급여 *보너스 포인트)) * 12
	// 3명 직원의 연봉 평균을 구하여 출력

	public static void main(String[] args) {
		Employee[] emp = new Employee[3];
		
		
		
		emp[0] = new Employee();
		emp[1] = new Employee(1, "홍길동", 19, 'M', "01022223333", "서울 잠실");
		emp[2] = new Employee(2, "강말순", "교육부", "강사",20, 'F', 1000000, 0.01,  "01011112222", "서울 마곡");
		
		
		emp[0].setEmpName(null);
		emp[0].setDept(null);
		emp[0].setJob(null);
		emp[0].setAge(0);
		emp[0].setGender(' ');
		emp[0].setSalary(0);
		emp[0].setBonusPoint(0);
		emp[0].setPhone(null);
		emp[0].setAddress(null);
		System.out.println("emp[0] : " + emp[0].information());
		System.out.println("emp[1] : " + emp[1].information());
		System.out.println("emp[2] : " + emp[2].information());
		
		
		System.out.println("===============================================");
		
		emp[0].setEmpName("김말똥");
		emp[0].setDept("영엽부");
		emp[0].setJob("팀장");
		emp[0].setAge(30);
		emp[0].setGender('M');
		emp[0].setSalary(3000000);
		emp[0].setBonusPoint(0.2);
		emp[0].setPhone("01055559999");
		emp[0].setAddress("전라도 광주");
		emp[1].setDept("기획부");
		emp[1].setJob("부장");
		emp[1].setSalary(4000000);
		emp[1].setBonusPoint(0.3);
		
		System.out.println("emp[0] : " + emp[0].information());
		System.out.println("emp[1] : " + emp[1].information());
		
		
		System.out.println("===============================================");
		
		for(int i = 0; i <emp.length; i++) {
			System.out.println(emp[i].getEmpName() + "의 연봉 : " +(emp[i].getSalary() + (int)(emp[i].getSalary()*emp[i].getBonusPoint()))*12 + "원");
		}
		
		System.out.println("===============================================");
		
		int sum = 0;
		for(int i = 0; i <emp.length; i++) {
			
			sum += (emp[i].getSalary() + (int)(emp[i].getSalary()*emp[i].getBonusPoint()))*12;
			
		}System.out.println("직원들의 연봉의 평균 " + sum/3 + "원");
		
	
		


	}

}
