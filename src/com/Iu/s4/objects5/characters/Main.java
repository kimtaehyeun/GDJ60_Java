package com.Iu.s4.objects5.characters;

public class Main {

	public static void main(String[] args) {
		Archer archer = new Archer();
		Character character = null;
		character = archer;
		/*archer = character;	// 캐릭터 = archer 가 아니기 때문에 에러*/
		archer = (Archer)character;//레퍼런스 타입 형변환
		
		
		
		archer.attack();
		
	
//		
//		IceMagition icemagition = new IceMagition();
//		FilreMagition firemagition = new FilreMagition();
//		
//		icemagition.getHp();
//		icemagition.getMp();
//		firemagition.getHp();
//		icemagition.attack();
//		
//		
//		archer.attack();
		
//		icemagition.getMp();
//		magition.setMp(0);
//		magition.setName(null);
//		
//		Archer archer = new Archer();
//		archer.getDex();
//		archer.setName(null);
//		
//		
//		magition.attack();
//		archer.attack();
//		
//		
		
	}

}
