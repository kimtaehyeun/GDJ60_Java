package com.Iu.s4.objects1.ex1;

import java.util.Scanner;

public class StudentInput {
	Scanner sc = new Scanner(System.in);
	//findStudent
	//학생 배열을 받아서
	//학생의 번호를 받아서 일치하는 학생을 리턴 없으면 null
	/////////////////////////////////////////////////////////////////////
	public Student findStudent(Student [] students) {
		
		////////////////////////////////////////////////////////////////
		
		Student student = new Student();
		Scanner sc = new Scanner(System.in);
		System.out.print("번호 입력 : ");
		int num = sc.nextInt();
		for(int i=0; i<students.length;i++) {
			if(num == students[i].num) {
				
				return students[i];
			}
		}
		return null;
		
		///////////////////////
//		Scanner sc = new Scanner(System.in);
//		System.out.println("찾으려는 학생의 번호를 입력");
//		int num = sc.nextInt();
//		Student student = null;
//		for(int i=0; i<students.length;i++) {
//			if(num==students[i].num) {
//				student = students[i];
//				//return students[i];
//			}
//			
//		}
//		return student;
	}
	
	
	//setStudent
	//학생 한명 객체를 생성해서 , 이름, 번호, 국어, 영어, 수학 입력
	//총점 평균
	//setAllStudents
	//매개변수로 학생 배열을 받아서 
	//배열의 수만큼 학생 객체를 생성해서 이름,번호,국어,영어,수학 입력
	//총점 평균
	//학생 객체를 배열에 대입
	
	public Student []setStudent(Student [] students){
		Student student = new Student();
		Student [] studentsadd = new Student[students.length+1];
		//setstudent [4]  Student[3]	
		// 3210		210				3
		for(int i = 0; i<students.length; i++) {
			studentsadd[i]=students[i];//[3]까지210
		}
		System.out.print("학생의 이름 입력 : ");
		student.name = sc.next();
		System.out.print(student.name+"학생의 번호 입력 : ");
		student.num = sc.nextInt();
		System.out.print(student.name+"학생의 국어점수 입력 : ");
		student.kor = sc.nextInt();
		System.out.print(student.name+"학생의 수학점수 입력 : ");
		student.math = sc.nextInt();
		System.out.print(student.name+"학생의 영어점수 입력 : ");
		student.eng = sc.nextInt();
		System.out.println(student.name+"학생의 총점");
		System.out.println(student.total=student.kor+student.eng+student.math);
		System.out.println(student.name+"학생의 평균");
		System.out.println(student.avg=(double)(student.total)/3);
		
		studentsadd[students.length] = student;//[3]까지
		
		
		
		
			return studentsadd;
	}
	public void setAllStudents(Student [] students){
		for(int i = 0; i<students.length; i++) {
			Student student = new Student();
			System.out.print("학생의 이름 입력 : ");
			student.name = sc.next();
			System.out.print(student.name+" 학생의 번호 입력 : ");
			student.num = sc.nextInt();
			System.out.print(student.name+" 학생의 국어점수 입력 : ");
			student.kor = sc.nextInt();
			System.out.print(student.name+" 학생의 수학점수 입력 : ");
			student.math = sc.nextInt();
			System.out.print(student.name+" 학생의 영어점수 입력 : ");
			student.eng = sc.nextInt();
			System.out.println(student.name+" 학생의 총점");
			System.out.println(student.total=student.kor+student.eng+student.math);
			System.out.println(student.name+"학생의 평균");
			System.out.println(student.avg=(double)(student.total)/3);
			students[i]=student;
		}
		for(int i = 0; i<students.length;i++){
			System.out.println("등록된 학생 : "+(i+1)+". "+students[i].name);

		}

	}
}
