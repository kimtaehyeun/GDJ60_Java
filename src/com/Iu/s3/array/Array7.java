package com.Iu.s3.array;

import java.util.Scanner;

public class Array7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("1추가 2삭제 3종료 : ");
		int num = sc.nextInt();
		boolean Action = true;
		while(Action) {
		int []ar = {5,1,4};
		
			if(num==1) {
				
				System.out.println("추가번호 입력 : ");
				int add = sc.nextInt();
				int []M  = new int[ar.length+1];
				M[0] = add;
				
				for(int i = 0; i<ar.length;i++) {
					M[i+1] = ar[i];
					
				}
				for(int i = 0; i<M.length;i++) {
					System.out.println(M[i]);
				}
				ar=M;
			}
			else if(num==2) {
				int []Remove = new int[ar.length-1];
				for(int i = 0; i<Remove.length;i++) {
					Remove[i] = ar[i+1];
					System.out.println(Remove[i]);
				}
				ar=Remove;
			}
			
			else {
				System.out.println("종료합니다.");
				
				
			}
		}
	}
}
