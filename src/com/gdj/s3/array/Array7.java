package com.gdj.s3.array;

import java.util.Scanner;

public class Array7 {

   public static void main(String[] args) {
      Scanner sc =new Scanner(System.in);
      // 1.데이터 추가
      //0번 인덱스에 추가 내가 원하는 숫자
      // 2.데이터 삭제
      //0번 인덱스 삭제
      // 3.종료
      int [] ar={5,1,4};
      int [] copy=new int[ar.length];
      int []copy1=ar;
      while(true) {
      System.out.println("1번 데이터 추가 2번 데이터 삭제 3번 종료");
      
      
      
      
      int num = sc.nextInt();
      
      if(num == 1) {
         copy=new int[copy1.length+1];
      System.out.println("어떤 숫자를 추가하시겠습니까?");
      int plus = sc.nextInt();
      copy[0]=plus;
      
         for(int i=1; i<copy.length;i++) {
            copy[i]=copy1[i-1];
         }
         for(int j=0; j<copy.length;j++) {
            System.out.println("copy 배열 데이터"+copy[j]);
         }
      }else if(num == 2) {
         copy=new int[copy.length-1];
         int k=0;
         for(int i=0; i<copy.length;i++) {
            copy[k]=copy1[i+1];
            k++;
         }
         for(int j=0; j<copy.length;j++) {
            System.out.println("copy 배열 데이터"+copy[j]);
         }
      }else
         break;
      
      copy1= copy;

   }
      

   }

}