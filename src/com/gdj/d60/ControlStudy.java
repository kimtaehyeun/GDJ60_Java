package com.gdj.d60;

import java.util.Random;
import java.util.Scanner;

public class ControlStudy {

   public static void main(String[] args) {
      // aaaa
      Scanner sc =new Scanner(System.in);
      Random random = new Random();
      //game : TORPGa
      //마법사 
      //랜덤 클래스
      String name = "핫팩";
      int hp = 20;
      int mp=20;
      String monsterName="괴물쥐";
      int monsterHp=10;
      
      
      //1. HP보충(포션) 2.MP보충 3.마법1 4.마법2 5.턴 넘기기
      //hp는 보충시 최대 40까지 가능
      //보충시 랜덤하게 0부터 40사이이ㅡ 숫자를 받아서 hp 더하기
      boolean turn = true;
      
      
      while(true) {
         System.out.println("1. HP보충 2.MP보충 3.마법1 4.마법2 5.턴넘기기");
         int play =sc.nextInt();
         int hps = random.nextInt(40)+1; //0부터 40 사이 숫자 랜덤으로 가져옴
         int attack =random.nextInt(5);
         int Hattack1=random.nextInt(5);
         int Hattack2=random.nextInt(5);
         if(turn == true) {
         if(play == 1&& hp!=40) {
            hp = hp+hps ;
            System.out.println("HP가"+hps+"만큼 회복되었습니다");
            
            if(hp+hps >40){
               hp = 40;   
            }
            System.out.println("HP량"+hp);
            turn = false;
         }else if(play == 2) {
            mp=mp+hps;
            System.out.println("MP가"+hps+"만큼 회복되었습니다");
            
            if(mp+hps>40){
               mp=40;
            }System.out.println("MP량"+mp);
            turn = false;
         }else if(play == 3) {
            if(mp>=3) {
            mp=mp-3;
            monsterHp=monsterHp-Hattack1;
            System.out.println(Hattack1+"마법1 공격");
            System.out.println("남은 몬스터 체력 :"+monsterHp);
            System.out.println("남은 마나"+mp);
            turn = false;}
            else
               System.out.println("mp가 부족합니다");
         }else if(play == 4) {
            if(mp>=5) {
            mp=mp-5;
            monsterHp=monsterHp-Hattack2;
            System.out.println(Hattack2+"마법2 공격");
            System.out.println("남은 몬스터 체력 :"+monsterHp);
            System.out.println("남은 마나"+mp);
            turn = false;
            }else {
               System.out.println("mp가 부족합니다");
            }
         }else if(play == 5) {
            System.out.println("턴 넘김");
            turn = false;
         }
         
         if(play == 1 &&hp==40) {
            System.out.println("HP가 최대입니다");
         }
      }
      if(turn == false) {
         hp = hp-attack;
         System.out.println("괴물쥐에게"+attack+"의 공격을 받았습니다");
         System.out.println("남은 HP"+hp);
         turn = true;
      }
      
      if(hp<=0) {
         System.out.println("인간이 쓰러졌습니다");
         break;
      }else if(monsterHp <=0) {
         System.out.println("몬스터가 쓰러졌습니다");
         break;
      }else
         continue;
      }
      sc.close();
   }

}