package com.Iu.s4.objects2;



public class MonsterMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Monster mon1 = new Monster();
		
		mon1.power = 10;
		mon1.hp = 100;
		
		Monster mon2 = new Monster();
		mon2.power = 10;
		mon2.hp = 100;
		
		//System.out.println(mon1 == mon2);
		
		System.out.println(mon1.checkValue(mon2));
		System.out.println(mon2.checkValue(mon1));
		
		//System.out.println(mon1);
//		mon1.info();
//		System.out.println(mon2);
//		mon2.info();
		}
}
