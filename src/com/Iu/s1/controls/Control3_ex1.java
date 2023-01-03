package com.Iu.s1.controls;

import java.util.Random;
import java.util.Scanner;

public class Control3_ex1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		
		//Game : TRPG
		//법사
		String name ="핫팩";
		int hp = 20;
		int mp = 20;
		//몬스터
		String monstername = "오크";
		int monsterhp = 10;
		boolean TurnFlag = true;
		//1. hp보충(포션)hp피는 보충시 최대 40	보충시 랜덤하게 0~40사이의 숫자를 받아서 hp더하기
		//2. mp보충(포션)hp피는 보충시 최대 40	보충시 랜덤하게 0~40사이의 숫자를 받아서 hp더하기
		//3. 약마법1 공격시 0~10 사이의 숫자를 받아서 공격, mp5감소
		//4. 강마법2 공격시 5~15 사이의 숫자를 받아서 공격, mp10감소
		//5. 턴을 넘기기
		
		//코드작성
		while(true) {
			if(TurnFlag==true){//내턴{
				if(hp<0) {
					System.out.println("///////////////////////////////////////////////////////////////////////////////////////");
					System.out.println("패배하였습니다.");
					System.out.println("///////////////////////////////////////////////////////////////////////////////////////");
					
					break;
					
					}
				else {
					System.out.println("///////////////////////////////////////////////////////////////////////////////////////");
					System.out.println("					현재체력 :" + hp +" 현재마나 : "+ mp);
					System.out.println("					현재 몬스터 체력 : " + monsterhp);
					
					System.out.println("1.hp포션 2.mp포션 3. 마법1 4.마법2 5.턴넘기기");
					System.out.print("행동을 선택하세요 : ");
					int Select = sc.nextInt();
					int Charge = random.nextInt(41);
					int attack = random.nextInt(11);
					
					if(Select==1) {
						
						if(hp>=40) {
							
							System.out.println("최대 hp입니다.");
							}
						else {
							System.out.println(Charge+"만큼 충전되었습니다.");
							hp = hp+Charge;
							if(hp>=40)
								hp=40;
							System.out.println("현재 hp : "+hp);
							TurnFlag=false;	
						}
						
						
					}
					else if(Select==2) {
						
						if(mp>=40) {
							System.out.println("최대 mp입니다.");
						}
						else {
							System.out.println(Charge+"만큼 충전되었습니다.");
							mp = mp+Charge;
							if(mp>=40)
								mp=40;
							System.out.println("현재 mp : "+mp);
							TurnFlag=false;	
						}
					}
					else if(Select==3) {
						if(mp<5)
							System.out.println("-X-X-X-X-X-X-X-마나가 없습니다.-X-X-X-X-X-X-X-");
						else {
							System.out.println("약공격");
							if(attack<6)
								System.out.println(monstername+"에게" +attack+"의 피해를 입혔습니다.");
							else {
								System.out.println("*크*3리*티*컬 발*똥*!");
								System.out.println(monstername+"에게" +attack+"의 피해를 입혔습니다.");
							}
							monsterhp = monsterhp-attack;
							if(monsterhp<0)
								System.out.println(monstername+"를 처치하였습니다.");
							else
								System.out.println(monstername + "의남은체력 : "+monsterhp);
							TurnFlag=false;	
						}
							
					}
					else if(Select==4) {
						if(mp<5)
							System.out.println("-X-X-X-X-X-X-X-마나가 없습니다.-X-X-X-X-X-X-X-");
						else {
							attack=attack+5;
							System.out.println("강굥격");
							if(attack<6)
								System.out.println(monstername+"에게" +attack+"의 피해를 입혔습니다.");
							else {
								System.out.println("*크*리*티*컬 발*똥*!");
								System.out.println(monstername+"에게" +attack+"의 피해를 입혔습니다.");
							}
								
							monsterhp = monsterhp-attack;
							if(monsterhp<0)
								System.out.println(monstername+"를 처치하였습니다.");
							else
								System.out.println(monstername + "의남은체력 : "+monsterhp);
							TurnFlag=false;	
						}
						
					}
					else if(Select==5) {
						System.out.println("턴을 넘깁니다.");
						TurnFlag=false;	
					}
					else {
						System.out.println("-X-다시 입력해 주세요.-X-");
					}
				}
			}
			if(TurnFlag==false) {
				if(monsterhp<0) {
					System.out.println("승리하였습니다.");
					break;
					}
	
				else {
					System.out.println("---------------몬스터차례----------------------");
					int monsterattack = random.nextInt(10);
					hp = hp-monsterattack;
					System.out.println(monsterattack+"의 피해를 입었습니다.");
					System.out.println("남은 체력 : "+hp);
					System.out.println("----------------------------------------");
					TurnFlag=true;}
			}
		}//while
	}
}
