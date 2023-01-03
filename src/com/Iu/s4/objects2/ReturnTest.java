package com.Iu.s4.objects2;

import java.util.Random;

public class ReturnTest {
	Random random = new Random();
	public void t1() {
		System.out.println("리턴이 없을 때는 void");

	}
	public int t2() {


		System.err.println("리턴은 int");

		return random.nextInt(50) ;
	}
	public  int[] t3(){
		int []ar = new int[5];
		int i = 0;
		for(i =0; i<ar.length;i++) {
			ar[i]=random.nextInt(5);
			System.out.println(i+"\t"+ar[i]);
		}
		return ar;
	}
}
