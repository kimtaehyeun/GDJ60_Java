package com.Iu.s2.loops;

import java.util.Scanner;

public class LoopFor3_ex1 {

	public static void main(String[] args) {
		
		//분과 초를 받아서 해당 분 초가 되면 반복문 종료
		
		Scanner sc = new Scanner(System.in);
		int yb,ys=0;
		System.out.print("분 작성 : ");
		yb = sc.nextInt();
		System.out.print("초 작성 : ");
		ys = sc.nextInt();
		
		for(int b =0; b<60;b++) {
			for(int s=0;s<60;s++) {
				System.out.println(b+" 분 " +s+"초");
				if(b==yb&&s==ys) {
					b=60;
					s=60;
				}
			}
		}
		System.out.println("프로그램 종료");
	}

}
