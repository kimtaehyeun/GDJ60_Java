package com.Iu.s4.objects5.characters;

//public class Magition extends Character {
//마법공격을 지웠을때 에러뜨는이유는 캐릭터에서 받은 어택메소드를 오버라이딩 시켜주지 않았기 때문에

public abstract class  Magition extends Character {

	private int mp;
	
	public Magition() {
		super("sdf");//생성자 첫줄에 위치, this() super ()를 같이쓸수없음.
		System.out.println();
	}
//	public void attack() {
//		System.out.println("마법공격");
//	}
//	public void attack() {//오버라이딩
//		System.out.println("마법공격");
//	}
	public abstract void attack();
	public abstract void spell();
	public int getMp() {
		return mp;
	}
	public void setMp(int mp) {
		this.mp = mp;
	}
	
}
