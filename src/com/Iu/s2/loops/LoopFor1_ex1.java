package com.Iu.s2.loops;

public class LoopFor1_ex1 {

	public static void main(String[] args) {
	
		//0~100미만의 짝수만 출력
		for(int i = 0; i<100; i+=2)
			System.out.print(i+" ");
		System.out.println("");
		//if문 있게
		for(int i = 0; i<100; i++)
			if(i%2==0)
				System.out.print(i+" ");
		System.out.println("");
		//0~100 미만의 합계를 구하시오
		int sum=0;
		for(int i =0; i<100;i++)
			sum+=i;
		System.err.println(sum);
	}

}
