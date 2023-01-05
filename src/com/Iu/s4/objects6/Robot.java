package com.Iu.s4.objects6;

public class Robot {
	
	private ArmRight armRight;
	private ArmLeft armLeft;
	
	public Robot(){
		this.armRight= new ArmRight();
	}
	//asdfasdf
	
	
	
	public ArmRight getArmRight() {
		return armRight;
	}
	public void setArmRight(ArmRight armRight) {
		this.armRight = armRight;
	}
	public ArmLeft getArmLeft() {
		return armLeft;
	}
	public void setArmLeft(ArmLeft armLeft) {
		this.armLeft = armLeft;
	}
	
}
