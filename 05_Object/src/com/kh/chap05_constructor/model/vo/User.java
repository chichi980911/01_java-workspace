package com.kh.chap05_constructor.model.vo;

public class User {
	
	//추상화
	//필드부
	private String userId;
	private String userPwd;
	private String userName;
	private int age;
	private char gender;
	
	//생성자
	/*public 클래스명 ([매개변수,매개변수,....]){
	 * 
	 * }
	 * 
	 * 생성자를 사용하는 목적
	 * 1.객체를 생성해주기 위한 목적
	 * 
	 * 
	 * 생성자 작성시 주의사항
	 *1.생성자명은 클래스명과 동일해야 한다 (대/소문자 포함)
	 *2.반환형이 존재하지 않음(반환형을 쓰게되면 메소드로 인식한다.)
	 *3.매개변수 생성자를 명시적으로 작성하게 되면 기본생성자를 jvm이 자동으로 만들어주지 않는다.
	 *	즉 기본생성자는 항상 작성하는 습관을 들이는게 좋다.
	 */
	public User() {
		//기본생성자(매개변수 x)
		//오로지 객체 생성만을 목적으로 할 때
		//기본생성자를 생략하는 경우 jvm이 자동으로 만들어주었기 떄문에 항상 객체 생성가능하다.
		System.out.println("되니?");
	}
	
	//매개변수 생성자
	//객체 생성과 동시에 매개변수로 받아서 해당 각 필드에 초기화할 목적
	public User(String userId, String userPwd, String userName) {
		this.userId = userId;
		this.userPwd = userPwd;
		this.userName = userName;
	}
	
	public User(String userId, String userPwd, String userName, int age, char gender) {
//		this.userId = userId;
//		this.userPwd = userPwd;
//		this.userName = userName;
		/*
		 * 위와같이 중복되는 동일한 초기화 하는 내용의 생성자가 이미 존재할경우
		 * this() 생성자 활용 가능
		 * =>클래스 내에 생성자에서 또 다른 생성자를 호출하고자 할 떄 사용한다.
		 * 유의사항:반드시 첫줄에 작성해야한다.!!
		 */
		this(userId,userPwd,userName);//this 생성자 코드를 간결하게 쓸 수 있음
		this.age = age;
		this.gender = gender;
	}
	
	
		//메소드부
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getuserPwd() {
		return userPwd;
	}
	public void setuserPwd(String userPwd) {
		this.userPwd = userPwd;
	}
	public String getuserName() {
		return userName;
	}
	public void setuserName(String userName) {
		this.userName = userName;
	}
	public int getage() {
		return age;
	}
	public void setage(int age) {
		this.age = age;
	}
	public char getgender() {
		return gender;
	}
	public void setgender(char gender) {
		this.gender = gender;
	}
	public String information() {
		return "userId : " + userId + ", userPwd :"+userPwd +", userName : " + userName+ ", userage : " + age + ", gender : " +gender;
	}
	
	
	

}
