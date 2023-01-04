package com.Iu.s4.objects3.p1;

public class Secret {
   
   public int money=1000000000;
   public int point = 500;
   
   public Secret() {
      
   }
   
   
   public void s1() {
      System.out.println("Secret의 S1 메서드 실행");
   }
   void s2() {
      System.out.println("같은 패키지 내에서만 사용 가능");
   }
}