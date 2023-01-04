package com.Iu.s4.objects3.p2;

import com.Iu.s4.objects3.p1.Secret;
//패키지 명에는 *(와일드카드) 사용 불가.

public class SecretMain {

	public static void main(String[] args) {
		 
		      Secret secret = new Secret();
		      com.Iu.s4.objects3.p2.Secret secret2= new com.Iu.s4.objects3.p2.Secret();
		      
		      
		      secret.money=1;
		      secret.s1();
		      
		      Test test =new Test();
		      
		      System.out.println(test.point);
		      
		      //secret.s2();
		      
	}

}
