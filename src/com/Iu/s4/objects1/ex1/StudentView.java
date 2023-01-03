package com.Iu.s4.objects1.ex1;

import java.util.Scanner;

public class StudentView {
	//메서드 명 : viewOne
	//학생 한명을 받아서 학생의 모든 정보를 출력하는 메서드/
	
	//view리스트
	//N명의 학생들을 받아서 학생의 모든 정보를 출력
	public void view(Student [] students) {
	
		for(int i =0; i<students.length; i++) {
			Student student = students[i];
//			System.out.println("학생의 이름 "+student.name);
//			System.out.println("학생의 번호 "+student.num);
//			System.out.println("학생의 국어 "+student.kor);
//			System.out.println("학생의 영어 "+student.eng);
//			System.out.println("학생의 수학 "+student.math);
//			System.out.println("학생의 총점 "+student.total);
//			System.out.println("학생의 평균 "+student.avg);
//			System.out.println("");
			this.view(student);
		}
		
	}
	public void view(Student student) {
		

		System.out.println("학생의 이름 "+student.name);
		System.out.println("학생의 번호 "+student.num);
		System.out.println("학생의 국어 "+student.kor);
		System.out.println("학생의 영어 "+student.eng);
		System.out.println("학생의 수학 "+student.math);
		System.out.println("학생의 총점 "+student.total);
		System.out.println("학생의 평균 "+student.avg);
		
	}
	
}
