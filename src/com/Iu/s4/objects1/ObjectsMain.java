package com.Iu.s4.objects1;

public class ObjectsMain {

	public static void main(String[] args) {
		System.out.println("Start");
		System.out.println("");
		//main 은 프로그램을 실행 목적
		//Test 목적
		//main은 어느 클래스 안에 있던지 상관 없음;
		
		
		//학생 한명 생성
		//객체 생성
		//변수 선언과 거의 동일
		//클래스 명 변수명 = new 클래스명();
		//	. -> ~~의
		Student student = new Student();//new 라는 말은 메모리의Heap이라는 곳에 공간을 확보하라
		student.name="test";
		student.num = 30;
		
		System.out.println(student);
		System.out.println(student.name);
		System.out.println(student.num);
		System.out.println(student.avg);
		
		//학생 객체 생성
		Student student2 = new Student();
		student2.name = "IU";
		student2.num = 20;
		
		
		System.out.println(student == student2);
		
		student = student2;
		System.out.println(student.name);
		student.name = "winter";
		System.out.println(student2.name);
		

		//가비지 collector		
		
		
		System.out.println("Finish");
		
	}

}
