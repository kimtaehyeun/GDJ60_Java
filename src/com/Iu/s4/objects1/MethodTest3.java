package com.Iu.s4.objects1;

public class MethodTest3 {

	public void t3(int salary, double tax) {//(매개변수) 호출하는쪽과 호출 당하는쪽을 연결해주는 변수
		//실급여를 계산하는 메서드
		salary = (int)(salary*0.97);
		System.out.println("T3 : " + salary);
		
	}
	public void info(Sword sword) {
		//Sword 모든 정보를 출력
		System.out.println(sword.name);
		System.out.println(sword.damage);
		System.out.println(sword.level);
		System.out.println(sword.durability);
		System.out.println(sword.price);
		sword.name = "단도";
	}
	
}
