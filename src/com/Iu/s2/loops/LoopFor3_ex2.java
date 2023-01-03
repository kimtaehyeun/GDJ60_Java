package com.Iu.s2.loops;

import java.util.Scanner;

// TODO Auto-generated method stub
//배그
//총알 30발 ->1탄창
//캐릭터당 -> 3탄창

//1.단발
//2.점사

//1번이면 총소리를 낸다. "탕" 30 번 반복 출력
//2번이면 타타탕 10번 반복
public class LoopFor3_ex2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		
		int bullet=0;
		
		for(int i=2;i>=0;i--) {
			System.out.println("1.단발 2.점사");
			System.out.print("선택하시오 : ");
			int select = sc.nextInt();
			
			if(select==1) {
				for(bullet=30-1;bullet>=0;bullet--) {
					System.out.println("탕          "+bullet+"발 남았습니다.");
				}
			}
			else
				for(bullet=30-1; bullet>=0;bullet=bullet-3) {
					System.out.println("타타탕        "+bullet+"발 남았습니다.");
				}
			System.out.println("남은탄창은 "+i+"발 남았습니다.");
			}	
		System.out.println("남은 탄창이 없습니다.");
	}
}

