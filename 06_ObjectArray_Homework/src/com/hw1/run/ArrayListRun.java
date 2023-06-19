package com.hw1.run;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

import com.hw1.model.vo.Employee;


public class ArrayListRun {

	public static void main(String[] args) {
		
		HashSet<Employee> hs1 = new HashSet<>();
		
		hs1.add(new Employee(0,"김말똥","영업부","팀장",30,'M',3000000,0.2,"01055559999","전라도광주"));
		hs1.add(new Employee(1, "홍길동","기획부","부장", 19, 'M',4000000,0.3, "01022223333", "서울 잠실"));
		hs1.add(new Employee(2, "강말순", "교육부", "강사", 20, 'F',1000000,0.01,"01011112222","서울 마곡"));
	
		System.out.println(hs1);
		
		for(Employee m :hs1) {
			System.out.println(m);
		}
		System.out.println("============================");
		ArrayList<Employee> list = new ArrayList<>(hs1);
		for(int i = 0 ; i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("============================");
		System.out.println(list.get(1));
	}
	

}
