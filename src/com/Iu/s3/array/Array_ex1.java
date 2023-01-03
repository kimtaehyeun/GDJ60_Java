package com.Iu.s3.array;

import java.util.Scanner;

//1. 학생 수를 입력받습니다.
//2. 학생의 수 만큼 이름을 입력 - a,b
//3. 학새의 수 만큼 학생의번호, 국어, 영어, 수학 입력
//		 a 학생의 번호 : 
//		 a 학생의 국어 : 
//		 a 학생의 영어 : 
//		 a 학생의 수학 : 
//4. 모든 학생의 정보 출력
// 이름 번호 국어 영어 수학  총점 평균
// a   1 12 12 21 	50	31.1
//...
public class Array_ex1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println(" 학생 수 입력 : " );
		int student = sc.nextInt();
		
		System.out.println("학생 수 만큼 이름 입력");
		String [] name = new String[student];
		int []num = new int[student];
		int []kor = new int[student];
		int []eng = new int[student];
		int []math = new int[student];
		int []total = new int[student];
		double[]avg = new double[student];
		for(int i =0; i<student;i++) {
			System.out.println("학생의 이름 입력 : ");
			name[i]=sc.next();
		}
		for(int i = 0; i<student; i++) {
			System.out.print(name[i]+"의 번호를 적어주세요 : ");
			num[i] = sc.nextInt();
			System.out.print(name[i]+"의 국어점수를 적어주세요 : ");
			kor[i] = sc.nextInt();
			System.out.print(name[i]+"의 수학점수를 적어주세요 : ");
			math[i] = sc.nextInt();
			System.out.print(name[i]+"의 영어점수를 적어주세요 : ");
			eng[i] = sc.nextInt();
			total[i] = kor[i]+math[i]+eng[i];
			avg[i] = total[i]/3;
		}
		
		System.out.println("모든학생의 점수 출력");
		System.out.println(" 이름 번호 국어 영어 수학 총점 평균");
		for(int i = 0; i<student; i++)
		System.out.println(name[i]+"  "+num[i]+" "+kor[i]+" "+math[i]+" "+eng[i]+" "+total[i]+" "+avg[i]);
	}

}
