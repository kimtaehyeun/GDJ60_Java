package com.Iu.s4.objects1;

import java.util.Scanner;

public class ObjectsMain3 {

	public static void main(String[] args) {
		//n명의 학생 객체 생성
		Scanner sc = new Scanner(System.in);
		System.out.print("학생 수를 입력하세요 : ");
		int count = sc.nextInt();//참조 변수 명 스캐너의 다음인트
		
		Student [] students = new Student[count];//객체를 가지고있는 주소를 담으려고 하는 배열생성
		Student [] students2 = new Student[count];
		Student student = new Student();
		for(int i =0; i<students.length; i++) {
			
			//Student student = new Student();
			System.out.print(i+1+"학생의 이름을 입력하세요 : ");
			student.name=sc.next();
			students[i] = student;
			
		}
		for(int i= 0; i<students.length; i++)	{
			System.out.println(students[i]);
			System.out.println(students[i].name);
			//System.out.println(students2[i].name);
			
		}
			
		System.out.println("Finish");
	}

}
