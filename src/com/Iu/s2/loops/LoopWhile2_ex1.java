package com.Iu.s2.loops;
//게임
//1.로그인
//2.로그인 한 사용자만 게임 가능

import java.util.Scanner;

//-------------------로그인 파트------------------------------------
//1.로그인 2.종료
//	1:id, pw입력 후 로그인 판단
//	2: 종료
	
//-------------------게임 진행 파트------------------------------------
//1.로그인 성고 했을 대 진행
//레벨1로 시작
//모든 몬스터의 경험치는 동일
//Gold 0
//5렙 달성시1000골드 지급
//10렙 달성시 2000골드 지급
//만랩 달성시 3000골드 지급

//1 -> 2: 3 
//2 -> 3: 6 
//3 -> 4: 9 
//4 -> 5: 12 
//5 -> 6: 15
//14->15 :52
//만랩달성 축하, 현재 골드 출력


public class LoopWhile2_ex1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//------------------------------로그인----------------------------------
		int Login=0;
		while(Login==0) {
			int yid=12;
			int ypw=34;
			System.out.print("id입력 : ");
			int id=sc.nextInt();
			System.out.print("pw입력 : ");
			int pw=sc.nextInt();
			if(yid==id&&ypw==pw) {
				 System.out.println("로그인 성공");
				 Login=1;
				 System.out.println("////////////////////////////////게임을 시작합니다////////////////////////////////////");
			}
			else
				System.out.println("다시 입력해 주시기 바랍니다.");
			
		}
		//--------------------------게임실행--------------------------------------
		//-------------------게임 진행 파트------------------------------------
		int Level=1;
		int ExpState=0;
		int MonsterExp=20;
		int MaxExp=3;
		int Gold=0;
		int LevelupFlag=0;
		while(Login==1) {
			System.out.println("                                     현재Level : "+Level);
			System.out.println("                                     현재Exp : "+ExpState);
			System.out.println("                                     현재Gold : "+Gold);
			
			System.out.println("몬스터가 출연하였습니다.");
			System.out.println("1.잡기 2.도망치기");
			int Select = sc.nextInt();
			if(Select==1) {
				System.out.println("몬스터를 사냥하였습니다.");
				System.out.println("경험치가 "+MonsterExp+"올랐습니다.");
				ExpState+=MonsterExp;
			}
			else if(Select==2) {
				System.out.println("도망쳤습니다.");
			}
			else
				System.out.println("다시 입력해주세요");
			for(int time=0;time<5;time++) {
				if(ExpState>=MaxExp) {
					System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-!!레벨업!!*-*-*-*-*-*-*-*-*-*-*-*-");
					System.out.println("레벨이 증가하였습니다."+Level+" -> "+(Level+1));
					Level+=1;
					if(Level<15) {
						System.out.println("최대 경험치가 증가하였습니다 "+MaxExp+" -> "+(MaxExp+3));
						
						ExpState=ExpState-MaxExp;
						MaxExp+=3;
					}
					if(Level%5==0&&ExpState==0)
						LevelupFlag=1;
				}
			}
			//-----------보상파트------------------//
			if(LevelupFlag==1) {
				if(Level==5) {
					System.out.println("5레벨 달성을 축하합니다. 1000골드를 드리겠습니다.");
					Gold+=1000;
				
				}
				else if(Level==10) {
					System.out.println("10레벨 달성을 축하합니다. 2000골드를 드리겠습니다.");
					Gold+=2000;
					
				}
				else if(Level==15) {
					System.out.println("최종레벨 달성을 축하합니다. 3000골드를 드리겠습니다.");
					Gold+=3000;
					System.out.println("*-*-*-*-*-*-*-*-*-최종레벨을 달성하여 게임을 종료합니다.*-*-*-*-*-*-*-*-*-");
					System.out.println("만랩까지 얻은 총골드" + Gold);
					Login=2;
				}
				LevelupFlag=0;
			}
			
			
			
		}
	}
}
