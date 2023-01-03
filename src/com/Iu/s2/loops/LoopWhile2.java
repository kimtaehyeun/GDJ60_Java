package com.Iu.s2.loops;

import java.util.Scanner;

public class LoopWhile2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		boolean check=true;
		while(true) {
			System.out.println("1.짜장 2.짬봉 3.탕수육 4.프로그램 종료");
			int select = sc.nextInt();
			switch(select) {
			
			case 1:
				System.out.println("짜장 선택");
				break;
			case 2:
				System.out.println("짬뽕 선택");
				break;
			case 3:
				System.out.println("탕수육 선택");
				break;
			default:
				System.out.println("프로그램 종료");
				break;
			}
			System.out.println("프로그램을 종료합니다.");
		}
	}
	

}
