package com.Iu.s1.controls;

public class Control1 {

	public static void main(String[] args) {
		// T
		//단일 if
		//if(조건식){조건식이 true일 때 실행}
		//졸업시험, 무조건 졸업, 평균이 90점 이상이면 우등상 수상
		System.out.println("프로그램 시작");
		double avg = 80.12;
		if(avg>=90) {
			System.out.println("우등상 수상");
			int don=1000000;
			System.out.println("장학금 : " + don);
		}
	
		System.out.println("졸업을 축하합니다.");
		System.out.println("프로그램 종료");
		
		
	}

}
