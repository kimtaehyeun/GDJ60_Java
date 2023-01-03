package com.Iu.s2.loops;

public class LoopFor2 {

	public static void main(String[] args) {
		
		for(int i=0;i<10;i++) {
			System.out.println(i);
			if(i%4==3)
				break;
		}
		
		System.out.println("반복문 종료");
	}

}
