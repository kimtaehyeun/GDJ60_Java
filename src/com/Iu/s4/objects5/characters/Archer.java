package com.Iu.s4.objects5.characters;

public class Archer extends Character implements AttackAble{

	private String dex;
	
	public Archer() {
		super("a");//생략가능, 생성자 첫줄에 위치, this() super ()를 같이쓸수없음.
	}
	
//	public void attack() {
//		System.out.println("활쏘기");
//	}
	@Override
	public void attack() {
		//super.attack();		//부모의 어텍 호출하기
		System.out.println("활 공격");
	}
	
	public void move() {
		System.out.println("이동");
		
	}
	public String getDex() {
		return dex;
	}
	public void setDex(String dex) {
		this.dex = dex;
	}
}
