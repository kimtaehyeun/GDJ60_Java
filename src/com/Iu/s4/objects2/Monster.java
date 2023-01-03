package com.Iu.s4.objects2;

public class Monster {

	//멤버변수 , instance변수
	String name;
	int power;
	int hp;
	//멤버메서드, Instance메서드
	//공격
	//어슬렁
	public boolean checkValue(Monster monster) {
		//나의 power 와 몬스터의 power가 같다면 나의 hp가 같다면 
		//true 리턴
		if(this.power==monster.power&&this.hp==monster.hp) {
			return true;
		}
		return false;
	}

	public void info() {
		System.out.println(this);
		//참조변수 this : 클래스 내부에서만 사용 가능, 생성된 객체 주소를 담음
		System.out.println(this.power);
		//this는 생략 가능
		System.out.println(hp);
		this.attack();
	}

	public void attack() {
		System.out.println("공격합니다.");
		//this.info();
	}
	public void setHp(int hp) {//int hp 매개변수 이면서 지역변수
		this.hp = hp; //멤버변수와 지역변수(매개변수)가 동일한 이름일 시 this사용

	}
}
