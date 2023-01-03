package com.Iu.s4.objects1;

public class MethodMain1 {

	public static void main(String[] args) {
		System.out.println("Main Method 실행");
		MethodTest mt = new MethodTest();
		MethodTest3 mt3 = new MethodTest3();
		int salary = 30000;
		//매개변수로 보내는 값 : 인자값
		mt3.t3(salary,0.95);
		Sword sword = new Sword();
		sword.name = "짐행검";
		sword.damage=500;
		sword.level=1;
		
		mt3.info(sword);
		System.out.println(sword.name);
		System.out.println("main : "+salary);
		
		//메소드 호출
		//mt.t1();//메서드를 호출하려면 소괄호까지 작성
		//메소드가 종료되면 메모리에서 t1 메모리 삭제
		//mt.t2();
		
	//	System.out.println("Main Method 종료");
	}
	
	//t2 메서드 선언한곳 => MethodMainTest2
	
}
