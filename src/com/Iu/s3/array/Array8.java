package com.Iu.s3.array;

import java.util.Scanner;

public class Array8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("9,5,8,3,6");
		System.out.println("1. 내림차순 2. 오름차순");
		int select = sc.nextInt();
		int [] ar = {9,5,8,3,6};
		int save = 0;
		if(select==1) {
			for(int i=0;i<ar.length-1;i++) {
					for(int j=0;j<ar.length-1-i;j++) {
						if(ar[j]>ar[j+1]) {
							save=ar[j];	
							ar[j]=ar[j+1];
							ar[j+1]=save;
							
							for(int x = 0; x<ar.length;x++)
								System.out.print(ar[x]);
							System.out.println("");
							
						}
						
					}
					
				
			}
		}
		else if(select==2) {
			for(int i=0;i<ar.length-1;i++) {
					for(int j=0;j<ar.length-1-i;j++) {
						if(ar[j]>ar[j+1]) {
							save=ar[j];	
							ar[j]=ar[j+1];
							ar[j+1]=save;
							
							for(int x = 0; x<ar.length;x++)
								System.out.print(ar[x]);
							System.out.println("");
							
						}
						
					}
			}
		}
		//9,8,6,5,3 으로 출력을 원함
		//내림차순
		//35689
		//오름차순
		//0번 : 1,2,3,4비교
		//
		
	}

}
