package com.Iu.s4.objects5.characters;

public class Knight extends Character implements AttackAble {
	
	int strong;
	
	Item item = new Staff(); //인터페이스도 데이터타입(추상타입처럼)으로 선언가능
	
	@Override
	public void attack() {
		item.a();
	}
}
