package com.Iu.s4.objects1.ex1;

import java.util.Scanner;


public class MenuController {

	//start 메소드
	//1. 등록
	//2. 수정
	//3. 삭제
	//4. 종료
	public void start() {
		boolean sw= true;
		Scanner sc = new Scanner(System.in);
		System.out.println("학생 수를 입력하세요");
		int count = sc.nextInt();
		Student[] students = new Student[count];
		StudentInput si = new StudentInput();
		StudentView sv = new StudentView();
		while(sw) {
			System.out.println("1. 학생 정보 입력 2. 학생을 검색해서 정보 출력, 3. 학생 전체 정보 출력, 4. 종료");
			int select = sc.nextInt();
			switch(select) {
			case 1 : 
				si.setAllStudents(students);;
			break;
			case 2 : 
				System.out.println("학생 검색");
				Student student =si.findStudent(students);
				if(student !=null) {
					sv.view1(student);
				}
				else
					System.out.println("없음");
			break;
			case 3:
				System.out.println("학생 전체 정보 출력");
				sv.viewlist(students);
			break;
			case 4:
				System.out.println("학생추가 ");
				students=si.setStudent(students);
				
			break;
			case 5:
				System.out.println("종료");
				sw=false;
			break;
			
			
			}
			
			
		}
	}
}

