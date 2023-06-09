package com.hw1.model.vo;

public class Employee extends Person{
	private int salary;
	private String dept;
	
	public Employee () {}
	
	public Employee (String name ,int age , double height, double weight,int salary,String dept) {
		super(age,height,weight);
		super.name = "";
		this.salary = salary;
		this.dept = dept;
		
		
		
	}
	
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary =salary;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String toString() {
		return super.toString() + " 급여 : " +salary + " 부서 : " + dept;
	}
	
	
	
}
