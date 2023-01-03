package com.Iu.s1.controls;

import java.util.Scanner;

public class Control2_ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//회원가입 할 때 입력한 id pw
		int id = 1234;
		int pw = 5678;
		//키보드로부터 id, pw입력받아서 로그인 처리
		Scanner sc = new Scanner(System.in);
		System.out.println("아이디 입력 : ");
		int Id_in = sc.nextInt();
		System.out.println("패스워드 입력 : ");
		int pw_in = sc.nextInt();
		
		if(id==Id_in&&pw==pw_in)
			System.out.println("외원가입 성공");
		else
			System.out.println("실패");
	}

}
