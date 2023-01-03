package com.Iu.s1.controls;

import java.util.Scanner;

public class Control4_ex1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//다중선택문 switch case
		System.out.print("평균을 입력 : ");
		
		int avg = sc.nextInt();
		
		switch(avg/10) {
		case 10:
			System.out.println("A");
			break;
		case 9:
			System.out.println("A");
			break;

		case 8:
			System.out.println("B");
			break;
			
		case 7:
			System.out.println("C");
			break;
			
		default:
			System.out.println("F");
			break;
		
		}
		
		
		
		
		
	}

}
