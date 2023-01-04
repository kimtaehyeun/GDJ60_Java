package com.Iu.s4.objects3.p1;

public class Member {


	String name;
	private int age;
	private double ki;
	private double muge;
	private boolean check;
	
	public boolean isCheck() {
		return check;
	}



	public void setCheck(boolean check) {
		this.check = check;
	}



	public Member() {}



	public Member(int age) {
		if(age>0 || age<200) {
			this.age = age;
		}
	}
	//setter 메소드
	//set+변수명의 첫글자를 대문자로 바꾼 것.
	
	public void setAge(int age) {
		this.age = age;
	}

	//getter메소드
	//get+변수명의 첫글자를 대문자로 바꾼것.
	public int getAge() {
		return this.age;

	}
	//name
	public String getName() {
		return this.name;
		
	}
	public void setName(String name) {
		this.name=name;
		
	}
	
	//ki
	public double getKi() {
		
		return this.ki;
		
	}
	public void setKi(double ki) {
		
		this.ki= ki;
		
	}
	
	//muge;
	public double getMuge() {
		
		return this.muge;
		
	}
	public void setMuge(double muge) {
		
		this.muge = muge;
		
	}
	
	public void info() {
		System.out.println("이름 : "+this.name);
		System.out.println("Age : "+this.age);

	}

}
