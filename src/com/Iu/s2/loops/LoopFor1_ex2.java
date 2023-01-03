package com.Iu.s2.loops;

import java.util.Scanner;

public class LoopFor1_ex2 {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
//		//학생수를입력받고 학생 만큼 점수를 입력받아서 총합계를 출력
//		System.out.print("학생 수 : ");
//		int student = sc.nextInt();
//		int grade=0;
//		for(int i =1; i<student+1; i++) {
//			System.out.print("학생 "+i+"번 점수 : ");
//			grade+=sc.nextInt();
//	
//		}
//		System.out.println("총 합계 : "+grade);
		
		int time = sc.nextInt();
		
		for(int i=0; i<60;i++) {
			System.out.println(i+"초");
			if(i ==time)
				i=60;
			}
		System.err.println("종료");
	}
}
