package com.Iu.s4.objects4;

public class GodMain {

	public static void main(String[] args) {
		//singleTon 디자인 패턴 기법
		God god = God.getInstance();
		
		god.setName("유일신");
		System.out.println("God : "+god);
		System.out.println("Name : "+god.getName());
		
		god = God.getInstance();
		
		System.out.println("God : "+god);
		System.out.println("Name : "+god.getName());
		
		//get Instance()를 많이해도 객체는 하나만 생성.
	}

}
