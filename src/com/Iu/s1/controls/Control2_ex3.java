package com.Iu.s1.controls;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Control2_ex3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
		//회원가입 할 때 입력한 id pw
		int id = 1234;
		int pw = 5678;
		int loginFlag=0;
		//키보드로부터 id, pw입력받아서 로그인 처리
		
		//반점 나타내기
		DecimalFormat de = new DecimalFormat("###,###");
		//
		System.out.println("아이디 입력 : ");
		int Id_in = sc.nextInt();
		System.out.println("패스워드 입력 : ");
		int pw_in = sc.nextInt();
		if(id==Id_in&&pw==pw_in) {
			loginFlag=1;
			System.out.println("로그인 성공");
			}
		else
			System.out.println("실패");
		if(loginFlag==1) {
			System.out.println("급여를 입력하세요 : ");
			long pay = sc.nextLong();
			System.out.println("정규직이면 1을 비정규직이면 2를 입력하세요 : ");
			int Flag = sc.nextInt();
			
			long godragon,madical,gukmin,sanjae,wonchun=0;
			String paymoney = de.format(pay);
			if(Flag==1) {
				godragon = pay*2/100;
				madical = pay*3/100;
				gukmin = pay*1/100;
				sanjae = pay*1/100;
				pay = pay-godragon-madical-gukmin-sanjae-wonchun;
				//반점나타내기
				
				String Sgodragon = de.format(godragon);
				String Sgukmin = de.format(gukmin);
				String Ssanjae = de.format(sanjae);
				String Smadical = de.format(madical);
				//
				System.out.println("고용보험 가격 : " + Sgodragon+"원");
				System.out.println("의료보험 가격 : " + Smadical+"원");
				System.out.println("국민연금 가격 : " + Sgukmin+"원");
				System.out.println("산재보험 가격 : " + Ssanjae+"원");
				
				
			}
			else {
				wonchun = pay*33/1000;
				pay = pay-wonchun;
				//반점 나타내기
			
				String Swonchun = de.format(wonchun);
				//
				System.out.println("원천징수 가격 : " + Swonchun+"원");;
				
			}
			System.out.println("실급여 : " + paymoney+"원");
			//로그인이 성공 했을 때만 실행
			//급여를 입력
			//정규직이면 1을, 계약직이면 2를 입력받는다.
			//실급여 계산
			//정규직 : 고용보험 2%, 의료보험3%, 국민연금 1%, 산재보험1%
			//계약직 : 원천징수 3.3%
			//실 급여 출력
		}
		
		
		

	}

}
