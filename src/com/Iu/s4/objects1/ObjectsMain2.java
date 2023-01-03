package com.Iu.s4.objects1;

public class ObjectsMain2 {

	public static void main(String[] args) {
		
		// Sword클래스를 보고 인스턴스 생성
		int n = 10; //-primitive 타입
		Sword s1 = new Sword();	//-레퍼런스 타입	스택영역에 변수가 선언 되었기 때문에 '지역변수'이다.
								//s1 = 참조변수
		s1.name = "나뭇가지";
		s1.damage = 30;
		s1.durability = 5;
		s1.level = 1;
		s1.price = 10;
				//damage, durabillity 등 Heap에 만들어진 변수들은 인스턴스변수이다.
		Knight knight = new Knight();
		knight.name = "불주먹";
		knight.HP = 100;
		knight.STR = 12;
		knight.DEX = 4;
		knight.INT = 4;
		knight.sword = s1;
		//나이트가 가지고 있는 칼의 이름
		System.out.println(knight.sword.name);
		
		//변수 선언
		
		// Sword s2;  -> 지역변수로 초기화 하지 않았기 때문에 사용X 
		//레퍼런스타입의 변수의 초기값은 무조건 null
//		Sword s2= null;	
//		System.out.println(s2.damage); - >이러면 에러뜸
	}

}
