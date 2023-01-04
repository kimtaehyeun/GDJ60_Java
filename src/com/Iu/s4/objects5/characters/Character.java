package com.Iu.s4.objects5.characters;

public abstract class Character {//미완성된 클래스,추상 클래스
	//abstract이 붙으면 상속해서 써라라는 의미
	//추상클래스 : 객체생성 X, 일반클래스처럼 멤버변수, 생성자, 추상메서드 가질수 있음.
	//하나라도 미완성메서드(추상메서드)가 있으면 그 클래스는 추상클래스로 선언.
	private String name;
	private int hp;
	private int level;
	
	public Character() {
		
	}
	public Character(String name) {
		this.name = name;
		
	}
	
	//public abstract void attack(); //미 완성된 메서드, 추상 메서드
	
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	
	
}
