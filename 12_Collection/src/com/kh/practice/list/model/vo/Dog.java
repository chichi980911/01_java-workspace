package com.kh.practice.list.model.vo;

public class Dog {
	private String name;
	private int age;
	private String kind;
	
	public Dog() {
		
	}

	public Dog(String name, int age, String kind) {
		super();
		this.name = name;
		this.age = age;
		this.kind = kind;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	@Override
	public String toString() {
		return "Dog [name=" + name + ", age=" + age + ", kind=" + kind + "]";
	}
	

}
