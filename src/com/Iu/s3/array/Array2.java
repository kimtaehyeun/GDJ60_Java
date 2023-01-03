package com.Iu.s3.array;

import java.util.Scanner;

public class Array2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] ar = new int[3];
		int[] ar2 = new int[1];
		
		//키보드로부터 숫자를 입력받아서 해당 숫자 만큼 배열을 생성
		//배열에 값을 키보드로 부터 입력받고
		//값들을 출력
		int count = sc.nextInt();
		int [] ar3 = new int[count];
		
		for(int i=0;i<count;i++) {
			
			ar3[i]  =sc.nextInt();
			System.out.println(ar3[i]);
		}
		for(int i=0;i<count; i++) {
			System.out.println(ar3[i]);
		}
		System.out.println(ar[4]);
	
	}

}
