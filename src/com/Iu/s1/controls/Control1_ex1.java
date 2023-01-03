package com.Iu.s1.controls;

import java.util.Scanner;

public class Control1_ex1 {

	public static void main(String[] args) {
		//키보드로부터 국어 영어 수학 점수를 입력받기
		//총점 과 평균을 계산
		//평균 90 이상 A
		//평균 80 이상 B
		//평균 70 이상 C
		//그 외 나머지 F를 출력
		Scanner sc = new Scanner(System.in);
		System.out.println("프로그램 시작");
		System.out.print("국어 점수 : ");
		int Korean = sc.nextInt();
		
		System.out.print("영어 점수 : ");
		int English = sc.nextInt();
		
		System.out.print("수학 점수 : ");
		int Math = sc.nextInt();
		
		double total = Korean+English+Math;
		char grade = 'F';
		double avg = total/3;
	
		if(avg>=70)
			grade = 'C';
		if(avg>=80)
			grade = 'B';
		if(avg>=90)
			grade = 'A';
	
		System.out.println("");
		
		System.out.println("학점 : " + grade);
		System.out.println("총 점수 : " + total);
		System.out.println("평균 : " + avg);
		System.out.println("프로그램 종료");
		
		
		
		
		
	}

}
