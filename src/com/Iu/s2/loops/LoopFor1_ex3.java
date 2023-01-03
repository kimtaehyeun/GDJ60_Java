package com.Iu.s2.loops;

import java.util.Scanner;

public class LoopFor1_ex3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int id =1234;
		int pw = 5678;
		//로그인 시도 총 5번 시도 가능
		//반복문 종료 후
		//로그인이 성공 했으면 "환영합니다"
		//로그인이 실패 했으면 "은행 방문 하세요" 출력
		int Login=0;
		for(int i =0; i<5;i++) {
			System.out.print("id입력 : ");
				
			int id_in=sc.nextInt();
		
			System.out.print("pw입력 : ");
			
			int pw_in=sc.nextInt();
			if(id_in==id&&pw_in==pw) {
				i=5;
				Login=1;
				System.out.println("로그인에 성공하였습니다.");
			}
			else
				System.out.println("아이디 도는 비밀번호 "+(i+1)+"회 오류입니다.");
		}
		if(Login==0)
			System.out.println("로그인에 실패하였습니다. 은행을 방문해 주세요");
		else
			System.out.println("환영합니다.");
		
	}

}
