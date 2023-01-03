package com.Iu.s4.objects2;

public class Main {

	public static void main(String[] args) {
		ReturnTest returntest = new ReturnTest();
		
		returntest.t1();
		int num = returntest.t2();
		
		System.out.println(num);
		int ar[] = returntest.t3();
		System.out.println(ar[3]);
	}

}
