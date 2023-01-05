package com.Iu.s4.objects6;

public class Main {

	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		Robot robot = new Robot();
		ArmLeft armLeft = new ArmLeft();
		robot.setArmLeft(armLeft);
		
		System.out.println(robot.getArmLeft());
		System.out.println("Right : " + robot.getArmRight());
		
		robot = null;
		
		System.out.println("프로그램 종료");
	}

}
